package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 只读节点权重配置信息。
 */
public class ModifyProxyRouteWeightReadonlyNode {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "weight")

    private Integer weight;

    public ModifyProxyRouteWeightReadonlyNode withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 只读节点ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ModifyProxyRouteWeightReadonlyNode withWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

    /**
     * 只读节点权重： - 如果路由模式为0，取值为0~1000； - 如果路由模式为1或2，取值为0或1。
     * @return weight
     */
    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModifyProxyRouteWeightReadonlyNode that = (ModifyProxyRouteWeightReadonlyNode) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.weight, that.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, weight);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyProxyRouteWeightReadonlyNode {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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
