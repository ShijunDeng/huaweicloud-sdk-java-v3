package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PayCustomerOrderReq
 */
public class PayCustomerOrderReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private String orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "coupon_infos")

    private List<CouponSimpleInfoOrderPay> couponInfos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "discount_infos")

    private List<DiscountSimpleInfo> discountInfos = null;

    public PayCustomerOrderReq withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * 订单编号。 取值为调用“查询订单列表”接口时响应消息中的“order_id”字段的值或调用“续订包年/包月资源”接口时响应消息“order_ids”中的订单ID。
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public PayCustomerOrderReq withCouponInfos(List<CouponSimpleInfoOrderPay> couponInfos) {
        this.couponInfos = couponInfos;
        return this;
    }

    public PayCustomerOrderReq addCouponInfosItem(CouponSimpleInfoOrderPay couponInfosItem) {
        if (this.couponInfos == null) {
            this.couponInfos = new ArrayList<>();
        }
        this.couponInfos.add(couponInfosItem);
        return this;
    }

    public PayCustomerOrderReq withCouponInfos(Consumer<List<CouponSimpleInfoOrderPay>> couponInfosSetter) {
        if (this.couponInfos == null) {
            this.couponInfos = new ArrayList<>();
        }
        couponInfosSetter.accept(this.couponInfos);
        return this;
    }

    /**
     * 优惠券ID列表，目前支持传递最多三个优惠券ID。 请从“查询订单可用优惠券”接口的响应参数中获取。 具体参见表1。
     * @return couponInfos
     */
    public List<CouponSimpleInfoOrderPay> getCouponInfos() {
        return couponInfos;
    }

    public void setCouponInfos(List<CouponSimpleInfoOrderPay> couponInfos) {
        this.couponInfos = couponInfos;
    }

    public PayCustomerOrderReq withDiscountInfos(List<DiscountSimpleInfo> discountInfos) {
        this.discountInfos = discountInfos;
        return this;
    }

    public PayCustomerOrderReq addDiscountInfosItem(DiscountSimpleInfo discountInfosItem) {
        if (this.discountInfos == null) {
            this.discountInfos = new ArrayList<>();
        }
        this.discountInfos.add(discountInfosItem);
        return this;
    }

    public PayCustomerOrderReq withDiscountInfos(Consumer<List<DiscountSimpleInfo>> discountInfosSetter) {
        if (this.discountInfos == null) {
            this.discountInfos = new ArrayList<>();
        }
        discountInfosSetter.accept(this.discountInfos);
        return this;
    }

    /**
     * 折扣ID列表，目前仅支持传递一个折扣ID。 请从“查询订单可用折扣”接口的响应参数中获取。 具体参见表2。
     * @return discountInfos
     */
    public List<DiscountSimpleInfo> getDiscountInfos() {
        return discountInfos;
    }

    public void setDiscountInfos(List<DiscountSimpleInfo> discountInfos) {
        this.discountInfos = discountInfos;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PayCustomerOrderReq payCustomerOrderReq = (PayCustomerOrderReq) o;
        return Objects.equals(this.orderId, payCustomerOrderReq.orderId)
            && Objects.equals(this.couponInfos, payCustomerOrderReq.couponInfos)
            && Objects.equals(this.discountInfos, payCustomerOrderReq.discountInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, couponInfos, discountInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PayCustomerOrderReq {\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    couponInfos: ").append(toIndentedString(couponInfos)).append("\n");
        sb.append("    discountInfos: ").append(toIndentedString(discountInfos)).append("\n");
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
