package com.huaweicloud.sdk.cdm.v1.region;

import com.huaweicloud.sdk.core.region.IRegionProvider;
import com.huaweicloud.sdk.core.region.Region;
import com.huaweicloud.sdk.core.region.RegionProviderChain;
import com.huaweicloud.sdk.core.utils.StringUtils;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CdmRegion {

    public static final Region CN_NORTH_4 = new Region("cn-north-4", "https://cdm.cn-north-4.myhuaweicloud.com");

    public static final Region CN_NORTH_1 = new Region("cn-north-1", "https://cdm.cn-north-1.myhuaweicloud.com");

    public static final Region CN_EAST_2 = new Region("cn-east-2", "https://cdm.cn-east-2.myhuaweicloud.com");

    public static final Region CN_EAST_3 = new Region("cn-east-3", "https://cdm.cn-east-3.myhuaweicloud.com");

    public static final Region CN_SOUTH_1 = new Region("cn-south-1", "https://cdm.cn-south-1.myhuaweicloud.com");

    public static final Region AP_SOUTHEAST_2 =
        new Region("ap-southeast-2", "https://cdm.ap-southeast-2.myhuaweicloud.com");

    public static final Region AP_SOUTHEAST_1 =
        new Region("ap-southeast-1", "https://cdm.ap-southeast-1.myhuaweicloud.com");

    public static final Region CN_SOUTHWEST_2 =
        new Region("cn-southwest-2", "https://cdm.cn-southwest-2.myhuaweicloud.com");

    public static final Region SA_BRAZIL_1 = new Region("sa-brazil-1", "https://cdm.sa-brazil-1.myhuaweicloud.com");

    public static final Region AF_SOUTH_1 = new Region("af-south-1", "https://cdm.af-south-1.myhuaweicloud.com");

    public static final Region CN_SOUTH_2 = new Region("cn-south-2", "https://cdm.cn-south-2.myhuaweicloud.com");

    public static final Region LA_SOUTH_2 = new Region("la-south-2", "https://cdm.la-south-2.myhuaweicloud.com");

    public static final Region CN_NORTH_9 = new Region("cn-north-9", "https://cdm.cn-north-9.myhuaweicloud.com");

    public static final Region CN_NORTH_2 = new Region("cn-north-2", "https://cdm.cn-north-2.myhuaweicloud.cn");

    public static final Region NA_MEXICO_1 = new Region("na-mexico-1", "https://cdm.na-mexico-1.myhuaweicloud.cn");

    public static final Region LA_NORTH_2 = new Region("la-north-2", "https://cdm.la-north-2.myhuaweicloud.cn");

    public static final Region AP_SOUTHEAST_3 =
        new Region("ap-southeast-3", "https://cdm.ap-southeast-3.myhuaweicloud.cn");

    public static final Region AP_SOUTHEAST_4 =
        new Region("ap-southeast-4", "https://cdm.ap-southeast-4.myhuaweicloud.com");

    public static final Region TR_WEST_1 = new Region("tr-west-1", "https://cdm.tr-west-1.myhuaweicloud.com");

    private static final IRegionProvider PROVIDER = RegionProviderChain.getDefaultRegionProviderChain("CDM");

    private static final Map<String, Region> STATIC_FIELDS = createStaticFields();

    private static Map<String, Region> createStaticFields() {
        Map<String, Region> map = new HashMap<>();
        map.put("cn-north-4", CN_NORTH_4);
        map.put("cn-north-1", CN_NORTH_1);
        map.put("cn-east-2", CN_EAST_2);
        map.put("cn-east-3", CN_EAST_3);
        map.put("cn-south-1", CN_SOUTH_1);
        map.put("ap-southeast-2", AP_SOUTHEAST_2);
        map.put("ap-southeast-1", AP_SOUTHEAST_1);
        map.put("cn-southwest-2", CN_SOUTHWEST_2);
        map.put("sa-brazil-1", SA_BRAZIL_1);
        map.put("af-south-1", AF_SOUTH_1);
        map.put("cn-south-2", CN_SOUTH_2);
        map.put("la-south-2", LA_SOUTH_2);
        map.put("cn-north-9", CN_NORTH_9);
        map.put("cn-north-2", CN_NORTH_2);
        map.put("na-mexico-1", NA_MEXICO_1);
        map.put("la-north-2", LA_NORTH_2);
        map.put("ap-southeast-3", AP_SOUTHEAST_3);
        map.put("ap-southeast-4", AP_SOUTHEAST_4);
        map.put("tr-west-1", TR_WEST_1);
        return Collections.unmodifiableMap(map);
    }

    public static Region valueOf(String regionId) {
        if (StringUtils.isEmpty(regionId)) {
            throw new IllegalArgumentException("Unexpected empty parameter: regionId.");
        }

        Region result = PROVIDER.getRegion(regionId);
        if (Objects.nonNull(result)) {
            return result;
        }

        result = STATIC_FIELDS.get(regionId);
        if (Objects.nonNull(result)) {
            return result;
        }
        throw new IllegalArgumentException("Unexpected regionId: " + regionId);
    }
}
