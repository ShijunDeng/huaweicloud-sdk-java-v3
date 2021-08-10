package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class DeletePublicZoneResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "email")

    private String email;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zone_type")

    private String zoneType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ttl")

    private Integer ttl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serial")

    private Integer serial;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_num")

    private Integer recordNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool_id")

    private String poolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "masters")

    private String masters;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "links")

    private List<PageLink> links = null;

    public DeletePublicZoneResponse withId(String id) {
        this.id = id;
        return this;
    }

    /** Zone的ID
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DeletePublicZoneResponse withName(String name) {
        this.name = name;
        return this;
    }

    /** zone名称
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeletePublicZoneResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 对zone的描述信息
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DeletePublicZoneResponse withEmail(String email) {
        this.email = email;
        return this;
    }

    /** 管理该zone的管理员邮箱
     * 
     * @return email */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public DeletePublicZoneResponse withZoneType(String zoneType) {
        this.zoneType = zoneType;
        return this;
    }

    /** zone类型，公网（public）或者内网（private）
     * 
     * @return zoneType */
    public String getZoneType() {
        return zoneType;
    }

    public void setZoneType(String zoneType) {
        this.zoneType = zoneType;
    }

    public DeletePublicZoneResponse withTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }

    /** 该zone下SOA记录中的ttl值
     * 
     * @return ttl */
    public Integer getTtl() {
        return ttl;
    }

    public void setTtl(Integer ttl) {
        this.ttl = ttl;
    }

    public DeletePublicZoneResponse withSerial(Integer serial) {
        this.serial = serial;
        return this;
    }

    /** 该zone下SOA记录中用于标识zone文件变更的序列值，用于主从节点同步
     * 
     * @return serial */
    public Integer getSerial() {
        return serial;
    }

    public void setSerial(Integer serial) {
        this.serial = serial;
    }

    public DeletePublicZoneResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /** 该zone下的recordset个数
     * 
     * @return status */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DeletePublicZoneResponse withRecordNum(Integer recordNum) {
        this.recordNum = recordNum;
        return this;
    }

    /** 该zone下的recordset个数
     * 
     * @return recordNum */
    public Integer getRecordNum() {
        return recordNum;
    }

    public void setRecordNum(Integer recordNum) {
        this.recordNum = recordNum;
    }

    public DeletePublicZoneResponse withPoolId(String poolId) {
        this.poolId = poolId;
        return this;
    }

    /** 托管该zone的pool，由系统分配
     * 
     * @return poolId */
    public String getPoolId() {
        return poolId;
    }

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    public DeletePublicZoneResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /** zone所属的项目ID
     * 
     * @return projectId */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public DeletePublicZoneResponse withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /** 创建时间
     * 
     * @return createdAt */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public DeletePublicZoneResponse withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /** 更新时间
     * 
     * @return updatedAt */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public DeletePublicZoneResponse withMasters(String masters) {
        this.masters = masters;
        return this;
    }

    /** 主从模式中，从DNS服务器用以获取DNS信息
     * 
     * @return masters */
    public String getMasters() {
        return masters;
    }

    public void setMasters(String masters) {
        this.masters = masters;
    }

    public DeletePublicZoneResponse withLinks(List<PageLink> links) {
        this.links = links;
        return this;
    }

    public DeletePublicZoneResponse addLinksItem(PageLink linksItem) {
        if (this.links == null) {
            this.links = new ArrayList<>();
        }
        this.links.add(linksItem);
        return this;
    }

    public DeletePublicZoneResponse withLinks(Consumer<List<PageLink>> linksSetter) {
        if (this.links == null) {
            this.links = new ArrayList<>();
        }
        linksSetter.accept(this.links);
        return this;
    }

    /** 指向当前资源或者其他资源的链接。当查询需要分页时，需要包含一个next链接指向下一页
     * 
     * @return links */
    public List<PageLink> getLinks() {
        return links;
    }

    public void setLinks(List<PageLink> links) {
        this.links = links;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeletePublicZoneResponse deletePublicZoneResponse = (DeletePublicZoneResponse) o;
        return Objects.equals(this.id, deletePublicZoneResponse.id)
            && Objects.equals(this.name, deletePublicZoneResponse.name)
            && Objects.equals(this.description, deletePublicZoneResponse.description)
            && Objects.equals(this.email, deletePublicZoneResponse.email)
            && Objects.equals(this.zoneType, deletePublicZoneResponse.zoneType)
            && Objects.equals(this.ttl, deletePublicZoneResponse.ttl)
            && Objects.equals(this.serial, deletePublicZoneResponse.serial)
            && Objects.equals(this.status, deletePublicZoneResponse.status)
            && Objects.equals(this.recordNum, deletePublicZoneResponse.recordNum)
            && Objects.equals(this.poolId, deletePublicZoneResponse.poolId)
            && Objects.equals(this.projectId, deletePublicZoneResponse.projectId)
            && Objects.equals(this.createdAt, deletePublicZoneResponse.createdAt)
            && Objects.equals(this.updatedAt, deletePublicZoneResponse.updatedAt)
            && Objects.equals(this.masters, deletePublicZoneResponse.masters)
            && Objects.equals(this.links, deletePublicZoneResponse.links);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            email,
            zoneType,
            ttl,
            serial,
            status,
            recordNum,
            poolId,
            projectId,
            createdAt,
            updatedAt,
            masters,
            links);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeletePublicZoneResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    zoneType: ").append(toIndentedString(zoneType)).append("\n");
        sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
        sb.append("    serial: ").append(toIndentedString(serial)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    recordNum: ").append(toIndentedString(recordNum)).append("\n");
        sb.append("    poolId: ").append(toIndentedString(poolId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    masters: ").append(toIndentedString(masters)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
