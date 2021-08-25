package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ListCompositeHostsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page")

    private Integer page;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pagesize")

    private Integer pagesize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hostname")

    private String hostname;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policyname")

    private String policyname;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_status")

    private Integer protectStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "waf_type")

    private String wafType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_https")

    private Boolean isHttps;

    public ListCompositeHostsRequest withPage(Integer page) {
        this.page = page;
        return this;
    }

    /** page
     * 
     * @return page */
    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public ListCompositeHostsRequest withPagesize(Integer pagesize) {
        this.pagesize = pagesize;
        return this;
    }

    /** 每页条数
     * 
     * @return pagesize */
    public Integer getPagesize() {
        return pagesize;
    }

    public void setPagesize(Integer pagesize) {
        this.pagesize = pagesize;
    }

    public ListCompositeHostsRequest withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /** 域名名称
     * 
     * @return hostname */
    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public ListCompositeHostsRequest withPolicyname(String policyname) {
        this.policyname = policyname;
        return this;
    }

    /** 防护策略名称
     * 
     * @return policyname */
    public String getPolicyname() {
        return policyname;
    }

    public void setPolicyname(String policyname) {
        this.policyname = policyname;
    }

    public ListCompositeHostsRequest withProtectStatus(Integer protectStatus) {
        this.protectStatus = protectStatus;
        return this;
    }

    /** 域名防护状态
     * 
     * @return protectStatus */
    public Integer getProtectStatus() {
        return protectStatus;
    }

    public void setProtectStatus(Integer protectStatus) {
        this.protectStatus = protectStatus;
    }

    public ListCompositeHostsRequest withWafType(String wafType) {
        this.wafType = wafType;
        return this;
    }

    /** 域名所属WAF模式
     * 
     * @return wafType */
    public String getWafType() {
        return wafType;
    }

    public void setWafType(String wafType) {
        this.wafType = wafType;
    }

    public ListCompositeHostsRequest withIsHttps(Boolean isHttps) {
        this.isHttps = isHttps;
        return this;
    }

    /** 域名是否使用HTTPS
     * 
     * @return isHttps */
    public Boolean getIsHttps() {
        return isHttps;
    }

    public void setIsHttps(Boolean isHttps) {
        this.isHttps = isHttps;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListCompositeHostsRequest listCompositeHostsRequest = (ListCompositeHostsRequest) o;
        return Objects.equals(this.page, listCompositeHostsRequest.page)
            && Objects.equals(this.pagesize, listCompositeHostsRequest.pagesize)
            && Objects.equals(this.hostname, listCompositeHostsRequest.hostname)
            && Objects.equals(this.policyname, listCompositeHostsRequest.policyname)
            && Objects.equals(this.protectStatus, listCompositeHostsRequest.protectStatus)
            && Objects.equals(this.wafType, listCompositeHostsRequest.wafType)
            && Objects.equals(this.isHttps, listCompositeHostsRequest.isHttps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(page, pagesize, hostname, policyname, protectStatus, wafType, isHttps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCompositeHostsRequest {\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
        sb.append("    pagesize: ").append(toIndentedString(pagesize)).append("\n");
        sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
        sb.append("    policyname: ").append(toIndentedString(policyname)).append("\n");
        sb.append("    protectStatus: ").append(toIndentedString(protectStatus)).append("\n");
        sb.append("    wafType: ").append(toIndentedString(wafType)).append("\n");
        sb.append("    isHttps: ").append(toIndentedString(isHttps)).append("\n");
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