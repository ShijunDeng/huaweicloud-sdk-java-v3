package com.huaweicloud.sdk.servicestage.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * DeployStrategyGrayReleaseRules
 */
public class DeployStrategyGrayReleaseRules {

    /**
     * Gets or Sets type
     */
    public static final class TypeEnum {

        /**
         * Enum HEADER for value: "header"
         */
        public static final TypeEnum HEADER = new TypeEnum("header");

        /**
         * Enum QUERY_PARAM for value: "query_param"
         */
        public static final TypeEnum QUERY_PARAM = new TypeEnum("query_param");

        /**
         * Enum CUSTOM for value: "custom"
         */
        public static final TypeEnum CUSTOM = new TypeEnum("custom");

        /**
         * Enum METHOD for value: "method"
         */
        public static final TypeEnum METHOD = new TypeEnum("method");

        /**
         * Enum COOKIE for value: "cookie"
         */
        public static final TypeEnum COOKIE = new TypeEnum("cookie");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("header", HEADER);
            map.put("query_param", QUERY_PARAM);
            map.put("custom", CUSTOM);
            map.put("method", METHOD);
            map.put("cookie", COOKIE);
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
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
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
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    /**
     * Gets or Sets condition
     */
    public static final class ConditionEnum {

        /**
         * Enum EQUAL for value: "equal"
         */
        public static final ConditionEnum EQUAL = new ConditionEnum("equal");

        /**
         * Enum MATCH for value: "match"
         */
        public static final ConditionEnum MATCH = new ConditionEnum("match");

        /**
         * Enum IN for value: "in"
         */
        public static final ConditionEnum IN = new ConditionEnum("in");

        private static final Map<String, ConditionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ConditionEnum> createStaticFields() {
            Map<String, ConditionEnum> map = new HashMap<>();
            map.put("equal", EQUAL);
            map.put("match", MATCH);
            map.put("in", IN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ConditionEnum(String value) {
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
        public static ConditionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ConditionEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ConditionEnum(value);
            }
            return result;
        }

        public static ConditionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ConditionEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ConditionEnum) {
                return this.value.equals(((ConditionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition")

    private ConditionEnum condition;

    public DeployStrategyGrayReleaseRules withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public DeployStrategyGrayReleaseRules withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Get key
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public DeployStrategyGrayReleaseRules withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get value
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public DeployStrategyGrayReleaseRules withCondition(ConditionEnum condition) {
        this.condition = condition;
        return this;
    }

    /**
     * Get condition
     * @return condition
     */
    public ConditionEnum getCondition() {
        return condition;
    }

    public void setCondition(ConditionEnum condition) {
        this.condition = condition;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeployStrategyGrayReleaseRules deployStrategyGrayReleaseRules = (DeployStrategyGrayReleaseRules) o;
        return Objects.equals(this.type, deployStrategyGrayReleaseRules.type)
            && Objects.equals(this.key, deployStrategyGrayReleaseRules.key)
            && Objects.equals(this.value, deployStrategyGrayReleaseRules.value)
            && Objects.equals(this.condition, deployStrategyGrayReleaseRules.condition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, key, value, condition);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeployStrategyGrayReleaseRules {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
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