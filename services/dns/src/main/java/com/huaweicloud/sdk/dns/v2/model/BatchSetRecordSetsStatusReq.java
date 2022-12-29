package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchSetRecordSetsStatusReq
 */
public class BatchSetRecordSetsStatusReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recordset_ids")

    private List<String> recordsetIds = null;

    public BatchSetRecordSetsStatusReq withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 待设置Record Se状态，当前仅支持DISABLE或ENABLE。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BatchSetRecordSetsStatusReq withRecordsetIds(List<String> recordsetIds) {
        this.recordsetIds = recordsetIds;
        return this;
    }

    public BatchSetRecordSetsStatusReq addRecordsetIdsItem(String recordsetIdsItem) {
        if (this.recordsetIds == null) {
            this.recordsetIds = new ArrayList<>();
        }
        this.recordsetIds.add(recordsetIdsItem);
        return this;
    }

    public BatchSetRecordSetsStatusReq withRecordsetIds(Consumer<List<String>> recordsetIdsSetter) {
        if (this.recordsetIds == null) {
            this.recordsetIds = new ArrayList<>();
        }
        recordsetIdsSetter.accept(this.recordsetIds);
        return this;
    }

    /**
     * 待设置Record Set ID列表。 最多支持50个。
     * @return recordsetIds
     */
    public List<String> getRecordsetIds() {
        return recordsetIds;
    }

    public void setRecordsetIds(List<String> recordsetIds) {
        this.recordsetIds = recordsetIds;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchSetRecordSetsStatusReq batchSetRecordSetsStatusReq = (BatchSetRecordSetsStatusReq) o;
        return Objects.equals(this.status, batchSetRecordSetsStatusReq.status)
            && Objects.equals(this.recordsetIds, batchSetRecordSetsStatusReq.recordsetIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, recordsetIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchSetRecordSetsStatusReq {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    recordsetIds: ").append(toIndentedString(recordsetIds)).append("\n");
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
