package com.huaweicloud.sdk.devstar.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.devstar.v1.model.RepositoryInfo;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * CodehubJobInfo
 */
public class CodehubJobInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="application_name")
    
    private String applicationName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="privately")
    
    private Boolean privately = true;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="short_id")
    
    private String shortId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="code_url")
    
    private String codeUrl;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="region_id")
    
    private String regionId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="repo_type")
    
    private Integer repoType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="properties")
    
    private Object properties = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="repo_info")
    
    private RepositoryInfo repoInfo = null;

    public CodehubJobInfo withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    


    /**
     * 应用名称
     * @return applicationName
     */
    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public CodehubJobInfo withPrivately(Boolean privately) {
        this.privately = privately;
        return this;
    }

    


    /**
     * 仓库是否私有
     * @return privately
     */
    public Boolean getPrivately() {
        return privately;
    }

    public void setPrivately(Boolean privately) {
        this.privately = privately;
    }

    public CodehubJobInfo withShortId(String shortId) {
        this.shortId = shortId;
        return this;
    }

    


    /**
     * 仓库短id
     * @return shortId
     */
    public String getShortId() {
        return shortId;
    }

    public void setShortId(String shortId) {
        this.shortId = shortId;
    }

    public CodehubJobInfo withCodeUrl(String codeUrl) {
        this.codeUrl = codeUrl;
        return this;
    }

    


    /**
     * 代码存放的ssh地址
     * @return codeUrl
     */
    public String getCodeUrl() {
        return codeUrl;
    }

    public void setCodeUrl(String codeUrl) {
        this.codeUrl = codeUrl;
    }

    public CodehubJobInfo withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    


    /**
     * 区域id
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public CodehubJobInfo withRepoType(Integer repoType) {
        this.repoType = repoType;
        return this;
    }

    


    /**
     * 应用代码生成后的地址类型，目前支持0：codehub地址; 1：压缩包下载地址
     * @return repoType
     */
    public Integer getRepoType() {
        return repoType;
    }

    public void setRepoType(Integer repoType) {
        this.repoType = repoType;
    }

    public CodehubJobInfo withProperties(Object properties) {
        this.properties = properties;
        return this;
    }

    


    /**
     * 应用的动态参数json
     * @return properties
     */
    public Object getProperties() {
        return properties;
    }

    public void setProperties(Object properties) {
        this.properties = properties;
    }

    public CodehubJobInfo withRepoInfo(RepositoryInfo repoInfo) {
        this.repoInfo = repoInfo;
        return this;
    }

    public CodehubJobInfo withRepoInfo(Consumer<RepositoryInfo> repoInfoSetter) {
        if(this.repoInfo == null ){
            this.repoInfo = new RepositoryInfo();
            repoInfoSetter.accept(this.repoInfo);
        }
        
        return this;
    }


    /**
     * Get repoInfo
     * @return repoInfo
     */
    public RepositoryInfo getRepoInfo() {
        return repoInfo;
    }

    public void setRepoInfo(RepositoryInfo repoInfo) {
        this.repoInfo = repoInfo;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CodehubJobInfo codehubJobInfo = (CodehubJobInfo) o;
        return Objects.equals(this.applicationName, codehubJobInfo.applicationName) &&
            Objects.equals(this.privately, codehubJobInfo.privately) &&
            Objects.equals(this.shortId, codehubJobInfo.shortId) &&
            Objects.equals(this.codeUrl, codehubJobInfo.codeUrl) &&
            Objects.equals(this.regionId, codehubJobInfo.regionId) &&
            Objects.equals(this.repoType, codehubJobInfo.repoType) &&
            Objects.equals(this.properties, codehubJobInfo.properties) &&
            Objects.equals(this.repoInfo, codehubJobInfo.repoInfo);
    }
    @Override
    public int hashCode() {
        return Objects.hash(applicationName, privately, shortId, codeUrl, regionId, repoType, properties, repoInfo);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CodehubJobInfo {\n");
        sb.append("    applicationName: ").append(toIndentedString(applicationName)).append("\n");
        sb.append("    privately: ").append(toIndentedString(privately)).append("\n");
        sb.append("    shortId: ").append(toIndentedString(shortId)).append("\n");
        sb.append("    codeUrl: ").append(toIndentedString(codeUrl)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    repoType: ").append(toIndentedString(repoType)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
        sb.append("    repoInfo: ").append(toIndentedString(repoInfo)).append("\n");
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
