package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class CreateMasterSlavePoolRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool")

    private CreateMasterSlavePoolOption pool;

    public CreateMasterSlavePoolRequestBody withPool(CreateMasterSlavePoolOption pool) {
        this.pool = pool;
        return this;
    }

    public CreateMasterSlavePoolRequestBody withPool(Consumer<CreateMasterSlavePoolOption> poolSetter) {
        if (this.pool == null) {
            this.pool = new CreateMasterSlavePoolOption();
            poolSetter.accept(this.pool);
        }

        return this;
    }

    /**
     * Get pool
     * @return pool
     */
    public CreateMasterSlavePoolOption getPool() {
        return pool;
    }

    public void setPool(CreateMasterSlavePoolOption pool) {
        this.pool = pool;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateMasterSlavePoolRequestBody createMasterSlavePoolRequestBody = (CreateMasterSlavePoolRequestBody) o;
        return Objects.equals(this.pool, createMasterSlavePoolRequestBody.pool);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pool);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateMasterSlavePoolRequestBody {\n");
        sb.append("    pool: ").append(toIndentedString(pool)).append("\n");
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