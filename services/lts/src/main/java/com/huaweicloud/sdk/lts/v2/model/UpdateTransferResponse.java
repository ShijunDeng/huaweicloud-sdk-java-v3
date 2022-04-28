package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateTransferResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_group_id")

    private String logGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_group_name")

    private String logGroupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_streams")

    private List<CreateTransferResponseBodyLogStreams> logStreams = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_transfer_id")

    private String logTransferId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_transfer_info")

    private CreateTransferResponseBodyLogTransferInfo logTransferInfo;

    public UpdateTransferResponse withLogGroupId(String logGroupId) {
        this.logGroupId = logGroupId;
        return this;
    }

    /**
     * 日志组ID
     * @return logGroupId
     */
    public String getLogGroupId() {
        return logGroupId;
    }

    public void setLogGroupId(String logGroupId) {
        this.logGroupId = logGroupId;
    }

    public UpdateTransferResponse withLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
        return this;
    }

    /**
     * 日志组名称
     * @return logGroupName
     */
    public String getLogGroupName() {
        return logGroupName;
    }

    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    public UpdateTransferResponse withLogStreams(List<CreateTransferResponseBodyLogStreams> logStreams) {
        this.logStreams = logStreams;
        return this;
    }

    public UpdateTransferResponse addLogStreamsItem(CreateTransferResponseBodyLogStreams logStreamsItem) {
        if (this.logStreams == null) {
            this.logStreams = new ArrayList<>();
        }
        this.logStreams.add(logStreamsItem);
        return this;
    }

    public UpdateTransferResponse withLogStreams(
        Consumer<List<CreateTransferResponseBodyLogStreams>> logStreamsSetter) {
        if (this.logStreams == null) {
            this.logStreams = new ArrayList<>();
        }
        logStreamsSetter.accept(this.logStreams);
        return this;
    }

    /**
     * 日志流ID集合
     * @return logStreams
     */
    public List<CreateTransferResponseBodyLogStreams> getLogStreams() {
        return logStreams;
    }

    public void setLogStreams(List<CreateTransferResponseBodyLogStreams> logStreams) {
        this.logStreams = logStreams;
    }

    public UpdateTransferResponse withLogTransferId(String logTransferId) {
        this.logTransferId = logTransferId;
        return this;
    }

    /**
     * 日志转储ID
     * @return logTransferId
     */
    public String getLogTransferId() {
        return logTransferId;
    }

    public void setLogTransferId(String logTransferId) {
        this.logTransferId = logTransferId;
    }

    public UpdateTransferResponse withLogTransferInfo(CreateTransferResponseBodyLogTransferInfo logTransferInfo) {
        this.logTransferInfo = logTransferInfo;
        return this;
    }

    public UpdateTransferResponse withLogTransferInfo(
        Consumer<CreateTransferResponseBodyLogTransferInfo> logTransferInfoSetter) {
        if (this.logTransferInfo == null) {
            this.logTransferInfo = new CreateTransferResponseBodyLogTransferInfo();
            logTransferInfoSetter.accept(this.logTransferInfo);
        }

        return this;
    }

    /**
     * Get logTransferInfo
     * @return logTransferInfo
     */
    public CreateTransferResponseBodyLogTransferInfo getLogTransferInfo() {
        return logTransferInfo;
    }

    public void setLogTransferInfo(CreateTransferResponseBodyLogTransferInfo logTransferInfo) {
        this.logTransferInfo = logTransferInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateTransferResponse updateTransferResponse = (UpdateTransferResponse) o;
        return Objects.equals(this.logGroupId, updateTransferResponse.logGroupId)
            && Objects.equals(this.logGroupName, updateTransferResponse.logGroupName)
            && Objects.equals(this.logStreams, updateTransferResponse.logStreams)
            && Objects.equals(this.logTransferId, updateTransferResponse.logTransferId)
            && Objects.equals(this.logTransferInfo, updateTransferResponse.logTransferInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logGroupId, logGroupName, logStreams, logTransferId, logTransferInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTransferResponse {\n");
        sb.append("    logGroupId: ").append(toIndentedString(logGroupId)).append("\n");
        sb.append("    logGroupName: ").append(toIndentedString(logGroupName)).append("\n");
        sb.append("    logStreams: ").append(toIndentedString(logStreams)).append("\n");
        sb.append("    logTransferId: ").append(toIndentedString(logTransferId)).append("\n");
        sb.append("    logTransferInfo: ").append(toIndentedString(logTransferInfo)).append("\n");
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