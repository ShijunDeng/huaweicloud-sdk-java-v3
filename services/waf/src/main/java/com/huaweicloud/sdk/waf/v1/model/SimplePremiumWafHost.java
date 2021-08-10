package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/** 独享模式域名部分详情 */
public class SimplePremiumWafHost {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hostname")

    private String hostname;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policyid")

    private String policyid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_status")

    private Integer protectStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_status")

    private Integer accessStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flag")

    private Map<String, String> flag = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private String mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool_ids")

    private List<String> poolIds = null;

    public SimplePremiumWafHost withId(String id) {
        this.id = id;
        return this;
    }

    /** 域名id
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SimplePremiumWafHost withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /** 域名
     * 
     * @return hostname */
    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public SimplePremiumWafHost withPolicyid(String policyid) {
        this.policyid = policyid;
        return this;
    }

    /** 策略id
     * 
     * @return policyid */
    public String getPolicyid() {
        return policyid;
    }

    public void setPolicyid(String policyid) {
        this.policyid = policyid;
    }

    public SimplePremiumWafHost withProtectStatus(Integer protectStatus) {
        this.protectStatus = protectStatus;
        return this;
    }

    /** 防护状态
     * 
     * @return protectStatus */
    public Integer getProtectStatus() {
        return protectStatus;
    }

    public void setProtectStatus(Integer protectStatus) {
        this.protectStatus = protectStatus;
    }

    public SimplePremiumWafHost withAccessStatus(Integer accessStatus) {
        this.accessStatus = accessStatus;
        return this;
    }

    /** 接入状态
     * 
     * @return accessStatus */
    public Integer getAccessStatus() {
        return accessStatus;
    }

    public void setAccessStatus(Integer accessStatus) {
        this.accessStatus = accessStatus;
    }

    public SimplePremiumWafHost withFlag(Map<String, String> flag) {
        this.flag = flag;
        return this;
    }

    public SimplePremiumWafHost putFlagItem(String key, String flagItem) {
        if (this.flag == null) {
            this.flag = new HashMap<>();
        }
        this.flag.put(key, flagItem);
        return this;
    }

    public SimplePremiumWafHost withFlag(Consumer<Map<String, String>> flagSetter) {
        if (this.flag == null) {
            this.flag = new HashMap<>();
        }
        flagSetter.accept(this.flag);
        return this;
    }

    /** 特殊标识
     * 
     * @return flag */
    public Map<String, String> getFlag() {
        return flag;
    }

    public void setFlag(Map<String, String> flag) {
        this.flag = flag;
    }

    public SimplePremiumWafHost withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /** 特殊模式独享引擎的标识（如elb）
     * 
     * @return mode */
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public SimplePremiumWafHost withPoolIds(List<String> poolIds) {
        this.poolIds = poolIds;
        return this;
    }

    public SimplePremiumWafHost addPoolIdsItem(String poolIdsItem) {
        if (this.poolIds == null) {
            this.poolIds = new ArrayList<>();
        }
        this.poolIds.add(poolIdsItem);
        return this;
    }

    public SimplePremiumWafHost withPoolIds(Consumer<List<String>> poolIdsSetter) {
        if (this.poolIds == null) {
            this.poolIds = new ArrayList<>();
        }
        poolIdsSetter.accept(this.poolIds);
        return this;
    }

    /** 特殊模式域名所属独享引擎组
     * 
     * @return poolIds */
    public List<String> getPoolIds() {
        return poolIds;
    }

    public void setPoolIds(List<String> poolIds) {
        this.poolIds = poolIds;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SimplePremiumWafHost simplePremiumWafHost = (SimplePremiumWafHost) o;
        return Objects.equals(this.id, simplePremiumWafHost.id)
            && Objects.equals(this.hostname, simplePremiumWafHost.hostname)
            && Objects.equals(this.policyid, simplePremiumWafHost.policyid)
            && Objects.equals(this.protectStatus, simplePremiumWafHost.protectStatus)
            && Objects.equals(this.accessStatus, simplePremiumWafHost.accessStatus)
            && Objects.equals(this.flag, simplePremiumWafHost.flag)
            && Objects.equals(this.mode, simplePremiumWafHost.mode)
            && Objects.equals(this.poolIds, simplePremiumWafHost.poolIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, hostname, policyid, protectStatus, accessStatus, flag, mode, poolIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SimplePremiumWafHost {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
        sb.append("    policyid: ").append(toIndentedString(policyid)).append("\n");
        sb.append("    protectStatus: ").append(toIndentedString(protectStatus)).append("\n");
        sb.append("    accessStatus: ").append(toIndentedString(accessStatus)).append("\n");
        sb.append("    flag: ").append(toIndentedString(flag)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    poolIds: ").append(toIndentedString(poolIds)).append("\n");
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
