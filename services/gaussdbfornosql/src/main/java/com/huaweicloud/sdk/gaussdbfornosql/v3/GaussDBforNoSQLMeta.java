package com.huaweicloud.sdk.gaussdbfornosql.v3;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.*;

@SuppressWarnings("unchecked")
public class GaussDBforNoSQLMeta {

    public static final HttpRequestDef<ApplyConfigurationRequest, ApplyConfigurationResponse> applyConfiguration =
        genForapplyConfiguration();

    private static HttpRequestDef<ApplyConfigurationRequest, ApplyConfigurationResponse> genForapplyConfiguration() {
        // basic
        HttpRequestDef.Builder<ApplyConfigurationRequest, ApplyConfigurationResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ApplyConfigurationRequest.class, ApplyConfigurationResponse.class)
                .withName("ApplyConfiguration")
                .withUri("/v3/{project_id}/configurations/{config_id}/apply")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("config_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ApplyConfigurationRequest::getConfigId, (req, v) -> {
                req.setConfigId(v);
            }));
        builder.<ApplyConfigurationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApplyConfigurationRequestBody.class),
            f -> f.withMarshaller(ApplyConfigurationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchTagActionRequest, BatchTagActionResponse> batchTagAction =
        genForbatchTagAction();

    private static HttpRequestDef<BatchTagActionRequest, BatchTagActionResponse> genForbatchTagAction() {
        // basic
        HttpRequestDef.Builder<BatchTagActionRequest, BatchTagActionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchTagActionRequest.class, BatchTagActionResponse.class)
                .withName("BatchTagAction")
                .withUri("/v3/{project_id}/instances/{instance_id}/tags/action")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchTagActionRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<BatchTagActionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchTagActionRequestBody.class),
            f -> f.withMarshaller(BatchTagActionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckDisasterRecoveryOperationRequest, CheckDisasterRecoveryOperationResponse> checkDisasterRecoveryOperation =
        genForcheckDisasterRecoveryOperation();

    private static HttpRequestDef<CheckDisasterRecoveryOperationRequest, CheckDisasterRecoveryOperationResponse> genForcheckDisasterRecoveryOperation() {
        // basic
        HttpRequestDef.Builder<CheckDisasterRecoveryOperationRequest, CheckDisasterRecoveryOperationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CheckDisasterRecoveryOperationRequest.class,
                    CheckDisasterRecoveryOperationResponse.class)
                .withName("CheckDisasterRecoveryOperation")
                .withUri("/v3/{project_id}/instances/{instance_id}/disaster-recovery/precheck")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckDisasterRecoveryOperationRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<PrecheckDisasterRecoveryOperationBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PrecheckDisasterRecoveryOperationBody.class),
            f -> f.withMarshaller(CheckDisasterRecoveryOperationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateConfigurationRequest, CreateConfigurationResponse> createConfiguration =
        genForcreateConfiguration();

    private static HttpRequestDef<CreateConfigurationRequest, CreateConfigurationResponse> genForcreateConfiguration() {
        // basic
        HttpRequestDef.Builder<CreateConfigurationRequest, CreateConfigurationResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateConfigurationRequest.class, CreateConfigurationResponse.class)
                .withName("CreateConfiguration")
                .withUri("/v3/{project_id}/configurations")
                .withContentType("application/json");

        // requests
        builder.<CreateConfigurationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateConfigurationRequestBody.class),
            f -> f.withMarshaller(CreateConfigurationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDisasterRecoveryRequest, CreateDisasterRecoveryResponse> createDisasterRecovery =
        genForcreateDisasterRecovery();

    private static HttpRequestDef<CreateDisasterRecoveryRequest, CreateDisasterRecoveryResponse> genForcreateDisasterRecovery() {
        // basic
        HttpRequestDef.Builder<CreateDisasterRecoveryRequest, CreateDisasterRecoveryResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateDisasterRecoveryRequest.class, CreateDisasterRecoveryResponse.class)
            .withName("CreateDisasterRecovery")
            .withUri("/v3/{project_id}/instances/{instance_id}/disaster-recovery/construction")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDisasterRecoveryRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<ConstructDisasterRecoveryBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ConstructDisasterRecoveryBody.class),
            f -> f.withMarshaller(CreateDisasterRecoveryRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateInstanceRequest, CreateInstanceResponse> createInstance =
        genForcreateInstance();

    private static HttpRequestDef<CreateInstanceRequest, CreateInstanceResponse> genForcreateInstance() {
        // basic
        HttpRequestDef.Builder<CreateInstanceRequest, CreateInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateInstanceRequest.class, CreateInstanceResponse.class)
                .withName("CreateInstance")
                .withUri("/v3/{project_id}/instances")
                .withContentType("application/json");

        // requests
        builder.<CreateInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateInstanceRequestBody.class),
            f -> f.withMarshaller(CreateInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteBackupRequest, DeleteBackupResponse> deleteBackup = genFordeleteBackup();

    private static HttpRequestDef<DeleteBackupRequest, DeleteBackupResponse> genFordeleteBackup() {
        // basic
        HttpRequestDef.Builder<DeleteBackupRequest, DeleteBackupResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteBackupRequest.class, DeleteBackupResponse.class)
                .withName("DeleteBackup")
                .withUri("/v3/{project_id}/backups/{backup_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("backup_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBackupRequest::getBackupId, (req, v) -> {
                req.setBackupId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteConfigurationRequest, DeleteConfigurationResponse> deleteConfiguration =
        genFordeleteConfiguration();

    private static HttpRequestDef<DeleteConfigurationRequest, DeleteConfigurationResponse> genFordeleteConfiguration() {
        // basic
        HttpRequestDef.Builder<DeleteConfigurationRequest, DeleteConfigurationResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteConfigurationRequest.class, DeleteConfigurationResponse.class)
            .withName("DeleteConfiguration")
            .withUri("/v3/{project_id}/configurations/{config_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("config_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteConfigurationRequest::getConfigId, (req, v) -> {
                req.setConfigId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDisasterRecoveryRequest, DeleteDisasterRecoveryResponse> deleteDisasterRecovery =
        genFordeleteDisasterRecovery();

    private static HttpRequestDef<DeleteDisasterRecoveryRequest, DeleteDisasterRecoveryResponse> genFordeleteDisasterRecovery() {
        // basic
        HttpRequestDef.Builder<DeleteDisasterRecoveryRequest, DeleteDisasterRecoveryResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, DeleteDisasterRecoveryRequest.class, DeleteDisasterRecoveryResponse.class)
            .withName("DeleteDisasterRecovery")
            .withUri("/v3/{project_id}/instances/{instance_id}/disaster-recovery/deconstruction")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDisasterRecoveryRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstance =
        genFordeleteInstance();

    private static HttpRequestDef<DeleteInstanceRequest, DeleteInstanceResponse> genFordeleteInstance() {
        // basic
        HttpRequestDef.Builder<DeleteInstanceRequest, DeleteInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteInstanceRequest.class, DeleteInstanceResponse.class)
                .withName("DeleteInstance")
                .withUri("/v3/{project_id}/instances/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExpandInstanceNodeRequest, ExpandInstanceNodeResponse> expandInstanceNode =
        genForexpandInstanceNode();

    private static HttpRequestDef<ExpandInstanceNodeRequest, ExpandInstanceNodeResponse> genForexpandInstanceNode() {
        // basic
        HttpRequestDef.Builder<ExpandInstanceNodeRequest, ExpandInstanceNodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExpandInstanceNodeRequest.class, ExpandInstanceNodeResponse.class)
                .withName("ExpandInstanceNode")
                .withUri("/v3/{project_id}/instances/{instance_id}/enlarge-node")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExpandInstanceNodeRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<ExpandInstanceNodeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExpandInstanceNodeRequestBody.class),
            f -> f.withMarshaller(ExpandInstanceNodeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListConfigurationTemplatesRequest, ListConfigurationTemplatesResponse> listConfigurationTemplates =
        genForlistConfigurationTemplates();

    private static HttpRequestDef<ListConfigurationTemplatesRequest, ListConfigurationTemplatesResponse> genForlistConfigurationTemplates() {
        // basic
        HttpRequestDef.Builder<ListConfigurationTemplatesRequest, ListConfigurationTemplatesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListConfigurationTemplatesRequest.class,
                    ListConfigurationTemplatesResponse.class)
                .withName("ListConfigurationTemplates")
                .withUri("/v3.1/{project_id}/configurations")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConfigurationTemplatesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConfigurationTemplatesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListConfigurationsRequest, ListConfigurationsResponse> listConfigurations =
        genForlistConfigurations();

    private static HttpRequestDef<ListConfigurationsRequest, ListConfigurationsResponse> genForlistConfigurations() {
        // basic
        HttpRequestDef.Builder<ListConfigurationsRequest, ListConfigurationsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListConfigurationsRequest.class, ListConfigurationsResponse.class)
                .withName("ListConfigurations")
                .withUri("/v3/{project_id}/configurations")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDatastoresRequest, ListDatastoresResponse> listDatastores =
        genForlistDatastores();

    private static HttpRequestDef<ListDatastoresRequest, ListDatastoresResponse> genForlistDatastores() {
        // basic
        HttpRequestDef.Builder<ListDatastoresRequest, ListDatastoresResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDatastoresRequest.class, ListDatastoresResponse.class)
                .withName("ListDatastores")
                .withUri("/v3/{project_id}/datastores/{datastore_name}/versions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("datastore_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatastoresRequest::getDatastoreName, (req, v) -> {
                req.setDatastoreName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDedicatedResourcesRequest, ListDedicatedResourcesResponse> listDedicatedResources =
        genForlistDedicatedResources();

    private static HttpRequestDef<ListDedicatedResourcesRequest, ListDedicatedResourcesResponse> genForlistDedicatedResources() {
        // basic
        HttpRequestDef.Builder<ListDedicatedResourcesRequest, ListDedicatedResourcesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListDedicatedResourcesRequest.class, ListDedicatedResourcesResponse.class)
            .withName("ListDedicatedResources")
            .withUri("/v3/{project_id}/dedicated-resources")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDedicatedResourcesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDedicatedResourcesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFlavorInfosRequest, ListFlavorInfosResponse> listFlavorInfos =
        genForlistFlavorInfos();

    private static HttpRequestDef<ListFlavorInfosRequest, ListFlavorInfosResponse> genForlistFlavorInfos() {
        // basic
        HttpRequestDef.Builder<ListFlavorInfosRequest, ListFlavorInfosResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFlavorInfosRequest.class, ListFlavorInfosResponse.class)
                .withName("ListFlavorInfos")
                .withUri("/v3.1/{project_id}/flavors")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("engine_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlavorInfosRequest::getEngineName, (req, v) -> {
                req.setEngineName(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFlavorInfosRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFlavorInfosRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFlavorsRequest, ListFlavorsResponse> listFlavors = genForlistFlavors();

    private static HttpRequestDef<ListFlavorsRequest, ListFlavorsResponse> genForlistFlavors() {
        // basic
        HttpRequestDef.Builder<ListFlavorsRequest, ListFlavorsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFlavorsRequest.class, ListFlavorsResponse.class)
                .withName("ListFlavors")
                .withUri("/v3/{project_id}/flavors")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("region",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlavorsRequest::getRegion, (req, v) -> {
                req.setRegion(v);
            }));
        builder.<String>withRequestField("engine_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlavorsRequest::getEngineName, (req, v) -> {
                req.setEngineName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceTagsRequest, ListInstanceTagsResponse> listInstanceTags =
        genForlistInstanceTags();

    private static HttpRequestDef<ListInstanceTagsRequest, ListInstanceTagsResponse> genForlistInstanceTags() {
        // basic
        HttpRequestDef.Builder<ListInstanceTagsRequest, ListInstanceTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListInstanceTagsRequest.class, ListInstanceTagsResponse.class)
                .withName("ListInstanceTags")
                .withUri("/v3/{project_id}/instances/{instance_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceTagsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstancesRequest, ListInstancesResponse> listInstances =
        genForlistInstances();

    private static HttpRequestDef<ListInstancesRequest, ListInstancesResponse> genForlistInstances() {
        // basic
        HttpRequestDef.Builder<ListInstancesRequest, ListInstancesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListInstancesRequest.class, ListInstancesResponse.class)
                .withName("ListInstances")
                .withUri("/v3/{project_id}/instances")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getMode, (req, v) -> {
                req.setMode(v);
            }));
        builder.<String>withRequestField("datastore_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getDatastoreType, (req, v) -> {
                req.setDatastoreType(v);
            }));
        builder.<String>withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getVpcId, (req, v) -> {
                req.setVpcId(v);
            }));
        builder.<String>withRequestField("subnet_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getSubnetId, (req, v) -> {
                req.setSubnetId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstancesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstancesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstancesByResourceTagsRequest, ListInstancesByResourceTagsResponse> listInstancesByResourceTags =
        genForlistInstancesByResourceTags();

    private static HttpRequestDef<ListInstancesByResourceTagsRequest, ListInstancesByResourceTagsResponse> genForlistInstancesByResourceTags() {
        // basic
        HttpRequestDef.Builder<ListInstancesByResourceTagsRequest, ListInstancesByResourceTagsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ListInstancesByResourceTagsRequest.class,
                    ListInstancesByResourceTagsResponse.class)
                .withName("ListInstancesByResourceTags")
                .withUri("/v3/{project_id}/instances/resource-instances/action")
                .withContentType("application/json");

        // requests
        builder.<ListInstancesByTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListInstancesByTagsRequestBody.class),
            f -> f.withMarshaller(ListInstancesByResourceTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstancesByTagsRequest, ListInstancesByTagsResponse> listInstancesByTags =
        genForlistInstancesByTags();

    private static HttpRequestDef<ListInstancesByTagsRequest, ListInstancesByTagsResponse> genForlistInstancesByTags() {
        // basic
        HttpRequestDef.Builder<ListInstancesByTagsRequest, ListInstancesByTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListInstancesByTagsRequest.class, ListInstancesByTagsResponse.class)
                .withName("ListInstancesByTags")
                .withUri("/v3/{project_id}/instances/resource_instances/action")
                .withContentType("application/json");

        // requests
        builder.<ListInstancesByTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListInstancesByTagsRequestBody.class),
            f -> f.withMarshaller(ListInstancesByTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRestoreTimeRequest, ListRestoreTimeResponse> listRestoreTime =
        genForlistRestoreTime();

    private static HttpRequestDef<ListRestoreTimeRequest, ListRestoreTimeResponse> genForlistRestoreTime() {
        // basic
        HttpRequestDef.Builder<ListRestoreTimeRequest, ListRestoreTimeResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRestoreTimeRequest.class, ListRestoreTimeResponse.class)
                .withName("ListRestoreTime")
                .withUri("/v3/{project_id}/instances/{instance_id}/backups/restorable-time-periods")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRestoreTimeRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRestoreTimeRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRestoreTimeRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRestoreTimeRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRestoreTimeRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSlowLogsRequest, ListSlowLogsResponse> listSlowLogs = genForlistSlowLogs();

    private static HttpRequestDef<ListSlowLogsRequest, ListSlowLogsResponse> genForlistSlowLogs() {
        // basic
        HttpRequestDef.Builder<ListSlowLogsRequest, ListSlowLogsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSlowLogsRequest.class, ListSlowLogsResponse.class)
                .withName("ListSlowLogs")
                .withUri("/v3/{project_id}/instances/{instance_id}/slowlog")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSlowLogsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("start_date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSlowLogsRequest::getStartDate, (req, v) -> {
                req.setStartDate(v);
            }));
        builder.<String>withRequestField("end_date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSlowLogsRequest::getEndDate, (req, v) -> {
                req.setEndDate(v);
            }));
        builder.<String>withRequestField("node_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSlowLogsRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            }));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSlowLogsRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSlowLogsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSlowLogsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetPasswordRequest, ResetPasswordResponse> resetPassword =
        genForresetPassword();

    private static HttpRequestDef<ResetPasswordRequest, ResetPasswordResponse> genForresetPassword() {
        // basic
        HttpRequestDef.Builder<ResetPasswordRequest, ResetPasswordResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ResetPasswordRequest.class, ResetPasswordResponse.class)
                .withName("ResetPassword")
                .withUri("/v3/{project_id}/instances/{instance_id}/password")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetPasswordRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<ResetPasswordRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResetPasswordRequestBody.class),
            f -> f.withMarshaller(ResetPasswordRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResizeInstanceRequest, ResizeInstanceResponse> resizeInstance =
        genForresizeInstance();

    private static HttpRequestDef<ResizeInstanceRequest, ResizeInstanceResponse> genForresizeInstance() {
        // basic
        HttpRequestDef.Builder<ResizeInstanceRequest, ResizeInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ResizeInstanceRequest.class, ResizeInstanceResponse.class)
                .withName("ResizeInstance")
                .withUri("/v3/{project_id}/instances/{instance_id}/resize")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResizeInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<ResizeInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResizeInstanceRequestBody.class),
            f -> f.withMarshaller(ResizeInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResizeInstanceVolumeRequest, ResizeInstanceVolumeResponse> resizeInstanceVolume =
        genForresizeInstanceVolume();

    private static HttpRequestDef<ResizeInstanceVolumeRequest, ResizeInstanceVolumeResponse> genForresizeInstanceVolume() {
        // basic
        HttpRequestDef.Builder<ResizeInstanceVolumeRequest, ResizeInstanceVolumeResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ResizeInstanceVolumeRequest.class, ResizeInstanceVolumeResponse.class)
            .withName("ResizeInstanceVolume")
            .withUri("/v3/{project_id}/instances/{instance_id}/extend-volume")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResizeInstanceVolumeRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<ResizeInstanceVolumeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResizeInstanceVolumeRequestBody.class),
            f -> f.withMarshaller(ResizeInstanceVolumeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestoreExistingInstanceRequest, RestoreExistingInstanceResponse> restoreExistingInstance =
        genForrestoreExistingInstance();

    private static HttpRequestDef<RestoreExistingInstanceRequest, RestoreExistingInstanceResponse> genForrestoreExistingInstance() {
        // basic
        HttpRequestDef.Builder<RestoreExistingInstanceRequest, RestoreExistingInstanceResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RestoreExistingInstanceRequest.class, RestoreExistingInstanceResponse.class)
            .withName("RestoreExistingInstance")
            .withUri("/v3/{project_id}/instances/{instance_id}/recovery")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestoreExistingInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<RestoreRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestoreRequestBody.class),
            f -> f.withMarshaller(RestoreExistingInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetBackupPolicyRequest, SetBackupPolicyResponse> setBackupPolicy =
        genForsetBackupPolicy();

    private static HttpRequestDef<SetBackupPolicyRequest, SetBackupPolicyResponse> genForsetBackupPolicy() {
        // basic
        HttpRequestDef.Builder<SetBackupPolicyRequest, SetBackupPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, SetBackupPolicyRequest.class, SetBackupPolicyResponse.class)
                .withName("SetBackupPolicy")
                .withUri("/v3/{project_id}/instances/{instance_id}/backups/policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetBackupPolicyRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<SetBackupPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SetBackupPolicyRequestBody.class),
            f -> f.withMarshaller(SetBackupPolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBackupPolicyRequest, ShowBackupPolicyResponse> showBackupPolicy =
        genForshowBackupPolicy();

    private static HttpRequestDef<ShowBackupPolicyRequest, ShowBackupPolicyResponse> genForshowBackupPolicy() {
        // basic
        HttpRequestDef.Builder<ShowBackupPolicyRequest, ShowBackupPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowBackupPolicyRequest.class, ShowBackupPolicyResponse.class)
                .withName("ShowBackupPolicy")
                .withUri("/v3/{project_id}/instances/{instance_id}/backups/policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBackupPolicyRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowConfigurationDetailRequest, ShowConfigurationDetailResponse> showConfigurationDetail =
        genForshowConfigurationDetail();

    private static HttpRequestDef<ShowConfigurationDetailRequest, ShowConfigurationDetailResponse> genForshowConfigurationDetail() {
        // basic
        HttpRequestDef.Builder<ShowConfigurationDetailRequest, ShowConfigurationDetailResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowConfigurationDetailRequest.class, ShowConfigurationDetailResponse.class)
            .withName("ShowConfigurationDetail")
            .withUri("/v3/{project_id}/configurations/{config_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("config_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConfigurationDetailRequest::getConfigId, (req, v) -> {
                req.setConfigId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceConfigurationRequest, ShowInstanceConfigurationResponse> showInstanceConfiguration =
        genForshowInstanceConfiguration();

    private static HttpRequestDef<ShowInstanceConfigurationRequest, ShowInstanceConfigurationResponse> genForshowInstanceConfiguration() {
        // basic
        HttpRequestDef.Builder<ShowInstanceConfigurationRequest, ShowInstanceConfigurationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowInstanceConfigurationRequest.class,
                    ShowInstanceConfigurationResponse.class)
                .withName("ShowInstanceConfiguration")
                .withUri("/v3/{project_id}/instances/{instance_id}/configurations")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceConfigurationRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceRoleRequest, ShowInstanceRoleResponse> showInstanceRole =
        genForshowInstanceRole();

    private static HttpRequestDef<ShowInstanceRoleRequest, ShowInstanceRoleResponse> genForshowInstanceRole() {
        // basic
        HttpRequestDef.Builder<ShowInstanceRoleRequest, ShowInstanceRoleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowInstanceRoleRequest.class, ShowInstanceRoleResponse.class)
                .withName("ShowInstanceRole")
                .withUri("/v3/{project_id}/instances/{instance_id}/instance-role")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceRoleRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowQuotasRequest, ShowQuotasResponse> showQuotas = genForshowQuotas();

    private static HttpRequestDef<ShowQuotasRequest, ShowQuotasResponse> genForshowQuotas() {
        // basic
        HttpRequestDef.Builder<ShowQuotasRequest, ShowQuotasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowQuotasRequest.class, ShowQuotasResponse.class)
                .withName("ShowQuotas")
                .withUri("/v3/{project_id}/quotas")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRestorableListRequest, ShowRestorableListResponse> showRestorableList =
        genForshowRestorableList();

    private static HttpRequestDef<ShowRestorableListRequest, ShowRestorableListResponse> genForshowRestorableList() {
        // basic
        HttpRequestDef.Builder<ShowRestorableListRequest, ShowRestorableListResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRestorableListRequest.class, ShowRestorableListResponse.class)
                .withName("ShowRestorableList")
                .withUri("/v3/{project_id}/backups/{backup_id}/restorable-instances")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("backup_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRestorableListRequest::getBackupId, (req, v) -> {
                req.setBackupId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowRestorableListRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowRestorableListRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShrinkInstanceNodeRequest, ShrinkInstanceNodeResponse> shrinkInstanceNode =
        genForshrinkInstanceNode();

    private static HttpRequestDef<ShrinkInstanceNodeRequest, ShrinkInstanceNodeResponse> genForshrinkInstanceNode() {
        // basic
        HttpRequestDef.Builder<ShrinkInstanceNodeRequest, ShrinkInstanceNodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShrinkInstanceNodeRequest.class, ShrinkInstanceNodeResponse.class)
                .withName("ShrinkInstanceNode")
                .withUri("/v3/{project_id}/instances/{instance_id}/reduce-node")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShrinkInstanceNodeRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<ShrinkInstanceNodeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShrinkInstanceNodeRequestBody.class),
            f -> f.withMarshaller(ShrinkInstanceNodeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SwitchToMasterRequest, SwitchToMasterResponse> switchToMaster =
        genForswitchToMaster();

    private static HttpRequestDef<SwitchToMasterRequest, SwitchToMasterResponse> genForswitchToMaster() {
        // basic
        HttpRequestDef.Builder<SwitchToMasterRequest, SwitchToMasterResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SwitchToMasterRequest.class, SwitchToMasterResponse.class)
                .withName("SwitchToMaster")
                .withUri("/v3/{project_id}/instances/{instance_id}/switchover-master")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchToMasterRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SwitchToSlaveRequest, SwitchToSlaveResponse> switchToSlave =
        genForswitchToSlave();

    private static HttpRequestDef<SwitchToSlaveRequest, SwitchToSlaveResponse> genForswitchToSlave() {
        // basic
        HttpRequestDef.Builder<SwitchToSlaveRequest, SwitchToSlaveResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SwitchToSlaveRequest.class, SwitchToSlaveResponse.class)
                .withName("SwitchToSlave")
                .withUri("/v3/{project_id}/instances/{instance_id}/switchover-slave")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchToSlaveRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateConfigurationRequest, UpdateConfigurationResponse> updateConfiguration =
        genForupdateConfiguration();

    private static HttpRequestDef<UpdateConfigurationRequest, UpdateConfigurationResponse> genForupdateConfiguration() {
        // basic
        HttpRequestDef.Builder<UpdateConfigurationRequest, UpdateConfigurationResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateConfigurationRequest.class, UpdateConfigurationResponse.class)
                .withName("UpdateConfiguration")
                .withUri("/v3/{project_id}/configurations/{config_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("config_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateConfigurationRequest::getConfigId, (req, v) -> {
                req.setConfigId(v);
            }));
        builder.<UpdateConfigurationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateConfigurationRequestBody.class),
            f -> f.withMarshaller(UpdateConfigurationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceConfigurationRequest, UpdateInstanceConfigurationResponse> updateInstanceConfiguration =
        genForupdateInstanceConfiguration();

    private static HttpRequestDef<UpdateInstanceConfigurationRequest, UpdateInstanceConfigurationResponse> genForupdateInstanceConfiguration() {
        // basic
        HttpRequestDef.Builder<UpdateInstanceConfigurationRequest, UpdateInstanceConfigurationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateInstanceConfigurationRequest.class,
                    UpdateInstanceConfigurationResponse.class)
                .withName("UpdateInstanceConfiguration")
                .withUri("/v3/{project_id}/instances/{instance_id}/configurations")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceConfigurationRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<UpdateInstanceConfigurationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateInstanceConfigurationRequestBody.class),
            f -> f.withMarshaller(UpdateInstanceConfigurationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceNameRequest, UpdateInstanceNameResponse> updateInstanceName =
        genForupdateInstanceName();

    private static HttpRequestDef<UpdateInstanceNameRequest, UpdateInstanceNameResponse> genForupdateInstanceName() {
        // basic
        HttpRequestDef.Builder<UpdateInstanceNameRequest, UpdateInstanceNameResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateInstanceNameRequest.class, UpdateInstanceNameResponse.class)
                .withName("UpdateInstanceName")
                .withUri("/v3/{project_id}/instances/{instance_id}/name")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceNameRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<UpdateInstanceNameRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateInstanceNameRequestBody.class),
            f -> f.withMarshaller(UpdateInstanceNameRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSecurityGroupRequest, UpdateSecurityGroupResponse> updateSecurityGroup =
        genForupdateSecurityGroup();

    private static HttpRequestDef<UpdateSecurityGroupRequest, UpdateSecurityGroupResponse> genForupdateSecurityGroup() {
        // basic
        HttpRequestDef.Builder<UpdateSecurityGroupRequest, UpdateSecurityGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateSecurityGroupRequest.class, UpdateSecurityGroupResponse.class)
                .withName("UpdateSecurityGroup")
                .withUri("/v3/{project_id}/instances/{instance_id}/security-group")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSecurityGroupRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<UpdateSecurityGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateSecurityGroupRequestBody.class),
            f -> f.withMarshaller(UpdateSecurityGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpgradeDbVersionRequest, UpgradeDbVersionResponse> upgradeDbVersion =
        genForupgradeDbVersion();

    private static HttpRequestDef<UpgradeDbVersionRequest, UpgradeDbVersionResponse> genForupgradeDbVersion() {
        // basic
        HttpRequestDef.Builder<UpgradeDbVersionRequest, UpgradeDbVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpgradeDbVersionRequest.class, UpgradeDbVersionResponse.class)
                .withName("UpgradeDbVersion")
                .withUri("/v3/{project_id}/instances/{instance_id}/db-upgrade")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpgradeDbVersionRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApiVersionRequest, ListApiVersionResponse> listApiVersion =
        genForlistApiVersion();

    private static HttpRequestDef<ListApiVersionRequest, ListApiVersionResponse> genForlistApiVersion() {
        // basic
        HttpRequestDef.Builder<ListApiVersionRequest, ListApiVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListApiVersionRequest.class, ListApiVersionResponse.class)
                .withName("ListApiVersion")
                .withUri("/")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowApiVersionRequest, ShowApiVersionResponse> showApiVersion =
        genForshowApiVersion();

    private static HttpRequestDef<ShowApiVersionRequest, ShowApiVersionResponse> genForshowApiVersion() {
        // basic
        HttpRequestDef.Builder<ShowApiVersionRequest, ShowApiVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowApiVersionRequest.class, ShowApiVersionResponse.class)
                .withName("ShowApiVersion")
                .withUri("/{version}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("version",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowApiVersionRequest::getVersion, (req, v) -> {
                req.setVersion(v);
            }));

        // response

        return builder.build();
    }

}
