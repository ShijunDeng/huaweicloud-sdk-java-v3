/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2020-2020. All rights reserved.
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

package com.huaweicloud.sdk.ecs.v2;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.huaweicloud.sdk.core.utils.StringUtils;
import com.huaweicloud.sdk.ecs.v2.model.ServerImage;

import java.io.IOException;
import java.util.Objects;

public class EcsServerImageDeSerializer extends StdDeserializer<ServerImage> {

    private static final long serialVersionUID = 4517716088233807927L;

    protected EcsServerImageDeSerializer(Class<?> vc) {
        super(vc);
    }

    public EcsServerImageDeSerializer() {
        this(ServerImage.class);
    }

    @Override
    public ServerImage deserialize(JsonParser jsonParser, DeserializationContext deserializationContext)
            throws IOException {
        if (StringUtils.isEmpty(jsonParser.getText())) {
            return null;
        }

        JsonNode jsonNode = jsonParser.readValueAsTree();

        return new ServerImage().withId(Objects.isNull(jsonNode.get("id")) || jsonNode.get("id").isNull()
                ? null : jsonNode.get("id").asText());

    }
}
