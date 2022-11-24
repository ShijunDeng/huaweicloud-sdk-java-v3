package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ResolveRuleReq
 */
public class ResolveRuleReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_id")

    private String endpointId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipaddresses")

    private List<IpInfo> ipaddresses = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "routers")

    private List<Router> routers = null;

    public ResolveRuleReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 规则名称。 取值范围：1-64个字符，支持数字、字母、中文、_（下划线）、-（中划线）、.（点）。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ResolveRuleReq withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * 域名。
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public ResolveRuleReq withEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }

    /**
     * 当前规则所属的endpoint_id。
     * @return endpointId
     */
    public String getEndpointId() {
        return endpointId;
    }

    public void setEndpointId(String endpointId) {
        this.endpointId = endpointId;
    }

    public ResolveRuleReq withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 当前规则所在的region。
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public ResolveRuleReq withIpaddresses(List<IpInfo> ipaddresses) {
        this.ipaddresses = ipaddresses;
        return this;
    }

    public ResolveRuleReq addIpaddressesItem(IpInfo ipaddressesItem) {
        if (this.ipaddresses == null) {
            this.ipaddresses = new ArrayList<>();
        }
        this.ipaddresses.add(ipaddressesItem);
        return this;
    }

    public ResolveRuleReq withIpaddresses(Consumer<List<IpInfo>> ipaddressesSetter) {
        if (this.ipaddresses == null) {
            this.ipaddresses = new ArrayList<>();
        }
        ipaddressesSetter.accept(this.ipaddresses);
        return this;
    }

    /**
     * 规则关联的目标ip地址。
     * @return ipaddresses
     */
    public List<IpInfo> getIpaddresses() {
        return ipaddresses;
    }

    public void setIpaddresses(List<IpInfo> ipaddresses) {
        this.ipaddresses = ipaddresses;
    }

    public ResolveRuleReq withRouters(List<Router> routers) {
        this.routers = routers;
        return this;
    }

    public ResolveRuleReq addRoutersItem(Router routersItem) {
        if (this.routers == null) {
            this.routers = new ArrayList<>();
        }
        this.routers.add(routersItem);
        return this;
    }

    public ResolveRuleReq withRouters(Consumer<List<Router>> routersSetter) {
        if (this.routers == null) {
            this.routers = new ArrayList<>();
        }
        routersSetter.accept(this.routers);
        return this;
    }

    /**
     * 规则关联的目标ip地址。
     * @return routers
     */
    public List<Router> getRouters() {
        return routers;
    }

    public void setRouters(List<Router> routers) {
        this.routers = routers;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResolveRuleReq resolveRuleReq = (ResolveRuleReq) o;
        return Objects.equals(this.name, resolveRuleReq.name)
            && Objects.equals(this.domainName, resolveRuleReq.domainName)
            && Objects.equals(this.endpointId, resolveRuleReq.endpointId)
            && Objects.equals(this.region, resolveRuleReq.region)
            && Objects.equals(this.ipaddresses, resolveRuleReq.ipaddresses)
            && Objects.equals(this.routers, resolveRuleReq.routers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, domainName, endpointId, region, ipaddresses, routers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResolveRuleReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    endpointId: ").append(toIndentedString(endpointId)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    ipaddresses: ").append(toIndentedString(ipaddresses)).append("\n");
        sb.append("    routers: ").append(toIndentedString(routers)).append("\n");
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