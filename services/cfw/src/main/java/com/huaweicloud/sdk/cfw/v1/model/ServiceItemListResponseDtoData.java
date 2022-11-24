package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 服务组成员列表
 */
public class ServiceItemListResponseDtoData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "records")

    private List<ServiceItemListResponseDtoDataRecords> records = null;

    public ServiceItemListResponseDtoData withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量：指定返回记录的开始位置，必须为数字，取值范围为大于或等于0，默认0
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ServiceItemListResponseDtoData withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示个数
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ServiceItemListResponseDtoData withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 记录的总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ServiceItemListResponseDtoData withRecords(List<ServiceItemListResponseDtoDataRecords> records) {
        this.records = records;
        return this;
    }

    public ServiceItemListResponseDtoData addRecordsItem(ServiceItemListResponseDtoDataRecords recordsItem) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        this.records.add(recordsItem);
        return this;
    }

    public ServiceItemListResponseDtoData withRecords(
        Consumer<List<ServiceItemListResponseDtoDataRecords>> recordsSetter) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        recordsSetter.accept(this.records);
        return this;
    }

    /**
     * 记录
     * @return records
     */
    public List<ServiceItemListResponseDtoDataRecords> getRecords() {
        return records;
    }

    public void setRecords(List<ServiceItemListResponseDtoDataRecords> records) {
        this.records = records;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ServiceItemListResponseDtoData serviceItemListResponseDtoData = (ServiceItemListResponseDtoData) o;
        return Objects.equals(this.offset, serviceItemListResponseDtoData.offset)
            && Objects.equals(this.limit, serviceItemListResponseDtoData.limit)
            && Objects.equals(this.total, serviceItemListResponseDtoData.total)
            && Objects.equals(this.records, serviceItemListResponseDtoData.records);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offset, limit, total, records);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServiceItemListResponseDtoData {\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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