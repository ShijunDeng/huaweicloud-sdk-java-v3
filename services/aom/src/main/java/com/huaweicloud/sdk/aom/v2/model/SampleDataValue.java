package com.huaweicloud.sdk.aom.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询结果详细。
 */
public class SampleDataValue {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sample")

    private QuerySample sample;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_points")

    private List<MetricDataPoints> dataPoints = null;

    public SampleDataValue withSample(QuerySample sample) {
        this.sample = sample;
        return this;
    }

    public SampleDataValue withSample(Consumer<QuerySample> sampleSetter) {
        if (this.sample == null) {
            this.sample = new QuerySample();
            sampleSetter.accept(this.sample);
        }

        return this;
    }

    /**
     * Get sample
     * @return sample
     */
    public QuerySample getSample() {
        return sample;
    }

    public void setSample(QuerySample sample) {
        this.sample = sample;
    }

    public SampleDataValue withDataPoints(List<MetricDataPoints> dataPoints) {
        this.dataPoints = dataPoints;
        return this;
    }

    public SampleDataValue addDataPointsItem(MetricDataPoints dataPointsItem) {
        if (this.dataPoints == null) {
            this.dataPoints = new ArrayList<>();
        }
        this.dataPoints.add(dataPointsItem);
        return this;
    }

    public SampleDataValue withDataPoints(Consumer<List<MetricDataPoints>> dataPointsSetter) {
        if (this.dataPoints == null) {
            this.dataPoints = new ArrayList<>();
        }
        dataPointsSetter.accept(this.dataPoints);
        return this;
    }

    /**
     * 时序数据。
     * @return dataPoints
     */
    public List<MetricDataPoints> getDataPoints() {
        return dataPoints;
    }

    public void setDataPoints(List<MetricDataPoints> dataPoints) {
        this.dataPoints = dataPoints;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SampleDataValue that = (SampleDataValue) obj;
        return Objects.equals(this.sample, that.sample) && Objects.equals(this.dataPoints, that.dataPoints);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sample, dataPoints);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SampleDataValue {\n");
        sb.append("    sample: ").append(toIndentedString(sample)).append("\n");
        sb.append("    dataPoints: ").append(toIndentedString(dataPoints)).append("\n");
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
