package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListCatalogTreeResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "guid")

    private String guid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_id")

    private Long parentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prev_id")

    private Long prevId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next_id")

    private Long nextId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "qualified_id")

    private String qualifiedId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_by")

    private String createBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_by")

    private String updateBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bizmetric_num")

    private Integer bizmetricNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "children_num")

    private Integer childrenNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "children")

    private List<BizCatalogVO> children = null;

    public ListCatalogTreeResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 流程名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListCatalogTreeResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ListCatalogTreeResponse withGuid(String guid) {
        this.guid = guid;
        return this;
    }

    /**
     * 对应资产中ID。
     * @return guid
     */
    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public ListCatalogTreeResponse withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * 责任人。
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public ListCatalogTreeResponse withParentId(Long parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * 父目录ID，没有则为根目录。
     * @return parentId
     */
    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public ListCatalogTreeResponse withPrevId(Long prevId) {
        this.prevId = prevId;
        return this;
    }

    /**
     * 上个节点ID，没有则为首节点。
     * @return prevId
     */
    public Long getPrevId() {
        return prevId;
    }

    public void setPrevId(Long prevId) {
        this.prevId = prevId;
    }

    public ListCatalogTreeResponse withNextId(Long nextId) {
        this.nextId = nextId;
        return this;
    }

    /**
     * 下个节点ID，没有则为尾节点。
     * @return nextId
     */
    public Long getNextId() {
        return nextId;
    }

    public void setNextId(Long nextId) {
        this.nextId = nextId;
    }

    public ListCatalogTreeResponse withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * 创建时传空，更新时必填。
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ListCatalogTreeResponse withQualifiedId(String qualifiedId) {
        this.qualifiedId = qualifiedId;
        return this;
    }

    /**
     * 认证ID，自动生成。
     * @return qualifiedId
     */
    public String getQualifiedId() {
        return qualifiedId;
    }

    public void setQualifiedId(String qualifiedId) {
        this.qualifiedId = qualifiedId;
    }

    public ListCatalogTreeResponse withCreateBy(String createBy) {
        this.createBy = createBy;
        return this;
    }

    /**
     * 创建人。
     * @return createBy
     */
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public ListCatalogTreeResponse withUpdateBy(String updateBy) {
        this.updateBy = updateBy;
        return this;
    }

    /**
     * 更新人。
     * @return updateBy
     */
    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public ListCatalogTreeResponse withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间，格式遵循RFC3339，精确到秒，UTC时区，即yyyy-mm-ddTHH:MM:SSZ，如1970-01-01T00:00:00Z。
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public ListCatalogTreeResponse withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间，格式遵循RFC3339，精确到秒，UTC时区，即yyyy-mm-ddTHH:MM:SSZ，如1970-01-01T00:00:00Z。
     * @return updateTime
     */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public ListCatalogTreeResponse withBizmetricNum(Integer bizmetricNum) {
        this.bizmetricNum = bizmetricNum;
        return this;
    }

    /**
     * 拥有业务指标数量，前端不传。
     * @return bizmetricNum
     */
    public Integer getBizmetricNum() {
        return bizmetricNum;
    }

    public void setBizmetricNum(Integer bizmetricNum) {
        this.bizmetricNum = bizmetricNum;
    }

    public ListCatalogTreeResponse withChildrenNum(Integer childrenNum) {
        this.childrenNum = childrenNum;
        return this;
    }

    /**
     * 拥有子流程的数量，不包括子流程的子流程。
     * @return childrenNum
     */
    public Integer getChildrenNum() {
        return childrenNum;
    }

    public void setChildrenNum(Integer childrenNum) {
        this.childrenNum = childrenNum;
    }

    public ListCatalogTreeResponse withChildren(List<BizCatalogVO> children) {
        this.children = children;
        return this;
    }

    public ListCatalogTreeResponse addChildrenItem(BizCatalogVO childrenItem) {
        if (this.children == null) {
            this.children = new ArrayList<>();
        }
        this.children.add(childrenItem);
        return this;
    }

    public ListCatalogTreeResponse withChildren(Consumer<List<BizCatalogVO>> childrenSetter) {
        if (this.children == null) {
            this.children = new ArrayList<>();
        }
        childrenSetter.accept(this.children);
        return this;
    }

    /**
     * 下层子目录。
     * @return children
     */
    public List<BizCatalogVO> getChildren() {
        return children;
    }

    public void setChildren(List<BizCatalogVO> children) {
        this.children = children;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCatalogTreeResponse that = (ListCatalogTreeResponse) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.guid, that.guid) && Objects.equals(this.owner, that.owner)
            && Objects.equals(this.parentId, that.parentId) && Objects.equals(this.prevId, that.prevId)
            && Objects.equals(this.nextId, that.nextId) && Objects.equals(this.id, that.id)
            && Objects.equals(this.qualifiedId, that.qualifiedId) && Objects.equals(this.createBy, that.createBy)
            && Objects.equals(this.updateBy, that.updateBy) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.bizmetricNum, that.bizmetricNum)
            && Objects.equals(this.childrenNum, that.childrenNum) && Objects.equals(this.children, that.children);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            description,
            guid,
            owner,
            parentId,
            prevId,
            nextId,
            id,
            qualifiedId,
            createBy,
            updateBy,
            createTime,
            updateTime,
            bizmetricNum,
            childrenNum,
            children);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCatalogTreeResponse {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("    prevId: ").append(toIndentedString(prevId)).append("\n");
        sb.append("    nextId: ").append(toIndentedString(nextId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    qualifiedId: ").append(toIndentedString(qualifiedId)).append("\n");
        sb.append("    createBy: ").append(toIndentedString(createBy)).append("\n");
        sb.append("    updateBy: ").append(toIndentedString(updateBy)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    bizmetricNum: ").append(toIndentedString(bizmetricNum)).append("\n");
        sb.append("    childrenNum: ").append(toIndentedString(childrenNum)).append("\n");
        sb.append("    children: ").append(toIndentedString(children)).append("\n");
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
