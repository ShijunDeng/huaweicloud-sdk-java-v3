package com.huaweicloud.sdk.servicestage.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 授权结构体。
 */
public class AuthorizationVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repo_type")

    @JacksonXmlProperty(localName = "repo_type")

    private String repoType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repo_host")

    @JacksonXmlProperty(localName = "repo_host")

    private String repoHost;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repo_home")

    @JacksonXmlProperty(localName = "repo_home")

    private String repoHome;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repo_user")

    @JacksonXmlProperty(localName = "repo_user")

    private String repoUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avartar")

    @JacksonXmlProperty(localName = "avartar")

    private String avartar;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "token_type")

    @JacksonXmlProperty(localName = "token_type")

    private String tokenType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    @JacksonXmlProperty(localName = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    @JacksonXmlProperty(localName = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    @JacksonXmlProperty(localName = "status")

    private Integer status;

    public AuthorizationVO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 授权名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AuthorizationVO withRepoType(String repoType) {
        this.repoType = repoType;
        return this;
    }

    /**
     * 仓库类型。 取值范围：github、gitlab、gitee、bitbucket、devcloud。 
     * @return repoType
     */
    public String getRepoType() {
        return repoType;
    }

    public void setRepoType(String repoType) {
        this.repoType = repoType;
    }

    public AuthorizationVO withRepoHost(String repoHost) {
        this.repoHost = repoHost;
        return this;
    }

    /**
     * 仓库地址。
     * @return repoHost
     */
    public String getRepoHost() {
        return repoHost;
    }

    public void setRepoHost(String repoHost) {
        this.repoHost = repoHost;
    }

    public AuthorizationVO withRepoHome(String repoHome) {
        this.repoHome = repoHome;
        return this;
    }

    /**
     * 仓库主页。
     * @return repoHome
     */
    public String getRepoHome() {
        return repoHome;
    }

    public void setRepoHome(String repoHome) {
        this.repoHome = repoHome;
    }

    public AuthorizationVO withRepoUser(String repoUser) {
        this.repoUser = repoUser;
        return this;
    }

    /**
     * 仓库用户名。
     * @return repoUser
     */
    public String getRepoUser() {
        return repoUser;
    }

    public void setRepoUser(String repoUser) {
        this.repoUser = repoUser;
    }

    public AuthorizationVO withAvartar(String avartar) {
        this.avartar = avartar;
        return this;
    }

    /**
     * 头像。
     * @return avartar
     */
    public String getAvartar() {
        return avartar;
    }

    public void setAvartar(String avartar) {
        this.avartar = avartar;
    }

    public AuthorizationVO withTokenType(String tokenType) {
        this.tokenType = tokenType;
        return this;
    }

    /**
     * 授权方式。
     * @return tokenType
     */
    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    public AuthorizationVO withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间。
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public AuthorizationVO withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 修改时间。
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public AuthorizationVO withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 状态。
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AuthorizationVO authorizationVO = (AuthorizationVO) o;
        return Objects.equals(this.name, authorizationVO.name)
            && Objects.equals(this.repoType, authorizationVO.repoType)
            && Objects.equals(this.repoHost, authorizationVO.repoHost)
            && Objects.equals(this.repoHome, authorizationVO.repoHome)
            && Objects.equals(this.repoUser, authorizationVO.repoUser)
            && Objects.equals(this.avartar, authorizationVO.avartar)
            && Objects.equals(this.tokenType, authorizationVO.tokenType)
            && Objects.equals(this.createTime, authorizationVO.createTime)
            && Objects.equals(this.updateTime, authorizationVO.updateTime)
            && Objects.equals(this.status, authorizationVO.status);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(name, repoType, repoHost, repoHome, repoUser, avartar, tokenType, createTime, updateTime, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuthorizationVO {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    repoType: ").append(toIndentedString(repoType)).append("\n");
        sb.append("    repoHost: ").append(toIndentedString(repoHost)).append("\n");
        sb.append("    repoHome: ").append(toIndentedString(repoHome)).append("\n");
        sb.append("    repoUser: ").append(toIndentedString(repoUser)).append("\n");
        sb.append("    avartar: ").append(toIndentedString(avartar)).append("\n");
        sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
