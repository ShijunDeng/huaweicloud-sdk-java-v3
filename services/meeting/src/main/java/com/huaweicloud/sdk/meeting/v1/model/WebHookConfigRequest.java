package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 会议推送参数配置请求体
 */
public class WebHookConfigRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "corpId")

    @JacksonXmlProperty(localName = "corpId")

    private String corpId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spId")

    @JacksonXmlProperty(localName = "spId")

    private String spId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscriberId")

    @JacksonXmlProperty(localName = "subscriberId")

    private String subscriberId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscriberKey")

    @JacksonXmlProperty(localName = "subscriberKey")

    private String subscriberKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    @JacksonXmlProperty(localName = "url")

    private String url;

    public WebHookConfigRequest withCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }

    /**
     * 企业ID，与spId二者必填一个
     * @return corpId
     */
    public String getCorpId() {
        return corpId;
    }

    public void setCorpId(String corpId) {
        this.corpId = corpId;
    }

    public WebHookConfigRequest withSpId(String spId) {
        this.spId = spId;
        return this;
    }

    /**
     * sp管理员ID，与corpId二者必填一个
     * @return spId
     */
    public String getSpId() {
        return spId;
    }

    public void setSpId(String spId) {
        this.spId = spId;
    }

    public WebHookConfigRequest withSubscriberId(String subscriberId) {
        this.subscriberId = subscriberId;
        return this;
    }

    /**
     * 订阅者ID
     * @return subscriberId
     */
    public String getSubscriberId() {
        return subscriberId;
    }

    public void setSubscriberId(String subscriberId) {
        this.subscriberId = subscriberId;
    }

    public WebHookConfigRequest withSubscriberKey(String subscriberKey) {
        this.subscriberKey = subscriberKey;
        return this;
    }

    /**
     * 订阅者秘钥
     * @return subscriberKey
     */
    public String getSubscriberKey() {
        return subscriberKey;
    }

    public void setSubscriberKey(String subscriberKey) {
        this.subscriberKey = subscriberKey;
    }

    public WebHookConfigRequest withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 订阅url，建议使用HTTPS
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebHookConfigRequest webHookConfigRequest = (WebHookConfigRequest) o;
        return Objects.equals(this.corpId, webHookConfigRequest.corpId)
            && Objects.equals(this.spId, webHookConfigRequest.spId)
            && Objects.equals(this.subscriberId, webHookConfigRequest.subscriberId)
            && Objects.equals(this.subscriberKey, webHookConfigRequest.subscriberKey)
            && Objects.equals(this.url, webHookConfigRequest.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(corpId, spId, subscriberId, subscriberKey, url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebHookConfigRequest {\n");
        sb.append("    corpId: ").append(toIndentedString(corpId)).append("\n");
        sb.append("    spId: ").append(toIndentedString(spId)).append("\n");
        sb.append("    subscriberId: ").append(toIndentedString(subscriberId)).append("\n");
        sb.append("    subscriberKey: ").append(toIndentedString(subscriberKey)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
