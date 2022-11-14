package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AddReadonlyNodeRequestBody
 */
public class AddReadonlyNodeRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_code")

    private String specCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num")

    private String num;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delay")

    private Integer delay;

    public AddReadonlyNodeRequestBody withSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }

    /**
     * 资源规格编码。获取方法请参见[查询数据库规格](x-wc://file=zh-cn_topic_0000001321087266.xml)中参数“spec_code”的值。  示例：dds.mongodb.c6.xlarge.2.shard
     * @return specCode
     */
    public String getSpecCode() {
        return specCode;
    }

    public void setSpecCode(String specCode) {
        this.specCode = specCode;
    }

    public AddReadonlyNodeRequestBody withNum(String num) {
        this.num = num;
        return this;
    }

    /**
     * 待新增只读节点个数。 取值范围：1-5。
     * @return num
     */
    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public AddReadonlyNodeRequestBody withDelay(Integer delay) {
        this.delay = delay;
        return this;
    }

    /**
     * 同步延迟时间。取值范围：0~1200毫秒。默认取值为0。
     * @return delay
     */
    public Integer getDelay() {
        return delay;
    }

    public void setDelay(Integer delay) {
        this.delay = delay;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddReadonlyNodeRequestBody addReadonlyNodeRequestBody = (AddReadonlyNodeRequestBody) o;
        return Objects.equals(this.specCode, addReadonlyNodeRequestBody.specCode)
            && Objects.equals(this.num, addReadonlyNodeRequestBody.num)
            && Objects.equals(this.delay, addReadonlyNodeRequestBody.delay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(specCode, num, delay);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddReadonlyNodeRequestBody {\n");
        sb.append("    specCode: ").append(toIndentedString(specCode)).append("\n");
        sb.append("    num: ").append(toIndentedString(num)).append("\n");
        sb.append("    delay: ").append(toIndentedString(delay)).append("\n");
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