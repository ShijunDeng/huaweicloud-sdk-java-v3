package com.huaweicloud.sdk.cbr.v1.model;

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
public class ListVaultResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vaults")

    private List<Vault> vaults = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sys_lock_source_service")

    private String sysLockSourceService;

    public ListVaultResponse withVaults(List<Vault> vaults) {
        this.vaults = vaults;
        return this;
    }

    public ListVaultResponse addVaultsItem(Vault vaultsItem) {
        if (this.vaults == null) {
            this.vaults = new ArrayList<>();
        }
        this.vaults.add(vaultsItem);
        return this;
    }

    public ListVaultResponse withVaults(Consumer<List<Vault>> vaultsSetter) {
        if (this.vaults == null) {
            this.vaults = new ArrayList<>();
        }
        vaultsSetter.accept(this.vaults);
        return this;
    }

    /**
     * 存储库实例列表
     * @return vaults
     */
    public List<Vault> getVaults() {
        return vaults;
    }

    public void setVaults(List<Vault> vaults) {
        this.vaults = vaults;
    }

    public ListVaultResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 存储库个数
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListVaultResponse withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示的条目数量
     * minimum: 1
     * maximum: 1000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListVaultResponse withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量，表示从此偏移量开始查询
     * minimum: 0
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListVaultResponse withSysLockSourceService(String sysLockSourceService) {
        this.sysLockSourceService = sysLockSourceService;
        return this;
    }

    /**
     * 用于标识SMB服务
     * @return sysLockSourceService
     */
    public String getSysLockSourceService() {
        return sysLockSourceService;
    }

    public void setSysLockSourceService(String sysLockSourceService) {
        this.sysLockSourceService = sysLockSourceService;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListVaultResponse that = (ListVaultResponse) obj;
        return Objects.equals(this.vaults, that.vaults) && Objects.equals(this.count, that.count)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.sysLockSourceService, that.sysLockSourceService);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vaults, count, limit, offset, sysLockSourceService);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListVaultResponse {\n");
        sb.append("    vaults: ").append(toIndentedString(vaults)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    sysLockSourceService: ").append(toIndentedString(sysLockSourceService)).append("\n");
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
