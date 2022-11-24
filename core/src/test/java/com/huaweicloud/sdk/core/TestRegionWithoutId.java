/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2021-2021. All rights reserved.
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.huaweicloud.sdk.core;

import com.github.tomakehurst.wiremock.client.WireMock;
import com.github.tomakehurst.wiremock.core.WireMockConfiguration;
import com.github.tomakehurst.wiremock.junit.WireMockRule;
import com.huaweicloud.sdk.core.auth.BasicCredentials;
import com.huaweicloud.sdk.core.auth.GlobalCredentials;
import com.huaweicloud.sdk.core.exception.SdkException;
import com.huaweicloud.sdk.core.http.HttpConfig;
import com.huaweicloud.sdk.core.region.Region;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;

import static com.huaweicloud.sdk.core.Constants.MEDIATYPE;
import static com.huaweicloud.sdk.core.TestRegion.TEST_ENDPOINT;

/**
 * TestRegionWithoutId：测试projectId/domainId在不同调用方式下的自动回填情况
 */
public class TestRegionWithoutId {
    private static final Logger logger = LoggerFactory.getLogger(TestRegionWithoutId.class);

    private static final String IAM_ENDPOINT = "http://127.0.0.1:10086";
    private static final String BASIC_EXPECTED = "123456789";
    private static final BasicCredentials BASIC_CREDENTIALS =
            new BasicCredentials().withAk("ak").withSk("sk").withIamEndpoint(IAM_ENDPOINT);
    private static final String GLOBAL_EXPECTED = "987654321";
    private static final GlobalCredentials GLOBAL_CREDENTIALS =
            new GlobalCredentials().withAk("ak").withSk("sk").withIamEndpoint(IAM_ENDPOINT);
    private final HttpConfig config = HttpConfig.getDefaultHttpConfig().withIgnoreSSLVerification(true);

    @Rule
    public WireMockRule wireMockRule;

    @Before
    public void init() {
        System.setProperty("org.eclipse.jetty.util.log.class", "org.eclipse.jetty.util.log.StdErrLog");
        System.setProperty("org.eclipse.jetty.LEVEL", "OFF");

        wireMockRule =
                new WireMockRule(WireMockConfiguration.options().httpsPort(10010).port(10086).disableRequestJournal());

        // operationId: KeystoneListProjects
        wireMockRule.stubFor(
                WireMock.get("/v3/projects?name=cn-north-7")
                        .willReturn(
                                WireMock.aResponse()
                                        .withHeader("Content-Type", MEDIATYPE.APPLICATION_JSON)
                                        .withBody("{\"projects\": [{\"id\": \"123456789\"}]}")
                                        .withStatus(200)));
        // operationId: KeystoneListProjects
        wireMockRule.stubFor(
                WireMock.get("/v3/projects?name=cn-north-400")
                        .willReturn(
                                WireMock.aResponse()
                                        .withHeader("Content-Type", MEDIATYPE.APPLICATION_JSON)
                                        .withBody(
                                                "{\"error_msg\": \"Incorrect IAM authentication information: "
                                                        + "verify aksk signature fail\"}")
                                        .withStatus(401)));
        // operationId: KeystoneListAuthDomains
        wireMockRule.stubFor(
                WireMock.get("/v3/auth/domains")
                        .willReturn(
                                WireMock.aResponse()
                                        .withHeader("Content-type", MEDIATYPE.APPLICATION_JSON)
                                        .withBody("{\"domains\": [{\"enabled\": true, \"id\": \"987654321\"}]}")
                                        .withStatus(200)));

        wireMockRule.start();
    }

    @After
    public void stop() {
        wireMockRule.stop();
    }

    @Test
    public void testProjectWithRegion() {
        TestServiceClient.newBuilder()
                .withCredential(BASIC_CREDENTIALS)
                .withHttpConfig(config)
                .withRegion(TestRegion.CN_NORTH_7)
                .build();

        try {
            Field projectId = BasicCredentials.class.getDeclaredField("projectId");
            projectId.setAccessible(true);
            Assert.assertEquals(BASIC_EXPECTED, projectId.get(BASIC_CREDENTIALS));
        } catch (NoSuchFieldException | IllegalAccessException e) {
            logger.error(e.getMessage());
        }
    }

    @Test
    public void testProjectWithRegionValueOf() {
        TestServiceClient.newBuilder()
                .withCredential(BASIC_CREDENTIALS)
                .withHttpConfig(config)
                .withRegion(TestRegion.valueOf("cn-north-7"))
                .build();

        try {
            Field projectId = BasicCredentials.class.getDeclaredField("projectId");
            projectId.setAccessible(true);
            Assert.assertEquals(BASIC_EXPECTED, projectId.get(BASIC_CREDENTIALS));
        } catch (NoSuchFieldException | IllegalAccessException e) {
            logger.error(e.getMessage());
        }
    }

    @Test
    public void testProjectWithNewRegion() {
        TestServiceClient.newBuilder()
                .withCredential(BASIC_CREDENTIALS)
                .withHttpConfig(config)
                .withRegion(new Region("cn-north-7", TEST_ENDPOINT))
                .build();
        try {
            Field projectId = BasicCredentials.class.getDeclaredField("projectId");
            projectId.setAccessible(true);
            Assert.assertEquals(BASIC_EXPECTED, projectId.get(BASIC_CREDENTIALS));
        } catch (NoSuchFieldException | IllegalAccessException e) {
            logger.error(e.getMessage());
        }
    }

    @Test
    public void testDomainWithRegion() {
        TestServiceClient.newBuilder()
                .withCredential(GLOBAL_CREDENTIALS)
                .withHttpConfig(config)
                .withRegion(TestRegion.CN_NORTH_7)
                .build();

        try {
            Field domainId = GlobalCredentials.class.getDeclaredField("domainId");
            domainId.setAccessible(true);
            Assert.assertEquals(GLOBAL_EXPECTED, domainId.get(GLOBAL_CREDENTIALS));
        } catch (NoSuchFieldException | IllegalAccessException e) {
            logger.error(e.getMessage());
        }
    }

    @Test
    public void testDomainWithRegionValueOf() {
        TestServiceClient.newBuilder()
                .withCredential(GLOBAL_CREDENTIALS)
                .withHttpConfig(config)
                .withRegion(TestRegion.valueOf("cn-north-7"))
                .build();

        try {
            Field domainId = GlobalCredentials.class.getDeclaredField("domainId");
            domainId.setAccessible(true);
            Assert.assertEquals(GLOBAL_EXPECTED, domainId.get(GLOBAL_CREDENTIALS));
        } catch (NoSuchFieldException | IllegalAccessException e) {
            logger.error(e.getMessage());
        }
    }

    @Test
    public void testDomainWithNewRegion() {
        TestServiceClient.newBuilder()
                .withCredential(GLOBAL_CREDENTIALS)
                .withHttpConfig(config)
                .withRegion(new Region("cn-north-7", TEST_ENDPOINT))
                .build();
        try {
            Field domainId = GlobalCredentials.class.getDeclaredField("domainId");
            domainId.setAccessible(true);
            Assert.assertEquals(GLOBAL_EXPECTED, domainId.get(GLOBAL_CREDENTIALS));
        } catch (NoSuchFieldException | IllegalAccessException e) {
            logger.error(e.getMessage());
        }
    }

    @Test
    public void testWrongCredential() {
        try {
            TestServiceClient.newBuilder()
                    .withCredential(GLOBAL_CREDENTIALS)
                    .withHttpConfig(config)
                    .withRegion(TestRegion.CN_NORTH_400)
                    .build();
        } catch (SdkException e) {
            String errMessage =
                    "Failed to get project id, Incorrect IAM authentication information: "
                            + "verify aksk signature fail";
            Assert.assertEquals(e.getMessage(), errMessage);
        }
    }
}
