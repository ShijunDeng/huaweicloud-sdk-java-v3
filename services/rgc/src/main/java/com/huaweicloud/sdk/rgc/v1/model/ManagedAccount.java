package com.huaweicloud.sdk.rgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 纳管的OU信息。
 */
public class ManagedAccount {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phone")

    private String phone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manage_account_id")

    private String manageAccountId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_id")

    private String accountId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_name")

    private String accountName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_email")

    private String accountEmail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_type")

    private String accountType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_organization_unit_id")

    private String parentOrganizationUnitId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_organization_unit_name")

    private String parentOrganizationUnitName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "identity_store_user_name")

    private String identityStoreUserName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "identity_store_email_name")

    private String identityStoreEmailName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blueprint_product_id")

    private String blueprintProductId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blueprint_product_version")

    private String blueprintProductVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blueprint_status")

    private String blueprintStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "regions")

    private List<RegionManagedList> regions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    public ManagedAccount withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * 手机号码。
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ManagedAccount withManageAccountId(String manageAccountId) {
        this.manageAccountId = manageAccountId;
        return this;
    }

    /**
     * 管理账号ID。
     * @return manageAccountId
     */
    public String getManageAccountId() {
        return manageAccountId;
    }

    public void setManageAccountId(String manageAccountId) {
        this.manageAccountId = manageAccountId;
    }

    public ManagedAccount withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * 账号ID。
     * @return accountId
     */
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public ManagedAccount withAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * 账号名称。
     * @return accountName
     */
    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public ManagedAccount withAccountEmail(String accountEmail) {
        this.accountEmail = accountEmail;
        return this;
    }

    /**
     * 账号email。
     * @return accountEmail
     */
    public String getAccountEmail() {
        return accountEmail;
    }

    public void setAccountEmail(String accountEmail) {
        this.accountEmail = accountEmail;
    }

    public ManagedAccount withAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }

    /**
     * 账号类型。
     * @return accountType
     */
    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public ManagedAccount withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * 账号的创建来源，包括CUSTOM和RGC。
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public ManagedAccount withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 账号状态。
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public ManagedAccount withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 错误状态描述信息。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ManagedAccount withParentOrganizationUnitId(String parentOrganizationUnitId) {
        this.parentOrganizationUnitId = parentOrganizationUnitId;
        return this;
    }

    /**
     * 父OU ID。
     * @return parentOrganizationUnitId
     */
    public String getParentOrganizationUnitId() {
        return parentOrganizationUnitId;
    }

    public void setParentOrganizationUnitId(String parentOrganizationUnitId) {
        this.parentOrganizationUnitId = parentOrganizationUnitId;
    }

    public ManagedAccount withParentOrganizationUnitName(String parentOrganizationUnitName) {
        this.parentOrganizationUnitName = parentOrganizationUnitName;
        return this;
    }

    /**
     * 父OU名称。
     * @return parentOrganizationUnitName
     */
    public String getParentOrganizationUnitName() {
        return parentOrganizationUnitName;
    }

    public void setParentOrganizationUnitName(String parentOrganizationUnitName) {
        this.parentOrganizationUnitName = parentOrganizationUnitName;
    }

    public ManagedAccount withIdentityStoreUserName(String identityStoreUserName) {
        this.identityStoreUserName = identityStoreUserName;
        return this;
    }

    /**
     * Identity Center用户名。
     * @return identityStoreUserName
     */
    public String getIdentityStoreUserName() {
        return identityStoreUserName;
    }

    public void setIdentityStoreUserName(String identityStoreUserName) {
        this.identityStoreUserName = identityStoreUserName;
    }

    public ManagedAccount withIdentityStoreEmailName(String identityStoreEmailName) {
        this.identityStoreEmailName = identityStoreEmailName;
        return this;
    }

    /**
     * Identity Center邮箱。
     * @return identityStoreEmailName
     */
    public String getIdentityStoreEmailName() {
        return identityStoreEmailName;
    }

    public void setIdentityStoreEmailName(String identityStoreEmailName) {
        this.identityStoreEmailName = identityStoreEmailName;
    }

    public ManagedAccount withBlueprintProductId(String blueprintProductId) {
        this.blueprintProductId = blueprintProductId;
        return this;
    }

    /**
     * 蓝图ID。
     * @return blueprintProductId
     */
    public String getBlueprintProductId() {
        return blueprintProductId;
    }

    public void setBlueprintProductId(String blueprintProductId) {
        this.blueprintProductId = blueprintProductId;
    }

    public ManagedAccount withBlueprintProductVersion(String blueprintProductVersion) {
        this.blueprintProductVersion = blueprintProductVersion;
        return this;
    }

    /**
     * 蓝图版本。
     * @return blueprintProductVersion
     */
    public String getBlueprintProductVersion() {
        return blueprintProductVersion;
    }

    public void setBlueprintProductVersion(String blueprintProductVersion) {
        this.blueprintProductVersion = blueprintProductVersion;
    }

    public ManagedAccount withBlueprintStatus(String blueprintStatus) {
        this.blueprintStatus = blueprintStatus;
        return this;
    }

    /**
     * 蓝图部署状态，包括error, active, in_progress。
     * @return blueprintStatus
     */
    public String getBlueprintStatus() {
        return blueprintStatus;
    }

    public void setBlueprintStatus(String blueprintStatus) {
        this.blueprintStatus = blueprintStatus;
    }

    public ManagedAccount withRegions(List<RegionManagedList> regions) {
        this.regions = regions;
        return this;
    }

    public ManagedAccount addRegionsItem(RegionManagedList regionsItem) {
        if (this.regions == null) {
            this.regions = new ArrayList<>();
        }
        this.regions.add(regionsItem);
        return this;
    }

    public ManagedAccount withRegions(Consumer<List<RegionManagedList>> regionsSetter) {
        if (this.regions == null) {
            this.regions = new ArrayList<>();
        }
        regionsSetter.accept(this.regions);
        return this;
    }

    /**
     * region信息。
     * @return regions
     */
    public List<RegionManagedList> getRegions() {
        return regions;
    }

    public void setRegions(List<RegionManagedList> regions) {
        this.regions = regions;
    }

    public ManagedAccount withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 被创建的时间。
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public ManagedAccount withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 最后一次更新的时间。
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ManagedAccount that = (ManagedAccount) obj;
        return Objects.equals(this.phone, that.phone) && Objects.equals(this.manageAccountId, that.manageAccountId)
            && Objects.equals(this.accountId, that.accountId) && Objects.equals(this.accountName, that.accountName)
            && Objects.equals(this.accountEmail, that.accountEmail)
            && Objects.equals(this.accountType, that.accountType) && Objects.equals(this.owner, that.owner)
            && Objects.equals(this.state, that.state) && Objects.equals(this.message, that.message)
            && Objects.equals(this.parentOrganizationUnitId, that.parentOrganizationUnitId)
            && Objects.equals(this.parentOrganizationUnitName, that.parentOrganizationUnitName)
            && Objects.equals(this.identityStoreUserName, that.identityStoreUserName)
            && Objects.equals(this.identityStoreEmailName, that.identityStoreEmailName)
            && Objects.equals(this.blueprintProductId, that.blueprintProductId)
            && Objects.equals(this.blueprintProductVersion, that.blueprintProductVersion)
            && Objects.equals(this.blueprintStatus, that.blueprintStatus) && Objects.equals(this.regions, that.regions)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phone,
            manageAccountId,
            accountId,
            accountName,
            accountEmail,
            accountType,
            owner,
            state,
            message,
            parentOrganizationUnitId,
            parentOrganizationUnitName,
            identityStoreUserName,
            identityStoreEmailName,
            blueprintProductId,
            blueprintProductVersion,
            blueprintStatus,
            regions,
            createdAt,
            updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ManagedAccount {\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("    manageAccountId: ").append(toIndentedString(manageAccountId)).append("\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
        sb.append("    accountEmail: ").append(toIndentedString(accountEmail)).append("\n");
        sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    parentOrganizationUnitId: ").append(toIndentedString(parentOrganizationUnitId)).append("\n");
        sb.append("    parentOrganizationUnitName: ").append(toIndentedString(parentOrganizationUnitName)).append("\n");
        sb.append("    identityStoreUserName: ").append(toIndentedString(identityStoreUserName)).append("\n");
        sb.append("    identityStoreEmailName: ").append(toIndentedString(identityStoreEmailName)).append("\n");
        sb.append("    blueprintProductId: ").append(toIndentedString(blueprintProductId)).append("\n");
        sb.append("    blueprintProductVersion: ").append(toIndentedString(blueprintProductVersion)).append("\n");
        sb.append("    blueprintStatus: ").append(toIndentedString(blueprintStatus)).append("\n");
        sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
