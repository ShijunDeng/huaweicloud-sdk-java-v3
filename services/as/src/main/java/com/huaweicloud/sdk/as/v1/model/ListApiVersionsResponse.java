package com.huaweicloud.sdk.as.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListApiVersionsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "versions")

    private List<VersionInfo> versions = null;

    public ListApiVersionsResponse withVersions(List<VersionInfo> versions) {
        this.versions = versions;
        return this;
    }

    public ListApiVersionsResponse addVersionsItem(VersionInfo versionsItem) {
        if (this.versions == null) {
            this.versions = new ArrayList<>();
        }
        this.versions.add(versionsItem);
        return this;
    }

    public ListApiVersionsResponse withVersions(Consumer<List<VersionInfo>> versionsSetter) {
        if (this.versions == null) {
            this.versions = new ArrayList<>();
        }
        versionsSetter.accept(this.versions);
        return this;
    }

    /** 弹性伸缩API版本信息。
     * 
     * @return versions */
    public List<VersionInfo> getVersions() {
        return versions;
    }

    public void setVersions(List<VersionInfo> versions) {
        this.versions = versions;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListApiVersionsResponse listApiVersionsResponse = (ListApiVersionsResponse) o;
        return Objects.equals(this.versions, listApiVersionsResponse.versions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(versions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListApiVersionsResponse {\n");
        sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
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
