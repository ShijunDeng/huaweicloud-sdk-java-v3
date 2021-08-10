package com.huaweicloud.sdk.evs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** GPSSD类型云硬盘预留的size大小，单位为GB，键值对，包含：reserved（预留）、allocated（预留）、limit（最大）和in_use（已使用）。 */
public class QuotaDetailGigabytesGPSSD {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "in_use")

    private Integer inUse;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reserved")

    private Integer reserved;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allocated")

    private Integer allocated;

    public QuotaDetailGigabytesGPSSD withInUse(Integer inUse) {
        this.inUse = inUse;
        return this;
    }

    /** 已使用的数量。
     * 
     * @return inUse */
    public Integer getInUse() {
        return inUse;
    }

    public void setInUse(Integer inUse) {
        this.inUse = inUse;
    }

    public QuotaDetailGigabytesGPSSD withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /** 最大的数量。
     * 
     * @return limit */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public QuotaDetailGigabytesGPSSD withReserved(Integer reserved) {
        this.reserved = reserved;
        return this;
    }

    /** 预留属性。
     * 
     * @return reserved */
    public Integer getReserved() {
        return reserved;
    }

    public void setReserved(Integer reserved) {
        this.reserved = reserved;
    }

    public QuotaDetailGigabytesGPSSD withAllocated(Integer allocated) {
        this.allocated = allocated;
        return this;
    }

    /** 预留属性。
     * 
     * @return allocated */
    public Integer getAllocated() {
        return allocated;
    }

    public void setAllocated(Integer allocated) {
        this.allocated = allocated;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QuotaDetailGigabytesGPSSD quotaDetailGigabytesGPSSD = (QuotaDetailGigabytesGPSSD) o;
        return Objects.equals(this.inUse, quotaDetailGigabytesGPSSD.inUse)
            && Objects.equals(this.limit, quotaDetailGigabytesGPSSD.limit)
            && Objects.equals(this.reserved, quotaDetailGigabytesGPSSD.reserved)
            && Objects.equals(this.allocated, quotaDetailGigabytesGPSSD.allocated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inUse, limit, reserved, allocated);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QuotaDetailGigabytesGPSSD {\n");
        sb.append("    inUse: ").append(toIndentedString(inUse)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    reserved: ").append(toIndentedString(reserved)).append("\n");
        sb.append("    allocated: ").append(toIndentedString(allocated)).append("\n");
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
