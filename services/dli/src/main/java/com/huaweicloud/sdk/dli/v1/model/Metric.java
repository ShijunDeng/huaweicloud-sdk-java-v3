package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 作业的所有输入输出监控信息。
 */
public class Metric {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sources")

    private List<FlinkJobMetricInfo> sources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sinks")

    private List<FlinkJobMetricInfo> sinks = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_read_rate")

    private Double totalReadRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_write_rate")

    private Double totalWriteRate;

    public Metric withSources(List<FlinkJobMetricInfo> sources) {
        this.sources = sources;
        return this;
    }

    public Metric addSourcesItem(FlinkJobMetricInfo sourcesItem) {
        if (this.sources == null) {
            this.sources = new ArrayList<>();
        }
        this.sources.add(sourcesItem);
        return this;
    }

    public Metric withSources(Consumer<List<FlinkJobMetricInfo>> sourcesSetter) {
        if (this.sources == null) {
            this.sources = new ArrayList<>();
        }
        sourcesSetter.accept(this.sources);
        return this;
    }

    /**
     * 所有输入流。
     * @return sources
     */
    public List<FlinkJobMetricInfo> getSources() {
        return sources;
    }

    public void setSources(List<FlinkJobMetricInfo> sources) {
        this.sources = sources;
    }

    public Metric withSinks(List<FlinkJobMetricInfo> sinks) {
        this.sinks = sinks;
        return this;
    }

    public Metric addSinksItem(FlinkJobMetricInfo sinksItem) {
        if (this.sinks == null) {
            this.sinks = new ArrayList<>();
        }
        this.sinks.add(sinksItem);
        return this;
    }

    public Metric withSinks(Consumer<List<FlinkJobMetricInfo>> sinksSetter) {
        if (this.sinks == null) {
            this.sinks = new ArrayList<>();
        }
        sinksSetter.accept(this.sinks);
        return this;
    }

    /**
     * 所有输出流。
     * @return sinks
     */
    public List<FlinkJobMetricInfo> getSinks() {
        return sinks;
    }

    public void setSinks(List<FlinkJobMetricInfo> sinks) {
        this.sinks = sinks;
    }

    public Metric withTotalReadRate(Double totalReadRate) {
        this.totalReadRate = totalReadRate;
        return this;
    }

    /**
     * 总输入速率
     * @return totalReadRate
     */
    public Double getTotalReadRate() {
        return totalReadRate;
    }

    public void setTotalReadRate(Double totalReadRate) {
        this.totalReadRate = totalReadRate;
    }

    public Metric withTotalWriteRate(Double totalWriteRate) {
        this.totalWriteRate = totalWriteRate;
        return this;
    }

    /**
     * 总输出速率
     * @return totalWriteRate
     */
    public Double getTotalWriteRate() {
        return totalWriteRate;
    }

    public void setTotalWriteRate(Double totalWriteRate) {
        this.totalWriteRate = totalWriteRate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Metric that = (Metric) obj;
        return Objects.equals(this.sources, that.sources) && Objects.equals(this.sinks, that.sinks)
            && Objects.equals(this.totalReadRate, that.totalReadRate)
            && Objects.equals(this.totalWriteRate, that.totalWriteRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sources, sinks, totalReadRate, totalWriteRate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Metric {\n");
        sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
        sb.append("    sinks: ").append(toIndentedString(sinks)).append("\n");
        sb.append("    totalReadRate: ").append(toIndentedString(totalReadRate)).append("\n");
        sb.append("    totalWriteRate: ").append(toIndentedString(totalWriteRate)).append("\n");
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
