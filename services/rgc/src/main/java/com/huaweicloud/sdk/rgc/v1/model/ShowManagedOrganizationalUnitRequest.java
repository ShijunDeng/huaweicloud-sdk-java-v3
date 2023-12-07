package com.huaweicloud.sdk.rgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowManagedOrganizationalUnitRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "managed_organization_unit_id")

    private String managedOrganizationUnitId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Security-Token")

    private String xSecurityToken;

    public ShowManagedOrganizationalUnitRequest withManagedOrganizationUnitId(String managedOrganizationUnitId) {
        this.managedOrganizationUnitId = managedOrganizationUnitId;
        return this;
    }

    /**
     * OU ID。
     * @return managedOrganizationUnitId
     */
    public String getManagedOrganizationUnitId() {
        return managedOrganizationUnitId;
    }

    public void setManagedOrganizationUnitId(String managedOrganizationUnitId) {
        this.managedOrganizationUnitId = managedOrganizationUnitId;
    }

    public ShowManagedOrganizationalUnitRequest withXSecurityToken(String xSecurityToken) {
        this.xSecurityToken = xSecurityToken;
        return this;
    }

    /**
     * 如果正在使用临时安全凭据，则此header是必需的，该值是临时安全凭据的安全令牌（会话令牌）。
     * @return xSecurityToken
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Security-Token")
    public String getXSecurityToken() {
        return xSecurityToken;
    }

    public void setXSecurityToken(String xSecurityToken) {
        this.xSecurityToken = xSecurityToken;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowManagedOrganizationalUnitRequest that = (ShowManagedOrganizationalUnitRequest) obj;
        return Objects.equals(this.managedOrganizationUnitId, that.managedOrganizationUnitId)
            && Objects.equals(this.xSecurityToken, that.xSecurityToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(managedOrganizationUnitId, xSecurityToken);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowManagedOrganizationalUnitRequest {\n");
        sb.append("    managedOrganizationUnitId: ").append(toIndentedString(managedOrganizationUnitId)).append("\n");
        sb.append("    xSecurityToken: ").append(toIndentedString(xSecurityToken)).append("\n");
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
