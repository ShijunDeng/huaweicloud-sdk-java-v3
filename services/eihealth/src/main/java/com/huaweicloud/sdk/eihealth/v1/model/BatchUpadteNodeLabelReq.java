package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 待更新的标签集
 */
public class BatchUpadteNodeLabelReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private List<UpadteNodeLabelReq> labels = null;

    public BatchUpadteNodeLabelReq withLabels(List<UpadteNodeLabelReq> labels) {
        this.labels = labels;
        return this;
    }

    public BatchUpadteNodeLabelReq addLabelsItem(UpadteNodeLabelReq labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    public BatchUpadteNodeLabelReq withLabels(Consumer<List<UpadteNodeLabelReq>> labelsSetter) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        labelsSetter.accept(this.labels);
        return this;
    }

    /**
     * 标签列表
     * @return labels
     */
    public List<UpadteNodeLabelReq> getLabels() {
        return labels;
    }

    public void setLabels(List<UpadteNodeLabelReq> labels) {
        this.labels = labels;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchUpadteNodeLabelReq batchUpadteNodeLabelReq = (BatchUpadteNodeLabelReq) o;
        return Objects.equals(this.labels, batchUpadteNodeLabelReq.labels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(labels);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchUpadteNodeLabelReq {\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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