package com.huaweicloud.sdk.dis.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class SendRecordsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_record_count")

    private Integer failedRecordCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "records")

    private List<PutRecordsResultEntry> records = null;

    public SendRecordsResponse withFailedRecordCount(Integer failedRecordCount) {
        this.failedRecordCount = failedRecordCount;
        return this;
    }

    /**
     * 上传失败的数据数量。
     * @return failedRecordCount
     */
    public Integer getFailedRecordCount() {
        return failedRecordCount;
    }

    public void setFailedRecordCount(Integer failedRecordCount) {
        this.failedRecordCount = failedRecordCount;
    }

    public SendRecordsResponse withRecords(List<PutRecordsResultEntry> records) {
        this.records = records;
        return this;
    }

    public SendRecordsResponse addRecordsItem(PutRecordsResultEntry recordsItem) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        this.records.add(recordsItem);
        return this;
    }

    public SendRecordsResponse withRecords(Consumer<List<PutRecordsResultEntry>> recordsSetter) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        recordsSetter.accept(this.records);
        return this;
    }

    /**
     * 上传结果列表。
     * @return records
     */
    public List<PutRecordsResultEntry> getRecords() {
        return records;
    }

    public void setRecords(List<PutRecordsResultEntry> records) {
        this.records = records;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SendRecordsResponse that = (SendRecordsResponse) obj;
        return Objects.equals(this.failedRecordCount, that.failedRecordCount)
            && Objects.equals(this.records, that.records);
    }

    @Override
    public int hashCode() {
        return Objects.hash(failedRecordCount, records);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SendRecordsResponse {\n");
        sb.append("    failedRecordCount: ").append(toIndentedString(failedRecordCount)).append("\n");
        sb.append("    records: ").append(toIndentedString(records)).append("\n");
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
