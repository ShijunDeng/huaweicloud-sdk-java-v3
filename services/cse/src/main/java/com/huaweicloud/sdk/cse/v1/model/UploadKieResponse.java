package com.huaweicloud.sdk.cse.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UploadKieResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success")

    @JacksonXmlProperty(localName = "success")

    private List<GetKieConfigs> success = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failure")

    @JacksonXmlProperty(localName = "failure")

    private List<UploadKieRespFailure> failure = null;

    public UploadKieResponse withSuccess(List<GetKieConfigs> success) {
        this.success = success;
        return this;
    }

    public UploadKieResponse addSuccessItem(GetKieConfigs successItem) {
        if (this.success == null) {
            this.success = new ArrayList<>();
        }
        this.success.add(successItem);
        return this;
    }

    public UploadKieResponse withSuccess(Consumer<List<GetKieConfigs>> successSetter) {
        if (this.success == null) {
            this.success = new ArrayList<>();
        }
        successSetter.accept(this.success);
        return this;
    }

    /**
     * 导入成功的配置项列表。
     * @return success
     */
    public List<GetKieConfigs> getSuccess() {
        return success;
    }

    public void setSuccess(List<GetKieConfigs> success) {
        this.success = success;
    }

    public UploadKieResponse withFailure(List<UploadKieRespFailure> failure) {
        this.failure = failure;
        return this;
    }

    public UploadKieResponse addFailureItem(UploadKieRespFailure failureItem) {
        if (this.failure == null) {
            this.failure = new ArrayList<>();
        }
        this.failure.add(failureItem);
        return this;
    }

    public UploadKieResponse withFailure(Consumer<List<UploadKieRespFailure>> failureSetter) {
        if (this.failure == null) {
            this.failure = new ArrayList<>();
        }
        failureSetter.accept(this.failure);
        return this;
    }

    /**
     * 导入失败的配置项及其错误列表。
     * @return failure
     */
    public List<UploadKieRespFailure> getFailure() {
        return failure;
    }

    public void setFailure(List<UploadKieRespFailure> failure) {
        this.failure = failure;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UploadKieResponse uploadKieResponse = (UploadKieResponse) o;
        return Objects.equals(this.success, uploadKieResponse.success)
            && Objects.equals(this.failure, uploadKieResponse.failure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(success, failure);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UploadKieResponse {\n");
        sb.append("    success: ").append(toIndentedString(success)).append("\n");
        sb.append("    failure: ").append(toIndentedString(failure)).append("\n");
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
