package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowMessageClearRuleResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message_retain_time")

    private Integer messageRetainTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message_retain_number")

    private Integer messageRetainNumber;

    public ShowMessageClearRuleResponse withMessageRetainTime(Integer messageRetainTime) {
        this.messageRetainTime = messageRetainTime;
        return this;
    }

    /**
     * 保存时长，单位：天
     * minimum: 180
     * maximum: 3650
     * @return messageRetainTime
     */
    public Integer getMessageRetainTime() {
        return messageRetainTime;
    }

    public void setMessageRetainTime(Integer messageRetainTime) {
        this.messageRetainTime = messageRetainTime;
    }

    public ShowMessageClearRuleResponse withMessageRetainNumber(Integer messageRetainNumber) {
        this.messageRetainNumber = messageRetainNumber;
        return this;
    }

    /**
     * 最多保留记录数
     * minimum: 10000
     * maximum: 5000000
     * @return messageRetainNumber
     */
    public Integer getMessageRetainNumber() {
        return messageRetainNumber;
    }

    public void setMessageRetainNumber(Integer messageRetainNumber) {
        this.messageRetainNumber = messageRetainNumber;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowMessageClearRuleResponse showMessageClearRuleResponse = (ShowMessageClearRuleResponse) o;
        return Objects.equals(this.messageRetainTime, showMessageClearRuleResponse.messageRetainTime)
            && Objects.equals(this.messageRetainNumber, showMessageClearRuleResponse.messageRetainNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(messageRetainTime, messageRetainNumber);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMessageClearRuleResponse {\n");
        sb.append("    messageRetainTime: ").append(toIndentedString(messageRetainTime)).append("\n");
        sb.append("    messageRetainNumber: ").append(toIndentedString(messageRetainNumber)).append("\n");
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