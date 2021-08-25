package com.huaweicloud.sdk.frs.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.frs.v2.model.*;

import java.util.concurrent.CompletableFuture;

public class FrsAsyncClient {

    protected HcClient hcClient;

    public FrsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<FrsAsyncClient> newBuilder() {
        return new ClientBuilder<>(FrsAsyncClient::new);
    }

    /** 添加人脸 添加人脸到人脸库中，检测到传入的单张图片中存在多少张人脸，则增加多少张人脸到人脸库当中。
     *
     * @param AddFacesByBase64Request 请求对象
     * @return CompletableFuture<AddFacesByBase64Response> */
    public CompletableFuture<AddFacesByBase64Response> addFacesByBase64Async(AddFacesByBase64Request request) {
        return hcClient.asyncInvokeHttp(request, FrsMeta.addFacesByBase64);
    }

    /** 添加人脸 添加人脸到人脸库中，检测到传入的单张图片中存在多少张人脸，则增加多少张人脸到人脸库当中。
     *
     * @param AddFacesByBase64Request 请求对象
     * @return AsyncInvoker<AddFacesByBase64Request, AddFacesByBase64Response> */
    public AsyncInvoker<AddFacesByBase64Request, AddFacesByBase64Response> addFacesByBase64AsyncInvoker(
        AddFacesByBase64Request request) {
        return new AsyncInvoker<AddFacesByBase64Request, AddFacesByBase64Response>(request, FrsMeta.addFacesByBase64,
            hcClient);
    }

    /** 添加人脸 添加人脸到人脸库中，检测到传入的单张图片中存在多少张人脸，则增加多少张人脸到人脸库当中。
     *
     * @param AddFacesByFileRequest 请求对象
     * @return CompletableFuture<AddFacesByFileResponse> */
    public CompletableFuture<AddFacesByFileResponse> addFacesByFileAsync(AddFacesByFileRequest request) {
        return hcClient.asyncInvokeHttp(request, FrsMeta.addFacesByFile);
    }

    /** 添加人脸 添加人脸到人脸库中，检测到传入的单张图片中存在多少张人脸，则增加多少张人脸到人脸库当中。
     *
     * @param AddFacesByFileRequest 请求对象
     * @return AsyncInvoker<AddFacesByFileRequest, AddFacesByFileResponse> */
    public AsyncInvoker<AddFacesByFileRequest, AddFacesByFileResponse> addFacesByFileAsyncInvoker(
        AddFacesByFileRequest request) {
        return new AsyncInvoker<AddFacesByFileRequest, AddFacesByFileResponse>(request, FrsMeta.addFacesByFile,
            hcClient);
    }

    /** 添加人脸 添加人脸到人脸库中，检测到传入的单张图片中存在多少张人脸，则增加多少张人脸到人脸库当中。
     *
     * @param AddFacesByUrlRequest 请求对象
     * @return CompletableFuture<AddFacesByUrlResponse> */
    public CompletableFuture<AddFacesByUrlResponse> addFacesByUrlAsync(AddFacesByUrlRequest request) {
        return hcClient.asyncInvokeHttp(request, FrsMeta.addFacesByUrl);
    }

    /** 添加人脸 添加人脸到人脸库中，检测到传入的单张图片中存在多少张人脸，则增加多少张人脸到人脸库当中。
     *
     * @param AddFacesByUrlRequest 请求对象
     * @return AsyncInvoker<AddFacesByUrlRequest, AddFacesByUrlResponse> */
    public AsyncInvoker<AddFacesByUrlRequest, AddFacesByUrlResponse> addFacesByUrlAsyncInvoker(
        AddFacesByUrlRequest request) {
        return new AsyncInvoker<AddFacesByUrlRequest, AddFacesByUrlResponse>(request, FrsMeta.addFacesByUrl, hcClient);
    }

    /** 批量删除人脸 自定义筛选条件，批量删除人脸库中的符合指定条件的多张人脸。
     *
     * @param BatchDeleteFacesRequest 请求对象
     * @return CompletableFuture<BatchDeleteFacesResponse> */
    public CompletableFuture<BatchDeleteFacesResponse> batchDeleteFacesAsync(BatchDeleteFacesRequest request) {
        return hcClient.asyncInvokeHttp(request, FrsMeta.batchDeleteFaces);
    }

    /** 批量删除人脸 自定义筛选条件，批量删除人脸库中的符合指定条件的多张人脸。
     *
     * @param BatchDeleteFacesRequest 请求对象
     * @return AsyncInvoker<BatchDeleteFacesRequest, BatchDeleteFacesResponse> */
    public AsyncInvoker<BatchDeleteFacesRequest, BatchDeleteFacesResponse> batchDeleteFacesAsyncInvoker(
        BatchDeleteFacesRequest request) {
        return new AsyncInvoker<BatchDeleteFacesRequest, BatchDeleteFacesResponse>(request, FrsMeta.batchDeleteFaces,
            hcClient);
    }

    /** 人脸比对 人脸比对是将两个人脸进行比对，来判断是否为同一个人，返回比对置信度。如果传入的图片中包含多个人脸，选取最大的人脸进行比对。
     *
     * @param CompareFaceByBase64Request 请求对象
     * @return CompletableFuture<CompareFaceByBase64Response> */
    public CompletableFuture<CompareFaceByBase64Response> compareFaceByBase64Async(CompareFaceByBase64Request request) {
        return hcClient.asyncInvokeHttp(request, FrsMeta.compareFaceByBase64);
    }

    /** 人脸比对 人脸比对是将两个人脸进行比对，来判断是否为同一个人，返回比对置信度。如果传入的图片中包含多个人脸，选取最大的人脸进行比对。
     *
     * @param CompareFaceByBase64Request 请求对象
     * @return AsyncInvoker<CompareFaceByBase64Request, CompareFaceByBase64Response> */
    public AsyncInvoker<CompareFaceByBase64Request, CompareFaceByBase64Response> compareFaceByBase64AsyncInvoker(
        CompareFaceByBase64Request request) {
        return new AsyncInvoker<CompareFaceByBase64Request, CompareFaceByBase64Response>(request,
            FrsMeta.compareFaceByBase64, hcClient);
    }

    /** 人脸比对 人脸比对是将两个人脸进行比对，来判断是否为同一个人，返回比对置信度。如果传入的图片中包含多个人脸，选取最大的人脸进行比对。
     *
     * @param CompareFaceByFileRequest 请求对象
     * @return CompletableFuture<CompareFaceByFileResponse> */
    public CompletableFuture<CompareFaceByFileResponse> compareFaceByFileAsync(CompareFaceByFileRequest request) {
        return hcClient.asyncInvokeHttp(request, FrsMeta.compareFaceByFile);
    }

    /** 人脸比对 人脸比对是将两个人脸进行比对，来判断是否为同一个人，返回比对置信度。如果传入的图片中包含多个人脸，选取最大的人脸进行比对。
     *
     * @param CompareFaceByFileRequest 请求对象
     * @return AsyncInvoker<CompareFaceByFileRequest, CompareFaceByFileResponse> */
    public AsyncInvoker<CompareFaceByFileRequest, CompareFaceByFileResponse> compareFaceByFileAsyncInvoker(
        CompareFaceByFileRequest request) {
        return new AsyncInvoker<CompareFaceByFileRequest, CompareFaceByFileResponse>(request, FrsMeta.compareFaceByFile,
            hcClient);
    }

    /** 人脸比对 人脸比对是将两个人脸进行比对，来判断是否为同一个人，返回比对置信度。如果传入的图片中包含多个人脸，选取最大的人脸进行比对。
     *
     * @param CompareFaceByUrlRequest 请求对象
     * @return CompletableFuture<CompareFaceByUrlResponse> */
    public CompletableFuture<CompareFaceByUrlResponse> compareFaceByUrlAsync(CompareFaceByUrlRequest request) {
        return hcClient.asyncInvokeHttp(request, FrsMeta.compareFaceByUrl);
    }

    /** 人脸比对 人脸比对是将两个人脸进行比对，来判断是否为同一个人，返回比对置信度。如果传入的图片中包含多个人脸，选取最大的人脸进行比对。
     *
     * @param CompareFaceByUrlRequest 请求对象
     * @return AsyncInvoker<CompareFaceByUrlRequest, CompareFaceByUrlResponse> */
    public AsyncInvoker<CompareFaceByUrlRequest, CompareFaceByUrlResponse> compareFaceByUrlAsyncInvoker(
        CompareFaceByUrlRequest request) {
        return new AsyncInvoker<CompareFaceByUrlRequest, CompareFaceByUrlResponse>(request, FrsMeta.compareFaceByUrl,
            hcClient);
    }

    /** 创建人脸库 创建用于存储人脸特征的人脸库。您最多可以创建10个人脸库，每个人脸库最大容量为10万个人脸特征。如有更大规格的需求请联系客服。
     *
     * @param CreateFaceSetRequest 请求对象
     * @return CompletableFuture<CreateFaceSetResponse> */
    public CompletableFuture<CreateFaceSetResponse> createFaceSetAsync(CreateFaceSetRequest request) {
        return hcClient.asyncInvokeHttp(request, FrsMeta.createFaceSet);
    }

    /** 创建人脸库 创建用于存储人脸特征的人脸库。您最多可以创建10个人脸库，每个人脸库最大容量为10万个人脸特征。如有更大规格的需求请联系客服。
     *
     * @param CreateFaceSetRequest 请求对象
     * @return AsyncInvoker<CreateFaceSetRequest, CreateFaceSetResponse> */
    public AsyncInvoker<CreateFaceSetRequest, CreateFaceSetResponse> createFaceSetAsyncInvoker(
        CreateFaceSetRequest request) {
        return new AsyncInvoker<CreateFaceSetRequest, CreateFaceSetResponse>(request, FrsMeta.createFaceSet, hcClient);
    }

    /** 删除人脸 根据external_image_id删除人脸。
     *
     * @param DeleteFaceByExternalImageIdRequest 请求对象
     * @return CompletableFuture<DeleteFaceByExternalImageIdResponse> */
    public CompletableFuture<DeleteFaceByExternalImageIdResponse> deleteFaceByExternalImageIdAsync(
        DeleteFaceByExternalImageIdRequest request) {
        return hcClient.asyncInvokeHttp(request, FrsMeta.deleteFaceByExternalImageId);
    }

    /** 删除人脸 根据external_image_id删除人脸。
     *
     * @param DeleteFaceByExternalImageIdRequest 请求对象
     * @return AsyncInvoker<DeleteFaceByExternalImageIdRequest, DeleteFaceByExternalImageIdResponse> */
    public AsyncInvoker<DeleteFaceByExternalImageIdRequest, DeleteFaceByExternalImageIdResponse> deleteFaceByExternalImageIdAsyncInvoker(
        DeleteFaceByExternalImageIdRequest request) {
        return new AsyncInvoker<DeleteFaceByExternalImageIdRequest, DeleteFaceByExternalImageIdResponse>(request,
            FrsMeta.deleteFaceByExternalImageId, hcClient);
    }

    /** 删除人脸 根据face_id删除人脸。
     *
     * @param DeleteFaceByFaceIdRequest 请求对象
     * @return CompletableFuture<DeleteFaceByFaceIdResponse> */
    public CompletableFuture<DeleteFaceByFaceIdResponse> deleteFaceByFaceIdAsync(DeleteFaceByFaceIdRequest request) {
        return hcClient.asyncInvokeHttp(request, FrsMeta.deleteFaceByFaceId);
    }

    /** 删除人脸 根据face_id删除人脸。
     *
     * @param DeleteFaceByFaceIdRequest 请求对象
     * @return AsyncInvoker<DeleteFaceByFaceIdRequest, DeleteFaceByFaceIdResponse> */
    public AsyncInvoker<DeleteFaceByFaceIdRequest, DeleteFaceByFaceIdResponse> deleteFaceByFaceIdAsyncInvoker(
        DeleteFaceByFaceIdRequest request) {
        return new AsyncInvoker<DeleteFaceByFaceIdRequest, DeleteFaceByFaceIdResponse>(request,
            FrsMeta.deleteFaceByFaceId, hcClient);
    }

    /** 删除人脸库 删除人脸库以及其中所有的人脸。
     *
     * @param DeleteFaceSetRequest 请求对象
     * @return CompletableFuture<DeleteFaceSetResponse> */
    public CompletableFuture<DeleteFaceSetResponse> deleteFaceSetAsync(DeleteFaceSetRequest request) {
        return hcClient.asyncInvokeHttp(request, FrsMeta.deleteFaceSet);
    }

    /** 删除人脸库 删除人脸库以及其中所有的人脸。
     *
     * @param DeleteFaceSetRequest 请求对象
     * @return AsyncInvoker<DeleteFaceSetRequest, DeleteFaceSetResponse> */
    public AsyncInvoker<DeleteFaceSetRequest, DeleteFaceSetResponse> deleteFaceSetAsyncInvoker(
        DeleteFaceSetRequest request) {
        return new AsyncInvoker<DeleteFaceSetRequest, DeleteFaceSetResponse>(request, FrsMeta.deleteFaceSet, hcClient);
    }

    /** 人脸检测 人脸检测是对输入图片进行人脸检测和分析，输出人脸在图像中的位置、人脸关键点位置和人脸关键属性。
     *
     * @param DetectFaceByBase64Request 请求对象
     * @return CompletableFuture<DetectFaceByBase64Response> */
    public CompletableFuture<DetectFaceByBase64Response> detectFaceByBase64Async(DetectFaceByBase64Request request) {
        return hcClient.asyncInvokeHttp(request, FrsMeta.detectFaceByBase64);
    }

    /** 人脸检测 人脸检测是对输入图片进行人脸检测和分析，输出人脸在图像中的位置、人脸关键点位置和人脸关键属性。
     *
     * @param DetectFaceByBase64Request 请求对象
     * @return AsyncInvoker<DetectFaceByBase64Request, DetectFaceByBase64Response> */
    public AsyncInvoker<DetectFaceByBase64Request, DetectFaceByBase64Response> detectFaceByBase64AsyncInvoker(
        DetectFaceByBase64Request request) {
        return new AsyncInvoker<DetectFaceByBase64Request, DetectFaceByBase64Response>(request,
            FrsMeta.detectFaceByBase64, hcClient);
    }

    /** 人脸检测 人脸检测是对输入图片进行人脸检测和分析，输出人脸在图像中的位置、人脸关键点位置和人脸关键属性。
     *
     * @param DetectFaceByFileRequest 请求对象
     * @return CompletableFuture<DetectFaceByFileResponse> */
    public CompletableFuture<DetectFaceByFileResponse> detectFaceByFileAsync(DetectFaceByFileRequest request) {
        return hcClient.asyncInvokeHttp(request, FrsMeta.detectFaceByFile);
    }

    /** 人脸检测 人脸检测是对输入图片进行人脸检测和分析，输出人脸在图像中的位置、人脸关键点位置和人脸关键属性。
     *
     * @param DetectFaceByFileRequest 请求对象
     * @return AsyncInvoker<DetectFaceByFileRequest, DetectFaceByFileResponse> */
    public AsyncInvoker<DetectFaceByFileRequest, DetectFaceByFileResponse> detectFaceByFileAsyncInvoker(
        DetectFaceByFileRequest request) {
        return new AsyncInvoker<DetectFaceByFileRequest, DetectFaceByFileResponse>(request, FrsMeta.detectFaceByFile,
            hcClient);
    }

    /** 人脸检测 人脸检测是对输入图片进行人脸检测和分析，输出人脸在图像中的位置、人脸关键点位置和人脸关键属性。
     *
     * @param DetectFaceByUrlRequest 请求对象
     * @return CompletableFuture<DetectFaceByUrlResponse> */
    public CompletableFuture<DetectFaceByUrlResponse> detectFaceByUrlAsync(DetectFaceByUrlRequest request) {
        return hcClient.asyncInvokeHttp(request, FrsMeta.detectFaceByUrl);
    }

    /** 人脸检测 人脸检测是对输入图片进行人脸检测和分析，输出人脸在图像中的位置、人脸关键点位置和人脸关键属性。
     *
     * @param DetectFaceByUrlRequest 请求对象
     * @return AsyncInvoker<DetectFaceByUrlRequest, DetectFaceByUrlResponse> */
    public AsyncInvoker<DetectFaceByUrlRequest, DetectFaceByUrlResponse> detectFaceByUrlAsyncInvoker(
        DetectFaceByUrlRequest request) {
        return new AsyncInvoker<DetectFaceByUrlRequest, DetectFaceByUrlResponse>(request, FrsMeta.detectFaceByUrl,
            hcClient);
    }

    /** 人脸搜索 人脸搜索是指在已有的人脸库中，查询与目标人脸相似的一张或者多张人脸，并返回相应的置信度。 支持传入图片或者faceID进行人脸搜索，如果传入的是多张人脸图片，选取图片中检测到的最大尺寸人脸作为检索的输入。
     *
     * @param SearchFaceByBase64Request 请求对象
     * @return CompletableFuture<SearchFaceByBase64Response> */
    public CompletableFuture<SearchFaceByBase64Response> searchFaceByBase64Async(SearchFaceByBase64Request request) {
        return hcClient.asyncInvokeHttp(request, FrsMeta.searchFaceByBase64);
    }

    /** 人脸搜索 人脸搜索是指在已有的人脸库中，查询与目标人脸相似的一张或者多张人脸，并返回相应的置信度。 支持传入图片或者faceID进行人脸搜索，如果传入的是多张人脸图片，选取图片中检测到的最大尺寸人脸作为检索的输入。
     *
     * @param SearchFaceByBase64Request 请求对象
     * @return AsyncInvoker<SearchFaceByBase64Request, SearchFaceByBase64Response> */
    public AsyncInvoker<SearchFaceByBase64Request, SearchFaceByBase64Response> searchFaceByBase64AsyncInvoker(
        SearchFaceByBase64Request request) {
        return new AsyncInvoker<SearchFaceByBase64Request, SearchFaceByBase64Response>(request,
            FrsMeta.searchFaceByBase64, hcClient);
    }

    /** 人脸搜索 人脸搜索是指在已有的人脸库中，查询与目标人脸相似的一张或者多张人脸，并返回相应的置信度。 支持传入图片或者faceID进行人脸搜索，如果传入的是多张人脸图片，选取图片中检测到的最大尺寸人脸作为检索的输入。
     *
     * @param SearchFaceByFaceIdRequest 请求对象
     * @return CompletableFuture<SearchFaceByFaceIdResponse> */
    public CompletableFuture<SearchFaceByFaceIdResponse> searchFaceByFaceIdAsync(SearchFaceByFaceIdRequest request) {
        return hcClient.asyncInvokeHttp(request, FrsMeta.searchFaceByFaceId);
    }

    /** 人脸搜索 人脸搜索是指在已有的人脸库中，查询与目标人脸相似的一张或者多张人脸，并返回相应的置信度。 支持传入图片或者faceID进行人脸搜索，如果传入的是多张人脸图片，选取图片中检测到的最大尺寸人脸作为检索的输入。
     *
     * @param SearchFaceByFaceIdRequest 请求对象
     * @return AsyncInvoker<SearchFaceByFaceIdRequest, SearchFaceByFaceIdResponse> */
    public AsyncInvoker<SearchFaceByFaceIdRequest, SearchFaceByFaceIdResponse> searchFaceByFaceIdAsyncInvoker(
        SearchFaceByFaceIdRequest request) {
        return new AsyncInvoker<SearchFaceByFaceIdRequest, SearchFaceByFaceIdResponse>(request,
            FrsMeta.searchFaceByFaceId, hcClient);
    }

    /** 人脸搜索 人脸搜索是指在已有的人脸库中，查询与目标人脸相似的一张或者多张人脸，并返回相应的置信度。 支持传入图片或者faceID进行人脸搜索，如果传入的是多张人脸图片，选取图片中检测到的最大尺寸人脸作为检索的输入。
     *
     * @param SearchFaceByFileRequest 请求对象
     * @return CompletableFuture<SearchFaceByFileResponse> */
    public CompletableFuture<SearchFaceByFileResponse> searchFaceByFileAsync(SearchFaceByFileRequest request) {
        return hcClient.asyncInvokeHttp(request, FrsMeta.searchFaceByFile);
    }

    /** 人脸搜索 人脸搜索是指在已有的人脸库中，查询与目标人脸相似的一张或者多张人脸，并返回相应的置信度。 支持传入图片或者faceID进行人脸搜索，如果传入的是多张人脸图片，选取图片中检测到的最大尺寸人脸作为检索的输入。
     *
     * @param SearchFaceByFileRequest 请求对象
     * @return AsyncInvoker<SearchFaceByFileRequest, SearchFaceByFileResponse> */
    public AsyncInvoker<SearchFaceByFileRequest, SearchFaceByFileResponse> searchFaceByFileAsyncInvoker(
        SearchFaceByFileRequest request) {
        return new AsyncInvoker<SearchFaceByFileRequest, SearchFaceByFileResponse>(request, FrsMeta.searchFaceByFile,
            hcClient);
    }

    /** 人脸搜索 人脸搜索是指在已有的人脸库中，查询与目标人脸相似的一张或者多张人脸，并返回相应的置信度。 支持传入图片或者faceID进行人脸搜索，如果传入的是多张人脸图片，选取图片中检测到的最大尺寸人脸作为检索的输入。
     *
     * @param SearchFaceByUrlRequest 请求对象
     * @return CompletableFuture<SearchFaceByUrlResponse> */
    public CompletableFuture<SearchFaceByUrlResponse> searchFaceByUrlAsync(SearchFaceByUrlRequest request) {
        return hcClient.asyncInvokeHttp(request, FrsMeta.searchFaceByUrl);
    }

    /** 人脸搜索 人脸搜索是指在已有的人脸库中，查询与目标人脸相似的一张或者多张人脸，并返回相应的置信度。 支持传入图片或者faceID进行人脸搜索，如果传入的是多张人脸图片，选取图片中检测到的最大尺寸人脸作为检索的输入。
     *
     * @param SearchFaceByUrlRequest 请求对象
     * @return AsyncInvoker<SearchFaceByUrlRequest, SearchFaceByUrlResponse> */
    public AsyncInvoker<SearchFaceByUrlRequest, SearchFaceByUrlResponse> searchFaceByUrlAsyncInvoker(
        SearchFaceByUrlRequest request) {
        return new AsyncInvoker<SearchFaceByUrlRequest, SearchFaceByUrlResponse>(request, FrsMeta.searchFaceByUrl,
            hcClient);
    }

    /** 查询所有人脸库 查询当前用户所有人脸库的状态信息。
     *
     * @param ShowAllFaceSetsRequest 请求对象
     * @return CompletableFuture<ShowAllFaceSetsResponse> */
    public CompletableFuture<ShowAllFaceSetsResponse> showAllFaceSetsAsync(ShowAllFaceSetsRequest request) {
        return hcClient.asyncInvokeHttp(request, FrsMeta.showAllFaceSets);
    }

    /** 查询所有人脸库 查询当前用户所有人脸库的状态信息。
     *
     * @param ShowAllFaceSetsRequest 请求对象
     * @return AsyncInvoker<ShowAllFaceSetsRequest, ShowAllFaceSetsResponse> */
    public AsyncInvoker<ShowAllFaceSetsRequest, ShowAllFaceSetsResponse> showAllFaceSetsAsyncInvoker(
        ShowAllFaceSetsRequest request) {
        return new AsyncInvoker<ShowAllFaceSetsRequest, ShowAllFaceSetsResponse>(request, FrsMeta.showAllFaceSets,
            hcClient);
    }

    /** 查询人脸库 查询人脸库当前的状态。
     *
     * @param ShowFaceSetRequest 请求对象
     * @return CompletableFuture<ShowFaceSetResponse> */
    public CompletableFuture<ShowFaceSetResponse> showFaceSetAsync(ShowFaceSetRequest request) {
        return hcClient.asyncInvokeHttp(request, FrsMeta.showFaceSet);
    }

    /** 查询人脸库 查询人脸库当前的状态。
     *
     * @param ShowFaceSetRequest 请求对象
     * @return AsyncInvoker<ShowFaceSetRequest, ShowFaceSetResponse> */
    public AsyncInvoker<ShowFaceSetRequest, ShowFaceSetResponse> showFaceSetAsyncInvoker(ShowFaceSetRequest request) {
        return new AsyncInvoker<ShowFaceSetRequest, ShowFaceSetResponse>(request, FrsMeta.showFaceSet, hcClient);
    }

    /** 查询人脸 查询指定人脸库中人脸信息。
     *
     * @param ShowFacesByFaceIdRequest 请求对象
     * @return CompletableFuture<ShowFacesByFaceIdResponse> */
    public CompletableFuture<ShowFacesByFaceIdResponse> showFacesByFaceIdAsync(ShowFacesByFaceIdRequest request) {
        return hcClient.asyncInvokeHttp(request, FrsMeta.showFacesByFaceId);
    }

    /** 查询人脸 查询指定人脸库中人脸信息。
     *
     * @param ShowFacesByFaceIdRequest 请求对象
     * @return AsyncInvoker<ShowFacesByFaceIdRequest, ShowFacesByFaceIdResponse> */
    public AsyncInvoker<ShowFacesByFaceIdRequest, ShowFacesByFaceIdResponse> showFacesByFaceIdAsyncInvoker(
        ShowFacesByFaceIdRequest request) {
        return new AsyncInvoker<ShowFacesByFaceIdRequest, ShowFacesByFaceIdResponse>(request, FrsMeta.showFacesByFaceId,
            hcClient);
    }

    /** 查询人脸 查询指定人脸库中人脸信息。
     *
     * @param ShowFacesByLimitRequest 请求对象
     * @return CompletableFuture<ShowFacesByLimitResponse> */
    public CompletableFuture<ShowFacesByLimitResponse> showFacesByLimitAsync(ShowFacesByLimitRequest request) {
        return hcClient.asyncInvokeHttp(request, FrsMeta.showFacesByLimit);
    }

    /** 查询人脸 查询指定人脸库中人脸信息。
     *
     * @param ShowFacesByLimitRequest 请求对象
     * @return AsyncInvoker<ShowFacesByLimitRequest, ShowFacesByLimitResponse> */
    public AsyncInvoker<ShowFacesByLimitRequest, ShowFacesByLimitResponse> showFacesByLimitAsyncInvoker(
        ShowFacesByLimitRequest request) {
        return new AsyncInvoker<ShowFacesByLimitRequest, ShowFacesByLimitResponse>(request, FrsMeta.showFacesByLimit,
            hcClient);
    }

    /** 更新人脸 根据人脸ID（face_id）更新单张人脸信息。
     *
     * @param UpdateFaceRequest 请求对象
     * @return CompletableFuture<UpdateFaceResponse> */
    public CompletableFuture<UpdateFaceResponse> updateFaceAsync(UpdateFaceRequest request) {
        return hcClient.asyncInvokeHttp(request, FrsMeta.updateFace);
    }

    /** 更新人脸 根据人脸ID（face_id）更新单张人脸信息。
     *
     * @param UpdateFaceRequest 请求对象
     * @return AsyncInvoker<UpdateFaceRequest, UpdateFaceResponse> */
    public AsyncInvoker<UpdateFaceRequest, UpdateFaceResponse> updateFaceAsyncInvoker(UpdateFaceRequest request) {
        return new AsyncInvoker<UpdateFaceRequest, UpdateFaceResponse>(request, FrsMeta.updateFace, hcClient);
    }

}