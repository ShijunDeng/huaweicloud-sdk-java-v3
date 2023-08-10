package com.huaweicloud.sdk.eg.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.eg.v2.model.PutEventsRequest;
import com.huaweicloud.sdk.eg.v2.model.PutEventsResponse;

public class EgClient {

    protected HcClient hcClient;

    public EgClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<EgClient> newBuilder() {
        ClientBuilder<EgClient> clientBuilder = new ClientBuilder<>(EgClient::new);
        return clientBuilder;
    }

    /**
     * 用户自定义事件集成入口
     *
     * 用户自定义事件集成入口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PutEventsRequest 请求对象
     * @return PutEventsResponse
     */
    public PutEventsResponse putEvents(PutEventsRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.putEvents);
    }

    /**
     * 用户自定义事件集成入口
     *
     * 用户自定义事件集成入口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PutEventsRequest 请求对象
     * @return SyncInvoker<PutEventsRequest, PutEventsResponse>
     */
    public SyncInvoker<PutEventsRequest, PutEventsResponse> putEventsInvoker(PutEventsRequest request) {
        return new SyncInvoker<PutEventsRequest, PutEventsResponse>(request, EgMeta.putEvents, hcClient);
    }

}
