package com.huaweicloud.sdk.gaussdb.v3.model;




import java.util.Collections;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Backup
 */
public class Backup  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="descriprion")
    
    
    private String descriprion;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="begin_time")
    
    
    private String beginTime;
    /**
     * 备份状态
     */
    public static final class StatusEnum {

        
        /**
         * Enum BUILDING_ for value: "BUILDING：备份中。"
         */
        public static final StatusEnum BUILDING_ = new StatusEnum("BUILDING：备份中。");
        
        /**
         * Enum COMPLETED_ for value: "COMPLETED：备份完成。"
         */
        public static final StatusEnum COMPLETED_ = new StatusEnum("COMPLETED：备份完成。");
        
        /**
         * Enum FAILED_ for value: "FAILED：备份失败。"
         */
        public static final StatusEnum FAILED_ = new StatusEnum("FAILED：备份失败。");
        
        /**
         * Enum AVAILABLE_ for value: "AVAILABLE：备份可用。"
         */
        public static final StatusEnum AVAILABLE_ = new StatusEnum("AVAILABLE：备份可用。");
        

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("BUILDING：备份中。", BUILDING_);
            map.put("COMPLETED：备份完成。", COMPLETED_);
            map.put("FAILED：备份失败。", FAILED_);
            map.put("AVAILABLE：备份可用。", AVAILABLE_);
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
            if( value == null ){
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if( value == null ){
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
    @JsonProperty(value="status")
    
    
    private StatusEnum status;
    /**
     * 备份类型，取值：
     */
    public static final class TypeEnum {

        
        /**
         * Enum MANUAL_ for value: "manual：手动全量备份。"
         */
        public static final TypeEnum MANUAL_ = new TypeEnum("manual：手动全量备份。");
        

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("manual：手动全量备份。", MANUAL_);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    
    private TypeEnum type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    
    private String instanceId;

    public Backup withId(String id) {
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

    

    public Backup withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 备份名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public Backup withDescriprion(String descriprion) {
        this.descriprion = descriprion;
        return this;
    }

    


    /**
     * 备份描述。
     * @return descriprion
     */
    public String getDescriprion() {
        return descriprion;
    }

    public void setDescriprion(String descriprion) {
        this.descriprion = descriprion;
    }

    

    public Backup withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    


    /**
     * 备份开始时间，格式为“yyyy-mm-ddThh:mm:ssZ”，其中T指时间字段的开始；Z指时区偏移量。
     * @return beginTime
     */
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    

    public Backup withStatus(StatusEnum status) {
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

    

    public Backup withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    


    /**
     * 备份类型，取值：
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    

    public Backup withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    


    /**
     * 实例ID。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Backup backup = (Backup) o;
        return Objects.equals(this.id, backup.id) &&
            Objects.equals(this.name, backup.name) &&
            Objects.equals(this.descriprion, backup.descriprion) &&
            Objects.equals(this.beginTime, backup.beginTime) &&
            Objects.equals(this.status, backup.status) &&
            Objects.equals(this.type, backup.type) &&
            Objects.equals(this.instanceId, backup.instanceId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, descriprion, beginTime, status, type, instanceId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Backup {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    descriprion: ").append(toIndentedString(descriprion)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
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
