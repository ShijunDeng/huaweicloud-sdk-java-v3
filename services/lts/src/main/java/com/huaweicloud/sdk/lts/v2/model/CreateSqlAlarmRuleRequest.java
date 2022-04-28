package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateSqlAlarmRuleRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CreateSqlAlarmRuleRequestBody body;

    public CreateSqlAlarmRuleRequest withBody(CreateSqlAlarmRuleRequestBody body) {
        this.body = body;
        return this;
    }

    public CreateSqlAlarmRuleRequest withBody(Consumer<CreateSqlAlarmRuleRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new CreateSqlAlarmRuleRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CreateSqlAlarmRuleRequestBody getBody() {
        return body;
    }

    public void setBody(CreateSqlAlarmRuleRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateSqlAlarmRuleRequest createSqlAlarmRuleRequest = (CreateSqlAlarmRuleRequest) o;
        return Objects.equals(this.body, createSqlAlarmRuleRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSqlAlarmRuleRequest {\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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