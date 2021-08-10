package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** CreateProductTopicRequestBody */
public class CreateProductTopicRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission")

    private Integer permission;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public CreateProductTopicRequestBody withPermission(Integer permission) {
        this.permission = permission;
        return this;
    }

    /** 主题权限 0-发布 1-订阅 minimum: 0 maximum: 10
     * 
     * @return permission */
    public Integer getPermission() {
        return permission;
    }

    public void setPermission(Integer permission) {
        this.permission = permission;
    }

    public CreateProductTopicRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /** 产品级主题名称<br>
     * Topic类格式必须以“/”进行分层，区分每个类目。其中第一个为用户自定义的版本号；第二个已经规定好，为${deviceId}通配设备ID；第三个为用户自定义的topic类名（即本字段）。Topic类组成即为：/${version}/${deviceId}/${customizePart}。简单来说，Topic类：/v1/${deviceId}/customizePart是具体Topic：/v1/deviceid1/customizePart1和/v1/deviceid2/customizePart2等的集合。
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateProductTopicRequestBody withVersion(String version) {
        this.version = version;
        return this;
    }

    /** 版本号,输入2-50个字符。值以字母或数字开头和结尾。仅允许使用字母，数字，中划线和点号。
     * 
     * @return version */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public CreateProductTopicRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 描述
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateProductTopicRequestBody createProductTopicRequestBody = (CreateProductTopicRequestBody) o;
        return Objects.equals(this.permission, createProductTopicRequestBody.permission)
            && Objects.equals(this.name, createProductTopicRequestBody.name)
            && Objects.equals(this.version, createProductTopicRequestBody.version)
            && Objects.equals(this.description, createProductTopicRequestBody.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(permission, name, version, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateProductTopicRequestBody {\n");
        sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
