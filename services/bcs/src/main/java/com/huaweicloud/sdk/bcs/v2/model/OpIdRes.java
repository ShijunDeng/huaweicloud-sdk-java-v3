package com.huaweicloud.sdk.bcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** OpIdRes */
public class OpIdRes {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_id")

    private String operationId;

    public OpIdRes withOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }

    /** 操作记录id
     * 
     * @return operationId */
    public String getOperationId() {
        return operationId;
    }

    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OpIdRes opIdRes = (OpIdRes) o;
        return Objects.equals(this.operationId, opIdRes.operationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operationId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpIdRes {\n");
        sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
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