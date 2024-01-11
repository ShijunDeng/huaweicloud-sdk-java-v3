package com.huaweicloud.sdk.elb.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新监听器的请求体。
 */
public class UpdateListenerReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_limit")

    private Integer connectionLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "http2_enable")

    private Boolean http2Enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_pool_id")

    private String defaultPoolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_tls_container_ref")

    private String defaultTlsContainerRef;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_ca_tls_container_ref")

    private String clientCaTlsContainerRef;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sni_container_refs")

    private List<String> sniContainerRefs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "insert_headers")

    private InsertHeader insertHeaders;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tls_ciphers_policy")

    private String tlsCiphersPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_state_up")

    private Boolean adminStateUp;

    /**
     * 修改保护状态, 取值： - nonProtection: 不保护 - consoleProtection: 控制台修改保护
     */
    public static final class ProtectionStatusEnum {

        /**
         * Enum NONPROTECTION for value: "nonProtection"
         */
        public static final ProtectionStatusEnum NONPROTECTION = new ProtectionStatusEnum("nonProtection");

        /**
         * Enum CONSOLEPROTECTION for value: "consoleProtection"
         */
        public static final ProtectionStatusEnum CONSOLEPROTECTION = new ProtectionStatusEnum("consoleProtection");

        private static final Map<String, ProtectionStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProtectionStatusEnum> createStaticFields() {
            Map<String, ProtectionStatusEnum> map = new HashMap<>();
            map.put("nonProtection", NONPROTECTION);
            map.put("consoleProtection", CONSOLEPROTECTION);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProtectionStatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ProtectionStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ProtectionStatusEnum(value));
        }

        public static ProtectionStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ProtectionStatusEnum) {
                return this.value.equals(((ProtectionStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protection_status")

    private ProtectionStatusEnum protectionStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protection_reason")

    private String protectionReason;

    public UpdateListenerReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 监听器名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateListenerReq withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 监听器的描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateListenerReq withConnectionLimit(Integer connectionLimit) {
        this.connectionLimit = connectionLimit;
        return this;
    }

    /**
     * 监听器的最大连接数。该字段为预留字段，暂未启用。默认为-1。
     * maximum: 2147483647
     * @return connectionLimit
     */
    public Integer getConnectionLimit() {
        return connectionLimit;
    }

    public void setConnectionLimit(Integer connectionLimit) {
        this.connectionLimit = connectionLimit;
    }

    public UpdateListenerReq withHttp2Enable(Boolean http2Enable) {
        this.http2Enable = http2Enable;
        return this;
    }

    /**
     * HTTP2功能的开启状态。该字段只有当监听器的协议是TERMINATED_HTTPS时才有意义。
     * @return http2Enable
     */
    public Boolean getHttp2Enable() {
        return http2Enable;
    }

    public void setHttp2Enable(Boolean http2Enable) {
        this.http2Enable = http2Enable;
    }

    public UpdateListenerReq withDefaultPoolId(String defaultPoolId) {
        this.defaultPoolId = defaultPoolId;
        return this;
    }

    /**
     * 监听器的默认后端云服务器组ID。当请求没有匹配的转发策略时，转发到默认后端云服务器上处理。当该字段为null时，表示监听器无默认的后端云服务器组。
     * @return defaultPoolId
     */
    public String getDefaultPoolId() {
        return defaultPoolId;
    }

    public void setDefaultPoolId(String defaultPoolId) {
        this.defaultPoolId = defaultPoolId;
    }

    public UpdateListenerReq withDefaultTlsContainerRef(String defaultTlsContainerRef) {
        this.defaultTlsContainerRef = defaultTlsContainerRef;
        return this;
    }

    /**
     * 监听器使用的服务器证书ID。当protocol参数为TERMINATED_HTTPS时，为必选字段
     * @return defaultTlsContainerRef
     */
    public String getDefaultTlsContainerRef() {
        return defaultTlsContainerRef;
    }

    public void setDefaultTlsContainerRef(String defaultTlsContainerRef) {
        this.defaultTlsContainerRef = defaultTlsContainerRef;
    }

    public UpdateListenerReq withClientCaTlsContainerRef(String clientCaTlsContainerRef) {
        this.clientCaTlsContainerRef = clientCaTlsContainerRef;
        return this;
    }

    /**
     * 监听器使用的CA证书ID。
     * @return clientCaTlsContainerRef
     */
    public String getClientCaTlsContainerRef() {
        return clientCaTlsContainerRef;
    }

    public void setClientCaTlsContainerRef(String clientCaTlsContainerRef) {
        this.clientCaTlsContainerRef = clientCaTlsContainerRef;
    }

    public UpdateListenerReq withSniContainerRefs(List<String> sniContainerRefs) {
        this.sniContainerRefs = sniContainerRefs;
        return this;
    }

    public UpdateListenerReq addSniContainerRefsItem(String sniContainerRefsItem) {
        if (this.sniContainerRefs == null) {
            this.sniContainerRefs = new ArrayList<>();
        }
        this.sniContainerRefs.add(sniContainerRefsItem);
        return this;
    }

    public UpdateListenerReq withSniContainerRefs(Consumer<List<String>> sniContainerRefsSetter) {
        if (this.sniContainerRefs == null) {
            this.sniContainerRefs = new ArrayList<>();
        }
        sniContainerRefsSetter.accept(this.sniContainerRefs);
        return this;
    }

    /**
     * 监听器使用的SNI证书（带域名的服务器证书）ID的列表。
     * @return sniContainerRefs
     */
    public List<String> getSniContainerRefs() {
        return sniContainerRefs;
    }

    public void setSniContainerRefs(List<String> sniContainerRefs) {
        this.sniContainerRefs = sniContainerRefs;
    }

    public UpdateListenerReq withInsertHeaders(InsertHeader insertHeaders) {
        this.insertHeaders = insertHeaders;
        return this;
    }

    public UpdateListenerReq withInsertHeaders(Consumer<InsertHeader> insertHeadersSetter) {
        if (this.insertHeaders == null) {
            this.insertHeaders = new InsertHeader();
            insertHeadersSetter.accept(this.insertHeaders);
        }

        return this;
    }

    /**
     * Get insertHeaders
     * @return insertHeaders
     */
    public InsertHeader getInsertHeaders() {
        return insertHeaders;
    }

    public void setInsertHeaders(InsertHeader insertHeaders) {
        this.insertHeaders = insertHeaders;
    }

    public UpdateListenerReq withTlsCiphersPolicy(String tlsCiphersPolicy) {
        this.tlsCiphersPolicy = tlsCiphersPolicy;
        return this;
    }

    /**
     * 监听器使用的安全策略，仅对TERMINATED_HTTPS协议类型的监听器有效。  取值包括：tls-1-0, tls-1-1, tls-1-2, tls-1-2-strict多种安全策略。  加密套件的排序为国密套件、ecc套件、rsa套件、tls1.3协议的套件（即支持ecc又支持rsa）
     * @return tlsCiphersPolicy
     */
    public String getTlsCiphersPolicy() {
        return tlsCiphersPolicy;
    }

    public void setTlsCiphersPolicy(String tlsCiphersPolicy) {
        this.tlsCiphersPolicy = tlsCiphersPolicy;
    }

    public UpdateListenerReq withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    /**
     * 监听器的管理状态。  该字段为预留字段，暂未启动。只支持设定为true
     * @return adminStateUp
     */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    public UpdateListenerReq withProtectionStatus(ProtectionStatusEnum protectionStatus) {
        this.protectionStatus = protectionStatus;
        return this;
    }

    /**
     * 修改保护状态, 取值： - nonProtection: 不保护 - consoleProtection: 控制台修改保护
     * @return protectionStatus
     */
    public ProtectionStatusEnum getProtectionStatus() {
        return protectionStatus;
    }

    public void setProtectionStatus(ProtectionStatusEnum protectionStatus) {
        this.protectionStatus = protectionStatus;
    }

    public UpdateListenerReq withProtectionReason(String protectionReason) {
        this.protectionReason = protectionReason;
        return this;
    }

    /**
     * 设置保护的原因 >仅当protection_status为consoleProtection时有效。
     * @return protectionReason
     */
    public String getProtectionReason() {
        return protectionReason;
    }

    public void setProtectionReason(String protectionReason) {
        this.protectionReason = protectionReason;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateListenerReq that = (UpdateListenerReq) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.connectionLimit, that.connectionLimit)
            && Objects.equals(this.http2Enable, that.http2Enable)
            && Objects.equals(this.defaultPoolId, that.defaultPoolId)
            && Objects.equals(this.defaultTlsContainerRef, that.defaultTlsContainerRef)
            && Objects.equals(this.clientCaTlsContainerRef, that.clientCaTlsContainerRef)
            && Objects.equals(this.sniContainerRefs, that.sniContainerRefs)
            && Objects.equals(this.insertHeaders, that.insertHeaders)
            && Objects.equals(this.tlsCiphersPolicy, that.tlsCiphersPolicy)
            && Objects.equals(this.adminStateUp, that.adminStateUp)
            && Objects.equals(this.protectionStatus, that.protectionStatus)
            && Objects.equals(this.protectionReason, that.protectionReason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            description,
            connectionLimit,
            http2Enable,
            defaultPoolId,
            defaultTlsContainerRef,
            clientCaTlsContainerRef,
            sniContainerRefs,
            insertHeaders,
            tlsCiphersPolicy,
            adminStateUp,
            protectionStatus,
            protectionReason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateListenerReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    connectionLimit: ").append(toIndentedString(connectionLimit)).append("\n");
        sb.append("    http2Enable: ").append(toIndentedString(http2Enable)).append("\n");
        sb.append("    defaultPoolId: ").append(toIndentedString(defaultPoolId)).append("\n");
        sb.append("    defaultTlsContainerRef: ").append(toIndentedString(defaultTlsContainerRef)).append("\n");
        sb.append("    clientCaTlsContainerRef: ").append(toIndentedString(clientCaTlsContainerRef)).append("\n");
        sb.append("    sniContainerRefs: ").append(toIndentedString(sniContainerRefs)).append("\n");
        sb.append("    insertHeaders: ").append(toIndentedString(insertHeaders)).append("\n");
        sb.append("    tlsCiphersPolicy: ").append(toIndentedString(tlsCiphersPolicy)).append("\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    protectionStatus: ").append(toIndentedString(protectionStatus)).append("\n");
        sb.append("    protectionReason: ").append(toIndentedString(protectionReason)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
