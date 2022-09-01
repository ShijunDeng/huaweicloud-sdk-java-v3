package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowRoomSettingResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "roomIntroduce")

    @JacksonXmlProperty(localName = "roomIntroduce")

    private String roomIntroduce;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cropLogoId")

    @JacksonXmlProperty(localName = "cropLogoId")

    private String cropLogoId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "coverPictureId")

    @JacksonXmlProperty(localName = "coverPictureId")

    private String coverPictureId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "showAudienceMode")

    @JacksonXmlProperty(localName = "showAudienceMode")

    private String showAudienceMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isRedoubleOpen")

    @JacksonXmlProperty(localName = "isRedoubleOpen")

    private String isRedoubleOpen;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "baseAudienceCount")

    @JacksonXmlProperty(localName = "baseAudienceCount")

    private Integer baseAudienceCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "multiple")

    @JacksonXmlProperty(localName = "multiple")

    private Double multiple;

    public ShowRoomSettingResponse withRoomIntroduce(String roomIntroduce) {
        this.roomIntroduce = roomIntroduce;
        return this;
    }

    /**
     * 直播介绍, 最大不超过500个字符
     * @return roomIntroduce
     */
    public String getRoomIntroduce() {
        return roomIntroduce;
    }

    public void setRoomIntroduce(String roomIntroduce) {
        this.roomIntroduce = roomIntroduce;
    }

    public ShowRoomSettingResponse withCropLogoId(String cropLogoId) {
        this.cropLogoId = cropLogoId;
        return this;
    }

    /**
     * 企业Logo（文件id）,不超过32字符
     * @return cropLogoId
     */
    public String getCropLogoId() {
        return cropLogoId;
    }

    public void setCropLogoId(String cropLogoId) {
        this.cropLogoId = cropLogoId;
    }

    public ShowRoomSettingResponse withCoverPictureId(String coverPictureId) {
        this.coverPictureId = coverPictureId;
        return this;
    }

    /**
     * 封面内容(文件id)，不超过32字符
     * @return coverPictureId
     */
    public String getCoverPictureId() {
        return coverPictureId;
    }

    public void setCoverPictureId(String coverPictureId) {
        this.coverPictureId = coverPictureId;
    }

    public ShowRoomSettingResponse withShowAudienceMode(String showAudienceMode) {
        this.showAudienceMode = showAudienceMode;
        return this;
    }

    /**
     * 显示观众人数的模式。默认值为real_time - none:不显示 - real_time:实时显示 
     * @return showAudienceMode
     */
    public String getShowAudienceMode() {
        return showAudienceMode;
    }

    public void setShowAudienceMode(String showAudienceMode) {
        this.showAudienceMode = showAudienceMode;
    }

    public ShowRoomSettingResponse withIsRedoubleOpen(String isRedoubleOpen) {
        this.isRedoubleOpen = isRedoubleOpen;
        return this;
    }

    /**
     * 智能倍增开关。默认值为Y - Y 开启智能倍增 - N 关闭智能倍增 
     * @return isRedoubleOpen
     */
    public String getIsRedoubleOpen() {
        return isRedoubleOpen;
    }

    public void setIsRedoubleOpen(String isRedoubleOpen) {
        this.isRedoubleOpen = isRedoubleOpen;
    }

    public ShowRoomSettingResponse withBaseAudienceCount(Integer baseAudienceCount) {
        this.baseAudienceCount = baseAudienceCount;
        return this;
    }

    /**
     * 基础设置人数(直播间没人时显示的人数). 取值范围为[0, 10000]。默认值为0
     * @return baseAudienceCount
     */
    public Integer getBaseAudienceCount() {
        return baseAudienceCount;
    }

    public void setBaseAudienceCount(Integer baseAudienceCount) {
        this.baseAudienceCount = baseAudienceCount;
    }

    public ShowRoomSettingResponse withMultiple(Double multiple) {
        this.multiple = multiple;
        return this;
    }

    /**
     * 设置倍数(基础人数+真实人数*倍数). 取值范围为[0, 10]，取1位小数。默认值为1.0
     * @return multiple
     */
    public Double getMultiple() {
        return multiple;
    }

    public void setMultiple(Double multiple) {
        this.multiple = multiple;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowRoomSettingResponse showRoomSettingResponse = (ShowRoomSettingResponse) o;
        return Objects.equals(this.roomIntroduce, showRoomSettingResponse.roomIntroduce)
            && Objects.equals(this.cropLogoId, showRoomSettingResponse.cropLogoId)
            && Objects.equals(this.coverPictureId, showRoomSettingResponse.coverPictureId)
            && Objects.equals(this.showAudienceMode, showRoomSettingResponse.showAudienceMode)
            && Objects.equals(this.isRedoubleOpen, showRoomSettingResponse.isRedoubleOpen)
            && Objects.equals(this.baseAudienceCount, showRoomSettingResponse.baseAudienceCount)
            && Objects.equals(this.multiple, showRoomSettingResponse.multiple);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roomIntroduce,
            cropLogoId,
            coverPictureId,
            showAudienceMode,
            isRedoubleOpen,
            baseAudienceCount,
            multiple);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRoomSettingResponse {\n");
        sb.append("    roomIntroduce: ").append(toIndentedString(roomIntroduce)).append("\n");
        sb.append("    cropLogoId: ").append(toIndentedString(cropLogoId)).append("\n");
        sb.append("    coverPictureId: ").append(toIndentedString(coverPictureId)).append("\n");
        sb.append("    showAudienceMode: ").append(toIndentedString(showAudienceMode)).append("\n");
        sb.append("    isRedoubleOpen: ").append(toIndentedString(isRedoubleOpen)).append("\n");
        sb.append("    baseAudienceCount: ").append(toIndentedString(baseAudienceCount)).append("\n");
        sb.append("    multiple: ").append(toIndentedString(multiple)).append("\n");
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
