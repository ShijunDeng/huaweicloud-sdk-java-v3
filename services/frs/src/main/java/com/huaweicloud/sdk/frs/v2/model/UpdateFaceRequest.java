package com.huaweicloud.sdk.frs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateFaceRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "face_set_name")

    @JacksonXmlProperty(localName = "face_set_name")

    private String faceSetName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private UpdateFaceReq body;

    public UpdateFaceRequest withFaceSetName(String faceSetName) {
        this.faceSetName = faceSetName;
        return this;
    }

    /**
     * 人脸库名称。
     * @return faceSetName
     */
    public String getFaceSetName() {
        return faceSetName;
    }

    public void setFaceSetName(String faceSetName) {
        this.faceSetName = faceSetName;
    }

    public UpdateFaceRequest withBody(UpdateFaceReq body) {
        this.body = body;
        return this;
    }

    public UpdateFaceRequest withBody(Consumer<UpdateFaceReq> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateFaceReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateFaceReq getBody() {
        return body;
    }

    public void setBody(UpdateFaceReq body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateFaceRequest updateFaceRequest = (UpdateFaceRequest) o;
        return Objects.equals(this.faceSetName, updateFaceRequest.faceSetName)
            && Objects.equals(this.body, updateFaceRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(faceSetName, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateFaceRequest {\n");
        sb.append("    faceSetName: ").append(toIndentedString(faceSetName)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
