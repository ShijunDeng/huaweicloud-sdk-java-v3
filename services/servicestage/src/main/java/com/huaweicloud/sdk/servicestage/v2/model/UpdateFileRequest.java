package com.huaweicloud.sdk.servicestage.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class UpdateFileRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Repo-Auth")

    private String xRepoAuth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project")

    private String project;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ref")

    private String ref;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private FileUpdate body;

    public UpdateFileRequest withXRepoAuth(String xRepoAuth) {
        this.xRepoAuth = xRepoAuth;
        return this;
    }

    /** 授权名称。
     * 
     * @return xRepoAuth */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Repo-Auth")
    public String getXRepoAuth() {
        return xRepoAuth;
    }

    public void setXRepoAuth(String xRepoAuth) {
        this.xRepoAuth = xRepoAuth;
    }

    public UpdateFileRequest withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /** 组织ID。
     * 
     * @return namespace */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public UpdateFileRequest withProject(String project) {
        this.project = project;
        return this;
    }

    /** 仓库项目ID，如果含有“/”，需要将“/”替换为“:”。
     * 
     * @return project */
    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public UpdateFileRequest withPath(String path) {
        this.path = path;
        return this;
    }

    /** 文件路径，需要将“/”替换为“:”。
     * 
     * @return path */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public UpdateFileRequest withRef(String ref) {
        this.ref = ref;
        return this;
    }

    /** 分支名称或者tag标签名称或者commit sha。
     * 
     * @return ref */
    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public UpdateFileRequest withBody(FileUpdate body) {
        this.body = body;
        return this;
    }

    public UpdateFileRequest withBody(Consumer<FileUpdate> bodySetter) {
        if (this.body == null) {
            this.body = new FileUpdate();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public FileUpdate getBody() {
        return body;
    }

    public void setBody(FileUpdate body) {
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
        UpdateFileRequest updateFileRequest = (UpdateFileRequest) o;
        return Objects.equals(this.xRepoAuth, updateFileRequest.xRepoAuth)
            && Objects.equals(this.namespace, updateFileRequest.namespace)
            && Objects.equals(this.project, updateFileRequest.project)
            && Objects.equals(this.path, updateFileRequest.path) && Objects.equals(this.ref, updateFileRequest.ref)
            && Objects.equals(this.body, updateFileRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xRepoAuth, namespace, project, path, ref, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateFileRequest {\n");
        sb.append("    xRepoAuth: ").append(toIndentedString(xRepoAuth)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    project: ").append(toIndentedString(project)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
