package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.math.BigDecimal;
import java.util.Objects;

/** Response Object */
public class ShowSubCustomerBudgetResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "budget_amount")

    private BigDecimal budgetAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_amount")

    private BigDecimal usedAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "measure_id")

    private Integer measureId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "currency")

    private String currency;

    public ShowSubCustomerBudgetResponse withBudgetAmount(BigDecimal budgetAmount) {
        this.budgetAmount = budgetAmount;
        return this;
    }

    /** |参数名称：预算金额。| |参数的约束及描述：预算金额。|
     * 
     * @return budgetAmount */
    public BigDecimal getBudgetAmount() {
        return budgetAmount;
    }

    public void setBudgetAmount(BigDecimal budgetAmount) {
        this.budgetAmount = budgetAmount;
    }

    public ShowSubCustomerBudgetResponse withUsedAmount(BigDecimal usedAmount) {
        this.usedAmount = usedAmount;
        return this;
    }

    /** |参数名称：已经使用的预算。该预算存在一定的时延和误差。| |参数的约束及描述：已经使用的预算。该预算存在一定的时延和误差。|
     * 
     * @return usedAmount */
    public BigDecimal getUsedAmount() {
        return usedAmount;
    }

    public void setUsedAmount(BigDecimal usedAmount) {
        this.usedAmount = usedAmount;
    }

    public ShowSubCustomerBudgetResponse withMeasureId(Integer measureId) {
        this.measureId = measureId;
        return this;
    }

    /** |参数名称：金额单位。1：元| |参数的约束及描述：金额单位。1：元|
     * 
     * @return measureId */
    public Integer getMeasureId() {
        return measureId;
    }

    public void setMeasureId(Integer measureId) {
        this.measureId = measureId;
    }

    public ShowSubCustomerBudgetResponse withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /** |参数名称：公司名称币种。CNY：人民币USD：美金| |参数约束及描述：公司名称币种。CNY：人民币USD：美金|
     * 
     * @return currency */
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowSubCustomerBudgetResponse showSubCustomerBudgetResponse = (ShowSubCustomerBudgetResponse) o;
        return Objects.equals(this.budgetAmount, showSubCustomerBudgetResponse.budgetAmount)
            && Objects.equals(this.usedAmount, showSubCustomerBudgetResponse.usedAmount)
            && Objects.equals(this.measureId, showSubCustomerBudgetResponse.measureId)
            && Objects.equals(this.currency, showSubCustomerBudgetResponse.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(budgetAmount, usedAmount, measureId, currency);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSubCustomerBudgetResponse {\n");
        sb.append("    budgetAmount: ").append(toIndentedString(budgetAmount)).append("\n");
        sb.append("    usedAmount: ").append(toIndentedString(usedAmount)).append("\n");
        sb.append("    measureId: ").append(toIndentedString(measureId)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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
