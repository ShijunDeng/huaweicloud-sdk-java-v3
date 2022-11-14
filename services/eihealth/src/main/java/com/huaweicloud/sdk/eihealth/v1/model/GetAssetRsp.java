package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * GetAssetRsp
 */
public class GetAssetRsp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private List<String> labels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "picture")

    private String picture;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vendor_id")

    private String vendorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latest_version")

    private VersionRsp latestVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "versions")

    private List<String> versions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stars")

    private Integer stars;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscribes")

    private Integer subscribes;

    public GetAssetRsp withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 资产id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public GetAssetRsp withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * 类别
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public GetAssetRsp withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 资产名
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GetAssetRsp withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 资产展示名
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public GetAssetRsp withLabels(List<String> labels) {
        this.labels = labels;
        return this;
    }

    public GetAssetRsp addLabelsItem(String labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    public GetAssetRsp withLabels(Consumer<List<String>> labelsSetter) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        labelsSetter.accept(this.labels);
        return this;
    }

    /**
     * 资产标签列表
     * @return labels
     */
    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public GetAssetRsp withPicture(String picture) {
        this.picture = picture;
        return this;
    }

    /**
     * 资产封面图访问链接
     * @return picture
     */
    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public GetAssetRsp withVendorId(String vendorId) {
        this.vendorId = vendorId;
        return this;
    }

    /**
     * 供应商id
     * @return vendorId
     */
    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public GetAssetRsp withLatestVersion(VersionRsp latestVersion) {
        this.latestVersion = latestVersion;
        return this;
    }

    public GetAssetRsp withLatestVersion(Consumer<VersionRsp> latestVersionSetter) {
        if (this.latestVersion == null) {
            this.latestVersion = new VersionRsp();
            latestVersionSetter.accept(this.latestVersion);
        }

        return this;
    }

    /**
     * Get latestVersion
     * @return latestVersion
     */
    public VersionRsp getLatestVersion() {
        return latestVersion;
    }

    public void setLatestVersion(VersionRsp latestVersion) {
        this.latestVersion = latestVersion;
    }

    public GetAssetRsp withVersions(List<String> versions) {
        this.versions = versions;
        return this;
    }

    public GetAssetRsp addVersionsItem(String versionsItem) {
        if (this.versions == null) {
            this.versions = new ArrayList<>();
        }
        this.versions.add(versionsItem);
        return this;
    }

    public GetAssetRsp withVersions(Consumer<List<String>> versionsSetter) {
        if (this.versions == null) {
            this.versions = new ArrayList<>();
        }
        versionsSetter.accept(this.versions);
        return this;
    }

    /**
     * 资产版本号列表
     * @return versions
     */
    public List<String> getVersions() {
        return versions;
    }

    public void setVersions(List<String> versions) {
        this.versions = versions;
    }

    public GetAssetRsp withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public GetAssetRsp withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public GetAssetRsp withStars(Integer stars) {
        this.stars = stars;
        return this;
    }

    /**
     * 收藏数
     * @return stars
     */
    public Integer getStars() {
        return stars;
    }

    public void setStars(Integer stars) {
        this.stars = stars;
    }

    public GetAssetRsp withSubscribes(Integer subscribes) {
        this.subscribes = subscribes;
        return this;
    }

    /**
     * 订阅数
     * @return subscribes
     */
    public Integer getSubscribes() {
        return subscribes;
    }

    public void setSubscribes(Integer subscribes) {
        this.subscribes = subscribes;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetAssetRsp getAssetRsp = (GetAssetRsp) o;
        return Objects.equals(this.id, getAssetRsp.id) && Objects.equals(this.category, getAssetRsp.category)
            && Objects.equals(this.name, getAssetRsp.name) && Objects.equals(this.title, getAssetRsp.title)
            && Objects.equals(this.labels, getAssetRsp.labels) && Objects.equals(this.picture, getAssetRsp.picture)
            && Objects.equals(this.vendorId, getAssetRsp.vendorId)
            && Objects.equals(this.latestVersion, getAssetRsp.latestVersion)
            && Objects.equals(this.versions, getAssetRsp.versions)
            && Objects.equals(this.createTime, getAssetRsp.createTime)
            && Objects.equals(this.updateTime, getAssetRsp.updateTime) && Objects.equals(this.stars, getAssetRsp.stars)
            && Objects.equals(this.subscribes, getAssetRsp.subscribes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            category,
            name,
            title,
            labels,
            picture,
            vendorId,
            latestVersion,
            versions,
            createTime,
            updateTime,
            stars,
            subscribes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetAssetRsp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    picture: ").append(toIndentedString(picture)).append("\n");
        sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
        sb.append("    latestVersion: ").append(toIndentedString(latestVersion)).append("\n");
        sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    stars: ").append(toIndentedString(stars)).append("\n");
        sb.append("    subscribes: ").append(toIndentedString(subscribes)).append("\n");
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