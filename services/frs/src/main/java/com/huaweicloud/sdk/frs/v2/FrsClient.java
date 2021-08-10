package com.huaweicloud.sdk.frs.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.frs.v2.model.*;

public class FrsClient {

    protected HcClient hcClient;

    public FrsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<FrsClient> newBuilder() {
        return new ClientBuilder<>(FrsClient::new);
    }

    /** 添加人脸 添加人脸到人脸库中，检测到传入的单张图片中存在多少张人脸，则增加多少张人脸到人脸库当中。
     *
     * @param AddFacesByBase64Request 请求对象
     * @return AddFacesByBase64Response */
    public AddFacesByBase64Response addFacesByBase64(AddFacesByBase64Request request) {
        return hcClient.syncInvokeHttp(request, FrsMeta.addFacesByBase64);
    }

    /** 添加人脸 添加人脸到人脸库中，检测到传入的单张图片中存在多少张人脸，则增加多少张人脸到人脸库当中。
     *
     * @param AddFacesByBase64Request 请求对象
     * @return SyncInvoker<AddFacesByBase64Request, AddFacesByBase64Response> */
    public SyncInvoker<AddFacesByBase64Request, AddFacesByBase64Response> addFacesByBase64Invoker(
        AddFacesByBase64Request request) {
        return new SyncInvoker<AddFacesByBase64Request, AddFacesByBase64Response>(request, FrsMeta.addFacesByBase64,
            hcClient);
    }

    /** 添加人脸 添加人脸到人脸库中，检测到传入的单张图片中存在多少张人脸，则增加多少张人脸到人脸库当中。
     *
     * @param AddFacesByFileRequest 请求对象
     * @return AddFacesByFileResponse */
    public AddFacesByFileResponse addFacesByFile(AddFacesByFileRequest request) {
        return hcClient.syncInvokeHttp(request, FrsMeta.addFacesByFile);
    }

    /** 添加人脸 添加人脸到人脸库中，检测到传入的单张图片中存在多少张人脸，则增加多少张人脸到人脸库当中。
     *
     * @param AddFacesByFileRequest 请求对象
     * @return SyncInvoker<AddFacesByFileRequest, AddFacesByFileResponse> */
    public SyncInvoker<AddFacesByFileRequest, AddFacesByFileResponse> addFacesByFileInvoker(
        AddFacesByFileRequest request) {
        return new SyncInvoker<AddFacesByFileRequest, AddFacesByFileResponse>(request, FrsMeta.addFacesByFile,
            hcClient);
    }

    /** 添加人脸 添加人脸到人脸库中，检测到传入的单张图片中存在多少张人脸，则增加多少张人脸到人脸库当中。
     *
     * @param AddFacesByUrlRequest 请求对象
     * @return AddFacesByUrlResponse */
    public AddFacesByUrlResponse addFacesByUrl(AddFacesByUrlRequest request) {
        return hcClient.syncInvokeHttp(request, FrsMeta.addFacesByUrl);
    }

    /** 添加人脸 添加人脸到人脸库中，检测到传入的单张图片中存在多少张人脸，则增加多少张人脸到人脸库当中。
     *
     * @param AddFacesByUrlRequest 请求对象
     * @return SyncInvoker<AddFacesByUrlRequest, AddFacesByUrlResponse> */
    public SyncInvoker<AddFacesByUrlRequest, AddFacesByUrlResponse> addFacesByUrlInvoker(AddFacesByUrlRequest request) {
        return new SyncInvoker<AddFacesByUrlRequest, AddFacesByUrlResponse>(request, FrsMeta.addFacesByUrl, hcClient);
    }

    /** 批量删除人脸 自定义筛选条件，批量删除人脸库中的符合指定条件的多张人脸。
     *
     * @param BatchDeleteFacesRequest 请求对象
     * @return BatchDeleteFacesResponse */
    public BatchDeleteFacesResponse batchDeleteFaces(BatchDeleteFacesRequest request) {
        return hcClient.syncInvokeHttp(request, FrsMeta.batchDeleteFaces);
    }

    /** 批量删除人脸 自定义筛选条件，批量删除人脸库中的符合指定条件的多张人脸。
     *
     * @param BatchDeleteFacesRequest 请求对象
     * @return SyncInvoker<BatchDeleteFacesRequest, BatchDeleteFacesResponse> */
    public SyncInvoker<BatchDeleteFacesRequest, BatchDeleteFacesResponse> batchDeleteFacesInvoker(
        BatchDeleteFacesRequest request) {
        return new SyncInvoker<BatchDeleteFacesRequest, BatchDeleteFacesResponse>(request, FrsMeta.batchDeleteFaces,
            hcClient);
    }

    /** 人脸比对 人脸比对是将两个人脸进行比对，来判断是否为同一个人，返回比对置信度。如果传入的图片中包含多个人脸，选取最大的人脸进行比对。
     *
     * @param CompareFaceByBase64Request 请求对象
     * @return CompareFaceByBase64Response */
    public CompareFaceByBase64Response compareFaceByBase64(CompareFaceByBase64Request request) {
        return hcClient.syncInvokeHttp(request, FrsMeta.compareFaceByBase64);
    }

    /** 人脸比对 人脸比对是将两个人脸进行比对，来判断是否为同一个人，返回比对置信度。如果传入的图片中包含多个人脸，选取最大的人脸进行比对。
     *
     * @param CompareFaceByBase64Request 请求对象
     * @return SyncInvoker<CompareFaceByBase64Request, CompareFaceByBase64Response> */
    public SyncInvoker<CompareFaceByBase64Request, CompareFaceByBase64Response> compareFaceByBase64Invoker(
        CompareFaceByBase64Request request) {
        return new SyncInvoker<CompareFaceByBase64Request, CompareFaceByBase64Response>(request,
            FrsMeta.compareFaceByBase64, hcClient);
    }

    /** 人脸比对 人脸比对是将两个人脸进行比对，来判断是否为同一个人，返回比对置信度。如果传入的图片中包含多个人脸，选取最大的人脸进行比对。
     *
     * @param CompareFaceByFileRequest 请求对象
     * @return CompareFaceByFileResponse */
    public CompareFaceByFileResponse compareFaceByFile(CompareFaceByFileRequest request) {
        return hcClient.syncInvokeHttp(request, FrsMeta.compareFaceByFile);
    }

    /** 人脸比对 人脸比对是将两个人脸进行比对，来判断是否为同一个人，返回比对置信度。如果传入的图片中包含多个人脸，选取最大的人脸进行比对。
     *
     * @param CompareFaceByFileRequest 请求对象
     * @return SyncInvoker<CompareFaceByFileRequest, CompareFaceByFileResponse> */
    public SyncInvoker<CompareFaceByFileRequest, CompareFaceByFileResponse> compareFaceByFileInvoker(
        CompareFaceByFileRequest request) {
        return new SyncInvoker<CompareFaceByFileRequest, CompareFaceByFileResponse>(request, FrsMeta.compareFaceByFile,
            hcClient);
    }

    /** 人脸比对 人脸比对是将两个人脸进行比对，来判断是否为同一个人，返回比对置信度。如果传入的图片中包含多个人脸，选取最大的人脸进行比对。
     *
     * @param CompareFaceByUrlRequest 请求对象
     * @return CompareFaceByUrlResponse */
    public CompareFaceByUrlResponse compareFaceByUrl(CompareFaceByUrlRequest request) {
        return hcClient.syncInvokeHttp(request, FrsMeta.compareFaceByUrl);
    }

    /** 人脸比对 人脸比对是将两个人脸进行比对，来判断是否为同一个人，返回比对置信度。如果传入的图片中包含多个人脸，选取最大的人脸进行比对。
     *
     * @param CompareFaceByUrlRequest 请求对象
     * @return SyncInvoker<CompareFaceByUrlRequest, CompareFaceByUrlResponse> */
    public SyncInvoker<CompareFaceByUrlRequest, CompareFaceByUrlResponse> compareFaceByUrlInvoker(
        CompareFaceByUrlRequest request) {
        return new SyncInvoker<CompareFaceByUrlRequest, CompareFaceByUrlResponse>(request, FrsMeta.compareFaceByUrl,
            hcClient);
    }

    /** 创建人脸库 创建用于存储人脸特征的人脸库。您最多可以创建10个人脸库，每个人脸库最大容量为10万个人脸特征。如有更大规格的需求请联系客服。
     *
     * @param CreateFaceSetRequest 请求对象
     * @return CreateFaceSetResponse */
    public CreateFaceSetResponse createFaceSet(CreateFaceSetRequest request) {
        return hcClient.syncInvokeHttp(request, FrsMeta.createFaceSet);
    }

    /** 创建人脸库 创建用于存储人脸特征的人脸库。您最多可以创建10个人脸库，每个人脸库最大容量为10万个人脸特征。如有更大规格的需求请联系客服。
     *
     * @param CreateFaceSetRequest 请求对象
     * @return SyncInvoker<CreateFaceSetRequest, CreateFaceSetResponse> */
    public SyncInvoker<CreateFaceSetRequest, CreateFaceSetResponse> createFaceSetInvoker(CreateFaceSetRequest request) {
        return new SyncInvoker<CreateFaceSetRequest, CreateFaceSetResponse>(request, FrsMeta.createFaceSet, hcClient);
    }

    /** 删除人脸 根据external_image_id删除人脸。
     *
     * @param DeleteFaceByExternalImageIdRequest 请求对象
     * @return DeleteFaceByExternalImageIdResponse */
    public DeleteFaceByExternalImageIdResponse deleteFaceByExternalImageId(DeleteFaceByExternalImageIdRequest request) {
        return hcClient.syncInvokeHttp(request, FrsMeta.deleteFaceByExternalImageId);
    }

    /** 删除人脸 根据external_image_id删除人脸。
     *
     * @param DeleteFaceByExternalImageIdRequest 请求对象
     * @return SyncInvoker<DeleteFaceByExternalImageIdRequest, DeleteFaceByExternalImageIdResponse> */
    public SyncInvoker<DeleteFaceByExternalImageIdRequest, DeleteFaceByExternalImageIdResponse> deleteFaceByExternalImageIdInvoker(
        DeleteFaceByExternalImageIdRequest request) {
        return new SyncInvoker<DeleteFaceByExternalImageIdRequest, DeleteFaceByExternalImageIdResponse>(request,
            FrsMeta.deleteFaceByExternalImageId, hcClient);
    }

    /** 删除人脸 根据face_id删除人脸。
     *
     * @param DeleteFaceByFaceIdRequest 请求对象
     * @return DeleteFaceByFaceIdResponse */
    public DeleteFaceByFaceIdResponse deleteFaceByFaceId(DeleteFaceByFaceIdRequest request) {
        return hcClient.syncInvokeHttp(request, FrsMeta.deleteFaceByFaceId);
    }

    /** 删除人脸 根据face_id删除人脸。
     *
     * @param DeleteFaceByFaceIdRequest 请求对象
     * @return SyncInvoker<DeleteFaceByFaceIdRequest, DeleteFaceByFaceIdResponse> */
    public SyncInvoker<DeleteFaceByFaceIdRequest, DeleteFaceByFaceIdResponse> deleteFaceByFaceIdInvoker(
        DeleteFaceByFaceIdRequest request) {
        return new SyncInvoker<DeleteFaceByFaceIdRequest, DeleteFaceByFaceIdResponse>(request,
            FrsMeta.deleteFaceByFaceId, hcClient);
    }

    /** 删除人脸库 删除人脸库以及其中所有的人脸。
     *
     * @param DeleteFaceSetRequest 请求对象
     * @return DeleteFaceSetResponse */
    public DeleteFaceSetResponse deleteFaceSet(DeleteFaceSetRequest request) {
        return hcClient.syncInvokeHttp(request, FrsMeta.deleteFaceSet);
    }

    /** 删除人脸库 删除人脸库以及其中所有的人脸。
     *
     * @param DeleteFaceSetRequest 请求对象
     * @return SyncInvoker<DeleteFaceSetRequest, DeleteFaceSetResponse> */
    public SyncInvoker<DeleteFaceSetRequest, DeleteFaceSetResponse> deleteFaceSetInvoker(DeleteFaceSetRequest request) {
        return new SyncInvoker<DeleteFaceSetRequest, DeleteFaceSetResponse>(request, FrsMeta.deleteFaceSet, hcClient);
    }

    /** 人脸检测 人脸检测是对输入图片进行人脸检测和分析，输出人脸在图像中的位置、人脸关键点位置和人脸关键属性。
     *
     * @param DetectFaceByBase64Request 请求对象
     * @return DetectFaceByBase64Response */
    public DetectFaceByBase64Response detectFaceByBase64(DetectFaceByBase64Request request) {
        return hcClient.syncInvokeHttp(request, FrsMeta.detectFaceByBase64);
    }

    /** 人脸检测 人脸检测是对输入图片进行人脸检测和分析，输出人脸在图像中的位置、人脸关键点位置和人脸关键属性。
     *
     * @param DetectFaceByBase64Request 请求对象
     * @return SyncInvoker<DetectFaceByBase64Request, DetectFaceByBase64Response> */
    public SyncInvoker<DetectFaceByBase64Request, DetectFaceByBase64Response> detectFaceByBase64Invoker(
        DetectFaceByBase64Request request) {
        return new SyncInvoker<DetectFaceByBase64Request, DetectFaceByBase64Response>(request,
            FrsMeta.detectFaceByBase64, hcClient);
    }

    /** 人脸检测 人脸检测是对输入图片进行人脸检测和分析，输出人脸在图像中的位置、人脸关键点位置和人脸关键属性。
     *
     * @param DetectFaceByFileRequest 请求对象
     * @return DetectFaceByFileResponse */
    public DetectFaceByFileResponse detectFaceByFile(DetectFaceByFileRequest request) {
        return hcClient.syncInvokeHttp(request, FrsMeta.detectFaceByFile);
    }

    /** 人脸检测 人脸检测是对输入图片进行人脸检测和分析，输出人脸在图像中的位置、人脸关键点位置和人脸关键属性。
     *
     * @param DetectFaceByFileRequest 请求对象
     * @return SyncInvoker<DetectFaceByFileRequest, DetectFaceByFileResponse> */
    public SyncInvoker<DetectFaceByFileRequest, DetectFaceByFileResponse> detectFaceByFileInvoker(
        DetectFaceByFileRequest request) {
        return new SyncInvoker<DetectFaceByFileRequest, DetectFaceByFileResponse>(request, FrsMeta.detectFaceByFile,
            hcClient);
    }

    /** 人脸检测 人脸检测是对输入图片进行人脸检测和分析，输出人脸在图像中的位置、人脸关键点位置和人脸关键属性。
     *
     * @param DetectFaceByUrlRequest 请求对象
     * @return DetectFaceByUrlResponse */
    public DetectFaceByUrlResponse detectFaceByUrl(DetectFaceByUrlRequest request) {
        return hcClient.syncInvokeHttp(request, FrsMeta.detectFaceByUrl);
    }

    /** 人脸检测 人脸检测是对输入图片进行人脸检测和分析，输出人脸在图像中的位置、人脸关键点位置和人脸关键属性。
     *
     * @param DetectFaceByUrlRequest 请求对象
     * @return SyncInvoker<DetectFaceByUrlRequest, DetectFaceByUrlResponse> */
    public SyncInvoker<DetectFaceByUrlRequest, DetectFaceByUrlResponse> detectFaceByUrlInvoker(
        DetectFaceByUrlRequest request) {
        return new SyncInvoker<DetectFaceByUrlRequest, DetectFaceByUrlResponse>(request, FrsMeta.detectFaceByUrl,
            hcClient);
    }

    /** 人脸搜索 人脸搜索是指在已有的人脸库中，查询与目标人脸相似的一张或者多张人脸，并返回相应的置信度。 支持传入图片或者faceID进行人脸搜索，如果传入的是多张人脸图片，选取图片中检测到的最大尺寸人脸作为检索的输入。
     *
     * @param SearchFaceByBase64Request 请求对象
     * @return SearchFaceByBase64Response */
    public SearchFaceByBase64Response searchFaceByBase64(SearchFaceByBase64Request request) {
        return hcClient.syncInvokeHttp(request, FrsMeta.searchFaceByBase64);
    }

    /** 人脸搜索 人脸搜索是指在已有的人脸库中，查询与目标人脸相似的一张或者多张人脸，并返回相应的置信度。 支持传入图片或者faceID进行人脸搜索，如果传入的是多张人脸图片，选取图片中检测到的最大尺寸人脸作为检索的输入。
     *
     * @param SearchFaceByBase64Request 请求对象
     * @return SyncInvoker<SearchFaceByBase64Request, SearchFaceByBase64Response> */
    public SyncInvoker<SearchFaceByBase64Request, SearchFaceByBase64Response> searchFaceByBase64Invoker(
        SearchFaceByBase64Request request) {
        return new SyncInvoker<SearchFaceByBase64Request, SearchFaceByBase64Response>(request,
            FrsMeta.searchFaceByBase64, hcClient);
    }

    /** 人脸搜索 人脸搜索是指在已有的人脸库中，查询与目标人脸相似的一张或者多张人脸，并返回相应的置信度。 支持传入图片或者faceID进行人脸搜索，如果传入的是多张人脸图片，选取图片中检测到的最大尺寸人脸作为检索的输入。
     *
     * @param SearchFaceByFaceIdRequest 请求对象
     * @return SearchFaceByFaceIdResponse */
    public SearchFaceByFaceIdResponse searchFaceByFaceId(SearchFaceByFaceIdRequest request) {
        return hcClient.syncInvokeHttp(request, FrsMeta.searchFaceByFaceId);
    }

    /** 人脸搜索 人脸搜索是指在已有的人脸库中，查询与目标人脸相似的一张或者多张人脸，并返回相应的置信度。 支持传入图片或者faceID进行人脸搜索，如果传入的是多张人脸图片，选取图片中检测到的最大尺寸人脸作为检索的输入。
     *
     * @param SearchFaceByFaceIdRequest 请求对象
     * @return SyncInvoker<SearchFaceByFaceIdRequest, SearchFaceByFaceIdResponse> */
    public SyncInvoker<SearchFaceByFaceIdRequest, SearchFaceByFaceIdResponse> searchFaceByFaceIdInvoker(
        SearchFaceByFaceIdRequest request) {
        return new SyncInvoker<SearchFaceByFaceIdRequest, SearchFaceByFaceIdResponse>(request,
            FrsMeta.searchFaceByFaceId, hcClient);
    }

    /** 人脸搜索 人脸搜索是指在已有的人脸库中，查询与目标人脸相似的一张或者多张人脸，并返回相应的置信度。 支持传入图片或者faceID进行人脸搜索，如果传入的是多张人脸图片，选取图片中检测到的最大尺寸人脸作为检索的输入。
     *
     * @param SearchFaceByFileRequest 请求对象
     * @return SearchFaceByFileResponse */
    public SearchFaceByFileResponse searchFaceByFile(SearchFaceByFileRequest request) {
        return hcClient.syncInvokeHttp(request, FrsMeta.searchFaceByFile);
    }

    /** 人脸搜索 人脸搜索是指在已有的人脸库中，查询与目标人脸相似的一张或者多张人脸，并返回相应的置信度。 支持传入图片或者faceID进行人脸搜索，如果传入的是多张人脸图片，选取图片中检测到的最大尺寸人脸作为检索的输入。
     *
     * @param SearchFaceByFileRequest 请求对象
     * @return SyncInvoker<SearchFaceByFileRequest, SearchFaceByFileResponse> */
    public SyncInvoker<SearchFaceByFileRequest, SearchFaceByFileResponse> searchFaceByFileInvoker(
        SearchFaceByFileRequest request) {
        return new SyncInvoker<SearchFaceByFileRequest, SearchFaceByFileResponse>(request, FrsMeta.searchFaceByFile,
            hcClient);
    }

    /** 人脸搜索 人脸搜索是指在已有的人脸库中，查询与目标人脸相似的一张或者多张人脸，并返回相应的置信度。 支持传入图片或者faceID进行人脸搜索，如果传入的是多张人脸图片，选取图片中检测到的最大尺寸人脸作为检索的输入。
     *
     * @param SearchFaceByUrlRequest 请求对象
     * @return SearchFaceByUrlResponse */
    public SearchFaceByUrlResponse searchFaceByUrl(SearchFaceByUrlRequest request) {
        return hcClient.syncInvokeHttp(request, FrsMeta.searchFaceByUrl);
    }

    /** 人脸搜索 人脸搜索是指在已有的人脸库中，查询与目标人脸相似的一张或者多张人脸，并返回相应的置信度。 支持传入图片或者faceID进行人脸搜索，如果传入的是多张人脸图片，选取图片中检测到的最大尺寸人脸作为检索的输入。
     *
     * @param SearchFaceByUrlRequest 请求对象
     * @return SyncInvoker<SearchFaceByUrlRequest, SearchFaceByUrlResponse> */
    public SyncInvoker<SearchFaceByUrlRequest, SearchFaceByUrlResponse> searchFaceByUrlInvoker(
        SearchFaceByUrlRequest request) {
        return new SyncInvoker<SearchFaceByUrlRequest, SearchFaceByUrlResponse>(request, FrsMeta.searchFaceByUrl,
            hcClient);
    }

    /** 查询所有人脸库 查询当前用户所有人脸库的状态信息。
     *
     * @param ShowAllFaceSetsRequest 请求对象
     * @return ShowAllFaceSetsResponse */
    public ShowAllFaceSetsResponse showAllFaceSets(ShowAllFaceSetsRequest request) {
        return hcClient.syncInvokeHttp(request, FrsMeta.showAllFaceSets);
    }

    /** 查询所有人脸库 查询当前用户所有人脸库的状态信息。
     *
     * @param ShowAllFaceSetsRequest 请求对象
     * @return SyncInvoker<ShowAllFaceSetsRequest, ShowAllFaceSetsResponse> */
    public SyncInvoker<ShowAllFaceSetsRequest, ShowAllFaceSetsResponse> showAllFaceSetsInvoker(
        ShowAllFaceSetsRequest request) {
        return new SyncInvoker<ShowAllFaceSetsRequest, ShowAllFaceSetsResponse>(request, FrsMeta.showAllFaceSets,
            hcClient);
    }

    /** 查询人脸库 查询人脸库当前的状态。
     *
     * @param ShowFaceSetRequest 请求对象
     * @return ShowFaceSetResponse */
    public ShowFaceSetResponse showFaceSet(ShowFaceSetRequest request) {
        return hcClient.syncInvokeHttp(request, FrsMeta.showFaceSet);
    }

    /** 查询人脸库 查询人脸库当前的状态。
     *
     * @param ShowFaceSetRequest 请求对象
     * @return SyncInvoker<ShowFaceSetRequest, ShowFaceSetResponse> */
    public SyncInvoker<ShowFaceSetRequest, ShowFaceSetResponse> showFaceSetInvoker(ShowFaceSetRequest request) {
        return new SyncInvoker<ShowFaceSetRequest, ShowFaceSetResponse>(request, FrsMeta.showFaceSet, hcClient);
    }

    /** 查询人脸 查询指定人脸库中人脸信息。
     *
     * @param ShowFacesByFaceIdRequest 请求对象
     * @return ShowFacesByFaceIdResponse */
    public ShowFacesByFaceIdResponse showFacesByFaceId(ShowFacesByFaceIdRequest request) {
        return hcClient.syncInvokeHttp(request, FrsMeta.showFacesByFaceId);
    }

    /** 查询人脸 查询指定人脸库中人脸信息。
     *
     * @param ShowFacesByFaceIdRequest 请求对象
     * @return SyncInvoker<ShowFacesByFaceIdRequest, ShowFacesByFaceIdResponse> */
    public SyncInvoker<ShowFacesByFaceIdRequest, ShowFacesByFaceIdResponse> showFacesByFaceIdInvoker(
        ShowFacesByFaceIdRequest request) {
        return new SyncInvoker<ShowFacesByFaceIdRequest, ShowFacesByFaceIdResponse>(request, FrsMeta.showFacesByFaceId,
            hcClient);
    }

    /** 查询人脸 查询指定人脸库中人脸信息。
     *
     * @param ShowFacesByLimitRequest 请求对象
     * @return ShowFacesByLimitResponse */
    public ShowFacesByLimitResponse showFacesByLimit(ShowFacesByLimitRequest request) {
        return hcClient.syncInvokeHttp(request, FrsMeta.showFacesByLimit);
    }

    /** 查询人脸 查询指定人脸库中人脸信息。
     *
     * @param ShowFacesByLimitRequest 请求对象
     * @return SyncInvoker<ShowFacesByLimitRequest, ShowFacesByLimitResponse> */
    public SyncInvoker<ShowFacesByLimitRequest, ShowFacesByLimitResponse> showFacesByLimitInvoker(
        ShowFacesByLimitRequest request) {
        return new SyncInvoker<ShowFacesByLimitRequest, ShowFacesByLimitResponse>(request, FrsMeta.showFacesByLimit,
            hcClient);
    }

    /** 更新人脸 根据人脸ID（face_id）更新单张人脸信息。
     *
     * @param UpdateFaceRequest 请求对象
     * @return UpdateFaceResponse */
    public UpdateFaceResponse updateFace(UpdateFaceRequest request) {
        return hcClient.syncInvokeHttp(request, FrsMeta.updateFace);
    }

    /** 更新人脸 根据人脸ID（face_id）更新单张人脸信息。
     *
     * @param UpdateFaceRequest 请求对象
     * @return SyncInvoker<UpdateFaceRequest, UpdateFaceResponse> */
    public SyncInvoker<UpdateFaceRequest, UpdateFaceResponse> updateFaceInvoker(UpdateFaceRequest request) {
        return new SyncInvoker<UpdateFaceRequest, UpdateFaceResponse>(request, FrsMeta.updateFace, hcClient);
    }

}
