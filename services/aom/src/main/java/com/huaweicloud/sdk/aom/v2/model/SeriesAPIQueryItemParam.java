package com.huaweicloud.sdk.aom.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 时间序列查询参数详情。
 */
public class SeriesAPIQueryItemParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "series")

    private List<QuerySeriesOptionParam> series = null;

    public SeriesAPIQueryItemParam withSeries(List<QuerySeriesOptionParam> series) {
        this.series = series;
        return this;
    }

    public SeriesAPIQueryItemParam addSeriesItem(QuerySeriesOptionParam seriesItem) {
        if (this.series == null) {
            this.series = new ArrayList<>();
        }
        this.series.add(seriesItem);
        return this;
    }

    public SeriesAPIQueryItemParam withSeries(Consumer<List<QuerySeriesOptionParam>> seriesSetter) {
        if (this.series == null) {
            this.series = new ArrayList<>();
        }
        seriesSetter.accept(this.series);
        return this;
    }

    /**
     * 通过该数组传递的参数信息进行时间序列查询。
     * @return series
     */
    public List<QuerySeriesOptionParam> getSeries() {
        return series;
    }

    public void setSeries(List<QuerySeriesOptionParam> series) {
        this.series = series;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SeriesAPIQueryItemParam that = (SeriesAPIQueryItemParam) obj;
        return Objects.equals(this.series, that.series);
    }

    @Override
    public int hashCode() {
        return Objects.hash(series);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SeriesAPIQueryItemParam {\n");
        sb.append("    series: ").append(toIndentedString(series)).append("\n");
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
