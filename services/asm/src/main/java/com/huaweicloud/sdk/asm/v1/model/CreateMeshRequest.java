package com.huaweicloud.sdk.asm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateMeshRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Apply-ProjectID")

    private String xApplyProjectID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private Mesh body;

    public CreateMeshRequest withXApplyProjectID(String xApplyProjectID) {
        this.xApplyProjectID = xApplyProjectID;
        return this;
    }

    /**
     * 网格所属ProjectID
     * @return xApplyProjectID
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Apply-ProjectID")
    public String getXApplyProjectID() {
        return xApplyProjectID;
    }

    public void setXApplyProjectID(String xApplyProjectID) {
        this.xApplyProjectID = xApplyProjectID;
    }

    public CreateMeshRequest withBody(Mesh body) {
        this.body = body;
        return this;
    }

    public CreateMeshRequest withBody(Consumer<Mesh> bodySetter) {
        if (this.body == null) {
            this.body = new Mesh();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public Mesh getBody() {
        return body;
    }

    public void setBody(Mesh body) {
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
        CreateMeshRequest that = (CreateMeshRequest) obj;
        return Objects.equals(this.xApplyProjectID, that.xApplyProjectID) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xApplyProjectID, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateMeshRequest {\n");
        sb.append("    xApplyProjectID: ").append(toIndentedString(xApplyProjectID)).append("\n");
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
