package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 分页查询企业用户信息
 */
public class SearchUserResultDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "userAccount")

    @JacksonXmlProperty(localName = "userAccount")

    private String userAccount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "englishName")

    @JacksonXmlProperty(localName = "englishName")

    private String englishName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phone")

    @JacksonXmlProperty(localName = "phone")

    private String phone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "country")

    @JacksonXmlProperty(localName = "country")

    private String country;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "email")

    @JacksonXmlProperty(localName = "email")

    private String email;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vmrId")

    @JacksonXmlProperty(localName = "vmrId")

    private String vmrId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deptCode")

    @JacksonXmlProperty(localName = "deptCode")

    private String deptCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deptNamePath")

    @JacksonXmlProperty(localName = "deptNamePath")

    private String deptNamePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "userType")

    @JacksonXmlProperty(localName = "userType")

    private Integer userType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "adminType")

    @JacksonXmlProperty(localName = "adminType")

    private Integer adminType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "signature")

    @JacksonXmlProperty(localName = "signature")

    private String signature;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    @JacksonXmlProperty(localName = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desc")

    @JacksonXmlProperty(localName = "desc")

    private String desc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    @JacksonXmlProperty(localName = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sortLevel")

    @JacksonXmlProperty(localName = "sortLevel")

    private Integer sortLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hidePhone")

    @JacksonXmlProperty(localName = "hidePhone")

    private Boolean hidePhone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "thirdAccount")

    @JacksonXmlProperty(localName = "thirdAccount")

    private String thirdAccount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "visionAccount")

    @JacksonXmlProperty(localName = "visionAccount")

    private String visionAccount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "license")

    @JacksonXmlProperty(localName = "license")

    private Integer license;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "activeTime")

    @JacksonXmlProperty(localName = "activeTime")

    private Long activeTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "activeCodeExpireTime")

    @JacksonXmlProperty(localName = "activeCodeExpireTime")

    private Long activeCodeExpireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expireTime")

    @JacksonXmlProperty(localName = "expireTime")

    private Long expireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "activeCode")

    @JacksonXmlProperty(localName = "activeCode")

    private String activeCode;

    public SearchUserResultDTO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 用户id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SearchUserResultDTO withUserAccount(String userAccount) {
        this.userAccount = userAccount;
        return this;
    }

    /**
     * 账号
     * @return userAccount
     */
    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public SearchUserResultDTO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 姓名
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SearchUserResultDTO withEnglishName(String englishName) {
        this.englishName = englishName;
        return this;
    }

    /**
     * 英文名称
     * @return englishName
     */
    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public SearchUserResultDTO withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * 手机
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public SearchUserResultDTO withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * 手机所属国家
     * @return country
     */
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public SearchUserResultDTO withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * 邮箱
     * @return email
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public SearchUserResultDTO withVmrId(String vmrId) {
        this.vmrId = vmrId;
        return this;
    }

    /**
     * 个人会议室Id
     * @return vmrId
     */
    public String getVmrId() {
        return vmrId;
    }

    public void setVmrId(String vmrId) {
        this.vmrId = vmrId;
    }

    public SearchUserResultDTO withDeptCode(String deptCode) {
        this.deptCode = deptCode;
        return this;
    }

    /**
     * 部门编码
     * @return deptCode
     */
    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public SearchUserResultDTO withDeptNamePath(String deptNamePath) {
        this.deptNamePath = deptNamePath;
        return this;
    }

    /**
     * 部门完整名称
     * @return deptNamePath
     */
    public String getDeptNamePath() {
        return deptNamePath;
    }

    public void setDeptNamePath(String deptNamePath) {
        this.deptNamePath = deptNamePath;
    }

    public SearchUserResultDTO withUserType(Integer userType) {
        this.userType = userType;
        return this;
    }

    /**
     * 用户类型 - 0：系统管理员账户 - 1：SP管理员账户 - 2：企业成员账户 - 3：注册用户 - 10：硬终端用户
     * @return userType
     */
    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public SearchUserResultDTO withAdminType(Integer adminType) {
        this.adminType = adminType;
        return this;
    }

    /**
     * 管理员类型 - 0：默认（超级）管理员 - 1：普通管理员 - 2：非管理员（即为普通企业成员，UserType是2时有效）
     * @return adminType
     */
    public Integer getAdminType() {
        return adminType;
    }

    public void setAdminType(Integer adminType) {
        this.adminType = adminType;
    }

    public SearchUserResultDTO withSignature(String signature) {
        this.signature = signature;
        return this;
    }

    /**
     * 签名
     * @return signature
     */
    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public SearchUserResultDTO withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 职位
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public SearchUserResultDTO withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * 备注
     * @return desc
     */
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public SearchUserResultDTO withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 用户状态 * 0：正常 * 1：停用 
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public SearchUserResultDTO withSortLevel(Integer sortLevel) {
        this.sortLevel = sortLevel;
        return this;
    }

    /**
     * 通讯录排序等级，序号越低优先级越高
     * @return sortLevel
     */
    public Integer getSortLevel() {
        return sortLevel;
    }

    public void setSortLevel(Integer sortLevel) {
        this.sortLevel = sortLevel;
    }

    public SearchUserResultDTO withHidePhone(Boolean hidePhone) {
        this.hidePhone = hidePhone;
        return this;
    }

    /**
     * 是否隐藏手机号码
     * @return hidePhone
     */
    public Boolean getHidePhone() {
        return hidePhone;
    }

    public void setHidePhone(Boolean hidePhone) {
        this.hidePhone = hidePhone;
    }

    public SearchUserResultDTO withThirdAccount(String thirdAccount) {
        this.thirdAccount = thirdAccount;
        return this;
    }

    /**
     * 第三方账号自动开户的第三方账号、Ideahub账号的sn等
     * @return thirdAccount
     */
    public String getThirdAccount() {
        return thirdAccount;
    }

    public void setThirdAccount(String thirdAccount) {
        this.thirdAccount = thirdAccount;
    }

    public SearchUserResultDTO withVisionAccount(String visionAccount) {
        this.visionAccount = visionAccount;
        return this;
    }

    /**
     * 智慧屏账号
     * @return visionAccount
     */
    public String getVisionAccount() {
        return visionAccount;
    }

    public void setVisionAccount(String visionAccount) {
        this.visionAccount = visionAccount;
    }

    public SearchUserResultDTO withLicense(Integer license) {
        this.license = license;
        return this;
    }

    /**
     * 许可证 * 0：商用 * 1：免费试用 
     * @return license
     */
    public Integer getLicense() {
        return license;
    }

    public void setLicense(Integer license) {
        this.license = license;
    }

    public SearchUserResultDTO withActiveTime(Long activeTime) {
        this.activeTime = activeTime;
        return this;
    }

    /**
     * 激活时间，utc时间戳
     * @return activeTime
     */
    public Long getActiveTime() {
        return activeTime;
    }

    public void setActiveTime(Long activeTime) {
        this.activeTime = activeTime;
    }

    public SearchUserResultDTO withActiveCodeExpireTime(Long activeCodeExpireTime) {
        this.activeCodeExpireTime = activeCodeExpireTime;
        return this;
    }

    /**
     * 激活码到期时间,utc时间戳
     * @return activeCodeExpireTime
     */
    public Long getActiveCodeExpireTime() {
        return activeCodeExpireTime;
    }

    public void setActiveCodeExpireTime(Long activeCodeExpireTime) {
        this.activeCodeExpireTime = activeCodeExpireTime;
    }

    public SearchUserResultDTO withExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /**
     * 已激活的终端到期时间,utc时间戳
     * @return expireTime
     */
    public Long getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
    }

    public SearchUserResultDTO withActiveCode(String activeCode) {
        this.activeCode = activeCode;
        return this;
    }

    /**
     * 激活码
     * @return activeCode
     */
    public String getActiveCode() {
        return activeCode;
    }

    public void setActiveCode(String activeCode) {
        this.activeCode = activeCode;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SearchUserResultDTO searchUserResultDTO = (SearchUserResultDTO) o;
        return Objects.equals(this.id, searchUserResultDTO.id)
            && Objects.equals(this.userAccount, searchUserResultDTO.userAccount)
            && Objects.equals(this.name, searchUserResultDTO.name)
            && Objects.equals(this.englishName, searchUserResultDTO.englishName)
            && Objects.equals(this.phone, searchUserResultDTO.phone)
            && Objects.equals(this.country, searchUserResultDTO.country)
            && Objects.equals(this.email, searchUserResultDTO.email)
            && Objects.equals(this.vmrId, searchUserResultDTO.vmrId)
            && Objects.equals(this.deptCode, searchUserResultDTO.deptCode)
            && Objects.equals(this.deptNamePath, searchUserResultDTO.deptNamePath)
            && Objects.equals(this.userType, searchUserResultDTO.userType)
            && Objects.equals(this.adminType, searchUserResultDTO.adminType)
            && Objects.equals(this.signature, searchUserResultDTO.signature)
            && Objects.equals(this.title, searchUserResultDTO.title)
            && Objects.equals(this.desc, searchUserResultDTO.desc)
            && Objects.equals(this.status, searchUserResultDTO.status)
            && Objects.equals(this.sortLevel, searchUserResultDTO.sortLevel)
            && Objects.equals(this.hidePhone, searchUserResultDTO.hidePhone)
            && Objects.equals(this.thirdAccount, searchUserResultDTO.thirdAccount)
            && Objects.equals(this.visionAccount, searchUserResultDTO.visionAccount)
            && Objects.equals(this.license, searchUserResultDTO.license)
            && Objects.equals(this.activeTime, searchUserResultDTO.activeTime)
            && Objects.equals(this.activeCodeExpireTime, searchUserResultDTO.activeCodeExpireTime)
            && Objects.equals(this.expireTime, searchUserResultDTO.expireTime)
            && Objects.equals(this.activeCode, searchUserResultDTO.activeCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            userAccount,
            name,
            englishName,
            phone,
            country,
            email,
            vmrId,
            deptCode,
            deptNamePath,
            userType,
            adminType,
            signature,
            title,
            desc,
            status,
            sortLevel,
            hidePhone,
            thirdAccount,
            visionAccount,
            license,
            activeTime,
            activeCodeExpireTime,
            expireTime,
            activeCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchUserResultDTO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    userAccount: ").append(toIndentedString(userAccount)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    englishName: ").append(toIndentedString(englishName)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    vmrId: ").append(toIndentedString(vmrId)).append("\n");
        sb.append("    deptCode: ").append(toIndentedString(deptCode)).append("\n");
        sb.append("    deptNamePath: ").append(toIndentedString(deptNamePath)).append("\n");
        sb.append("    userType: ").append(toIndentedString(userType)).append("\n");
        sb.append("    adminType: ").append(toIndentedString(adminType)).append("\n");
        sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    sortLevel: ").append(toIndentedString(sortLevel)).append("\n");
        sb.append("    hidePhone: ").append(toIndentedString(hidePhone)).append("\n");
        sb.append("    thirdAccount: ").append(toIndentedString(thirdAccount)).append("\n");
        sb.append("    visionAccount: ").append(toIndentedString(visionAccount)).append("\n");
        sb.append("    license: ").append(toIndentedString(license)).append("\n");
        sb.append("    activeTime: ").append(toIndentedString(activeTime)).append("\n");
        sb.append("    activeCodeExpireTime: ").append(toIndentedString(activeCodeExpireTime)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("    activeCode: ").append(toIndentedString(activeCode)).append("\n");
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
