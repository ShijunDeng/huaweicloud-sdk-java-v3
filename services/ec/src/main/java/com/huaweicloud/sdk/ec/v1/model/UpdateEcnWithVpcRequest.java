package com.huaweicloud.sdk.ec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateEcnWithVpcRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ecn_id")

    private String ecnId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relation_id")

    private String relationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateEcnWithVpcRequestBody body;

    public UpdateEcnWithVpcRequest withEcnId(String ecnId) {
        this.ecnId = ecnId;
        return this;
    }

    /**
     * 企业连接网络ID
     * @return ecnId
     */
    public String getEcnId() {
        return ecnId;
    }

    public void setEcnId(String ecnId) {
        this.ecnId = ecnId;
    }

    public UpdateEcnWithVpcRequest withRelationId(String relationId) {
        this.relationId = relationId;
        return this;
    }

    /**
     * 企业连接网络绑定关系ID
     * @return relationId
     */
    public String getRelationId() {
        return relationId;
    }

    public void setRelationId(String relationId) {
        this.relationId = relationId;
    }

    public UpdateEcnWithVpcRequest withBody(UpdateEcnWithVpcRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateEcnWithVpcRequest withBody(Consumer<UpdateEcnWithVpcRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateEcnWithVpcRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateEcnWithVpcRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateEcnWithVpcRequestBody body) {
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
        UpdateEcnWithVpcRequest that = (UpdateEcnWithVpcRequest) obj;
        return Objects.equals(this.ecnId, that.ecnId) && Objects.equals(this.relationId, that.relationId)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ecnId, relationId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateEcnWithVpcRequest {\n");
        sb.append("    ecnId: ").append(toIndentedString(ecnId)).append("\n");
        sb.append("    relationId: ").append(toIndentedString(relationId)).append("\n");
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
