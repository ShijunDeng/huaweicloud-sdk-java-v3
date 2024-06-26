package com.huaweicloud.sdk.geip.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DetachInternetBandwidth
 */
public class DetachInternetBandwidth {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "global_eip_segment_id")

    private String globalEipSegmentId;

    public DetachInternetBandwidth withGlobalEipSegmentId(String globalEipSegmentId) {
        this.globalEipSegmentId = globalEipSegmentId;
        return this;
    }

    /**
     * 全域弹性公网IP段ID
     * @return globalEipSegmentId
     */
    public String getGlobalEipSegmentId() {
        return globalEipSegmentId;
    }

    public void setGlobalEipSegmentId(String globalEipSegmentId) {
        this.globalEipSegmentId = globalEipSegmentId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DetachInternetBandwidth that = (DetachInternetBandwidth) obj;
        return Objects.equals(this.globalEipSegmentId, that.globalEipSegmentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(globalEipSegmentId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DetachInternetBandwidth {\n");
        sb.append("    globalEipSegmentId: ").append(toIndentedString(globalEipSegmentId)).append("\n");
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
