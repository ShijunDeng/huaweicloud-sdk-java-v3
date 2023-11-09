package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowQuotasInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quotas")

    private Quotas quotas;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public ShowQuotasInfoResponse withQuotas(Quotas quotas) {
        this.quotas = quotas;
        return this;
    }

    public ShowQuotasInfoResponse withQuotas(Consumer<Quotas> quotasSetter) {
        if (this.quotas == null) {
            this.quotas = new Quotas();
            quotasSetter.accept(this.quotas);
        }

        return this;
    }

    /**
     * Get quotas
     * @return quotas
     */
    public Quotas getQuotas() {
        return quotas;
    }

    public void setQuotas(Quotas quotas) {
        this.quotas = quotas;
    }

    public ShowQuotasInfoResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求id
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowQuotasInfoResponse that = (ShowQuotasInfoResponse) obj;
        return Objects.equals(this.quotas, that.quotas) && Objects.equals(this.requestId, that.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quotas, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowQuotasInfoResponse {\n");
        sb.append("    quotas: ").append(toIndentedString(quotas)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
