package com.huaweicloud.sdk.codeartsartifact.v2;

import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowProjectReleaseFilesRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowProjectReleaseFilesResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowReleaseProjectFilesRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowReleaseProjectFilesResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class CodeArtsArtifactClient {

    protected HcClient hcClient;

    public CodeArtsArtifactClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CodeArtsArtifactClient> newBuilder() {
        ClientBuilder<CodeArtsArtifactClient> clientBuilder = new ClientBuilder<>(CodeArtsArtifactClient::new);
        return clientBuilder;
    }

    /**
     * 获取项目下文件版本信息列表
     *
     * 获取项目下文件版本信息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowProjectReleaseFilesRequest 请求对象
     * @return ShowProjectReleaseFilesResponse
     */
    public ShowProjectReleaseFilesResponse showProjectReleaseFiles(ShowProjectReleaseFilesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsArtifactMeta.showProjectReleaseFiles);
    }

    /**
     * 获取项目下文件版本信息列表
     *
     * 获取项目下文件版本信息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowProjectReleaseFilesRequest 请求对象
     * @return SyncInvoker<ShowProjectReleaseFilesRequest, ShowProjectReleaseFilesResponse>
     */
    public SyncInvoker<ShowProjectReleaseFilesRequest, ShowProjectReleaseFilesResponse> showProjectReleaseFilesInvoker(
        ShowProjectReleaseFilesRequest request) {
        return new SyncInvoker<ShowProjectReleaseFilesRequest, ShowProjectReleaseFilesResponse>(request,
            CodeArtsArtifactMeta.showProjectReleaseFiles, hcClient);
    }

    /**
     * 获取项目下文件版本信息列表
     *
     * 获取项目下文件版本信息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowReleaseProjectFilesRequest 请求对象
     * @return ShowReleaseProjectFilesResponse
     */
    @Deprecated
    public ShowReleaseProjectFilesResponse showReleaseProjectFiles(ShowReleaseProjectFilesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsArtifactMeta.showReleaseProjectFiles);
    }

    /**
     * 获取项目下文件版本信息列表
     *
     * 获取项目下文件版本信息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowReleaseProjectFilesRequest 请求对象
     * @return SyncInvoker<ShowReleaseProjectFilesRequest, ShowReleaseProjectFilesResponse>
     */
    @Deprecated
    public SyncInvoker<ShowReleaseProjectFilesRequest, ShowReleaseProjectFilesResponse> showReleaseProjectFilesInvoker(
        ShowReleaseProjectFilesRequest request) {
        return new SyncInvoker<ShowReleaseProjectFilesRequest, ShowReleaseProjectFilesResponse>(request,
            CodeArtsArtifactMeta.showReleaseProjectFiles, hcClient);
    }

}
