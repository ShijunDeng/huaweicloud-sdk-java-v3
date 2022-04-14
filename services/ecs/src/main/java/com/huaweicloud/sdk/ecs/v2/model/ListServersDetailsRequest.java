package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ListServersDetailsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor")

    private String flavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private String ip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not-tags")

    private String notTags;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reservation_id")

    private String reservationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private String tags;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_eq")

    private String ipEq;

    public ListServersDetailsRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /** 查询绑定某个企业项目的弹性云服务器。 若需要查询当前用户所有企业项目绑定的弹性云服务，请传参all_granted_eps。
     * 
     * @return enterpriseProjectId */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListServersDetailsRequest withFlavor(String flavor) {
        this.flavor = flavor;
        return this;
    }

    /** 云服务器规格ID,已上线的规格请参见《弹性云服务器用户指南》的“实例和应用场景”章节。
     * 
     * @return flavor */
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public ListServersDetailsRequest withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /** IPv4地址过滤结果，匹配规则为模糊匹配。
     * 
     * @return ip */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public ListServersDetailsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /** 查询返回云服务器当前页面的大小。每页最多返回1000台云服务器的信息。 minimum: 1 maximum: 1000
     * 
     * @return limit */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListServersDetailsRequest withName(String name) {
        this.name = name;
        return this;
    }

    /** 云服务器名称，匹配规则为模糊匹配。
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListServersDetailsRequest withNotTags(String notTags) {
        this.notTags = notTags;
        return this;
    }

    /** 查询tag字段中不包含该值的云服务器。
     * 
     * @return notTags */
    public String getNotTags() {
        return notTags;
    }

    public void setNotTags(String notTags) {
        this.notTags = notTags;
    }

    public ListServersDetailsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /** 页码。 当前页面数，默认为1。 取值大于等于0，取值为0时返回第1页。
     * 
     * @return offset */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListServersDetailsRequest withReservationId(String reservationId) {
        this.reservationId = reservationId;
        return this;
    }

    /** 批量创建弹性云服务器时，指定返回的ID，用于查询本次批量创建的弹性云服务器。
     * 
     * @return reservationId */
    public String getReservationId() {
        return reservationId;
    }

    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }

    public ListServersDetailsRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /** 云服务器状态。 取值范围： ACTIVE，
     * BUILD，DELETED，ERROR，HARD_REBOOT，MIGRATING，REBOOT，RESIZE，REVERT_RESIZE，SHELVED，SHELVED_OFFLOADED，SHUTOFF，UNKNOWN，VERIFY_RESIZE
     * 只有管理员可以使用“deleted”状态过滤查询已经删除的弹性云服务器。
     * 弹性云服务器状态说明请参考[云服务器状态](https://support.huaweicloud.com/api-ecs/ecs_08_0002.html)
     * 
     * @return status */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListServersDetailsRequest withTags(String tags) {
        this.tags = tags;
        return this;
    }

    /** 查询tag字段中包含该值的云服务器。
     * 
     * @return tags */
    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public ListServersDetailsRequest withIpEq(String ipEq) {
        this.ipEq = ipEq;
        return this;
    }

    /** IPv4地址过滤结果，匹配规则为精确匹配。
     * 
     * @return ipEq */
    public String getIpEq() {
        return ipEq;
    }

    public void setIpEq(String ipEq) {
        this.ipEq = ipEq;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListServersDetailsRequest listServersDetailsRequest = (ListServersDetailsRequest) o;
        return Objects.equals(this.enterpriseProjectId, listServersDetailsRequest.enterpriseProjectId)
            && Objects.equals(this.flavor, listServersDetailsRequest.flavor)
            && Objects.equals(this.ip, listServersDetailsRequest.ip)
            && Objects.equals(this.limit, listServersDetailsRequest.limit)
            && Objects.equals(this.name, listServersDetailsRequest.name)
            && Objects.equals(this.notTags, listServersDetailsRequest.notTags)
            && Objects.equals(this.offset, listServersDetailsRequest.offset)
            && Objects.equals(this.reservationId, listServersDetailsRequest.reservationId)
            && Objects.equals(this.status, listServersDetailsRequest.status)
            && Objects.equals(this.tags, listServersDetailsRequest.tags)
            && Objects.equals(this.ipEq, listServersDetailsRequest.ipEq);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(enterpriseProjectId, flavor, ip, limit, name, notTags, offset, reservationId, status, tags, ipEq);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListServersDetailsRequest {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    notTags: ").append(toIndentedString(notTags)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    reservationId: ").append(toIndentedString(reservationId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    ipEq: ").append(toIndentedString(ipEq)).append("\n");
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
