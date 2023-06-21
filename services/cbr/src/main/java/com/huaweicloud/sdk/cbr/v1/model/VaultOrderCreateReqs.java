package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建包周期存储库请求体
 */
public class VaultOrderCreateReqs {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vault")

    private VaultOrder vault;

    public VaultOrderCreateReqs withVault(VaultOrder vault) {
        this.vault = vault;
        return this;
    }

    public VaultOrderCreateReqs withVault(Consumer<VaultOrder> vaultSetter) {
        if (this.vault == null) {
            this.vault = new VaultOrder();
            vaultSetter.accept(this.vault);
        }

        return this;
    }

    /**
     * Get vault
     * @return vault
     */
    public VaultOrder getVault() {
        return vault;
    }

    public void setVault(VaultOrder vault) {
        this.vault = vault;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VaultOrderCreateReqs vaultOrderCreateReqs = (VaultOrderCreateReqs) o;
        return Objects.equals(this.vault, vaultOrderCreateReqs.vault);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vault);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VaultOrderCreateReqs {\n");
        sb.append("    vault: ").append(toIndentedString(vault)).append("\n");
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