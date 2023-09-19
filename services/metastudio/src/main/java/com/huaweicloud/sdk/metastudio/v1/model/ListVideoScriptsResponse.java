package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListVideoScriptsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_scripts")

    private List<VideoScriptBaseInfo> videoScripts = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public ListVideoScriptsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 剧本总数。
     * minimum: 0
     * maximum: 2147483647
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListVideoScriptsResponse withVideoScripts(List<VideoScriptBaseInfo> videoScripts) {
        this.videoScripts = videoScripts;
        return this;
    }

    public ListVideoScriptsResponse addVideoScriptsItem(VideoScriptBaseInfo videoScriptsItem) {
        if (this.videoScripts == null) {
            this.videoScripts = new ArrayList<>();
        }
        this.videoScripts.add(videoScriptsItem);
        return this;
    }

    public ListVideoScriptsResponse withVideoScripts(Consumer<List<VideoScriptBaseInfo>> videoScriptsSetter) {
        if (this.videoScripts == null) {
            this.videoScripts = new ArrayList<>();
        }
        videoScriptsSetter.accept(this.videoScripts);
        return this;
    }

    /**
     * 剧本列表。
     * @return videoScripts
     */
    public List<VideoScriptBaseInfo> getVideoScripts() {
        return videoScripts;
    }

    public void setVideoScripts(List<VideoScriptBaseInfo> videoScripts) {
        this.videoScripts = videoScripts;
    }

    public ListVideoScriptsResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListVideoScriptsResponse that = (ListVideoScriptsResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.videoScripts, that.videoScripts)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, videoScripts, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListVideoScriptsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    videoScripts: ").append(toIndentedString(videoScripts)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
