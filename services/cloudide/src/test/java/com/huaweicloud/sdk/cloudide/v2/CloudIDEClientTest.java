/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2023-2023. All rights reserved.
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

package com.huaweicloud.sdk.cloudide.v2;

import com.github.tomakehurst.wiremock.client.WireMock;
import com.github.tomakehurst.wiremock.core.WireMockConfiguration;
import com.github.tomakehurst.wiremock.junit.WireMockRule;
import com.huaweicloud.sdk.cloudide.v2.model.ShowAccountStatusRequest;
import com.huaweicloud.sdk.cloudide.v2.model.ShowAccountStatusResponse;
import com.huaweicloud.sdk.cloudide.v2.model.ShowPriceRequest;
import com.huaweicloud.sdk.cloudide.v2.model.ShowPriceResponse;
import com.huaweicloud.sdk.core.Constants;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.http.HttpConfig;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class CloudIDEClientTest {
    private CloudIDEClient cloudIDEClient;
    @Rule
    public WireMockRule wireMockRule;

    @Before
    public void init() {
        System.setProperty("org.eclipse.jetty.util.log.class", "org.eclipse.jetty.util.log.StdErrLog");
        System.setProperty("org.eclipse.jetty.LEVEL", "OFF");
        wireMockRule = new WireMockRule(
                WireMockConfiguration.options().dynamicPort().dynamicHttpsPort().disableRequestJournal());
        wireMockRule.stubFor(WireMock.get("/marketplace/account").willReturn(
                WireMock.aResponse().
                        withHeader("Content-Type", Constants.MEDIATYPE.APPLICATION_JSON).
                        withStatus(200)));
        wireMockRule.stubFor(WireMock.get("/marketplace/price").willReturn(
                WireMock.aResponse().
                        withHeader("Content-Type", Constants.MEDIATYPE.APPLICATION_JSON).
                        withStatus(200)));
        wireMockRule.start();
        List<String> endpoints = Arrays.asList(
                String.format(Locale.ROOT, "http://127.0.0.1:%d", wireMockRule.port()),
                "https://goods.huaweicloud.com",
                "https://product.huaweicloud.com",
                "https://buy.huaweicloud.com");
        HttpConfig httpConfig = HttpConfig.getDefaultHttpConfig();
        HcClient hcClient = new HcClient(httpConfig).withEndpoints(endpoints);
        cloudIDEClient = new CloudIDEClient(hcClient);
    }

    @Test
    public void testShowAccountStatus() {
        HttpRequestDef.Builder<ShowAccountStatusRequest, ShowAccountStatusResponse> builder = HttpRequestDef
                .builder(HttpMethod.GET, ShowAccountStatusRequest.class, ShowAccountStatusResponse.class)
                .withName("ShowAccountStatus")
                .withUri("/marketplace/account")
                .withContentType("application/json");
        ShowAccountStatusRequest request = new ShowAccountStatusRequest();
        ShowAccountStatusResponse response = cloudIDEClient.hcClient.syncInvokeHttp(request, builder.build());
        Assert.assertEquals(response.getHttpStatusCode(), 200);
    }

    @Test
    public void testShowPrice() {
        HttpRequestDef.Builder<ShowPriceRequest, ShowPriceResponse> builder = HttpRequestDef
                .builder(HttpMethod.GET, ShowPriceRequest.class, ShowPriceResponse.class)
                .withName("ShowPrice")
                .withUri("/marketplace/price")
                .withContentType("application/json");
        ShowPriceRequest request = new ShowPriceRequest();
        ShowPriceResponse response = cloudIDEClient.hcClient.syncInvokeHttp(request, builder.build());
        Assert.assertEquals(response.getHttpStatusCode(), 200);
    }

    @After
    public void stop() {
        wireMockRule.stop();
    }
}