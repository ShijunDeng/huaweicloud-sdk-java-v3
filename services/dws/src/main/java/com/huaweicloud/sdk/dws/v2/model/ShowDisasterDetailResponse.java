package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowDisasterDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dr_type")

    private String drType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "primary_cluster")

    private DisasterRecoveryCluster primaryCluster;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "standby_cluster")

    private DisasterRecoveryCluster standbyCluster;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dr_sync_period")

    private String drSyncPeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    public ShowDisasterDetailResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 容灾ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowDisasterDetailResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 容灾名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowDisasterDetailResponse withDrType(String drType) {
        this.drType = drType;
        return this;
    }

    /**
     * 容灾类型
     * @return drType
     */
    public String getDrType() {
        return drType;
    }

    public void setDrType(String drType) {
        this.drType = drType;
    }

    public ShowDisasterDetailResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 容灾状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowDisasterDetailResponse withPrimaryCluster(DisasterRecoveryCluster primaryCluster) {
        this.primaryCluster = primaryCluster;
        return this;
    }

    public ShowDisasterDetailResponse withPrimaryCluster(Consumer<DisasterRecoveryCluster> primaryClusterSetter) {
        if (this.primaryCluster == null) {
            this.primaryCluster = new DisasterRecoveryCluster();
            primaryClusterSetter.accept(this.primaryCluster);
        }

        return this;
    }

    /**
     * Get primaryCluster
     * @return primaryCluster
     */
    public DisasterRecoveryCluster getPrimaryCluster() {
        return primaryCluster;
    }

    public void setPrimaryCluster(DisasterRecoveryCluster primaryCluster) {
        this.primaryCluster = primaryCluster;
    }

    public ShowDisasterDetailResponse withStandbyCluster(DisasterRecoveryCluster standbyCluster) {
        this.standbyCluster = standbyCluster;
        return this;
    }

    public ShowDisasterDetailResponse withStandbyCluster(Consumer<DisasterRecoveryCluster> standbyClusterSetter) {
        if (this.standbyCluster == null) {
            this.standbyCluster = new DisasterRecoveryCluster();
            standbyClusterSetter.accept(this.standbyCluster);
        }

        return this;
    }

    /**
     * Get standbyCluster
     * @return standbyCluster
     */
    public DisasterRecoveryCluster getStandbyCluster() {
        return standbyCluster;
    }

    public void setStandbyCluster(DisasterRecoveryCluster standbyCluster) {
        this.standbyCluster = standbyCluster;
    }

    public ShowDisasterDetailResponse withDrSyncPeriod(String drSyncPeriod) {
        this.drSyncPeriod = drSyncPeriod;
        return this;
    }

    /**
     * 容灾同步周期
     * @return drSyncPeriod
     */
    public String getDrSyncPeriod() {
        return drSyncPeriod;
    }

    public void setDrSyncPeriod(String drSyncPeriod) {
        this.drSyncPeriod = drSyncPeriod;
    }

    public ShowDisasterDetailResponse withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 容灾启动时间
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ShowDisasterDetailResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 容灾创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowDisasterDetailResponse showDisasterDetailResponse = (ShowDisasterDetailResponse) o;
        return Objects.equals(this.id, showDisasterDetailResponse.id)
            && Objects.equals(this.name, showDisasterDetailResponse.name)
            && Objects.equals(this.drType, showDisasterDetailResponse.drType)
            && Objects.equals(this.status, showDisasterDetailResponse.status)
            && Objects.equals(this.primaryCluster, showDisasterDetailResponse.primaryCluster)
            && Objects.equals(this.standbyCluster, showDisasterDetailResponse.standbyCluster)
            && Objects.equals(this.drSyncPeriod, showDisasterDetailResponse.drSyncPeriod)
            && Objects.equals(this.startTime, showDisasterDetailResponse.startTime)
            && Objects.equals(this.createTime, showDisasterDetailResponse.createTime);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(id, name, drType, status, primaryCluster, standbyCluster, drSyncPeriod, startTime, createTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDisasterDetailResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    drType: ").append(toIndentedString(drType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    primaryCluster: ").append(toIndentedString(primaryCluster)).append("\n");
        sb.append("    standbyCluster: ").append(toIndentedString(standbyCluster)).append("\n");
        sb.append("    drSyncPeriod: ").append(toIndentedString(drSyncPeriod)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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
