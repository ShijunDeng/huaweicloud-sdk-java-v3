package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class CheckTokenResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accessToken")

    private String accessToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tokenIp")

    private String tokenIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "validPeriod")

    private Long validPeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expireTime")

    private Long expireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "createTime")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user")

    private UserInfo user;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clientType")

    private Integer clientType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "forceLoginInd")

    private Integer forceLoginInd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "firstLogin")

    private Boolean firstLogin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pwdExpired")

    private Boolean pwdExpired;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "daysPwdAvailable")

    private Integer daysPwdAvailable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proxyToken")

    private ProxyTokenDTO proxyToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delayDelete")

    private Boolean delayDelete;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tokenType")

    private Integer tokenType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "refreshToken")

    private String refreshToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "refreshValidPeriod")

    private Long refreshValidPeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "refreshExpireTime")

    private Long refreshExpireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "refreshCreateTime")

    private Long refreshCreateTime;

    public CheckTokenResponse withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    /** 接入token字符串。
     * 
     * @return accessToken */
    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public CheckTokenResponse withTokenIp(String tokenIp) {
        this.tokenIp = tokenIp;
        return this;
    }

    /** 用户IP。
     * 
     * @return tokenIp */
    public String getTokenIp() {
        return tokenIp;
    }

    public void setTokenIp(String tokenIp) {
        this.tokenIp = tokenIp;
    }

    public CheckTokenResponse withValidPeriod(Long validPeriod) {
        this.validPeriod = validPeriod;
        return this;
    }

    /** token有效时长，单位：秒。
     * 
     * @return validPeriod */
    public Long getValidPeriod() {
        return validPeriod;
    }

    public void setValidPeriod(Long validPeriod) {
        this.validPeriod = validPeriod;
    }

    public CheckTokenResponse withExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /** token的失效时间戳，单位：秒。
     * 
     * @return expireTime */
    public Long getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
    }

    public CheckTokenResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /** 业务token的创建时间戳，单位：毫秒。
     * 
     * @return createTime */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public CheckTokenResponse withUser(UserInfo user) {
        this.user = user;
        return this;
    }

    public CheckTokenResponse withUser(Consumer<UserInfo> userSetter) {
        if (this.user == null) {
            this.user = new UserInfo();
            userSetter.accept(this.user);
        }

        return this;
    }

    /** Get user
     * 
     * @return user */
    public UserInfo getUser() {
        return user;
    }

    public void setUser(UserInfo user) {
        this.user = user;
    }

    public CheckTokenResponse withClientType(Integer clientType) {
        this.clientType = clientType;
        return this;
    }

    /** 登录帐号类型。 * 72：API调用类型
     * 
     * @return clientType */
    public Integer getClientType() {
        return clientType;
    }

    public void setClientType(Integer clientType) {
        this.clientType = clientType;
    }

    public CheckTokenResponse withForceLoginInd(Integer forceLoginInd) {
        this.forceLoginInd = forceLoginInd;
        return this;
    }

    /** 抢占登录标识 * 0：非抢占 * 1：抢占 未启用
     * 
     * @return forceLoginInd */
    public Integer getForceLoginInd() {
        return forceLoginInd;
    }

    public void setForceLoginInd(Integer forceLoginInd) {
        this.forceLoginInd = forceLoginInd;
    }

    public CheckTokenResponse withFirstLogin(Boolean firstLogin) {
        this.firstLogin = firstLogin;
        return this;
    }

    /** 是否首次登录（说明：首次登录表示尚未修改过密码。首次登录时，系统会提醒用户需要修改密码），默认值：false。
     * 
     * @return firstLogin */
    public Boolean getFirstLogin() {
        return firstLogin;
    }

    public void setFirstLogin(Boolean firstLogin) {
        this.firstLogin = firstLogin;
    }

    public CheckTokenResponse withPwdExpired(Boolean pwdExpired) {
        this.pwdExpired = pwdExpired;
        return this;
    }

    /** 密码是否过期，默认值：false。
     * 
     * @return pwdExpired */
    public Boolean getPwdExpired() {
        return pwdExpired;
    }

    public void setPwdExpired(Boolean pwdExpired) {
        this.pwdExpired = pwdExpired;
    }

    public CheckTokenResponse withDaysPwdAvailable(Integer daysPwdAvailable) {
        this.daysPwdAvailable = daysPwdAvailable;
        return this;
    }

    /** 密码有效天数
     * 
     * @return daysPwdAvailable */
    public Integer getDaysPwdAvailable() {
        return daysPwdAvailable;
    }

    public void setDaysPwdAvailable(Integer daysPwdAvailable) {
        this.daysPwdAvailable = daysPwdAvailable;
    }

    public CheckTokenResponse withProxyToken(ProxyTokenDTO proxyToken) {
        this.proxyToken = proxyToken;
        return this;
    }

    public CheckTokenResponse withProxyToken(Consumer<ProxyTokenDTO> proxyTokenSetter) {
        if (this.proxyToken == null) {
            this.proxyToken = new ProxyTokenDTO();
            proxyTokenSetter.accept(this.proxyToken);
        }

        return this;
    }

    /** Get proxyToken
     * 
     * @return proxyToken */
    public ProxyTokenDTO getProxyToken() {
        return proxyToken;
    }

    public void setProxyToken(ProxyTokenDTO proxyToken) {
        this.proxyToken = proxyToken;
    }

    public CheckTokenResponse withDelayDelete(Boolean delayDelete) {
        this.delayDelete = delayDelete;
        return this;
    }

    /** 是否延时删除状态
     * 
     * @return delayDelete */
    public Boolean getDelayDelete() {
        return delayDelete;
    }

    public void setDelayDelete(Boolean delayDelete) {
        this.delayDelete = delayDelete;
    }

    public CheckTokenResponse withTokenType(Integer tokenType) {
        this.tokenType = tokenType;
        return this;
    }

    /** token类型 * 0：用户ACCESS TOKEN； * 1：会控TOKEN * 2：一次性TOKEN
     * 
     * @return tokenType */
    public Integer getTokenType() {
        return tokenType;
    }

    public void setTokenType(Integer tokenType) {
        this.tokenType = tokenType;
    }

    public CheckTokenResponse withRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }

    /** 刷新token字符串。
     * 
     * @return refreshToken */
    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public CheckTokenResponse withRefreshValidPeriod(Long refreshValidPeriod) {
        this.refreshValidPeriod = refreshValidPeriod;
        return this;
    }

    /** 刷新token有效时长，单位：秒。
     * 
     * @return refreshValidPeriod */
    public Long getRefreshValidPeriod() {
        return refreshValidPeriod;
    }

    public void setRefreshValidPeriod(Long refreshValidPeriod) {
        this.refreshValidPeriod = refreshValidPeriod;
    }

    public CheckTokenResponse withRefreshExpireTime(Long refreshExpireTime) {
        this.refreshExpireTime = refreshExpireTime;
        return this;
    }

    /** 刷新token的失效时间戳，单位：秒。
     * 
     * @return refreshExpireTime */
    public Long getRefreshExpireTime() {
        return refreshExpireTime;
    }

    public void setRefreshExpireTime(Long refreshExpireTime) {
        this.refreshExpireTime = refreshExpireTime;
    }

    public CheckTokenResponse withRefreshCreateTime(Long refreshCreateTime) {
        this.refreshCreateTime = refreshCreateTime;
        return this;
    }

    /** 刷新token的创建时间戳，单位：毫秒。
     * 
     * @return refreshCreateTime */
    public Long getRefreshCreateTime() {
        return refreshCreateTime;
    }

    public void setRefreshCreateTime(Long refreshCreateTime) {
        this.refreshCreateTime = refreshCreateTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CheckTokenResponse checkTokenResponse = (CheckTokenResponse) o;
        return Objects.equals(this.accessToken, checkTokenResponse.accessToken)
            && Objects.equals(this.tokenIp, checkTokenResponse.tokenIp)
            && Objects.equals(this.validPeriod, checkTokenResponse.validPeriod)
            && Objects.equals(this.expireTime, checkTokenResponse.expireTime)
            && Objects.equals(this.createTime, checkTokenResponse.createTime)
            && Objects.equals(this.user, checkTokenResponse.user)
            && Objects.equals(this.clientType, checkTokenResponse.clientType)
            && Objects.equals(this.forceLoginInd, checkTokenResponse.forceLoginInd)
            && Objects.equals(this.firstLogin, checkTokenResponse.firstLogin)
            && Objects.equals(this.pwdExpired, checkTokenResponse.pwdExpired)
            && Objects.equals(this.daysPwdAvailable, checkTokenResponse.daysPwdAvailable)
            && Objects.equals(this.proxyToken, checkTokenResponse.proxyToken)
            && Objects.equals(this.delayDelete, checkTokenResponse.delayDelete)
            && Objects.equals(this.tokenType, checkTokenResponse.tokenType)
            && Objects.equals(this.refreshToken, checkTokenResponse.refreshToken)
            && Objects.equals(this.refreshValidPeriod, checkTokenResponse.refreshValidPeriod)
            && Objects.equals(this.refreshExpireTime, checkTokenResponse.refreshExpireTime)
            && Objects.equals(this.refreshCreateTime, checkTokenResponse.refreshCreateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessToken,
            tokenIp,
            validPeriod,
            expireTime,
            createTime,
            user,
            clientType,
            forceLoginInd,
            firstLogin,
            pwdExpired,
            daysPwdAvailable,
            proxyToken,
            delayDelete,
            tokenType,
            refreshToken,
            refreshValidPeriod,
            refreshExpireTime,
            refreshCreateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckTokenResponse {\n");
        sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
        sb.append("    tokenIp: ").append(toIndentedString(tokenIp)).append("\n");
        sb.append("    validPeriod: ").append(toIndentedString(validPeriod)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    clientType: ").append(toIndentedString(clientType)).append("\n");
        sb.append("    forceLoginInd: ").append(toIndentedString(forceLoginInd)).append("\n");
        sb.append("    firstLogin: ").append(toIndentedString(firstLogin)).append("\n");
        sb.append("    pwdExpired: ").append(toIndentedString(pwdExpired)).append("\n");
        sb.append("    daysPwdAvailable: ").append(toIndentedString(daysPwdAvailable)).append("\n");
        sb.append("    proxyToken: ").append(toIndentedString(proxyToken)).append("\n");
        sb.append("    delayDelete: ").append(toIndentedString(delayDelete)).append("\n");
        sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
        sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
        sb.append("    refreshValidPeriod: ").append(toIndentedString(refreshValidPeriod)).append("\n");
        sb.append("    refreshExpireTime: ").append(toIndentedString(refreshExpireTime)).append("\n");
        sb.append("    refreshCreateTime: ").append(toIndentedString(refreshCreateTime)).append("\n");
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
