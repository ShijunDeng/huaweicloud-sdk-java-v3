package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class NovaVersionMediaType {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "base")

    private String base;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    public NovaVersionMediaType withBase(String base) {
        this.base = base;
        return this;
    }

    /**
     * 基础类型。
     * @return base
     */
    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public NovaVersionMediaType withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 媒体类型。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NovaVersionMediaType that = (NovaVersionMediaType) obj;
        return Objects.equals(this.base, that.base) && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(base, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NovaVersionMediaType {\n");
        sb.append("    base: ").append(toIndentedString(base)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
