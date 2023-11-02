package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * IncidentDetail
 */
public class IncidentDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_object")

    private Incident dataObject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataclass_ref")

    private AlertDetailDataclassRef dataclassRef;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "format_version")

    private Integer formatVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private Integer version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    public IncidentDetail withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 记录时间，格式ISO8601：YYYY-MM-DDTHH:mm:ss.ms+timezone。时区信息为事件发生时区，无法解析时区的时间，默认时区填东八区
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public IncidentDetail withDataObject(Incident dataObject) {
        this.dataObject = dataObject;
        return this;
    }

    public IncidentDetail withDataObject(Consumer<Incident> dataObjectSetter) {
        if (this.dataObject == null) {
            this.dataObject = new Incident();
            dataObjectSetter.accept(this.dataObject);
        }

        return this;
    }

    /**
     * Get dataObject
     * @return dataObject
     */
    public Incident getDataObject() {
        return dataObject;
    }

    public void setDataObject(Incident dataObject) {
        this.dataObject = dataObject;
    }

    public IncidentDetail withDataclassRef(AlertDetailDataclassRef dataclassRef) {
        this.dataclassRef = dataclassRef;
        return this;
    }

    public IncidentDetail withDataclassRef(Consumer<AlertDetailDataclassRef> dataclassRefSetter) {
        if (this.dataclassRef == null) {
            this.dataclassRef = new AlertDetailDataclassRef();
            dataclassRefSetter.accept(this.dataclassRef);
        }

        return this;
    }

    /**
     * Get dataclassRef
     * @return dataclassRef
     */
    public AlertDetailDataclassRef getDataclassRef() {
        return dataclassRef;
    }

    public void setDataclassRef(AlertDetailDataclassRef dataclassRef) {
        this.dataclassRef = dataclassRef;
    }

    public IncidentDetail withFormatVersion(Integer formatVersion) {
        this.formatVersion = formatVersion;
        return this;
    }

    /**
     * 格式版本
     * minimum: 0
     * maximum: 999
     * @return formatVersion
     */
    public Integer getFormatVersion() {
        return formatVersion;
    }

    public void setFormatVersion(Integer formatVersion) {
        this.formatVersion = formatVersion;
    }

    public IncidentDetail withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 事件唯一标识，UUID格式，最大36个字符
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public IncidentDetail withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 当前项目的id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public IncidentDetail withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间，格式ISO8601：YYYY-MM-DDTHH:mm:ss.ms+timezone。时区信息为告警发生时区，无法解析时区的时间，默认时区填东八区
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public IncidentDetail withVersion(Integer version) {
        this.version = version;
        return this;
    }

    /**
     * 版本
     * minimum: 0
     * maximum: 999
     * @return version
     */
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public IncidentDetail withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 当前的工作空间id
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IncidentDetail that = (IncidentDetail) obj;
        return Objects.equals(this.createTime, that.createTime) && Objects.equals(this.dataObject, that.dataObject)
            && Objects.equals(this.dataclassRef, that.dataclassRef)
            && Objects.equals(this.formatVersion, that.formatVersion) && Objects.equals(this.id, that.id)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.version, that.version) && Objects.equals(this.workspaceId, that.workspaceId);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(createTime, dataObject, dataclassRef, formatVersion, id, projectId, updateTime, version, workspaceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IncidentDetail {\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    dataObject: ").append(toIndentedString(dataObject)).append("\n");
        sb.append("    dataclassRef: ").append(toIndentedString(dataclassRef)).append("\n");
        sb.append("    formatVersion: ").append(toIndentedString(formatVersion)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
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
