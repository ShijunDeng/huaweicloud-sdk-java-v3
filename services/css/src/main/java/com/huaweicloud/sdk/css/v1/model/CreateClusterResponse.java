package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateClusterResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster")

    private CreateClusterClusterResponse cluster;

    public CreateClusterResponse withCluster(CreateClusterClusterResponse cluster) {
        this.cluster = cluster;
        return this;
    }

    public CreateClusterResponse withCluster(Consumer<CreateClusterClusterResponse> clusterSetter) {
        if (this.cluster == null) {
            this.cluster = new CreateClusterClusterResponse();
            clusterSetter.accept(this.cluster);
        }

        return this;
    }

    /**
     * Get cluster
     * @return cluster
     */
    public CreateClusterClusterResponse getCluster() {
        return cluster;
    }

    public void setCluster(CreateClusterClusterResponse cluster) {
        this.cluster = cluster;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateClusterResponse createClusterResponse = (CreateClusterResponse) o;
        return Objects.equals(this.cluster, createClusterResponse.cluster);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cluster);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateClusterResponse {\n");
        sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
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