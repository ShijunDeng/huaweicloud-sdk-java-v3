package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 创建防护策略
 */
public class ProtectionProxyInfoRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_id")

    private String policyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_name")

    private String policyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protection_mode")

    private String protectionMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bait_protection_status")

    private String baitProtectionStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protection_directory")

    private String protectionDirectory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protection_type")

    private String protectionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exclude_directory")

    private String excludeDirectory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runtime_detection_status")

    private String runtimeDetectionStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operating_system")

    private String operatingSystem;

    public ProtectionProxyInfoRequestInfo withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * 策略ID
     * @return policyId
     */
    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public ProtectionProxyInfoRequestInfo withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * 策略名称
     * @return policyName
     */
    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public ProtectionProxyInfoRequestInfo withProtectionMode(String protectionMode) {
        this.protectionMode = protectionMode;
        return this;
    }

    /**
     * 防护动作，包含如下：   - alarm_and_isolation ：告警并自动隔离。   - alarm_only ：仅告警。
     * @return protectionMode
     */
    public String getProtectionMode() {
        return protectionMode;
    }

    public void setProtectionMode(String protectionMode) {
        this.protectionMode = protectionMode;
    }

    public ProtectionProxyInfoRequestInfo withBaitProtectionStatus(String baitProtectionStatus) {
        this.baitProtectionStatus = baitProtectionStatus;
        return this;
    }

    /**
     * 是否开启诱饵防护，包含如下1种, 默认为开启防护诱饵防护。   - opened ：开启。   - closed ：关闭。
     * @return baitProtectionStatus
     */
    public String getBaitProtectionStatus() {
        return baitProtectionStatus;
    }

    public void setBaitProtectionStatus(String baitProtectionStatus) {
        this.baitProtectionStatus = baitProtectionStatus;
    }

    public ProtectionProxyInfoRequestInfo withProtectionDirectory(String protectionDirectory) {
        this.protectionDirectory = protectionDirectory;
        return this;
    }

    /**
     * 防护目录
     * @return protectionDirectory
     */
    public String getProtectionDirectory() {
        return protectionDirectory;
    }

    public void setProtectionDirectory(String protectionDirectory) {
        this.protectionDirectory = protectionDirectory;
    }

    public ProtectionProxyInfoRequestInfo withProtectionType(String protectionType) {
        this.protectionType = protectionType;
        return this;
    }

    /**
     * 防护类型
     * @return protectionType
     */
    public String getProtectionType() {
        return protectionType;
    }

    public void setProtectionType(String protectionType) {
        this.protectionType = protectionType;
    }

    public ProtectionProxyInfoRequestInfo withExcludeDirectory(String excludeDirectory) {
        this.excludeDirectory = excludeDirectory;
        return this;
    }

    /**
     * 排除目录
     * @return excludeDirectory
     */
    public String getExcludeDirectory() {
        return excludeDirectory;
    }

    public void setExcludeDirectory(String excludeDirectory) {
        this.excludeDirectory = excludeDirectory;
    }

    public ProtectionProxyInfoRequestInfo withRuntimeDetectionStatus(String runtimeDetectionStatus) {
        this.runtimeDetectionStatus = runtimeDetectionStatus;
        return this;
    }

    /**
     * 是否运行时检测，包含如下2种，暂时只有关闭一种状态，为保留字段。   - opened ：开启。   - closed ：关闭。
     * @return runtimeDetectionStatus
     */
    public String getRuntimeDetectionStatus() {
        return runtimeDetectionStatus;
    }

    public void setRuntimeDetectionStatus(String runtimeDetectionStatus) {
        this.runtimeDetectionStatus = runtimeDetectionStatus;
    }

    public ProtectionProxyInfoRequestInfo withOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
        return this;
    }

    /**
     * 操作系统，包含如下：   - Windows : 无需处理   - Linux : 已忽略
     * @return operatingSystem
     */
    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProtectionProxyInfoRequestInfo protectionProxyInfoRequestInfo = (ProtectionProxyInfoRequestInfo) o;
        return Objects.equals(this.policyId, protectionProxyInfoRequestInfo.policyId)
            && Objects.equals(this.policyName, protectionProxyInfoRequestInfo.policyName)
            && Objects.equals(this.protectionMode, protectionProxyInfoRequestInfo.protectionMode)
            && Objects.equals(this.baitProtectionStatus, protectionProxyInfoRequestInfo.baitProtectionStatus)
            && Objects.equals(this.protectionDirectory, protectionProxyInfoRequestInfo.protectionDirectory)
            && Objects.equals(this.protectionType, protectionProxyInfoRequestInfo.protectionType)
            && Objects.equals(this.excludeDirectory, protectionProxyInfoRequestInfo.excludeDirectory)
            && Objects.equals(this.runtimeDetectionStatus, protectionProxyInfoRequestInfo.runtimeDetectionStatus)
            && Objects.equals(this.operatingSystem, protectionProxyInfoRequestInfo.operatingSystem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyId,
            policyName,
            protectionMode,
            baitProtectionStatus,
            protectionDirectory,
            protectionType,
            excludeDirectory,
            runtimeDetectionStatus,
            operatingSystem);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProtectionProxyInfoRequestInfo {\n");
        sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
        sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
        sb.append("    protectionMode: ").append(toIndentedString(protectionMode)).append("\n");
        sb.append("    baitProtectionStatus: ").append(toIndentedString(baitProtectionStatus)).append("\n");
        sb.append("    protectionDirectory: ").append(toIndentedString(protectionDirectory)).append("\n");
        sb.append("    protectionType: ").append(toIndentedString(protectionType)).append("\n");
        sb.append("    excludeDirectory: ").append(toIndentedString(excludeDirectory)).append("\n");
        sb.append("    runtimeDetectionStatus: ").append(toIndentedString(runtimeDetectionStatus)).append("\n");
        sb.append("    operatingSystem: ").append(toIndentedString(operatingSystem)).append("\n");
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