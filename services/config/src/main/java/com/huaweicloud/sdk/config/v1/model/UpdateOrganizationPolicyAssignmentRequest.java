package com.huaweicloud.sdk.config.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateOrganizationPolicyAssignmentRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "organization_id")

    private String organizationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "organization_policy_assignment_id")

    private String organizationPolicyAssignmentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private OrganizationPolicyAssignmentRequest body;

    public UpdateOrganizationPolicyAssignmentRequest withOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }

    /**
     * 组织ID。
     * @return organizationId
     */
    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public UpdateOrganizationPolicyAssignmentRequest withOrganizationPolicyAssignmentId(
        String organizationPolicyAssignmentId) {
        this.organizationPolicyAssignmentId = organizationPolicyAssignmentId;
        return this;
    }

    /**
     * 组织合规规则ID。
     * @return organizationPolicyAssignmentId
     */
    public String getOrganizationPolicyAssignmentId() {
        return organizationPolicyAssignmentId;
    }

    public void setOrganizationPolicyAssignmentId(String organizationPolicyAssignmentId) {
        this.organizationPolicyAssignmentId = organizationPolicyAssignmentId;
    }

    public UpdateOrganizationPolicyAssignmentRequest withBody(OrganizationPolicyAssignmentRequest body) {
        this.body = body;
        return this;
    }

    public UpdateOrganizationPolicyAssignmentRequest withBody(
        Consumer<OrganizationPolicyAssignmentRequest> bodySetter) {
        if (this.body == null) {
            this.body = new OrganizationPolicyAssignmentRequest();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public OrganizationPolicyAssignmentRequest getBody() {
        return body;
    }

    public void setBody(OrganizationPolicyAssignmentRequest body) {
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
        UpdateOrganizationPolicyAssignmentRequest that = (UpdateOrganizationPolicyAssignmentRequest) obj;
        return Objects.equals(this.organizationId, that.organizationId)
            && Objects.equals(this.organizationPolicyAssignmentId, that.organizationPolicyAssignmentId)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(organizationId, organizationPolicyAssignmentId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateOrganizationPolicyAssignmentRequest {\n");
        sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
        sb.append("    organizationPolicyAssignmentId: ")
            .append(toIndentedString(organizationPolicyAssignmentId))
            .append("\n");
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
