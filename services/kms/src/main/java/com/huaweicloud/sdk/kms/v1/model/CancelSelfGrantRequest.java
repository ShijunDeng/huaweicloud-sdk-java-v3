package com.huaweicloud.sdk.kms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class CancelSelfGrantRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_id")

    private String versionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private RevokeGrantRequestBody body;

    public CancelSelfGrantRequest withVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }

    /** API版本号
     * 
     * @return versionId */
    public String getVersionId() {
        return versionId;
    }

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    public CancelSelfGrantRequest withBody(RevokeGrantRequestBody body) {
        this.body = body;
        return this;
    }

    public CancelSelfGrantRequest withBody(Consumer<RevokeGrantRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new RevokeGrantRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public RevokeGrantRequestBody getBody() {
        return body;
    }

    public void setBody(RevokeGrantRequestBody body) {
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
        CancelSelfGrantRequest cancelSelfGrantRequest = (CancelSelfGrantRequest) o;
        return Objects.equals(this.versionId, cancelSelfGrantRequest.versionId)
            && Objects.equals(this.body, cancelSelfGrantRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(versionId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CancelSelfGrantRequest {\n");
        sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
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
