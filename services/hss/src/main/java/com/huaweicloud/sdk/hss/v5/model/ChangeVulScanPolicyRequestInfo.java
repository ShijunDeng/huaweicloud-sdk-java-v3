package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ChangeVulScanPolicyRequestInfo
 */
public class ChangeVulScanPolicyRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_period")

    private String scanPeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_range_type")

    private String scanRangeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_ids")

    private List<String> hostIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_vul_types")

    private List<String> scanVulTypes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public ChangeVulScanPolicyRequestInfo withScanPeriod(String scanPeriod) {
        this.scanPeriod = scanPeriod;
        return this;
    }

    /**
     * 扫描周期 - one_day : 每天 - three_day : 每三天 - one_week : 每周
     * @return scanPeriod
     */
    public String getScanPeriod() {
        return scanPeriod;
    }

    public void setScanPeriod(String scanPeriod) {
        this.scanPeriod = scanPeriod;
    }

    public ChangeVulScanPolicyRequestInfo withScanRangeType(String scanRangeType) {
        this.scanRangeType = scanRangeType;
        return this;
    }

    /**
     * 扫描主机的范围，包含如下：   -all_host : 扫描全部主机   -specific_host : 扫描指定主机
     * @return scanRangeType
     */
    public String getScanRangeType() {
        return scanRangeType;
    }

    public void setScanRangeType(String scanRangeType) {
        this.scanRangeType = scanRangeType;
    }

    public ChangeVulScanPolicyRequestInfo withHostIds(List<String> hostIds) {
        this.hostIds = hostIds;
        return this;
    }

    public ChangeVulScanPolicyRequestInfo addHostIdsItem(String hostIdsItem) {
        if (this.hostIds == null) {
            this.hostIds = new ArrayList<>();
        }
        this.hostIds.add(hostIdsItem);
        return this;
    }

    public ChangeVulScanPolicyRequestInfo withHostIds(Consumer<List<String>> hostIdsSetter) {
        if (this.hostIds == null) {
            this.hostIds = new ArrayList<>();
        }
        hostIdsSetter.accept(this.hostIds);
        return this;
    }

    /**
     * 主机ID列表；当scan_range_type的值为specific_host时必填
     * @return hostIds
     */
    public List<String> getHostIds() {
        return hostIds;
    }

    public void setHostIds(List<String> hostIds) {
        this.hostIds = hostIds;
    }

    public ChangeVulScanPolicyRequestInfo withScanVulTypes(List<String> scanVulTypes) {
        this.scanVulTypes = scanVulTypes;
        return this;
    }

    public ChangeVulScanPolicyRequestInfo addScanVulTypesItem(String scanVulTypesItem) {
        if (this.scanVulTypes == null) {
            this.scanVulTypes = new ArrayList<>();
        }
        this.scanVulTypes.add(scanVulTypesItem);
        return this;
    }

    public ChangeVulScanPolicyRequestInfo withScanVulTypes(Consumer<List<String>> scanVulTypesSetter) {
        if (this.scanVulTypes == null) {
            this.scanVulTypes = new ArrayList<>();
        }
        scanVulTypesSetter.accept(this.scanVulTypes);
        return this;
    }

    /**
     * 扫描的漏洞类型列表
     * @return scanVulTypes
     */
    public List<String> getScanVulTypes() {
        return scanVulTypes;
    }

    public void setScanVulTypes(List<String> scanVulTypes) {
        this.scanVulTypes = scanVulTypes;
    }

    public ChangeVulScanPolicyRequestInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 扫描策略状态，包含如下：   -open : 开启   -close : 关闭
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChangeVulScanPolicyRequestInfo that = (ChangeVulScanPolicyRequestInfo) obj;
        return Objects.equals(this.scanPeriod, that.scanPeriod)
            && Objects.equals(this.scanRangeType, that.scanRangeType) && Objects.equals(this.hostIds, that.hostIds)
            && Objects.equals(this.scanVulTypes, that.scanVulTypes) && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scanPeriod, scanRangeType, hostIds, scanVulTypes, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeVulScanPolicyRequestInfo {\n");
        sb.append("    scanPeriod: ").append(toIndentedString(scanPeriod)).append("\n");
        sb.append("    scanRangeType: ").append(toIndentedString(scanRangeType)).append("\n");
        sb.append("    hostIds: ").append(toIndentedString(hostIds)).append("\n");
        sb.append("    scanVulTypes: ").append(toIndentedString(scanVulTypes)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
