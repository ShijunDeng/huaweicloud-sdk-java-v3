package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 创建全局变量
 */
public class CreateGlobalValueReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "var_name")

    @JacksonXmlProperty(localName = "var_name")

    private String varName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "var_value")

    @JacksonXmlProperty(localName = "var_value")

    private String varValue;

    public CreateGlobalValueReq withVarName(String varName) {
        this.varName = varName;
        return this;
    }

    /**
     * 变量名称
     * @return varName
     */
    public String getVarName() {
        return varName;
    }

    public void setVarName(String varName) {
        this.varName = varName;
    }

    public CreateGlobalValueReq withVarValue(String varValue) {
        this.varValue = varValue;
        return this;
    }

    /**
     * 变量的值
     * @return varValue
     */
    public String getVarValue() {
        return varValue;
    }

    public void setVarValue(String varValue) {
        this.varValue = varValue;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateGlobalValueReq createGlobalValueReq = (CreateGlobalValueReq) o;
        return Objects.equals(this.varName, createGlobalValueReq.varName)
            && Objects.equals(this.varValue, createGlobalValueReq.varValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(varName, varValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateGlobalValueReq {\n");
        sb.append("    varName: ").append(toIndentedString(varName)).append("\n");
        sb.append("    varValue: ").append(toIndentedString(varValue)).append("\n");
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
