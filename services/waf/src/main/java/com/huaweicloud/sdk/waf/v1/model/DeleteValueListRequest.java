package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class DeleteValueListRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "valuelistid")

    private String valuelistid;

    public DeleteValueListRequest withValuelistid(String valuelistid) {
        this.valuelistid = valuelistid;
        return this;
    }

    /** 引用表id
     * 
     * @return valuelistid */
    public String getValuelistid() {
        return valuelistid;
    }

    public void setValuelistid(String valuelistid) {
        this.valuelistid = valuelistid;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteValueListRequest deleteValueListRequest = (DeleteValueListRequest) o;
        return Objects.equals(this.valuelistid, deleteValueListRequest.valuelistid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valuelistid);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteValueListRequest {\n");
        sb.append("    valuelistid: ").append(toIndentedString(valuelistid)).append("\n");
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
