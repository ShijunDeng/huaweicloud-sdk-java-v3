package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class BatchDeleteQueuePlansRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue_name")

    private String queueName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private BatchDeleteQueuePlansRequestBody body;

    public BatchDeleteQueuePlansRequest withQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }

    /**
     * 待删除定时扩缩计划的队列名称
     * @return queueName
     */
    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    public BatchDeleteQueuePlansRequest withBody(BatchDeleteQueuePlansRequestBody body) {
        this.body = body;
        return this;
    }

    public BatchDeleteQueuePlansRequest withBody(Consumer<BatchDeleteQueuePlansRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new BatchDeleteQueuePlansRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public BatchDeleteQueuePlansRequestBody getBody() {
        return body;
    }

    public void setBody(BatchDeleteQueuePlansRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchDeleteQueuePlansRequest that = (BatchDeleteQueuePlansRequest) obj;
        return Objects.equals(this.queueName, that.queueName) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(queueName, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteQueuePlansRequest {\n");
        sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
