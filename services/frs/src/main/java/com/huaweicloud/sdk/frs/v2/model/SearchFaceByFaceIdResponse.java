package com.huaweicloud.sdk.frs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class SearchFaceByFaceIdResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "faces")

    private List<SearchFace> faces = null;

    public SearchFaceByFaceIdResponse withFaces(List<SearchFace> faces) {
        this.faces = faces;
        return this;
    }

    public SearchFaceByFaceIdResponse addFacesItem(SearchFace facesItem) {
        if (this.faces == null) {
            this.faces = new ArrayList<>();
        }
        this.faces.add(facesItem);
        return this;
    }

    public SearchFaceByFaceIdResponse withFaces(Consumer<List<SearchFace>> facesSetter) {
        if (this.faces == null) {
            this.faces = new ArrayList<>();
        }
        facesSetter.accept(this.faces);
        return this;
    }

    /** 查找的人脸集合，详见[SearchFace](zh-cn_topic_0106912071.xml)。 调用失败时无此字段。
     * 
     * @return faces */
    public List<SearchFace> getFaces() {
        return faces;
    }

    public void setFaces(List<SearchFace> faces) {
        this.faces = faces;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SearchFaceByFaceIdResponse searchFaceByFaceIdResponse = (SearchFaceByFaceIdResponse) o;
        return Objects.equals(this.faces, searchFaceByFaceIdResponse.faces);
    }

    @Override
    public int hashCode() {
        return Objects.hash(faces);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchFaceByFaceIdResponse {\n");
        sb.append("    faces: ").append(toIndentedString(faces)).append("\n");
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
