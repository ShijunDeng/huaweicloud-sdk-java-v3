package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BackupDetail
 */
public class BackupDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "checkpoint_id")

    @JacksonXmlProperty(localName = "checkpoint_id")

    private String checkpointId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    @JacksonXmlProperty(localName = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expired_at")

    @JacksonXmlProperty(localName = "expired_at")

    private OffsetDateTime expiredAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend_info")

    @JacksonXmlProperty(localName = "extend_info")

    private BackupExtendInfo extendInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    /**
     * 备份类型
     */
    public static final class ImageTypeEnum {

        /**
         * Enum BACKUP for value: "backup"
         */
        public static final ImageTypeEnum BACKUP = new ImageTypeEnum("backup");

        /**
         * Enum REPLICATION for value: "replication"
         */
        public static final ImageTypeEnum REPLICATION = new ImageTypeEnum("replication");

        private static final Map<String, ImageTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ImageTypeEnum> createStaticFields() {
            Map<String, ImageTypeEnum> map = new HashMap<>();
            map.put("backup", BACKUP);
            map.put("replication", REPLICATION);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ImageTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ImageTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ImageTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ImageTypeEnum(value);
            }
            return result;
        }

        public static ImageTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ImageTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ImageTypeEnum) {
                return this.value.equals(((ImageTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_type")

    @JacksonXmlProperty(localName = "image_type")

    private ImageTypeEnum imageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_id")

    @JacksonXmlProperty(localName = "parent_id")

    private String parentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    @JacksonXmlProperty(localName = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protected_at")

    @JacksonXmlProperty(localName = "protected_at")

    private LocalDate protectedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_az")

    @JacksonXmlProperty(localName = "resource_az")

    private String resourceAz;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    @JacksonXmlProperty(localName = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name")

    @JacksonXmlProperty(localName = "resource_name")

    private String resourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_size")

    @JacksonXmlProperty(localName = "resource_size")

    private Integer resourceSize;

    /**
     * 资源类型
     */
    public static final class ResourceTypeEnum {

        /**
         * Enum OS_NOVA_SERVER for value: "OS::Nova::Server"
         */
        public static final ResourceTypeEnum OS_NOVA_SERVER = new ResourceTypeEnum("OS::Nova::Server");

        /**
         * Enum OS_CINDER_VOLUME for value: "OS::Cinder::Volume"
         */
        public static final ResourceTypeEnum OS_CINDER_VOLUME = new ResourceTypeEnum("OS::Cinder::Volume");

        private static final Map<String, ResourceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ResourceTypeEnum> createStaticFields() {
            Map<String, ResourceTypeEnum> map = new HashMap<>();
            map.put("OS::Nova::Server", OS_NOVA_SERVER);
            map.put("OS::Cinder::Volume", OS_CINDER_VOLUME);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ResourceTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ResourceTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ResourceTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ResourceTypeEnum(value);
            }
            return result;
        }

        public static ResourceTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ResourceTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ResourceTypeEnum) {
                return this.value.equals(((ResourceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    @JacksonXmlProperty(localName = "resource_type")

    private ResourceTypeEnum resourceType;

    /**
     * 备份状态
     */
    public static final class StatusEnum {

        /**
         * Enum AVAILABLE for value: "available"
         */
        public static final StatusEnum AVAILABLE = new StatusEnum("available");

        /**
         * Enum PROTECTING for value: "protecting"
         */
        public static final StatusEnum PROTECTING = new StatusEnum("protecting");

        /**
         * Enum DELETING for value: "deleting"
         */
        public static final StatusEnum DELETING = new StatusEnum("deleting");

        /**
         * Enum RESTORING for value: "restoring"
         */
        public static final StatusEnum RESTORING = new StatusEnum("restoring");

        /**
         * Enum ERROR for value: "error"
         */
        public static final StatusEnum ERROR = new StatusEnum("error");

        /**
         * Enum WAITING_PROTECT for value: "waiting_protect"
         */
        public static final StatusEnum WAITING_PROTECT = new StatusEnum("waiting_protect");

        /**
         * Enum WAITING_DELETE for value: "waiting_delete"
         */
        public static final StatusEnum WAITING_DELETE = new StatusEnum("waiting_delete");

        /**
         * Enum WAITING_RESTORE for value: "waiting_restore"
         */
        public static final StatusEnum WAITING_RESTORE = new StatusEnum("waiting_restore");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("available", AVAILABLE);
            map.put("protecting", PROTECTING);
            map.put("deleting", DELETING);
            map.put("restoring", RESTORING);
            map.put("error", ERROR);
            map.put("waiting_protect", WAITING_PROTECT);
            map.put("waiting_delete", WAITING_DELETE);
            map.put("waiting_restore", WAITING_RESTORE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    @JacksonXmlProperty(localName = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    @JacksonXmlProperty(localName = "updated_at")

    private OffsetDateTime updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vault_id")

    @JacksonXmlProperty(localName = "vault_id")

    private String vaultId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replication_records")

    @JacksonXmlProperty(localName = "replication_records")

    private List<ReplicationRecordGet> replicationRecords = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    @JacksonXmlProperty(localName = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider_id")

    @JacksonXmlProperty(localName = "provider_id")

    private String providerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "children")

    @JacksonXmlProperty(localName = "children")

    private List<BackupResp> children = null;

    public BackupDetail withCheckpointId(String checkpointId) {
        this.checkpointId = checkpointId;
        return this;
    }

    /**
     * 还原点ID
     * @return checkpointId
     */
    public String getCheckpointId() {
        return checkpointId;
    }

    public void setCheckpointId(String checkpointId) {
        this.checkpointId = checkpointId;
    }

    public BackupDetail withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间，例如:\"2020-02-05T10:38:34.209782\"
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public BackupDetail withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 备份描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BackupDetail withExpiredAt(OffsetDateTime expiredAt) {
        this.expiredAt = expiredAt;
        return this;
    }

    /**
     * 过期时间，例如:\"2020-02-05T10:38:34.209782\"
     * @return expiredAt
     */
    public OffsetDateTime getExpiredAt() {
        return expiredAt;
    }

    public void setExpiredAt(OffsetDateTime expiredAt) {
        this.expiredAt = expiredAt;
    }

    public BackupDetail withExtendInfo(BackupExtendInfo extendInfo) {
        this.extendInfo = extendInfo;
        return this;
    }

    public BackupDetail withExtendInfo(Consumer<BackupExtendInfo> extendInfoSetter) {
        if (this.extendInfo == null) {
            this.extendInfo = new BackupExtendInfo();
            extendInfoSetter.accept(this.extendInfo);
        }

        return this;
    }

    /**
     * Get extendInfo
     * @return extendInfo
     */
    public BackupExtendInfo getExtendInfo() {
        return extendInfo;
    }

    public void setExtendInfo(BackupExtendInfo extendInfo) {
        this.extendInfo = extendInfo;
    }

    public BackupDetail withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 备份ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BackupDetail withImageType(ImageTypeEnum imageType) {
        this.imageType = imageType;
        return this;
    }

    /**
     * 备份类型
     * @return imageType
     */
    public ImageTypeEnum getImageType() {
        return imageType;
    }

    public void setImageType(ImageTypeEnum imageType) {
        this.imageType = imageType;
    }

    public BackupDetail withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 备份名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BackupDetail withParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * 父备份ID
     * @return parentId
     */
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public BackupDetail withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public BackupDetail withProtectedAt(LocalDate protectedAt) {
        this.protectedAt = protectedAt;
        return this;
    }

    /**
     * 备份时间
     * @return protectedAt
     */
    public LocalDate getProtectedAt() {
        return protectedAt;
    }

    public void setProtectedAt(LocalDate protectedAt) {
        this.protectedAt = protectedAt;
    }

    public BackupDetail withResourceAz(String resourceAz) {
        this.resourceAz = resourceAz;
        return this;
    }

    /**
     * 资源可用区
     * @return resourceAz
     */
    public String getResourceAz() {
        return resourceAz;
    }

    public void setResourceAz(String resourceAz) {
        this.resourceAz = resourceAz;
    }

    public BackupDetail withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源ID
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public BackupDetail withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * 资源名称
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public BackupDetail withResourceSize(Integer resourceSize) {
        this.resourceSize = resourceSize;
        return this;
    }

    /**
     * 资源大小，单位为GB
     * @return resourceSize
     */
    public Integer getResourceSize() {
        return resourceSize;
    }

    public void setResourceSize(Integer resourceSize) {
        this.resourceSize = resourceSize;
    }

    public BackupDetail withResourceType(ResourceTypeEnum resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 资源类型
     * @return resourceType
     */
    public ResourceTypeEnum getResourceType() {
        return resourceType;
    }

    public void setResourceType(ResourceTypeEnum resourceType) {
        this.resourceType = resourceType;
    }

    public BackupDetail withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 备份状态
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public BackupDetail withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 更新时间，例如:\"2020-02-05T10:38:34.209782\"
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public BackupDetail withVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }

    /**
     * 存储库ID
     * @return vaultId
     */
    public String getVaultId() {
        return vaultId;
    }

    public void setVaultId(String vaultId) {
        this.vaultId = vaultId;
    }

    public BackupDetail withReplicationRecords(List<ReplicationRecordGet> replicationRecords) {
        this.replicationRecords = replicationRecords;
        return this;
    }

    public BackupDetail addReplicationRecordsItem(ReplicationRecordGet replicationRecordsItem) {
        if (this.replicationRecords == null) {
            this.replicationRecords = new ArrayList<>();
        }
        this.replicationRecords.add(replicationRecordsItem);
        return this;
    }

    public BackupDetail withReplicationRecords(Consumer<List<ReplicationRecordGet>> replicationRecordsSetter) {
        if (this.replicationRecords == null) {
            this.replicationRecords = new ArrayList<>();
        }
        replicationRecordsSetter.accept(this.replicationRecords);
        return this;
    }

    /**
     * 复制记录
     * @return replicationRecords
     */
    public List<ReplicationRecordGet> getReplicationRecords() {
        return replicationRecords;
    }

    public void setReplicationRecords(List<ReplicationRecordGet> replicationRecords) {
        this.replicationRecords = replicationRecords;
    }

    public BackupDetail withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目id,默认为‘0’。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public BackupDetail withProviderId(String providerId) {
        this.providerId = providerId;
        return this;
    }

    /**
     * 备份提供商ID，用于区分备份对象。当前取值包含  0daac4c5-6707-4851-97ba-169e36266b66，该值代表备份对象为云服务器。d1603440-187d-4516-af25-121250c7cc97，该值代表备份对象为云硬盘。3f3c3220-245c-4805-b811-758870015881， 该值代表备份对象为SFS Turbo。a13639de-00be-4e94-af30-26912d75e4a2，该值代表备份对象为混合云VMware备份。
     * @return providerId
     */
    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    public BackupDetail withChildren(List<BackupResp> children) {
        this.children = children;
        return this;
    }

    public BackupDetail addChildrenItem(BackupResp childrenItem) {
        if (this.children == null) {
            this.children = new ArrayList<>();
        }
        this.children.add(childrenItem);
        return this;
    }

    public BackupDetail withChildren(Consumer<List<BackupResp>> childrenSetter) {
        if (this.children == null) {
            this.children = new ArrayList<>();
        }
        childrenSetter.accept(this.children);
        return this;
    }

    /**
     * 
     * @return children
     */
    public List<BackupResp> getChildren() {
        return children;
    }

    public void setChildren(List<BackupResp> children) {
        this.children = children;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BackupDetail backupDetail = (BackupDetail) o;
        return Objects.equals(this.checkpointId, backupDetail.checkpointId)
            && Objects.equals(this.createdAt, backupDetail.createdAt)
            && Objects.equals(this.description, backupDetail.description)
            && Objects.equals(this.expiredAt, backupDetail.expiredAt)
            && Objects.equals(this.extendInfo, backupDetail.extendInfo) && Objects.equals(this.id, backupDetail.id)
            && Objects.equals(this.imageType, backupDetail.imageType) && Objects.equals(this.name, backupDetail.name)
            && Objects.equals(this.parentId, backupDetail.parentId)
            && Objects.equals(this.projectId, backupDetail.projectId)
            && Objects.equals(this.protectedAt, backupDetail.protectedAt)
            && Objects.equals(this.resourceAz, backupDetail.resourceAz)
            && Objects.equals(this.resourceId, backupDetail.resourceId)
            && Objects.equals(this.resourceName, backupDetail.resourceName)
            && Objects.equals(this.resourceSize, backupDetail.resourceSize)
            && Objects.equals(this.resourceType, backupDetail.resourceType)
            && Objects.equals(this.status, backupDetail.status)
            && Objects.equals(this.updatedAt, backupDetail.updatedAt)
            && Objects.equals(this.vaultId, backupDetail.vaultId)
            && Objects.equals(this.replicationRecords, backupDetail.replicationRecords)
            && Objects.equals(this.enterpriseProjectId, backupDetail.enterpriseProjectId)
            && Objects.equals(this.providerId, backupDetail.providerId)
            && Objects.equals(this.children, backupDetail.children);
    }

    @Override
    public int hashCode() {
        return Objects.hash(checkpointId,
            createdAt,
            description,
            expiredAt,
            extendInfo,
            id,
            imageType,
            name,
            parentId,
            projectId,
            protectedAt,
            resourceAz,
            resourceId,
            resourceName,
            resourceSize,
            resourceType,
            status,
            updatedAt,
            vaultId,
            replicationRecords,
            enterpriseProjectId,
            providerId,
            children);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackupDetail {\n");
        sb.append("    checkpointId: ").append(toIndentedString(checkpointId)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    expiredAt: ").append(toIndentedString(expiredAt)).append("\n");
        sb.append("    extendInfo: ").append(toIndentedString(extendInfo)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    protectedAt: ").append(toIndentedString(protectedAt)).append("\n");
        sb.append("    resourceAz: ").append(toIndentedString(resourceAz)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    resourceSize: ").append(toIndentedString(resourceSize)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    vaultId: ").append(toIndentedString(vaultId)).append("\n");
        sb.append("    replicationRecords: ").append(toIndentedString(replicationRecords)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
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
