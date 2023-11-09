package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 待更新属性
 */
public class UpdateQueuePropertyRequestBodyProperties {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "computeEngine.maxInstance")

    private Integer computeEngineMaxInstance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job.maxConcurrent")

    private Integer jobMaxConcurrent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "computeEngine.maxPrefetchInstance")

    private Integer computeEngineMaxPrefetchInstance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network.cidrInVpc")

    private String networkCidrInVpc;

    public UpdateQueuePropertyRequestBodyProperties withComputeEngineMaxInstance(Integer computeEngineMaxInstance) {
        this.computeEngineMaxInstance = computeEngineMaxInstance;
        return this;
    }

    /**
     * 队列能启动的最大spark driver数量
     * @return computeEngineMaxInstance
     */
    public Integer getComputeEngineMaxInstance() {
        return computeEngineMaxInstance;
    }

    public void setComputeEngineMaxInstance(Integer computeEngineMaxInstance) {
        this.computeEngineMaxInstance = computeEngineMaxInstance;
    }

    public UpdateQueuePropertyRequestBodyProperties withJobMaxConcurrent(Integer jobMaxConcurrent) {
        this.jobMaxConcurrent = jobMaxConcurrent;
        return this;
    }

    /**
     * 单个spark driver能同时运行的最大任务数量
     * @return jobMaxConcurrent
     */
    public Integer getJobMaxConcurrent() {
        return jobMaxConcurrent;
    }

    public void setJobMaxConcurrent(Integer jobMaxConcurrent) {
        this.jobMaxConcurrent = jobMaxConcurrent;
    }

    public UpdateQueuePropertyRequestBodyProperties withComputeEngineMaxPrefetchInstance(
        Integer computeEngineMaxPrefetchInstance) {
        this.computeEngineMaxPrefetchInstance = computeEngineMaxPrefetchInstance;
        return this;
    }

    /**
     * 队列预先启动的最大spark driver数量
     * @return computeEngineMaxPrefetchInstance
     */
    public Integer getComputeEngineMaxPrefetchInstance() {
        return computeEngineMaxPrefetchInstance;
    }

    public void setComputeEngineMaxPrefetchInstance(Integer computeEngineMaxPrefetchInstance) {
        this.computeEngineMaxPrefetchInstance = computeEngineMaxPrefetchInstance;
    }

    public UpdateQueuePropertyRequestBodyProperties withNetworkCidrInVpc(String networkCidrInVpc) {
        this.networkCidrInVpc = networkCidrInVpc;
        return this;
    }

    /**
     * 设置队列网段
     * @return networkCidrInVpc
     */
    public String getNetworkCidrInVpc() {
        return networkCidrInVpc;
    }

    public void setNetworkCidrInVpc(String networkCidrInVpc) {
        this.networkCidrInVpc = networkCidrInVpc;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateQueuePropertyRequestBodyProperties that = (UpdateQueuePropertyRequestBodyProperties) obj;
        return Objects.equals(this.computeEngineMaxInstance, that.computeEngineMaxInstance)
            && Objects.equals(this.jobMaxConcurrent, that.jobMaxConcurrent)
            && Objects.equals(this.computeEngineMaxPrefetchInstance, that.computeEngineMaxPrefetchInstance)
            && Objects.equals(this.networkCidrInVpc, that.networkCidrInVpc);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(computeEngineMaxInstance, jobMaxConcurrent, computeEngineMaxPrefetchInstance, networkCidrInVpc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateQueuePropertyRequestBodyProperties {\n");
        sb.append("    computeEngineMaxInstance: ").append(toIndentedString(computeEngineMaxInstance)).append("\n");
        sb.append("    jobMaxConcurrent: ").append(toIndentedString(jobMaxConcurrent)).append("\n");
        sb.append("    computeEngineMaxPrefetchInstance: ")
            .append(toIndentedString(computeEngineMaxPrefetchInstance))
            .append("\n");
        sb.append("    networkCidrInVpc: ").append(toIndentedString(networkCidrInVpc)).append("\n");
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
