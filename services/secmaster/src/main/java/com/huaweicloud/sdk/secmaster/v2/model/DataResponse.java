package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * indicator batch operation response
 */
public class DataResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_ids")

    private List<String> successIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_ids")

    private List<String> errorIds = null;

    public DataResponse withSuccessIds(List<String> successIds) {
        this.successIds = successIds;
        return this;
    }

    public DataResponse addSuccessIdsItem(String successIdsItem) {
        if (this.successIds == null) {
            this.successIds = new ArrayList<>();
        }
        this.successIds.add(successIdsItem);
        return this;
    }

    public DataResponse withSuccessIds(Consumer<List<String>> successIdsSetter) {
        if (this.successIds == null) {
            this.successIds = new ArrayList<>();
        }
        successIdsSetter.accept(this.successIds);
        return this;
    }

    /**
     * id list
     * @return successIds
     */
    public List<String> getSuccessIds() {
        return successIds;
    }

    public void setSuccessIds(List<String> successIds) {
        this.successIds = successIds;
    }

    public DataResponse withErrorIds(List<String> errorIds) {
        this.errorIds = errorIds;
        return this;
    }

    public DataResponse addErrorIdsItem(String errorIdsItem) {
        if (this.errorIds == null) {
            this.errorIds = new ArrayList<>();
        }
        this.errorIds.add(errorIdsItem);
        return this;
    }

    public DataResponse withErrorIds(Consumer<List<String>> errorIdsSetter) {
        if (this.errorIds == null) {
            this.errorIds = new ArrayList<>();
        }
        errorIdsSetter.accept(this.errorIds);
        return this;
    }

    /**
     * id list
     * @return errorIds
     */
    public List<String> getErrorIds() {
        return errorIds;
    }

    public void setErrorIds(List<String> errorIds) {
        this.errorIds = errorIds;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DataResponse dataResponse = (DataResponse) o;
        return Objects.equals(this.successIds, dataResponse.successIds)
            && Objects.equals(this.errorIds, dataResponse.errorIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(successIds, errorIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataResponse {\n");
        sb.append("    successIds: ").append(toIndentedString(successIds)).append("\n");
        sb.append("    errorIds: ").append(toIndentedString(errorIds)).append("\n");
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