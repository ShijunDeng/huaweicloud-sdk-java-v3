package com.huaweicloud.sdk.cts.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.cts.v3.model.BatchCreateResourceTagsRequest;
import com.huaweicloud.sdk.cts.v3.model.BatchCreateResourceTagsResponse;
import com.huaweicloud.sdk.cts.v3.model.BatchDeleteResourceTagsRequest;
import com.huaweicloud.sdk.cts.v3.model.BatchDeleteResourceTagsResponse;
import com.huaweicloud.sdk.cts.v3.model.CheckObsBucketsRequest;
import com.huaweicloud.sdk.cts.v3.model.CheckObsBucketsResponse;
import com.huaweicloud.sdk.cts.v3.model.CreateNotificationRequest;
import com.huaweicloud.sdk.cts.v3.model.CreateNotificationResponse;
import com.huaweicloud.sdk.cts.v3.model.CreateTrackerRequest;
import com.huaweicloud.sdk.cts.v3.model.CreateTrackerResponse;
import com.huaweicloud.sdk.cts.v3.model.DeleteNotificationRequest;
import com.huaweicloud.sdk.cts.v3.model.DeleteNotificationResponse;
import com.huaweicloud.sdk.cts.v3.model.DeleteTrackerRequest;
import com.huaweicloud.sdk.cts.v3.model.DeleteTrackerResponse;
import com.huaweicloud.sdk.cts.v3.model.ListNotificationsRequest;
import com.huaweicloud.sdk.cts.v3.model.ListNotificationsResponse;
import com.huaweicloud.sdk.cts.v3.model.ListOperationsRequest;
import com.huaweicloud.sdk.cts.v3.model.ListOperationsResponse;
import com.huaweicloud.sdk.cts.v3.model.ListQuotasRequest;
import com.huaweicloud.sdk.cts.v3.model.ListQuotasResponse;
import com.huaweicloud.sdk.cts.v3.model.ListTraceResourcesRequest;
import com.huaweicloud.sdk.cts.v3.model.ListTraceResourcesResponse;
import com.huaweicloud.sdk.cts.v3.model.ListTracesRequest;
import com.huaweicloud.sdk.cts.v3.model.ListTracesResponse;
import com.huaweicloud.sdk.cts.v3.model.ListTrackersRequest;
import com.huaweicloud.sdk.cts.v3.model.ListTrackersResponse;
import com.huaweicloud.sdk.cts.v3.model.ListUserResourcesRequest;
import com.huaweicloud.sdk.cts.v3.model.ListUserResourcesResponse;
import com.huaweicloud.sdk.cts.v3.model.UpdateNotificationRequest;
import com.huaweicloud.sdk.cts.v3.model.UpdateNotificationResponse;
import com.huaweicloud.sdk.cts.v3.model.UpdateTrackerRequest;
import com.huaweicloud.sdk.cts.v3.model.UpdateTrackerResponse;

public class CtsClient {

    protected HcClient hcClient;

    public CtsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CtsClient> newBuilder() {
        ClientBuilder<CtsClient> clientBuilder = new ClientBuilder<>(CtsClient::new);
        return clientBuilder;
    }

    /**
     * 批量添加CTS资源标签
     *
     * 批量添加CTS资源标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateResourceTagsRequest 请求对象
     * @return BatchCreateResourceTagsResponse
     */
    public BatchCreateResourceTagsResponse batchCreateResourceTags(BatchCreateResourceTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CtsMeta.batchCreateResourceTags);
    }

    /**
     * 批量添加CTS资源标签
     *
     * 批量添加CTS资源标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateResourceTagsRequest 请求对象
     * @return SyncInvoker<BatchCreateResourceTagsRequest, BatchCreateResourceTagsResponse>
     */
    public SyncInvoker<BatchCreateResourceTagsRequest, BatchCreateResourceTagsResponse> batchCreateResourceTagsInvoker(
        BatchCreateResourceTagsRequest request) {
        return new SyncInvoker<>(request, CtsMeta.batchCreateResourceTags, hcClient);
    }

    /**
     * 批量删除CTS资源标签
     *
     * 批量删除CTS资源标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteResourceTagsRequest 请求对象
     * @return BatchDeleteResourceTagsResponse
     */
    public BatchDeleteResourceTagsResponse batchDeleteResourceTags(BatchDeleteResourceTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CtsMeta.batchDeleteResourceTags);
    }

    /**
     * 批量删除CTS资源标签
     *
     * 批量删除CTS资源标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteResourceTagsRequest 请求对象
     * @return SyncInvoker<BatchDeleteResourceTagsRequest, BatchDeleteResourceTagsResponse>
     */
    public SyncInvoker<BatchDeleteResourceTagsRequest, BatchDeleteResourceTagsResponse> batchDeleteResourceTagsInvoker(
        BatchDeleteResourceTagsRequest request) {
        return new SyncInvoker<>(request, CtsMeta.batchDeleteResourceTags, hcClient);
    }

    /**
     * 检查已经配置OBS桶是否可以成功转储
     *
     * 检查已经配置OBS桶是否可以成功转储。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckObsBucketsRequest 请求对象
     * @return CheckObsBucketsResponse
     */
    public CheckObsBucketsResponse checkObsBuckets(CheckObsBucketsRequest request) {
        return hcClient.syncInvokeHttp(request, CtsMeta.checkObsBuckets);
    }

    /**
     * 检查已经配置OBS桶是否可以成功转储
     *
     * 检查已经配置OBS桶是否可以成功转储。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckObsBucketsRequest 请求对象
     * @return SyncInvoker<CheckObsBucketsRequest, CheckObsBucketsResponse>
     */
    public SyncInvoker<CheckObsBucketsRequest, CheckObsBucketsResponse> checkObsBucketsInvoker(
        CheckObsBucketsRequest request) {
        return new SyncInvoker<>(request, CtsMeta.checkObsBuckets, hcClient);
    }

    /**
     * 创建关键操作通知
     *
     * 配置关键操作通知，可在发生特定操作时，使用预先创建好的SMN主题，向用户手机、邮箱发送消息，也可直接发送http/https消息。常用于实时感知高危操作、触发特定操作或对接用户自有审计分析系统。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateNotificationRequest 请求对象
     * @return CreateNotificationResponse
     */
    public CreateNotificationResponse createNotification(CreateNotificationRequest request) {
        return hcClient.syncInvokeHttp(request, CtsMeta.createNotification);
    }

    /**
     * 创建关键操作通知
     *
     * 配置关键操作通知，可在发生特定操作时，使用预先创建好的SMN主题，向用户手机、邮箱发送消息，也可直接发送http/https消息。常用于实时感知高危操作、触发特定操作或对接用户自有审计分析系统。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateNotificationRequest 请求对象
     * @return SyncInvoker<CreateNotificationRequest, CreateNotificationResponse>
     */
    public SyncInvoker<CreateNotificationRequest, CreateNotificationResponse> createNotificationInvoker(
        CreateNotificationRequest request) {
        return new SyncInvoker<>(request, CtsMeta.createNotification, hcClient);
    }

    /**
     * 创建追踪器
     *
     * 云审计服务开通后系统会自动创建一个追踪器，用来关联系统记录的所有操作。目前，一个云账户在一个Region下支持创建一个管理类追踪器和多个数据类追踪器。
     * 云审计服务支持在管理控制台查询近7天内的操作记录。如需保存更长时间的操作记录，您可以在创建追踪器之后通过对象存储服务（Object Storage Service，以下简称OBS）将操作记录实时保存至OBS桶中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTrackerRequest 请求对象
     * @return CreateTrackerResponse
     */
    public CreateTrackerResponse createTracker(CreateTrackerRequest request) {
        return hcClient.syncInvokeHttp(request, CtsMeta.createTracker);
    }

    /**
     * 创建追踪器
     *
     * 云审计服务开通后系统会自动创建一个追踪器，用来关联系统记录的所有操作。目前，一个云账户在一个Region下支持创建一个管理类追踪器和多个数据类追踪器。
     * 云审计服务支持在管理控制台查询近7天内的操作记录。如需保存更长时间的操作记录，您可以在创建追踪器之后通过对象存储服务（Object Storage Service，以下简称OBS）将操作记录实时保存至OBS桶中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTrackerRequest 请求对象
     * @return SyncInvoker<CreateTrackerRequest, CreateTrackerResponse>
     */
    public SyncInvoker<CreateTrackerRequest, CreateTrackerResponse> createTrackerInvoker(CreateTrackerRequest request) {
        return new SyncInvoker<>(request, CtsMeta.createTracker, hcClient);
    }

    /**
     * 删除关键操作通知
     *
     * 云审计服务支持删除已创建的关键操作通知。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteNotificationRequest 请求对象
     * @return DeleteNotificationResponse
     */
    public DeleteNotificationResponse deleteNotification(DeleteNotificationRequest request) {
        return hcClient.syncInvokeHttp(request, CtsMeta.deleteNotification);
    }

    /**
     * 删除关键操作通知
     *
     * 云审计服务支持删除已创建的关键操作通知。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteNotificationRequest 请求对象
     * @return SyncInvoker<DeleteNotificationRequest, DeleteNotificationResponse>
     */
    public SyncInvoker<DeleteNotificationRequest, DeleteNotificationResponse> deleteNotificationInvoker(
        DeleteNotificationRequest request) {
        return new SyncInvoker<>(request, CtsMeta.deleteNotification, hcClient);
    }

    /**
     * 删除追踪器
     *
     * 云审计服务目前仅支持删除已创建的数据类追踪器。删除追踪器对已有的操作记录没有影响，当您重新开通云审计服务后，依旧可以查看已有的操作记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTrackerRequest 请求对象
     * @return DeleteTrackerResponse
     */
    public DeleteTrackerResponse deleteTracker(DeleteTrackerRequest request) {
        return hcClient.syncInvokeHttp(request, CtsMeta.deleteTracker);
    }

    /**
     * 删除追踪器
     *
     * 云审计服务目前仅支持删除已创建的数据类追踪器。删除追踪器对已有的操作记录没有影响，当您重新开通云审计服务后，依旧可以查看已有的操作记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTrackerRequest 请求对象
     * @return SyncInvoker<DeleteTrackerRequest, DeleteTrackerResponse>
     */
    public SyncInvoker<DeleteTrackerRequest, DeleteTrackerResponse> deleteTrackerInvoker(DeleteTrackerRequest request) {
        return new SyncInvoker<>(request, CtsMeta.deleteTracker, hcClient);
    }

    /**
     * 查询关键操作通知
     *
     * 查询创建的关键操作通知规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNotificationsRequest 请求对象
     * @return ListNotificationsResponse
     */
    public ListNotificationsResponse listNotifications(ListNotificationsRequest request) {
        return hcClient.syncInvokeHttp(request, CtsMeta.listNotifications);
    }

    /**
     * 查询关键操作通知
     *
     * 查询创建的关键操作通知规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNotificationsRequest 请求对象
     * @return SyncInvoker<ListNotificationsRequest, ListNotificationsResponse>
     */
    public SyncInvoker<ListNotificationsRequest, ListNotificationsResponse> listNotificationsInvoker(
        ListNotificationsRequest request) {
        return new SyncInvoker<>(request, CtsMeta.listNotifications, hcClient);
    }

    /**
     * 查询云服务的全量操作列表
     *
     * 查询云服务的全量操作列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOperationsRequest 请求对象
     * @return ListOperationsResponse
     */
    public ListOperationsResponse listOperations(ListOperationsRequest request) {
        return hcClient.syncInvokeHttp(request, CtsMeta.listOperations);
    }

    /**
     * 查询云服务的全量操作列表
     *
     * 查询云服务的全量操作列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOperationsRequest 请求对象
     * @return SyncInvoker<ListOperationsRequest, ListOperationsResponse>
     */
    public SyncInvoker<ListOperationsRequest, ListOperationsResponse> listOperationsInvoker(
        ListOperationsRequest request) {
        return new SyncInvoker<>(request, CtsMeta.listOperations, hcClient);
    }

    /**
     * 查询租户追踪器配额信息
     *
     * 查询租户追踪器配额信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQuotasRequest 请求对象
     * @return ListQuotasResponse
     */
    public ListQuotasResponse listQuotas(ListQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, CtsMeta.listQuotas);
    }

    /**
     * 查询租户追踪器配额信息
     *
     * 查询租户追踪器配额信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQuotasRequest 请求对象
     * @return SyncInvoker<ListQuotasRequest, ListQuotasResponse>
     */
    public SyncInvoker<ListQuotasRequest, ListQuotasResponse> listQuotasInvoker(ListQuotasRequest request) {
        return new SyncInvoker<>(request, CtsMeta.listQuotas, hcClient);
    }

    /**
     * 查询事件的资源类型列表
     *
     * 查询事件的资源类型列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTraceResourcesRequest 请求对象
     * @return ListTraceResourcesResponse
     */
    public ListTraceResourcesResponse listTraceResources(ListTraceResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, CtsMeta.listTraceResources);
    }

    /**
     * 查询事件的资源类型列表
     *
     * 查询事件的资源类型列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTraceResourcesRequest 请求对象
     * @return SyncInvoker<ListTraceResourcesRequest, ListTraceResourcesResponse>
     */
    public SyncInvoker<ListTraceResourcesRequest, ListTraceResourcesResponse> listTraceResourcesInvoker(
        ListTraceResourcesRequest request) {
        return new SyncInvoker<>(request, CtsMeta.listTraceResources, hcClient);
    }

    /**
     * 查询事件列表
     *
     * 通过事件列表查询接口，可以查出系统记录的7天内资源操作记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTracesRequest 请求对象
     * @return ListTracesResponse
     */
    public ListTracesResponse listTraces(ListTracesRequest request) {
        return hcClient.syncInvokeHttp(request, CtsMeta.listTraces);
    }

    /**
     * 查询事件列表
     *
     * 通过事件列表查询接口，可以查出系统记录的7天内资源操作记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTracesRequest 请求对象
     * @return SyncInvoker<ListTracesRequest, ListTracesResponse>
     */
    public SyncInvoker<ListTracesRequest, ListTracesResponse> listTracesInvoker(ListTracesRequest request) {
        return new SyncInvoker<>(request, CtsMeta.listTraces, hcClient);
    }

    /**
     * 查询追踪器
     *
     * 开通云审计服务成功后，您可以在追踪器信息页面查看追踪器的详细信息。详细信息主要包括追踪器名称，用于存储操作事件的OBS桶名称和OBS桶中的事件文件前缀。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTrackersRequest 请求对象
     * @return ListTrackersResponse
     */
    public ListTrackersResponse listTrackers(ListTrackersRequest request) {
        return hcClient.syncInvokeHttp(request, CtsMeta.listTrackers);
    }

    /**
     * 查询追踪器
     *
     * 开通云审计服务成功后，您可以在追踪器信息页面查看追踪器的详细信息。详细信息主要包括追踪器名称，用于存储操作事件的OBS桶名称和OBS桶中的事件文件前缀。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTrackersRequest 请求对象
     * @return SyncInvoker<ListTrackersRequest, ListTrackersResponse>
     */
    public SyncInvoker<ListTrackersRequest, ListTrackersResponse> listTrackersInvoker(ListTrackersRequest request) {
        return new SyncInvoker<>(request, CtsMeta.listTrackers, hcClient);
    }

    /**
     * 查询30天事件的操作用户列表
     *
     * 查询30天事件的操作用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserResourcesRequest 请求对象
     * @return ListUserResourcesResponse
     */
    public ListUserResourcesResponse listUserResources(ListUserResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, CtsMeta.listUserResources);
    }

    /**
     * 查询30天事件的操作用户列表
     *
     * 查询30天事件的操作用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserResourcesRequest 请求对象
     * @return SyncInvoker<ListUserResourcesRequest, ListUserResourcesResponse>
     */
    public SyncInvoker<ListUserResourcesRequest, ListUserResourcesResponse> listUserResourcesInvoker(
        ListUserResourcesRequest request) {
        return new SyncInvoker<>(request, CtsMeta.listUserResources, hcClient);
    }

    /**
     * 修改关键操作通知
     *
     * 云审计服务支持修改已创建关键操作通知配置项，通过notification_id的字段匹配修改对象，notification_id必须已经存在。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNotificationRequest 请求对象
     * @return UpdateNotificationResponse
     */
    public UpdateNotificationResponse updateNotification(UpdateNotificationRequest request) {
        return hcClient.syncInvokeHttp(request, CtsMeta.updateNotification);
    }

    /**
     * 修改关键操作通知
     *
     * 云审计服务支持修改已创建关键操作通知配置项，通过notification_id的字段匹配修改对象，notification_id必须已经存在。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNotificationRequest 请求对象
     * @return SyncInvoker<UpdateNotificationRequest, UpdateNotificationResponse>
     */
    public SyncInvoker<UpdateNotificationRequest, UpdateNotificationResponse> updateNotificationInvoker(
        UpdateNotificationRequest request) {
        return new SyncInvoker<>(request, CtsMeta.updateNotification, hcClient);
    }

    /**
     * 修改追踪器
     *
     * 云审计服务支持修改已创建追踪器的配置项，包括OBS桶转储、关键事件通知、事件转储加密、通过LTS对管理类事件进行检索、事件文件完整性校验以及追踪器启停状态等相关参数，修改追踪器对已有的操作记录没有影响。修改追踪器完成后，系统立即以新的规则开始记录操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTrackerRequest 请求对象
     * @return UpdateTrackerResponse
     */
    public UpdateTrackerResponse updateTracker(UpdateTrackerRequest request) {
        return hcClient.syncInvokeHttp(request, CtsMeta.updateTracker);
    }

    /**
     * 修改追踪器
     *
     * 云审计服务支持修改已创建追踪器的配置项，包括OBS桶转储、关键事件通知、事件转储加密、通过LTS对管理类事件进行检索、事件文件完整性校验以及追踪器启停状态等相关参数，修改追踪器对已有的操作记录没有影响。修改追踪器完成后，系统立即以新的规则开始记录操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTrackerRequest 请求对象
     * @return SyncInvoker<UpdateTrackerRequest, UpdateTrackerResponse>
     */
    public SyncInvoker<UpdateTrackerRequest, UpdateTrackerResponse> updateTrackerInvoker(UpdateTrackerRequest request) {
        return new SyncInvoker<>(request, CtsMeta.updateTracker, hcClient);
    }

}
