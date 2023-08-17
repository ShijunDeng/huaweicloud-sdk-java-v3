package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建WKS存储
 */
public class CreatePersistentStorageReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_metadata")

    private Storage storageMetadata;

    public CreatePersistentStorageReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * WKS存储名称,名称需满足如下规则: 1. 名称允许可见字符或空格，不可为全空格 2. 长度1~128个字符
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreatePersistentStorageReq withStorageMetadata(Storage storageMetadata) {
        this.storageMetadata = storageMetadata;
        return this;
    }

    public CreatePersistentStorageReq withStorageMetadata(Consumer<Storage> storageMetadataSetter) {
        if (this.storageMetadata == null) {
            this.storageMetadata = new Storage();
            storageMetadataSetter.accept(this.storageMetadata);
        }

        return this;
    }

    /**
     * Get storageMetadata
     * @return storageMetadata
     */
    public Storage getStorageMetadata() {
        return storageMetadata;
    }

    public void setStorageMetadata(Storage storageMetadata) {
        this.storageMetadata = storageMetadata;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreatePersistentStorageReq that = (CreatePersistentStorageReq) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.storageMetadata, that.storageMetadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, storageMetadata);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePersistentStorageReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    storageMetadata: ").append(toIndentedString(storageMetadata)).append("\n");
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