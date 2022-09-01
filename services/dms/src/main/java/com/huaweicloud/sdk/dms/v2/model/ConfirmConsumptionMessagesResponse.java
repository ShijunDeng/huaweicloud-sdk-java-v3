package com.huaweicloud.sdk.dms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ConfirmConsumptionMessagesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success")

    @JacksonXmlProperty(localName = "success")

    private Integer success;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail")

    @JacksonXmlProperty(localName = "fail")

    private Integer fail;

    public ConfirmConsumptionMessagesResponse withSuccess(Integer success) {
        this.success = success;
        return this;
    }

    /**
     * 确认成功的数目（如果为N，则表示前N条消息确认成功）。
     * @return success
     */
    public Integer getSuccess() {
        return success;
    }

    public void setSuccess(Integer success) {
        this.success = success;
    }

    public ConfirmConsumptionMessagesResponse withFail(Integer fail) {
        this.fail = fail;
        return this;
    }

    /**
     * 确认失败的数目（如果为N，则表示后N条消息确认失败）。
     * @return fail
     */
    public Integer getFail() {
        return fail;
    }

    public void setFail(Integer fail) {
        this.fail = fail;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConfirmConsumptionMessagesResponse confirmConsumptionMessagesResponse = (ConfirmConsumptionMessagesResponse) o;
        return Objects.equals(this.success, confirmConsumptionMessagesResponse.success)
            && Objects.equals(this.fail, confirmConsumptionMessagesResponse.fail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(success, fail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfirmConsumptionMessagesResponse {\n");
        sb.append("    success: ").append(toIndentedString(success)).append("\n");
        sb.append("    fail: ").append(toIndentedString(fail)).append("\n");
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
