package com.huaweicloud.sdk.dns.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dns.v2.model.PrivateNameServer;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowPrivateZoneNameServerResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="nameservers")
    
    private List<PrivateNameServer> nameservers = null;
    
    public ShowPrivateZoneNameServerResponse withNameservers(List<PrivateNameServer> nameservers) {
        this.nameservers = nameservers;
        return this;
    }

    
    public ShowPrivateZoneNameServerResponse addNameserversItem(PrivateNameServer nameserversItem) {
        this.nameservers.add(nameserversItem);
        return this;
    }

    public ShowPrivateZoneNameServerResponse withNameservers(Consumer<List<PrivateNameServer>> nameserversSetter) {
        if(this.nameservers == null ){
            this.nameservers = new ArrayList<>();
        }
        nameserversSetter.accept(this.nameservers);
        return this;
    }

    /**
     * Get nameservers
     * @return nameservers
     */
    public List<PrivateNameServer> getNameservers() {
        return nameservers;
    }

    public void setNameservers(List<PrivateNameServer> nameservers) {
        this.nameservers = nameservers;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowPrivateZoneNameServerResponse showPrivateZoneNameServerResponse = (ShowPrivateZoneNameServerResponse) o;
        return Objects.equals(this.nameservers, showPrivateZoneNameServerResponse.nameservers);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nameservers);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPrivateZoneNameServerResponse {\n");
        sb.append("    nameservers: ").append(toIndentedString(nameservers)).append("\n");
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
