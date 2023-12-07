package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListGaussMySqlInstanceDetailInfoUnifyStatusResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instances")

    private List<MysqlInstanceInfoDetailUnifyStatus> instances = null;

    public ListGaussMySqlInstanceDetailInfoUnifyStatusResponse withInstances(
        List<MysqlInstanceInfoDetailUnifyStatus> instances) {
        this.instances = instances;
        return this;
    }

    public ListGaussMySqlInstanceDetailInfoUnifyStatusResponse addInstancesItem(
        MysqlInstanceInfoDetailUnifyStatus instancesItem) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        this.instances.add(instancesItem);
        return this;
    }

    public ListGaussMySqlInstanceDetailInfoUnifyStatusResponse withInstances(
        Consumer<List<MysqlInstanceInfoDetailUnifyStatus>> instancesSetter) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        instancesSetter.accept(this.instances);
        return this;
    }

    /**
     * 实例详情。
     * @return instances
     */
    public List<MysqlInstanceInfoDetailUnifyStatus> getInstances() {
        return instances;
    }

    public void setInstances(List<MysqlInstanceInfoDetailUnifyStatus> instances) {
        this.instances = instances;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListGaussMySqlInstanceDetailInfoUnifyStatusResponse that =
            (ListGaussMySqlInstanceDetailInfoUnifyStatusResponse) obj;
        return Objects.equals(this.instances, that.instances);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instances);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListGaussMySqlInstanceDetailInfoUnifyStatusResponse {\n");
        sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
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
