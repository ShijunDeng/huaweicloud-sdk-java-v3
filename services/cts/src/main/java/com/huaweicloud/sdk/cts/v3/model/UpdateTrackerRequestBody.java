package com.huaweicloud.sdk.cts.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateTrackerRequestBody
 */
public class UpdateTrackerRequestBody {

    /**
     * 标识追踪器类型。 目前支持系统追踪器类型有管理类追踪器(system)和数据类追踪器(data)。 数据类追踪器和管理类追踪器共同参数有：is_lts_enabled, obs_info; 管理类追踪器参数：is_support_trace_files_encryption, kms_id, is_support_validate, is_support_validate; 数据类追踪器参数：tracker_name, data_bucket。
     */
    public static final class TrackerTypeEnum {

        /**
         * Enum SYSTEM for value: "system"
         */
        public static final TrackerTypeEnum SYSTEM = new TrackerTypeEnum("system");

        /**
         * Enum DATA for value: "data"
         */
        public static final TrackerTypeEnum DATA = new TrackerTypeEnum("data");

        private static final Map<String, TrackerTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TrackerTypeEnum> createStaticFields() {
            Map<String, TrackerTypeEnum> map = new HashMap<>();
            map.put("system", SYSTEM);
            map.put("data", DATA);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TrackerTypeEnum(String value) {
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
        public static TrackerTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TrackerTypeEnum(value));
        }

        public static TrackerTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TrackerTypeEnum) {
                return this.value.equals(((TrackerTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tracker_type")

    private TrackerTypeEnum trackerType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tracker_name")

    private String trackerName;

    /**
     * 云服务委托名称。 参数值为\"cts_admin_trust\"时，更新追踪器会自动创建一个云服务委托：cts_admin_trust。
     */
    public static final class AgencyNameEnum {

        /**
         * Enum CTS_ADMIN_TRUST for value: "cts_admin_trust"
         */
        public static final AgencyNameEnum CTS_ADMIN_TRUST = new AgencyNameEnum("cts_admin_trust");

        private static final Map<String, AgencyNameEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AgencyNameEnum> createStaticFields() {
            Map<String, AgencyNameEnum> map = new HashMap<>();
            map.put("cts_admin_trust", CTS_ADMIN_TRUST);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AgencyNameEnum(String value) {
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
        public static AgencyNameEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AgencyNameEnum(value));
        }

        public static AgencyNameEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AgencyNameEnum) {
                return this.value.equals(((AgencyNameEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_name")

    private AgencyNameEnum agencyName;

    /**
     * 标识追踪器状态，该接口中可修改的状态包括正常（enabled）和停止（disabled）。如果选择修改状态为停止，则修改成功后追踪器停止记录事件。
     */
    public static final class StatusEnum {

        /**
         * Enum ENABLED for value: "enabled"
         */
        public static final StatusEnum ENABLED = new StatusEnum("enabled");

        /**
         * Enum DISABLED for value: "disabled"
         */
        public static final StatusEnum DISABLED = new StatusEnum("disabled");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("enabled", ENABLED);
            map.put("disabled", DISABLED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_organization_tracker")

    private Boolean isOrganizationTracker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "management_event_selector")

    private ManagementEventSelector managementEventSelector;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_lts_enabled")

    private Boolean isLtsEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_info")

    private TrackerObsInfo obsInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_support_trace_files_encryption")

    private Boolean isSupportTraceFilesEncryption;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kms_id")

    private String kmsId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_support_validate")

    private Boolean isSupportValidate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_bucket")

    private DataBucket dataBucket;

    public UpdateTrackerRequestBody withTrackerType(TrackerTypeEnum trackerType) {
        this.trackerType = trackerType;
        return this;
    }

    /**
     * 标识追踪器类型。 目前支持系统追踪器类型有管理类追踪器(system)和数据类追踪器(data)。 数据类追踪器和管理类追踪器共同参数有：is_lts_enabled, obs_info; 管理类追踪器参数：is_support_trace_files_encryption, kms_id, is_support_validate, is_support_validate; 数据类追踪器参数：tracker_name, data_bucket。
     * @return trackerType
     */
    public TrackerTypeEnum getTrackerType() {
        return trackerType;
    }

    public void setTrackerType(TrackerTypeEnum trackerType) {
        this.trackerType = trackerType;
    }

    public UpdateTrackerRequestBody withTrackerName(String trackerName) {
        this.trackerName = trackerName;
        return this;
    }

    /**
     * 标识追踪器名称。 当\"tracker_type\"参数值为\"system\"时该参数为默认值\"system\"。 当\"tracker_type\"参数值为\"data\"时该参数需要指定追踪器名称\"。
     * @return trackerName
     */
    public String getTrackerName() {
        return trackerName;
    }

    public void setTrackerName(String trackerName) {
        this.trackerName = trackerName;
    }

    public UpdateTrackerRequestBody withAgencyName(AgencyNameEnum agencyName) {
        this.agencyName = agencyName;
        return this;
    }

    /**
     * 云服务委托名称。 参数值为\"cts_admin_trust\"时，更新追踪器会自动创建一个云服务委托：cts_admin_trust。
     * @return agencyName
     */
    public AgencyNameEnum getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(AgencyNameEnum agencyName) {
        this.agencyName = agencyName;
    }

    public UpdateTrackerRequestBody withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 标识追踪器状态，该接口中可修改的状态包括正常（enabled）和停止（disabled）。如果选择修改状态为停止，则修改成功后追踪器停止记录事件。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public UpdateTrackerRequestBody withIsOrganizationTracker(Boolean isOrganizationTracker) {
        this.isOrganizationTracker = isOrganizationTracker;
        return this;
    }

    /**
     * 是否应用到我的组织。 只针对管理类追踪器。设置为true时，ORG组织下所有成员当前区域的审计日志会转储到该追踪器配置的OBS桶或者LTS日志流，但是事件列表界面不支持查看其它组织成员的审计日志。
     * @return isOrganizationTracker
     */
    public Boolean getIsOrganizationTracker() {
        return isOrganizationTracker;
    }

    public void setIsOrganizationTracker(Boolean isOrganizationTracker) {
        this.isOrganizationTracker = isOrganizationTracker;
    }

    public UpdateTrackerRequestBody withManagementEventSelector(ManagementEventSelector managementEventSelector) {
        this.managementEventSelector = managementEventSelector;
        return this;
    }

    public UpdateTrackerRequestBody withManagementEventSelector(
        Consumer<ManagementEventSelector> managementEventSelectorSetter) {
        if (this.managementEventSelector == null) {
            this.managementEventSelector = new ManagementEventSelector();
            managementEventSelectorSetter.accept(this.managementEventSelector);
        }

        return this;
    }

    /**
     * Get managementEventSelector
     * @return managementEventSelector
     */
    public ManagementEventSelector getManagementEventSelector() {
        return managementEventSelector;
    }

    public void setManagementEventSelector(ManagementEventSelector managementEventSelector) {
        this.managementEventSelector = managementEventSelector;
    }

    public UpdateTrackerRequestBody withIsLtsEnabled(Boolean isLtsEnabled) {
        this.isLtsEnabled = isLtsEnabled;
        return this;
    }

    /**
     * 是否打开事件分析。
     * @return isLtsEnabled
     */
    public Boolean getIsLtsEnabled() {
        return isLtsEnabled;
    }

    public void setIsLtsEnabled(Boolean isLtsEnabled) {
        this.isLtsEnabled = isLtsEnabled;
    }

    public UpdateTrackerRequestBody withObsInfo(TrackerObsInfo obsInfo) {
        this.obsInfo = obsInfo;
        return this;
    }

    public UpdateTrackerRequestBody withObsInfo(Consumer<TrackerObsInfo> obsInfoSetter) {
        if (this.obsInfo == null) {
            this.obsInfo = new TrackerObsInfo();
            obsInfoSetter.accept(this.obsInfo);
        }

        return this;
    }

    /**
     * Get obsInfo
     * @return obsInfo
     */
    public TrackerObsInfo getObsInfo() {
        return obsInfo;
    }

    public void setObsInfo(TrackerObsInfo obsInfo) {
        this.obsInfo = obsInfo;
    }

    public UpdateTrackerRequestBody withIsSupportTraceFilesEncryption(Boolean isSupportTraceFilesEncryption) {
        this.isSupportTraceFilesEncryption = isSupportTraceFilesEncryption;
        return this;
    }

    /**
     * 事件文件转储加密功能开关。 当\"tracker_type\"参数值为\"system\"时该参数值有效。 该参数必须与kms_id参数同时使用。
     * @return isSupportTraceFilesEncryption
     */
    public Boolean getIsSupportTraceFilesEncryption() {
        return isSupportTraceFilesEncryption;
    }

    public void setIsSupportTraceFilesEncryption(Boolean isSupportTraceFilesEncryption) {
        this.isSupportTraceFilesEncryption = isSupportTraceFilesEncryption;
    }

    public UpdateTrackerRequestBody withKmsId(String kmsId) {
        this.kmsId = kmsId;
        return this;
    }

    /**
     * 事件文件转储加密所采用的秘钥id（从KMS获取）。 当\"tracker_type\"参数值为\"system\"时该参数值有效。 当\"is_support_trace_files_encryption\"参数值为“是”时，此参数为必选项。
     * @return kmsId
     */
    public String getKmsId() {
        return kmsId;
    }

    public void setKmsId(String kmsId) {
        this.kmsId = kmsId;
    }

    public UpdateTrackerRequestBody withIsSupportValidate(Boolean isSupportValidate) {
        this.isSupportValidate = isSupportValidate;
        return this;
    }

    /**
     * 事件文件转储时是否打开事件文件校验。 当\"tracker_type\"参数值为\"system\"时该参数值有效。
     * @return isSupportValidate
     */
    public Boolean getIsSupportValidate() {
        return isSupportValidate;
    }

    public void setIsSupportValidate(Boolean isSupportValidate) {
        this.isSupportValidate = isSupportValidate;
    }

    public UpdateTrackerRequestBody withDataBucket(DataBucket dataBucket) {
        this.dataBucket = dataBucket;
        return this;
    }

    public UpdateTrackerRequestBody withDataBucket(Consumer<DataBucket> dataBucketSetter) {
        if (this.dataBucket == null) {
            this.dataBucket = new DataBucket();
            dataBucketSetter.accept(this.dataBucket);
        }

        return this;
    }

    /**
     * Get dataBucket
     * @return dataBucket
     */
    public DataBucket getDataBucket() {
        return dataBucket;
    }

    public void setDataBucket(DataBucket dataBucket) {
        this.dataBucket = dataBucket;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateTrackerRequestBody that = (UpdateTrackerRequestBody) obj;
        return Objects.equals(this.trackerType, that.trackerType) && Objects.equals(this.trackerName, that.trackerName)
            && Objects.equals(this.agencyName, that.agencyName) && Objects.equals(this.status, that.status)
            && Objects.equals(this.isOrganizationTracker, that.isOrganizationTracker)
            && Objects.equals(this.managementEventSelector, that.managementEventSelector)
            && Objects.equals(this.isLtsEnabled, that.isLtsEnabled) && Objects.equals(this.obsInfo, that.obsInfo)
            && Objects.equals(this.isSupportTraceFilesEncryption, that.isSupportTraceFilesEncryption)
            && Objects.equals(this.kmsId, that.kmsId) && Objects.equals(this.isSupportValidate, that.isSupportValidate)
            && Objects.equals(this.dataBucket, that.dataBucket);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trackerType,
            trackerName,
            agencyName,
            status,
            isOrganizationTracker,
            managementEventSelector,
            isLtsEnabled,
            obsInfo,
            isSupportTraceFilesEncryption,
            kmsId,
            isSupportValidate,
            dataBucket);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTrackerRequestBody {\n");
        sb.append("    trackerType: ").append(toIndentedString(trackerType)).append("\n");
        sb.append("    trackerName: ").append(toIndentedString(trackerName)).append("\n");
        sb.append("    agencyName: ").append(toIndentedString(agencyName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    isOrganizationTracker: ").append(toIndentedString(isOrganizationTracker)).append("\n");
        sb.append("    managementEventSelector: ").append(toIndentedString(managementEventSelector)).append("\n");
        sb.append("    isLtsEnabled: ").append(toIndentedString(isLtsEnabled)).append("\n");
        sb.append("    obsInfo: ").append(toIndentedString(obsInfo)).append("\n");
        sb.append("    isSupportTraceFilesEncryption: ")
            .append(toIndentedString(isSupportTraceFilesEncryption))
            .append("\n");
        sb.append("    kmsId: ").append(toIndentedString(kmsId)).append("\n");
        sb.append("    isSupportValidate: ").append(toIndentedString(isSupportValidate)).append("\n");
        sb.append("    dataBucket: ").append(toIndentedString(dataBucket)).append("\n");
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
