package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** JobDetail */
public class JobDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created")

    private String created;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ended")

    private String ended;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progress")

    private String progress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance")

    private JobInstanceInfo instance;

    public JobDetail withId(String id) {
        this.id = id;
        return this;
    }

    /** 任务ID
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public JobDetail withName(String name) {
        this.name = name;
        return this;
    }

    /** 任务名称。
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JobDetail withCreated(String created) {
        this.created = created;
        return this;
    }

    /** 任务创建时间，格式为yyyy-mm-ddThh:mm:ssZ。
     * 
     * @return created */
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public JobDetail withEnded(String ended) {
        this.ended = ended;
        return this;
    }

    /** 任务结束时间，格式为yyyy-mm-ddThh:mm:ssZ。
     * 
     * @return ended */
    public String getEnded() {
        return ended;
    }

    public void setEnded(String ended) {
        this.ended = ended;
    }

    public JobDetail withProgress(String progress) {
        this.progress = progress;
        return this;
    }

    /** 任务执行进度。
     * 
     * @return progress */
    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    public JobDetail withInstance(JobInstanceInfo instance) {
        this.instance = instance;
        return this;
    }

    public JobDetail withInstance(Consumer<JobInstanceInfo> instanceSetter) {
        if (this.instance == null) {
            this.instance = new JobInstanceInfo();
            instanceSetter.accept(this.instance);
        }

        return this;
    }

    /** Get instance
     * 
     * @return instance */
    public JobInstanceInfo getInstance() {
        return instance;
    }

    public void setInstance(JobInstanceInfo instance) {
        this.instance = instance;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JobDetail jobDetail = (JobDetail) o;
        return Objects.equals(this.id, jobDetail.id) && Objects.equals(this.name, jobDetail.name)
            && Objects.equals(this.created, jobDetail.created) && Objects.equals(this.ended, jobDetail.ended)
            && Objects.equals(this.progress, jobDetail.progress) && Objects.equals(this.instance, jobDetail.instance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, created, ended, progress, instance);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobDetail {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    ended: ").append(toIndentedString(ended)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
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