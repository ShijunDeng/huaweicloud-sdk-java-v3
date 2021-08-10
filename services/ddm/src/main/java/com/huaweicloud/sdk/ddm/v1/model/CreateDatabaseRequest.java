package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class CreateDatabaseRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CreateDatabaseReq body;

    public CreateDatabaseRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /** DDM实例ID
     * 
     * @return instanceId */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public CreateDatabaseRequest withBody(CreateDatabaseReq body) {
        this.body = body;
        return this;
    }

    public CreateDatabaseRequest withBody(Consumer<CreateDatabaseReq> bodySetter) {
        if (this.body == null) {
            this.body = new CreateDatabaseReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public CreateDatabaseReq getBody() {
        return body;
    }

    public void setBody(CreateDatabaseReq body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateDatabaseRequest createDatabaseRequest = (CreateDatabaseRequest) o;
        return Objects.equals(this.instanceId, createDatabaseRequest.instanceId)
            && Objects.equals(this.body, createDatabaseRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDatabaseRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
