package com.huaweicloud.sdk.ec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowEquipmentOspfResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ospf_enabled")

    private Boolean ospfEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "area_id")

    private Long areaId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "post_to_cloud")

    private Boolean postToCloud;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hello_timer")

    private Integer helloTimer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "router_id")

    private String routerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interfaces")

    private List<String> interfaces = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter_enabled")

    private Boolean filterEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trust_list")

    private List<String> trustList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "block_list")

    private List<String> blockList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_subnet_list")

    private List<String> cloudSubnetList = null;

    public ShowEquipmentOspfResponse withOspfEnabled(Boolean ospfEnabled) {
        this.ospfEnabled = ospfEnabled;
        return this;
    }

    /**
     * 是否启用OSPF
     * @return ospfEnabled
     */
    public Boolean getOspfEnabled() {
        return ospfEnabled;
    }

    public void setOspfEnabled(Boolean ospfEnabled) {
        this.ospfEnabled = ospfEnabled;
    }

    public ShowEquipmentOspfResponse withAreaId(Long areaId) {
        this.areaId = areaId;
        return this;
    }

    /**
     * 区域标识
     * minimum: 0
     * maximum: 4294967295
     * @return areaId
     */
    public Long getAreaId() {
        return areaId;
    }

    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    public ShowEquipmentOspfResponse withPostToCloud(Boolean postToCloud) {
        this.postToCloud = postToCloud;
        return this;
    }

    /**
     * 发布到企业连接网络
     * @return postToCloud
     */
    public Boolean getPostToCloud() {
        return postToCloud;
    }

    public void setPostToCloud(Boolean postToCloud) {
        this.postToCloud = postToCloud;
    }

    public ShowEquipmentOspfResponse withHelloTimer(Integer helloTimer) {
        this.helloTimer = helloTimer;
        return this;
    }

    /**
     * 发送Hello报文的时间间隔，单位是秒
     * minimum: 1
     * maximum: 65535
     * @return helloTimer
     */
    public Integer getHelloTimer() {
        return helloTimer;
    }

    public void setHelloTimer(Integer helloTimer) {
        this.helloTimer = helloTimer;
    }

    public ShowEquipmentOspfResponse withRouterId(String routerId) {
        this.routerId = routerId;
        return this;
    }

    /**
     * 点分十进制格式，OSPF协议使用全网唯一的Router ID
     * @return routerId
     */
    public String getRouterId() {
        return routerId;
    }

    public void setRouterId(String routerId) {
        this.routerId = routerId;
    }

    public ShowEquipmentOspfResponse withInterfaces(List<String> interfaces) {
        this.interfaces = interfaces;
        return this;
    }

    public ShowEquipmentOspfResponse addInterfacesItem(String interfacesItem) {
        if (this.interfaces == null) {
            this.interfaces = new ArrayList<>();
        }
        this.interfaces.add(interfacesItem);
        return this;
    }

    public ShowEquipmentOspfResponse withInterfaces(Consumer<List<String>> interfacesSetter) {
        if (this.interfaces == null) {
            this.interfaces = new ArrayList<>();
        }
        interfacesSetter.accept(this.interfaces);
        return this;
    }

    /**
     * 启用OSPF协议的接口列表
     * @return interfaces
     */
    public List<String> getInterfaces() {
        return interfaces;
    }

    public void setInterfaces(List<String> interfaces) {
        this.interfaces = interfaces;
    }

    public ShowEquipmentOspfResponse withFilterEnabled(Boolean filterEnabled) {
        this.filterEnabled = filterEnabled;
        return this;
    }

    /**
     * 是否启用前缀过滤
     * @return filterEnabled
     */
    public Boolean getFilterEnabled() {
        return filterEnabled;
    }

    public void setFilterEnabled(Boolean filterEnabled) {
        this.filterEnabled = filterEnabled;
    }

    public ShowEquipmentOspfResponse withTrustList(List<String> trustList) {
        this.trustList = trustList;
        return this;
    }

    public ShowEquipmentOspfResponse addTrustListItem(String trustListItem) {
        if (this.trustList == null) {
            this.trustList = new ArrayList<>();
        }
        this.trustList.add(trustListItem);
        return this;
    }

    public ShowEquipmentOspfResponse withTrustList(Consumer<List<String>> trustListSetter) {
        if (this.trustList == null) {
            this.trustList = new ArrayList<>();
        }
        trustListSetter.accept(this.trustList);
        return this;
    }

    /**
     * 白名单列表
     * @return trustList
     */
    public List<String> getTrustList() {
        return trustList;
    }

    public void setTrustList(List<String> trustList) {
        this.trustList = trustList;
    }

    public ShowEquipmentOspfResponse withBlockList(List<String> blockList) {
        this.blockList = blockList;
        return this;
    }

    public ShowEquipmentOspfResponse addBlockListItem(String blockListItem) {
        if (this.blockList == null) {
            this.blockList = new ArrayList<>();
        }
        this.blockList.add(blockListItem);
        return this;
    }

    public ShowEquipmentOspfResponse withBlockList(Consumer<List<String>> blockListSetter) {
        if (this.blockList == null) {
            this.blockList = new ArrayList<>();
        }
        blockListSetter.accept(this.blockList);
        return this;
    }

    /**
     * 黑名单列表
     * @return blockList
     */
    public List<String> getBlockList() {
        return blockList;
    }

    public void setBlockList(List<String> blockList) {
        this.blockList = blockList;
    }

    public ShowEquipmentOspfResponse withCloudSubnetList(List<String> cloudSubnetList) {
        this.cloudSubnetList = cloudSubnetList;
        return this;
    }

    public ShowEquipmentOspfResponse addCloudSubnetListItem(String cloudSubnetListItem) {
        if (this.cloudSubnetList == null) {
            this.cloudSubnetList = new ArrayList<>();
        }
        this.cloudSubnetList.add(cloudSubnetListItem);
        return this;
    }

    public ShowEquipmentOspfResponse withCloudSubnetList(Consumer<List<String>> cloudSubnetListSetter) {
        if (this.cloudSubnetList == null) {
            this.cloudSubnetList = new ArrayList<>();
        }
        cloudSubnetListSetter.accept(this.cloudSubnetList);
        return this;
    }

    /**
     * 上云子网列表
     * @return cloudSubnetList
     */
    public List<String> getCloudSubnetList() {
        return cloudSubnetList;
    }

    public void setCloudSubnetList(List<String> cloudSubnetList) {
        this.cloudSubnetList = cloudSubnetList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowEquipmentOspfResponse that = (ShowEquipmentOspfResponse) obj;
        return Objects.equals(this.ospfEnabled, that.ospfEnabled) && Objects.equals(this.areaId, that.areaId)
            && Objects.equals(this.postToCloud, that.postToCloud) && Objects.equals(this.helloTimer, that.helloTimer)
            && Objects.equals(this.routerId, that.routerId) && Objects.equals(this.interfaces, that.interfaces)
            && Objects.equals(this.filterEnabled, that.filterEnabled) && Objects.equals(this.trustList, that.trustList)
            && Objects.equals(this.blockList, that.blockList)
            && Objects.equals(this.cloudSubnetList, that.cloudSubnetList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ospfEnabled,
            areaId,
            postToCloud,
            helloTimer,
            routerId,
            interfaces,
            filterEnabled,
            trustList,
            blockList,
            cloudSubnetList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowEquipmentOspfResponse {\n");
        sb.append("    ospfEnabled: ").append(toIndentedString(ospfEnabled)).append("\n");
        sb.append("    areaId: ").append(toIndentedString(areaId)).append("\n");
        sb.append("    postToCloud: ").append(toIndentedString(postToCloud)).append("\n");
        sb.append("    helloTimer: ").append(toIndentedString(helloTimer)).append("\n");
        sb.append("    routerId: ").append(toIndentedString(routerId)).append("\n");
        sb.append("    interfaces: ").append(toIndentedString(interfaces)).append("\n");
        sb.append("    filterEnabled: ").append(toIndentedString(filterEnabled)).append("\n");
        sb.append("    trustList: ").append(toIndentedString(trustList)).append("\n");
        sb.append("    blockList: ").append(toIndentedString(blockList)).append("\n");
        sb.append("    cloudSubnetList: ").append(toIndentedString(cloudSubnetList)).append("\n");
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
