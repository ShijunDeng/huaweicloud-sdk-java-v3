package com.huaweicloud.sdk.kps.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 对私钥进行加密存储的方式。
 */
public class Encryption {

    /**
     * 取值范围：“kms”或“default”。 - “default”为默认加密方式，适用于没有kms服务的局点。 - “kms”为采用kms服务加密方式。 若局点没有kms服务，请填“default”。
     */
    public static final class TypeEnum {

        /**
         * Enum DEFAULT for value: "default"
         */
        public static final TypeEnum DEFAULT = new TypeEnum("default");

        /**
         * Enum KMS for value: "kms"
         */
        public static final TypeEnum KMS = new TypeEnum("kms");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("default", DEFAULT);
            map.put("kms", KMS);
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
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kms_key_name")

    private String kmsKeyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kms_key_id")

    private String kmsKeyId;

    public Encryption withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 取值范围：“kms”或“default”。 - “default”为默认加密方式，适用于没有kms服务的局点。 - “kms”为采用kms服务加密方式。 若局点没有kms服务，请填“default”。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public Encryption withKmsKeyName(String kmsKeyName) {
        this.kmsKeyName = kmsKeyName;
        return this;
    }

    /**
     * kms密钥的名称。  - 若“type”为“kms”，则必须填入\"kms_key_name\"或\"kms_key_id\"。
     * @return kmsKeyName
     */
    public String getKmsKeyName() {
        return kmsKeyName;
    }

    public void setKmsKeyName(String kmsKeyName) {
        this.kmsKeyName = kmsKeyName;
    }

    public Encryption withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * kms密钥的ID。  - 若“type”为“kms”，则必须填入\"kms_key_name\"或\"kms_key_id\"。
     * @return kmsKeyId
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Encryption that = (Encryption) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.kmsKeyName, that.kmsKeyName)
            && Objects.equals(this.kmsKeyId, that.kmsKeyId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, kmsKeyName, kmsKeyId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Encryption {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    kmsKeyName: ").append(toIndentedString(kmsKeyName)).append("\n");
        sb.append("    kmsKeyId: ").append(toIndentedString(kmsKeyId)).append("\n");
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
