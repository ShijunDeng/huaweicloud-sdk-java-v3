package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowHisMeetingDetailRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confUUID")

    @JacksonXmlProperty(localName = "confUUID")

    private String confUUID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    @JacksonXmlProperty(localName = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    @JacksonXmlProperty(localName = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "searchKey")

    @JacksonXmlProperty(localName = "searchKey")

    private String searchKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "userUUID")

    @JacksonXmlProperty(localName = "userUUID")

    private String userUUID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Type")

    @JacksonXmlProperty(localName = "X-Type")

    private Integer xType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Query-Type")

    @JacksonXmlProperty(localName = "X-Query-Type")

    private Integer xQueryType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Authorization-Type")

    @JacksonXmlProperty(localName = "X-Authorization-Type")

    private String xAuthorizationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Site-Id")

    @JacksonXmlProperty(localName = "X-Site-Id")

    private String xSiteId;

    public ShowHisMeetingDetailRequest withConfUUID(String confUUID) {
        this.confUUID = confUUID;
        return this;
    }

    /**
     * 会议UUID。
     * @return confUUID
     */
    public String getConfUUID() {
        return confUUID;
    }

    public void setConfUUID(String confUUID) {
        this.confUUID = confUUID;
    }

    public ShowHisMeetingDetailRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 指定返回的与会者列表的记录索引。该值必须大于等于0；默认为0。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ShowHisMeetingDetailRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 指定返回的与会者记录数，默认是20。
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ShowHisMeetingDetailRequest withSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }

    /**
     * 根据会议主题，预定人和云会议室会议id关键词的字符串，查询历史会议信息。
     * @return searchKey
     */
    public String getSearchKey() {
        return searchKey;
    }

    public void setSearchKey(String searchKey) {
        this.searchKey = searchKey;
    }

    public ShowHisMeetingDetailRequest withUserUUID(String userUUID) {
        this.userUUID = userUUID;
        return this;
    }

    /**
     * 用户的UUID（已在USG注册过的）。
     * @return userUUID
     */
    public String getUserUUID() {
        return userUUID;
    }

    public void setUserUUID(String userUUID) {
        this.userUUID = userUUID;
    }

    public ShowHisMeetingDetailRequest withXType(Integer xType) {
        this.xType = xType;
        return this;
    }

    /**
     * 默认值为0。 0: 不区分会议室和与会人。 1：分页查询区分会议室和与会人，结果合并返回。 2：单独查询会议室与与会人，结果也是单独返回。
     * @return xType
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Type")
    public Integer getXType() {
        return xType;
    }

    public void setXType(Integer xType) {
        this.xType = xType;
    }

    public ShowHisMeetingDetailRequest withXQueryType(Integer xQueryType) {
        this.xQueryType = xQueryType;
        return this;
    }

    /**
     * 当X-Type为2时，该字段有效。默认值为0。 0: 查询与会人。 1：查询终端。
     * @return xQueryType
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Query-Type")
    public Integer getXQueryType() {
        return xQueryType;
    }

    public void setXQueryType(Integer xQueryType) {
        this.xQueryType = xQueryType;
    }

    public ShowHisMeetingDetailRequest withXAuthorizationType(String xAuthorizationType) {
        this.xAuthorizationType = xAuthorizationType;
        return this;
    }

    /**
     * 标识是否为第三方portal过来的请求。
     * @return xAuthorizationType
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Authorization-Type")
    public String getXAuthorizationType() {
        return xAuthorizationType;
    }

    public void setXAuthorizationType(String xAuthorizationType) {
        this.xAuthorizationType = xAuthorizationType;
    }

    public ShowHisMeetingDetailRequest withXSiteId(String xSiteId) {
        this.xSiteId = xSiteId;
        return this;
    }

    /**
     * 用于区分到哪个HCSO站点鉴权。
     * @return xSiteId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Site-Id")
    public String getXSiteId() {
        return xSiteId;
    }

    public void setXSiteId(String xSiteId) {
        this.xSiteId = xSiteId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowHisMeetingDetailRequest showHisMeetingDetailRequest = (ShowHisMeetingDetailRequest) o;
        return Objects.equals(this.confUUID, showHisMeetingDetailRequest.confUUID)
            && Objects.equals(this.offset, showHisMeetingDetailRequest.offset)
            && Objects.equals(this.limit, showHisMeetingDetailRequest.limit)
            && Objects.equals(this.searchKey, showHisMeetingDetailRequest.searchKey)
            && Objects.equals(this.userUUID, showHisMeetingDetailRequest.userUUID)
            && Objects.equals(this.xType, showHisMeetingDetailRequest.xType)
            && Objects.equals(this.xQueryType, showHisMeetingDetailRequest.xQueryType)
            && Objects.equals(this.xAuthorizationType, showHisMeetingDetailRequest.xAuthorizationType)
            && Objects.equals(this.xSiteId, showHisMeetingDetailRequest.xSiteId);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(confUUID, offset, limit, searchKey, userUUID, xType, xQueryType, xAuthorizationType, xSiteId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowHisMeetingDetailRequest {\n");
        sb.append("    confUUID: ").append(toIndentedString(confUUID)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    searchKey: ").append(toIndentedString(searchKey)).append("\n");
        sb.append("    userUUID: ").append(toIndentedString(userUUID)).append("\n");
        sb.append("    xType: ").append(toIndentedString(xType)).append("\n");
        sb.append("    xQueryType: ").append(toIndentedString(xQueryType)).append("\n");
        sb.append("    xAuthorizationType: ").append(toIndentedString(xAuthorizationType)).append("\n");
        sb.append("    xSiteId: ").append(toIndentedString(xSiteId)).append("\n");
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
