package com.huaweicloud.sdk.aos.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListStackResourcesRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="Client-Request-Id")
    
    
    private String clientRequestId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="stack_name")
    
    
    private String stackName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="stack_id")
    
    
    private String stackId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="executor")
    
    
    private String executor;

    public ListStackResourcesRequest withClientRequestId(String clientRequestId) {
        this.clientRequestId = clientRequestId;
        return this;
    }

    


    /**
     * 用户指定的，对于此请求的唯一ID，用于定位某个请求，推荐使用UUID
     * @return clientRequestId
     */
    public String getClientRequestId() {
        return clientRequestId;
    }

    public void setClientRequestId(String clientRequestId) {
        this.clientRequestId = clientRequestId;
    }

    

    public ListStackResourcesRequest withStackName(String stackName) {
        this.stackName = stackName;
        return this;
    }

    


    /**
     * 用户希望操作的资源栈名
     * @return stackName
     */
    public String getStackName() {
        return stackName;
    }

    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    

    public ListStackResourcesRequest withStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }

    


    /**
     * 用户希望描述的栈的Id。若stack_name和stack_id同时存在，则IaC会检查是否两个匹配，否则返回400
     * @return stackId
     */
    public String getStackId() {
        return stackId;
    }

    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    

    public ListStackResourcesRequest withExecutor(String executor) {
        this.executor = executor;
        return this;
    }

    


    /**
     * 执行操作者的名字，将用做未来的审计工作。
     * @return executor
     */
    public String getExecutor() {
        return executor;
    }

    public void setExecutor(String executor) {
        this.executor = executor;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListStackResourcesRequest listStackResourcesRequest = (ListStackResourcesRequest) o;
        return Objects.equals(this.clientRequestId, listStackResourcesRequest.clientRequestId) &&
            Objects.equals(this.stackName, listStackResourcesRequest.stackName) &&
            Objects.equals(this.stackId, listStackResourcesRequest.stackId) &&
            Objects.equals(this.executor, listStackResourcesRequest.executor);
    }
    @Override
    public int hashCode() {
        return Objects.hash(clientRequestId, stackName, stackId, executor);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListStackResourcesRequest {\n");
        sb.append("    clientRequestId: ").append(toIndentedString(clientRequestId)).append("\n");
        sb.append("    stackName: ").append(toIndentedString(stackName)).append("\n");
        sb.append("    stackId: ").append(toIndentedString(stackId)).append("\n");
        sb.append("    executor: ").append(toIndentedString(executor)).append("\n");
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
