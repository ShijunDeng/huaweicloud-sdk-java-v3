package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateRecordSetRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zone_id")

    @JacksonXmlProperty(localName = "zone_id")

    private String zoneId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recordset_id")

    @JacksonXmlProperty(localName = "recordset_id")

    private String recordsetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private UpdateRecordSetReq body;

    public UpdateRecordSetRequest withZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }

    /**
     * Get zoneId
     * @return zoneId
     */
    public String getZoneId() {
        return zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public UpdateRecordSetRequest withRecordsetId(String recordsetId) {
        this.recordsetId = recordsetId;
        return this;
    }

    /**
     * Get recordsetId
     * @return recordsetId
     */
    public String getRecordsetId() {
        return recordsetId;
    }

    public void setRecordsetId(String recordsetId) {
        this.recordsetId = recordsetId;
    }

    public UpdateRecordSetRequest withBody(UpdateRecordSetReq body) {
        this.body = body;
        return this;
    }

    public UpdateRecordSetRequest withBody(Consumer<UpdateRecordSetReq> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateRecordSetReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateRecordSetReq getBody() {
        return body;
    }

    public void setBody(UpdateRecordSetReq body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateRecordSetRequest updateRecordSetRequest = (UpdateRecordSetRequest) o;
        return Objects.equals(this.zoneId, updateRecordSetRequest.zoneId)
            && Objects.equals(this.recordsetId, updateRecordSetRequest.recordsetId)
            && Objects.equals(this.body, updateRecordSetRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(zoneId, recordsetId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateRecordSetRequest {\n");
        sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
        sb.append("    recordsetId: ").append(toIndentedString(recordsetId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
