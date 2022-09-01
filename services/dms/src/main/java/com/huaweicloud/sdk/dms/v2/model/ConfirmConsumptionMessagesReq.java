package com.huaweicloud.sdk.dms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ConfirmConsumptionMessagesReq
 */
public class ConfirmConsumptionMessagesReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    @JacksonXmlProperty(localName = "message")

    private List<ConfirmMessageEntity> message = null;

    public ConfirmConsumptionMessagesReq withMessage(List<ConfirmMessageEntity> message) {
        this.message = message;
        return this;
    }

    public ConfirmConsumptionMessagesReq addMessageItem(ConfirmMessageEntity messageItem) {
        if (this.message == null) {
            this.message = new ArrayList<>();
        }
        this.message.add(messageItem);
        return this;
    }

    public ConfirmConsumptionMessagesReq withMessage(Consumer<List<ConfirmMessageEntity>> messageSetter) {
        if (this.message == null) {
            this.message = new ArrayList<>();
        }
        messageSetter.accept(this.message);
        return this;
    }

    /**
     * 确认消息数组。
     * @return message
     */
    public List<ConfirmMessageEntity> getMessage() {
        return message;
    }

    public void setMessage(List<ConfirmMessageEntity> message) {
        this.message = message;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConfirmConsumptionMessagesReq confirmConsumptionMessagesReq = (ConfirmConsumptionMessagesReq) o;
        return Objects.equals(this.message, confirmConsumptionMessagesReq.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfirmConsumptionMessagesReq {\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
