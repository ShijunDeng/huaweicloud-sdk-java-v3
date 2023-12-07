package com.huaweicloud.sdk.rds.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.rds.v3.model.AddPostgresqlHbaConfRequest;
import com.huaweicloud.sdk.rds.v3.model.AddPostgresqlHbaConfResponse;
import com.huaweicloud.sdk.rds.v3.model.AllowDbPrivilegeRequest;
import com.huaweicloud.sdk.rds.v3.model.AllowDbPrivilegeResponse;
import com.huaweicloud.sdk.rds.v3.model.AllowDbUserPrivilegeRequest;
import com.huaweicloud.sdk.rds.v3.model.AllowDbUserPrivilegeResponse;
import com.huaweicloud.sdk.rds.v3.model.AllowSqlserverDbUserPrivilegeRequest;
import com.huaweicloud.sdk.rds.v3.model.AllowSqlserverDbUserPrivilegeResponse;
import com.huaweicloud.sdk.rds.v3.model.ApplyConfigurationAsyncRequest;
import com.huaweicloud.sdk.rds.v3.model.ApplyConfigurationAsyncResponse;
import com.huaweicloud.sdk.rds.v3.model.AttachEipRequest;
import com.huaweicloud.sdk.rds.v3.model.AttachEipResponse;
import com.huaweicloud.sdk.rds.v3.model.BatchAddMsdtcsRequest;
import com.huaweicloud.sdk.rds.v3.model.BatchAddMsdtcsResponse;
import com.huaweicloud.sdk.rds.v3.model.BatchDeleteManualBackupRequest;
import com.huaweicloud.sdk.rds.v3.model.BatchDeleteManualBackupResponse;
import com.huaweicloud.sdk.rds.v3.model.BatchRestoreDatabaseRequest;
import com.huaweicloud.sdk.rds.v3.model.BatchRestoreDatabaseResponse;
import com.huaweicloud.sdk.rds.v3.model.BatchRestorePostgreSqlTablesRequest;
import com.huaweicloud.sdk.rds.v3.model.BatchRestorePostgreSqlTablesResponse;
import com.huaweicloud.sdk.rds.v3.model.BatchTagAddActionRequest;
import com.huaweicloud.sdk.rds.v3.model.BatchTagAddActionResponse;
import com.huaweicloud.sdk.rds.v3.model.BatchTagDelActionRequest;
import com.huaweicloud.sdk.rds.v3.model.BatchTagDelActionResponse;
import com.huaweicloud.sdk.rds.v3.model.ChangeFailoverModeRequest;
import com.huaweicloud.sdk.rds.v3.model.ChangeFailoverModeResponse;
import com.huaweicloud.sdk.rds.v3.model.ChangeFailoverStrategyRequest;
import com.huaweicloud.sdk.rds.v3.model.ChangeFailoverStrategyResponse;
import com.huaweicloud.sdk.rds.v3.model.ChangeOpsWindowRequest;
import com.huaweicloud.sdk.rds.v3.model.ChangeOpsWindowResponse;
import com.huaweicloud.sdk.rds.v3.model.ChangeProxyScaleRequest;
import com.huaweicloud.sdk.rds.v3.model.ChangeProxyScaleResponse;
import com.huaweicloud.sdk.rds.v3.model.ChangeTheDelayThresholdRequest;
import com.huaweicloud.sdk.rds.v3.model.ChangeTheDelayThresholdResponse;
import com.huaweicloud.sdk.rds.v3.model.CopyConfigurationRequest;
import com.huaweicloud.sdk.rds.v3.model.CopyConfigurationResponse;
import com.huaweicloud.sdk.rds.v3.model.CreateConfigurationRequest;
import com.huaweicloud.sdk.rds.v3.model.CreateConfigurationResponse;
import com.huaweicloud.sdk.rds.v3.model.CreateDatabaseRequest;
import com.huaweicloud.sdk.rds.v3.model.CreateDatabaseResponse;
import com.huaweicloud.sdk.rds.v3.model.CreateDbUserRequest;
import com.huaweicloud.sdk.rds.v3.model.CreateDbUserResponse;
import com.huaweicloud.sdk.rds.v3.model.CreateDnsNameRequest;
import com.huaweicloud.sdk.rds.v3.model.CreateDnsNameResponse;
import com.huaweicloud.sdk.rds.v3.model.CreateInstanceRequest;
import com.huaweicloud.sdk.rds.v3.model.CreateInstanceResponse;
import com.huaweicloud.sdk.rds.v3.model.CreateManualBackupRequest;
import com.huaweicloud.sdk.rds.v3.model.CreateManualBackupResponse;
import com.huaweicloud.sdk.rds.v3.model.CreatePostgresqlDatabaseRequest;
import com.huaweicloud.sdk.rds.v3.model.CreatePostgresqlDatabaseResponse;
import com.huaweicloud.sdk.rds.v3.model.CreatePostgresqlDatabaseSchemaRequest;
import com.huaweicloud.sdk.rds.v3.model.CreatePostgresqlDatabaseSchemaResponse;
import com.huaweicloud.sdk.rds.v3.model.CreatePostgresqlDbUserRequest;
import com.huaweicloud.sdk.rds.v3.model.CreatePostgresqlDbUserResponse;
import com.huaweicloud.sdk.rds.v3.model.CreatePostgresqlExtensionRequest;
import com.huaweicloud.sdk.rds.v3.model.CreatePostgresqlExtensionResponse;
import com.huaweicloud.sdk.rds.v3.model.CreateRestoreInstanceRequest;
import com.huaweicloud.sdk.rds.v3.model.CreateRestoreInstanceResponse;
import com.huaweicloud.sdk.rds.v3.model.CreateSqlserverDatabaseRequest;
import com.huaweicloud.sdk.rds.v3.model.CreateSqlserverDatabaseResponse;
import com.huaweicloud.sdk.rds.v3.model.CreateSqlserverDbUserRequest;
import com.huaweicloud.sdk.rds.v3.model.CreateSqlserverDbUserResponse;
import com.huaweicloud.sdk.rds.v3.model.CreateXelLogDownloadRequest;
import com.huaweicloud.sdk.rds.v3.model.CreateXelLogDownloadResponse;
import com.huaweicloud.sdk.rds.v3.model.DeleteConfigurationRequest;
import com.huaweicloud.sdk.rds.v3.model.DeleteConfigurationResponse;
import com.huaweicloud.sdk.rds.v3.model.DeleteDatabaseRequest;
import com.huaweicloud.sdk.rds.v3.model.DeleteDatabaseResponse;
import com.huaweicloud.sdk.rds.v3.model.DeleteDbUserRequest;
import com.huaweicloud.sdk.rds.v3.model.DeleteDbUserResponse;
import com.huaweicloud.sdk.rds.v3.model.DeleteInstanceRequest;
import com.huaweicloud.sdk.rds.v3.model.DeleteInstanceResponse;
import com.huaweicloud.sdk.rds.v3.model.DeleteJobRequest;
import com.huaweicloud.sdk.rds.v3.model.DeleteJobResponse;
import com.huaweicloud.sdk.rds.v3.model.DeleteManualBackupRequest;
import com.huaweicloud.sdk.rds.v3.model.DeleteManualBackupResponse;
import com.huaweicloud.sdk.rds.v3.model.DeletePostgresqlDatabaseRequest;
import com.huaweicloud.sdk.rds.v3.model.DeletePostgresqlDatabaseResponse;
import com.huaweicloud.sdk.rds.v3.model.DeletePostgresqlDbUserRequest;
import com.huaweicloud.sdk.rds.v3.model.DeletePostgresqlDbUserResponse;
import com.huaweicloud.sdk.rds.v3.model.DeletePostgresqlExtensionRequest;
import com.huaweicloud.sdk.rds.v3.model.DeletePostgresqlExtensionResponse;
import com.huaweicloud.sdk.rds.v3.model.DeletePostgresqlHbaConfRequest;
import com.huaweicloud.sdk.rds.v3.model.DeletePostgresqlHbaConfResponse;
import com.huaweicloud.sdk.rds.v3.model.DeleteSqlserverDatabaseExRequest;
import com.huaweicloud.sdk.rds.v3.model.DeleteSqlserverDatabaseExResponse;
import com.huaweicloud.sdk.rds.v3.model.DeleteSqlserverDatabaseRequest;
import com.huaweicloud.sdk.rds.v3.model.DeleteSqlserverDatabaseResponse;
import com.huaweicloud.sdk.rds.v3.model.DeleteSqlserverDbUserRequest;
import com.huaweicloud.sdk.rds.v3.model.DeleteSqlserverDbUserResponse;
import com.huaweicloud.sdk.rds.v3.model.DownloadSlowlogRequest;
import com.huaweicloud.sdk.rds.v3.model.DownloadSlowlogResponse;
import com.huaweicloud.sdk.rds.v3.model.EnableConfigurationRequest;
import com.huaweicloud.sdk.rds.v3.model.EnableConfigurationResponse;
import com.huaweicloud.sdk.rds.v3.model.ListApiVersionNewRequest;
import com.huaweicloud.sdk.rds.v3.model.ListApiVersionNewResponse;
import com.huaweicloud.sdk.rds.v3.model.ListApiVersionRequest;
import com.huaweicloud.sdk.rds.v3.model.ListApiVersionResponse;
import com.huaweicloud.sdk.rds.v3.model.ListAuditlogsRequest;
import com.huaweicloud.sdk.rds.v3.model.ListAuditlogsResponse;
import com.huaweicloud.sdk.rds.v3.model.ListAuthorizedDatabasesRequest;
import com.huaweicloud.sdk.rds.v3.model.ListAuthorizedDatabasesResponse;
import com.huaweicloud.sdk.rds.v3.model.ListAuthorizedDbUsersRequest;
import com.huaweicloud.sdk.rds.v3.model.ListAuthorizedDbUsersResponse;
import com.huaweicloud.sdk.rds.v3.model.ListAuthorizedSqlserverDbUsersRequest;
import com.huaweicloud.sdk.rds.v3.model.ListAuthorizedSqlserverDbUsersResponse;
import com.huaweicloud.sdk.rds.v3.model.ListBackupsRequest;
import com.huaweicloud.sdk.rds.v3.model.ListBackupsResponse;
import com.huaweicloud.sdk.rds.v3.model.ListCollationsRequest;
import com.huaweicloud.sdk.rds.v3.model.ListCollationsResponse;
import com.huaweicloud.sdk.rds.v3.model.ListConfigurationsRequest;
import com.huaweicloud.sdk.rds.v3.model.ListConfigurationsResponse;
import com.huaweicloud.sdk.rds.v3.model.ListDatabasesRequest;
import com.huaweicloud.sdk.rds.v3.model.ListDatabasesResponse;
import com.huaweicloud.sdk.rds.v3.model.ListDatastoresRequest;
import com.huaweicloud.sdk.rds.v3.model.ListDatastoresResponse;
import com.huaweicloud.sdk.rds.v3.model.ListDbUsersRequest;
import com.huaweicloud.sdk.rds.v3.model.ListDbUsersResponse;
import com.huaweicloud.sdk.rds.v3.model.ListDrRelationsRequest;
import com.huaweicloud.sdk.rds.v3.model.ListDrRelationsResponse;
import com.huaweicloud.sdk.rds.v3.model.ListEngineFlavorsRequest;
import com.huaweicloud.sdk.rds.v3.model.ListEngineFlavorsResponse;
import com.huaweicloud.sdk.rds.v3.model.ListErrorLogsNewRequest;
import com.huaweicloud.sdk.rds.v3.model.ListErrorLogsNewResponse;
import com.huaweicloud.sdk.rds.v3.model.ListErrorLogsRequest;
import com.huaweicloud.sdk.rds.v3.model.ListErrorLogsResponse;
import com.huaweicloud.sdk.rds.v3.model.ListErrorlogForLtsRequest;
import com.huaweicloud.sdk.rds.v3.model.ListErrorlogForLtsResponse;
import com.huaweicloud.sdk.rds.v3.model.ListFlavorsRequest;
import com.huaweicloud.sdk.rds.v3.model.ListFlavorsResponse;
import com.huaweicloud.sdk.rds.v3.model.ListHistoryDatabaseRequest;
import com.huaweicloud.sdk.rds.v3.model.ListHistoryDatabaseResponse;
import com.huaweicloud.sdk.rds.v3.model.ListInspectionHistoriesRequest;
import com.huaweicloud.sdk.rds.v3.model.ListInspectionHistoriesResponse;
import com.huaweicloud.sdk.rds.v3.model.ListInstanceDiagnosisRequest;
import com.huaweicloud.sdk.rds.v3.model.ListInstanceDiagnosisResponse;
import com.huaweicloud.sdk.rds.v3.model.ListInstanceParamHistoriesRequest;
import com.huaweicloud.sdk.rds.v3.model.ListInstanceParamHistoriesResponse;
import com.huaweicloud.sdk.rds.v3.model.ListInstanceTagsRequest;
import com.huaweicloud.sdk.rds.v3.model.ListInstanceTagsResponse;
import com.huaweicloud.sdk.rds.v3.model.ListInstancesInfoDiagnosisRequest;
import com.huaweicloud.sdk.rds.v3.model.ListInstancesInfoDiagnosisResponse;
import com.huaweicloud.sdk.rds.v3.model.ListInstancesRequest;
import com.huaweicloud.sdk.rds.v3.model.ListInstancesResponse;
import com.huaweicloud.sdk.rds.v3.model.ListInstancesSupportFastRestoreRequest;
import com.huaweicloud.sdk.rds.v3.model.ListInstancesSupportFastRestoreResponse;
import com.huaweicloud.sdk.rds.v3.model.ListJobInfoDetailRequest;
import com.huaweicloud.sdk.rds.v3.model.ListJobInfoDetailResponse;
import com.huaweicloud.sdk.rds.v3.model.ListJobInfoRequest;
import com.huaweicloud.sdk.rds.v3.model.ListJobInfoResponse;
import com.huaweicloud.sdk.rds.v3.model.ListMsdtcHostsRequest;
import com.huaweicloud.sdk.rds.v3.model.ListMsdtcHostsResponse;
import com.huaweicloud.sdk.rds.v3.model.ListOffSiteBackupsRequest;
import com.huaweicloud.sdk.rds.v3.model.ListOffSiteBackupsResponse;
import com.huaweicloud.sdk.rds.v3.model.ListOffSiteInstancesRequest;
import com.huaweicloud.sdk.rds.v3.model.ListOffSiteInstancesResponse;
import com.huaweicloud.sdk.rds.v3.model.ListOffSiteRestoreTimesRequest;
import com.huaweicloud.sdk.rds.v3.model.ListOffSiteRestoreTimesResponse;
import com.huaweicloud.sdk.rds.v3.model.ListPostgresqlDatabaseSchemasRequest;
import com.huaweicloud.sdk.rds.v3.model.ListPostgresqlDatabaseSchemasResponse;
import com.huaweicloud.sdk.rds.v3.model.ListPostgresqlDatabasesRequest;
import com.huaweicloud.sdk.rds.v3.model.ListPostgresqlDatabasesResponse;
import com.huaweicloud.sdk.rds.v3.model.ListPostgresqlDbUserPaginatedRequest;
import com.huaweicloud.sdk.rds.v3.model.ListPostgresqlDbUserPaginatedResponse;
import com.huaweicloud.sdk.rds.v3.model.ListPostgresqlExtensionRequest;
import com.huaweicloud.sdk.rds.v3.model.ListPostgresqlExtensionResponse;
import com.huaweicloud.sdk.rds.v3.model.ListPostgresqlHbaInfoHistoryRequest;
import com.huaweicloud.sdk.rds.v3.model.ListPostgresqlHbaInfoHistoryResponse;
import com.huaweicloud.sdk.rds.v3.model.ListPostgresqlHbaInfoRequest;
import com.huaweicloud.sdk.rds.v3.model.ListPostgresqlHbaInfoResponse;
import com.huaweicloud.sdk.rds.v3.model.ListPostgresqlListHistoryTablesRequest;
import com.huaweicloud.sdk.rds.v3.model.ListPostgresqlListHistoryTablesResponse;
import com.huaweicloud.sdk.rds.v3.model.ListPredefinedTagRequest;
import com.huaweicloud.sdk.rds.v3.model.ListPredefinedTagResponse;
import com.huaweicloud.sdk.rds.v3.model.ListProjectTagsRequest;
import com.huaweicloud.sdk.rds.v3.model.ListProjectTagsResponse;
import com.huaweicloud.sdk.rds.v3.model.ListRecycleInstancesRequest;
import com.huaweicloud.sdk.rds.v3.model.ListRecycleInstancesResponse;
import com.huaweicloud.sdk.rds.v3.model.ListRestoreTimesRequest;
import com.huaweicloud.sdk.rds.v3.model.ListRestoreTimesResponse;
import com.huaweicloud.sdk.rds.v3.model.ListSimplifiedInstancesRequest;
import com.huaweicloud.sdk.rds.v3.model.ListSimplifiedInstancesResponse;
import com.huaweicloud.sdk.rds.v3.model.ListSlowLogFileRequest;
import com.huaweicloud.sdk.rds.v3.model.ListSlowLogFileResponse;
import com.huaweicloud.sdk.rds.v3.model.ListSlowLogStatisticsForLtsRequest;
import com.huaweicloud.sdk.rds.v3.model.ListSlowLogStatisticsForLtsResponse;
import com.huaweicloud.sdk.rds.v3.model.ListSlowLogsNewRequest;
import com.huaweicloud.sdk.rds.v3.model.ListSlowLogsNewResponse;
import com.huaweicloud.sdk.rds.v3.model.ListSlowLogsRequest;
import com.huaweicloud.sdk.rds.v3.model.ListSlowLogsResponse;
import com.huaweicloud.sdk.rds.v3.model.ListSlowlogForLtsRequest;
import com.huaweicloud.sdk.rds.v3.model.ListSlowlogForLtsResponse;
import com.huaweicloud.sdk.rds.v3.model.ListSlowlogStatisticsRequest;
import com.huaweicloud.sdk.rds.v3.model.ListSlowlogStatisticsResponse;
import com.huaweicloud.sdk.rds.v3.model.ListSqlserverDatabasesRequest;
import com.huaweicloud.sdk.rds.v3.model.ListSqlserverDatabasesResponse;
import com.huaweicloud.sdk.rds.v3.model.ListSqlserverDbUsersRequest;
import com.huaweicloud.sdk.rds.v3.model.ListSqlserverDbUsersResponse;
import com.huaweicloud.sdk.rds.v3.model.ListSslCertDownloadLinkRequest;
import com.huaweicloud.sdk.rds.v3.model.ListSslCertDownloadLinkResponse;
import com.huaweicloud.sdk.rds.v3.model.ListStorageTypesRequest;
import com.huaweicloud.sdk.rds.v3.model.ListStorageTypesResponse;
import com.huaweicloud.sdk.rds.v3.model.ListUpgradeHistoriesRequest;
import com.huaweicloud.sdk.rds.v3.model.ListUpgradeHistoriesResponse;
import com.huaweicloud.sdk.rds.v3.model.ListXellogFilesRequest;
import com.huaweicloud.sdk.rds.v3.model.ListXellogFilesResponse;
import com.huaweicloud.sdk.rds.v3.model.MigrateFollowerRequest;
import com.huaweicloud.sdk.rds.v3.model.MigrateFollowerResponse;
import com.huaweicloud.sdk.rds.v3.model.ModifyCollationRequest;
import com.huaweicloud.sdk.rds.v3.model.ModifyCollationResponse;
import com.huaweicloud.sdk.rds.v3.model.ModifyPostgresqlHbaConfRequest;
import com.huaweicloud.sdk.rds.v3.model.ModifyPostgresqlHbaConfResponse;
import com.huaweicloud.sdk.rds.v3.model.ResetPwdRequest;
import com.huaweicloud.sdk.rds.v3.model.ResetPwdResponse;
import com.huaweicloud.sdk.rds.v3.model.RestoreExistInstanceRequest;
import com.huaweicloud.sdk.rds.v3.model.RestoreExistInstanceResponse;
import com.huaweicloud.sdk.rds.v3.model.RestoreTablesNewRequest;
import com.huaweicloud.sdk.rds.v3.model.RestoreTablesNewResponse;
import com.huaweicloud.sdk.rds.v3.model.RestoreTablesRequest;
import com.huaweicloud.sdk.rds.v3.model.RestoreTablesResponse;
import com.huaweicloud.sdk.rds.v3.model.RestoreToExistingInstanceRequest;
import com.huaweicloud.sdk.rds.v3.model.RestoreToExistingInstanceResponse;
import com.huaweicloud.sdk.rds.v3.model.RevokePostgresqlDbPrivilegeRequest;
import com.huaweicloud.sdk.rds.v3.model.RevokePostgresqlDbPrivilegeResponse;
import com.huaweicloud.sdk.rds.v3.model.RevokeRequest;
import com.huaweicloud.sdk.rds.v3.model.RevokeResponse;
import com.huaweicloud.sdk.rds.v3.model.RevokeSqlserverDbUserPrivilegeRequest;
import com.huaweicloud.sdk.rds.v3.model.RevokeSqlserverDbUserPrivilegeResponse;
import com.huaweicloud.sdk.rds.v3.model.SearchQueryScaleComputeFlavorsRequest;
import com.huaweicloud.sdk.rds.v3.model.SearchQueryScaleComputeFlavorsResponse;
import com.huaweicloud.sdk.rds.v3.model.SearchQueryScaleFlavorsRequest;
import com.huaweicloud.sdk.rds.v3.model.SearchQueryScaleFlavorsResponse;
import com.huaweicloud.sdk.rds.v3.model.SetAuditlogPolicyRequest;
import com.huaweicloud.sdk.rds.v3.model.SetAuditlogPolicyResponse;
import com.huaweicloud.sdk.rds.v3.model.SetAutoEnlargePolicyRequest;
import com.huaweicloud.sdk.rds.v3.model.SetAutoEnlargePolicyResponse;
import com.huaweicloud.sdk.rds.v3.model.SetBackupPolicyRequest;
import com.huaweicloud.sdk.rds.v3.model.SetBackupPolicyResponse;
import com.huaweicloud.sdk.rds.v3.model.SetBinlogClearPolicyRequest;
import com.huaweicloud.sdk.rds.v3.model.SetBinlogClearPolicyResponse;
import com.huaweicloud.sdk.rds.v3.model.SetDatabaseUserPrivilegeRequest;
import com.huaweicloud.sdk.rds.v3.model.SetDatabaseUserPrivilegeResponse;
import com.huaweicloud.sdk.rds.v3.model.SetDbUserPwdRequest;
import com.huaweicloud.sdk.rds.v3.model.SetDbUserPwdResponse;
import com.huaweicloud.sdk.rds.v3.model.SetInstancesDbShrinkRequest;
import com.huaweicloud.sdk.rds.v3.model.SetInstancesDbShrinkResponse;
import com.huaweicloud.sdk.rds.v3.model.SetOffSiteBackupPolicyRequest;
import com.huaweicloud.sdk.rds.v3.model.SetOffSiteBackupPolicyResponse;
import com.huaweicloud.sdk.rds.v3.model.SetPostgresqlDbUserPwdRequest;
import com.huaweicloud.sdk.rds.v3.model.SetPostgresqlDbUserPwdResponse;
import com.huaweicloud.sdk.rds.v3.model.SetReadOnlySwitchRequest;
import com.huaweicloud.sdk.rds.v3.model.SetReadOnlySwitchResponse;
import com.huaweicloud.sdk.rds.v3.model.SetSecondLevelMonitorRequest;
import com.huaweicloud.sdk.rds.v3.model.SetSecondLevelMonitorResponse;
import com.huaweicloud.sdk.rds.v3.model.SetSecurityGroupRequest;
import com.huaweicloud.sdk.rds.v3.model.SetSecurityGroupResponse;
import com.huaweicloud.sdk.rds.v3.model.SetSensitiveSlowLogRequest;
import com.huaweicloud.sdk.rds.v3.model.SetSensitiveSlowLogResponse;
import com.huaweicloud.sdk.rds.v3.model.ShowApiVersionRequest;
import com.huaweicloud.sdk.rds.v3.model.ShowApiVersionResponse;
import com.huaweicloud.sdk.rds.v3.model.ShowAuditlogDownloadLinkRequest;
import com.huaweicloud.sdk.rds.v3.model.ShowAuditlogDownloadLinkResponse;
import com.huaweicloud.sdk.rds.v3.model.ShowAuditlogPolicyRequest;
import com.huaweicloud.sdk.rds.v3.model.ShowAuditlogPolicyResponse;
import com.huaweicloud.sdk.rds.v3.model.ShowAutoEnlargePolicyRequest;
import com.huaweicloud.sdk.rds.v3.model.ShowAutoEnlargePolicyResponse;
import com.huaweicloud.sdk.rds.v3.model.ShowAvailableVersionRequest;
import com.huaweicloud.sdk.rds.v3.model.ShowAvailableVersionResponse;
import com.huaweicloud.sdk.rds.v3.model.ShowBackupDownloadLinkRequest;
import com.huaweicloud.sdk.rds.v3.model.ShowBackupDownloadLinkResponse;
import com.huaweicloud.sdk.rds.v3.model.ShowBackupPolicyRequest;
import com.huaweicloud.sdk.rds.v3.model.ShowBackupPolicyResponse;
import com.huaweicloud.sdk.rds.v3.model.ShowBinlogClearPolicyRequest;
import com.huaweicloud.sdk.rds.v3.model.ShowBinlogClearPolicyResponse;
import com.huaweicloud.sdk.rds.v3.model.ShowConfigurationRequest;
import com.huaweicloud.sdk.rds.v3.model.ShowConfigurationResponse;
import com.huaweicloud.sdk.rds.v3.model.ShowDnsNameRequest;
import com.huaweicloud.sdk.rds.v3.model.ShowDnsNameResponse;
import com.huaweicloud.sdk.rds.v3.model.ShowDomainNameRequest;
import com.huaweicloud.sdk.rds.v3.model.ShowDomainNameResponse;
import com.huaweicloud.sdk.rds.v3.model.ShowDrReplicaStatusRequest;
import com.huaweicloud.sdk.rds.v3.model.ShowDrReplicaStatusResponse;
import com.huaweicloud.sdk.rds.v3.model.ShowInformationAboutDatabaseProxyRequest;
import com.huaweicloud.sdk.rds.v3.model.ShowInformationAboutDatabaseProxyResponse;
import com.huaweicloud.sdk.rds.v3.model.ShowInstanceConfigurationRequest;
import com.huaweicloud.sdk.rds.v3.model.ShowInstanceConfigurationResponse;
import com.huaweicloud.sdk.rds.v3.model.ShowOffSiteBackupPolicyRequest;
import com.huaweicloud.sdk.rds.v3.model.ShowOffSiteBackupPolicyResponse;
import com.huaweicloud.sdk.rds.v3.model.ShowPostgresqlParamValueRequest;
import com.huaweicloud.sdk.rds.v3.model.ShowPostgresqlParamValueResponse;
import com.huaweicloud.sdk.rds.v3.model.ShowQuotasRequest;
import com.huaweicloud.sdk.rds.v3.model.ShowQuotasResponse;
import com.huaweicloud.sdk.rds.v3.model.ShowRecyclePolicyRequest;
import com.huaweicloud.sdk.rds.v3.model.ShowRecyclePolicyResponse;
import com.huaweicloud.sdk.rds.v3.model.ShowReplicationStatusRequest;
import com.huaweicloud.sdk.rds.v3.model.ShowReplicationStatusResponse;
import com.huaweicloud.sdk.rds.v3.model.ShowSecondLevelMonitoringRequest;
import com.huaweicloud.sdk.rds.v3.model.ShowSecondLevelMonitoringResponse;
import com.huaweicloud.sdk.rds.v3.model.ShowTdeStatusRequest;
import com.huaweicloud.sdk.rds.v3.model.ShowTdeStatusResponse;
import com.huaweicloud.sdk.rds.v3.model.ShowUpgradeDbMajorVersionStatusRequest;
import com.huaweicloud.sdk.rds.v3.model.ShowUpgradeDbMajorVersionStatusResponse;
import com.huaweicloud.sdk.rds.v3.model.StartDatabaseProxyRequest;
import com.huaweicloud.sdk.rds.v3.model.StartDatabaseProxyResponse;
import com.huaweicloud.sdk.rds.v3.model.StartFailoverRequest;
import com.huaweicloud.sdk.rds.v3.model.StartFailoverResponse;
import com.huaweicloud.sdk.rds.v3.model.StartInstanceEnlargeVolumeActionRequest;
import com.huaweicloud.sdk.rds.v3.model.StartInstanceEnlargeVolumeActionResponse;
import com.huaweicloud.sdk.rds.v3.model.StartInstanceRestartActionRequest;
import com.huaweicloud.sdk.rds.v3.model.StartInstanceRestartActionResponse;
import com.huaweicloud.sdk.rds.v3.model.StartInstanceSingleToHaActionRequest;
import com.huaweicloud.sdk.rds.v3.model.StartInstanceSingleToHaActionResponse;
import com.huaweicloud.sdk.rds.v3.model.StartRecyclePolicyRequest;
import com.huaweicloud.sdk.rds.v3.model.StartRecyclePolicyResponse;
import com.huaweicloud.sdk.rds.v3.model.StartResizeFlavorActionRequest;
import com.huaweicloud.sdk.rds.v3.model.StartResizeFlavorActionResponse;
import com.huaweicloud.sdk.rds.v3.model.StartupInstanceRequest;
import com.huaweicloud.sdk.rds.v3.model.StartupInstanceResponse;
import com.huaweicloud.sdk.rds.v3.model.StopDatabaseProxyRequest;
import com.huaweicloud.sdk.rds.v3.model.StopDatabaseProxyResponse;
import com.huaweicloud.sdk.rds.v3.model.StopInstanceRequest;
import com.huaweicloud.sdk.rds.v3.model.StopInstanceResponse;
import com.huaweicloud.sdk.rds.v3.model.SwitchSslRequest;
import com.huaweicloud.sdk.rds.v3.model.SwitchSslResponse;
import com.huaweicloud.sdk.rds.v3.model.UpdateConfigurationRequest;
import com.huaweicloud.sdk.rds.v3.model.UpdateConfigurationResponse;
import com.huaweicloud.sdk.rds.v3.model.UpdateDataIpRequest;
import com.huaweicloud.sdk.rds.v3.model.UpdateDataIpResponse;
import com.huaweicloud.sdk.rds.v3.model.UpdateDatabaseRequest;
import com.huaweicloud.sdk.rds.v3.model.UpdateDatabaseResponse;
import com.huaweicloud.sdk.rds.v3.model.UpdateDbUserCommentRequest;
import com.huaweicloud.sdk.rds.v3.model.UpdateDbUserCommentResponse;
import com.huaweicloud.sdk.rds.v3.model.UpdateDbUserPrivilegeRequest;
import com.huaweicloud.sdk.rds.v3.model.UpdateDbUserPrivilegeResponse;
import com.huaweicloud.sdk.rds.v3.model.UpdateDnsNameRequest;
import com.huaweicloud.sdk.rds.v3.model.UpdateDnsNameResponse;
import com.huaweicloud.sdk.rds.v3.model.UpdateInstanceConfigurationAsyncRequest;
import com.huaweicloud.sdk.rds.v3.model.UpdateInstanceConfigurationAsyncResponse;
import com.huaweicloud.sdk.rds.v3.model.UpdateInstanceConfigurationRequest;
import com.huaweicloud.sdk.rds.v3.model.UpdateInstanceConfigurationResponse;
import com.huaweicloud.sdk.rds.v3.model.UpdateInstanceNameRequest;
import com.huaweicloud.sdk.rds.v3.model.UpdateInstanceNameResponse;
import com.huaweicloud.sdk.rds.v3.model.UpdatePortRequest;
import com.huaweicloud.sdk.rds.v3.model.UpdatePortResponse;
import com.huaweicloud.sdk.rds.v3.model.UpdatePostgresqlDatabaseRequest;
import com.huaweicloud.sdk.rds.v3.model.UpdatePostgresqlDatabaseResponse;
import com.huaweicloud.sdk.rds.v3.model.UpdatePostgresqlDbUserCommentRequest;
import com.huaweicloud.sdk.rds.v3.model.UpdatePostgresqlDbUserCommentResponse;
import com.huaweicloud.sdk.rds.v3.model.UpdatePostgresqlInstanceAliasRequest;
import com.huaweicloud.sdk.rds.v3.model.UpdatePostgresqlInstanceAliasResponse;
import com.huaweicloud.sdk.rds.v3.model.UpdatePostgresqlParameterValueRequest;
import com.huaweicloud.sdk.rds.v3.model.UpdatePostgresqlParameterValueResponse;
import com.huaweicloud.sdk.rds.v3.model.UpdateReadWeightRequest;
import com.huaweicloud.sdk.rds.v3.model.UpdateReadWeightResponse;
import com.huaweicloud.sdk.rds.v3.model.UpdateTdeStatusRequest;
import com.huaweicloud.sdk.rds.v3.model.UpdateTdeStatusResponse;
import com.huaweicloud.sdk.rds.v3.model.UpgradeDbMajorVersionPreCheckRequest;
import com.huaweicloud.sdk.rds.v3.model.UpgradeDbMajorVersionPreCheckResponse;
import com.huaweicloud.sdk.rds.v3.model.UpgradeDbMajorVersionRequest;
import com.huaweicloud.sdk.rds.v3.model.UpgradeDbMajorVersionResponse;
import com.huaweicloud.sdk.rds.v3.model.UpgradeDbVersionNewRequest;
import com.huaweicloud.sdk.rds.v3.model.UpgradeDbVersionNewResponse;
import com.huaweicloud.sdk.rds.v3.model.UpgradeDbVersionRequest;
import com.huaweicloud.sdk.rds.v3.model.UpgradeDbVersionResponse;

public class RdsClient {

    protected HcClient hcClient;

    public RdsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<RdsClient> newBuilder() {
        ClientBuilder<RdsClient> clientBuilder = new ClientBuilder<>(RdsClient::new);
        return clientBuilder;
    }

    /**
     * 在pg_hba.conf文件最后新增单个或多个配置
     *
     * 以传入配置全量覆盖当前pg_hba.conf文件内容，入参为空时用默认配置覆盖当前文件内容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddPostgresqlHbaConfRequest 请求对象
     * @return AddPostgresqlHbaConfResponse
     */
    public AddPostgresqlHbaConfResponse addPostgresqlHbaConf(AddPostgresqlHbaConfRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.addPostgresqlHbaConf);
    }

    /**
     * 在pg_hba.conf文件最后新增单个或多个配置
     *
     * 以传入配置全量覆盖当前pg_hba.conf文件内容，入参为空时用默认配置覆盖当前文件内容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddPostgresqlHbaConfRequest 请求对象
     * @return SyncInvoker<AddPostgresqlHbaConfRequest, AddPostgresqlHbaConfResponse>
     */
    public SyncInvoker<AddPostgresqlHbaConfRequest, AddPostgresqlHbaConfResponse> addPostgresqlHbaConfInvoker(
        AddPostgresqlHbaConfRequest request) {
        return new SyncInvoker<AddPostgresqlHbaConfRequest, AddPostgresqlHbaConfResponse>(request,
            RdsMeta.addPostgresqlHbaConf, hcClient);
    }

    /**
     * 应用参数模板
     *
     * 应用参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ApplyConfigurationAsyncRequest 请求对象
     * @return ApplyConfigurationAsyncResponse
     */
    public ApplyConfigurationAsyncResponse applyConfigurationAsync(ApplyConfigurationAsyncRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.applyConfigurationAsync);
    }

    /**
     * 应用参数模板
     *
     * 应用参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ApplyConfigurationAsyncRequest 请求对象
     * @return SyncInvoker<ApplyConfigurationAsyncRequest, ApplyConfigurationAsyncResponse>
     */
    public SyncInvoker<ApplyConfigurationAsyncRequest, ApplyConfigurationAsyncResponse> applyConfigurationAsyncInvoker(
        ApplyConfigurationAsyncRequest request) {
        return new SyncInvoker<ApplyConfigurationAsyncRequest, ApplyConfigurationAsyncResponse>(request,
            RdsMeta.applyConfigurationAsync, hcClient);
    }

    /**
     * 绑定和解绑弹性公网IP
     *
     * 绑定和解绑弹性公网IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AttachEipRequest 请求对象
     * @return AttachEipResponse
     */
    public AttachEipResponse attachEip(AttachEipRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.attachEip);
    }

    /**
     * 绑定和解绑弹性公网IP
     *
     * 绑定和解绑弹性公网IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AttachEipRequest 请求对象
     * @return SyncInvoker<AttachEipRequest, AttachEipResponse>
     */
    public SyncInvoker<AttachEipRequest, AttachEipResponse> attachEipInvoker(AttachEipRequest request) {
        return new SyncInvoker<AttachEipRequest, AttachEipResponse>(request, RdsMeta.attachEip, hcClient);
    }

    /**
     * 批量删除手动备份
     *
     * 批量删除手动备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteManualBackupRequest 请求对象
     * @return BatchDeleteManualBackupResponse
     */
    public BatchDeleteManualBackupResponse batchDeleteManualBackup(BatchDeleteManualBackupRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.batchDeleteManualBackup);
    }

    /**
     * 批量删除手动备份
     *
     * 批量删除手动备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteManualBackupRequest 请求对象
     * @return SyncInvoker<BatchDeleteManualBackupRequest, BatchDeleteManualBackupResponse>
     */
    public SyncInvoker<BatchDeleteManualBackupRequest, BatchDeleteManualBackupResponse> batchDeleteManualBackupInvoker(
        BatchDeleteManualBackupRequest request) {
        return new SyncInvoker<BatchDeleteManualBackupRequest, BatchDeleteManualBackupResponse>(request,
            RdsMeta.batchDeleteManualBackup, hcClient);
    }

    /**
     * 库级时间点恢复
     *
     * 库级时间点恢复
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchRestoreDatabaseRequest 请求对象
     * @return BatchRestoreDatabaseResponse
     */
    public BatchRestoreDatabaseResponse batchRestoreDatabase(BatchRestoreDatabaseRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.batchRestoreDatabase);
    }

    /**
     * 库级时间点恢复
     *
     * 库级时间点恢复
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchRestoreDatabaseRequest 请求对象
     * @return SyncInvoker<BatchRestoreDatabaseRequest, BatchRestoreDatabaseResponse>
     */
    public SyncInvoker<BatchRestoreDatabaseRequest, BatchRestoreDatabaseResponse> batchRestoreDatabaseInvoker(
        BatchRestoreDatabaseRequest request) {
        return new SyncInvoker<BatchRestoreDatabaseRequest, BatchRestoreDatabaseResponse>(request,
            RdsMeta.batchRestoreDatabase, hcClient);
    }

    /**
     * 表级时间点恢复（PostgreSQL）
     *
     * 表级时间点恢复（PostgreSQL）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchRestorePostgreSqlTablesRequest 请求对象
     * @return BatchRestorePostgreSqlTablesResponse
     */
    public BatchRestorePostgreSqlTablesResponse batchRestorePostgreSqlTables(
        BatchRestorePostgreSqlTablesRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.batchRestorePostgreSqlTables);
    }

    /**
     * 表级时间点恢复（PostgreSQL）
     *
     * 表级时间点恢复（PostgreSQL）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchRestorePostgreSqlTablesRequest 请求对象
     * @return SyncInvoker<BatchRestorePostgreSqlTablesRequest, BatchRestorePostgreSqlTablesResponse>
     */
    public SyncInvoker<BatchRestorePostgreSqlTablesRequest, BatchRestorePostgreSqlTablesResponse> batchRestorePostgreSqlTablesInvoker(
        BatchRestorePostgreSqlTablesRequest request) {
        return new SyncInvoker<BatchRestorePostgreSqlTablesRequest, BatchRestorePostgreSqlTablesResponse>(request,
            RdsMeta.batchRestorePostgreSqlTables, hcClient);
    }

    /**
     * 批量添加标签
     *
     * 批量添加标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchTagAddActionRequest 请求对象
     * @return BatchTagAddActionResponse
     */
    public BatchTagAddActionResponse batchTagAddAction(BatchTagAddActionRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.batchTagAddAction);
    }

    /**
     * 批量添加标签
     *
     * 批量添加标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchTagAddActionRequest 请求对象
     * @return SyncInvoker<BatchTagAddActionRequest, BatchTagAddActionResponse>
     */
    public SyncInvoker<BatchTagAddActionRequest, BatchTagAddActionResponse> batchTagAddActionInvoker(
        BatchTagAddActionRequest request) {
        return new SyncInvoker<BatchTagAddActionRequest, BatchTagAddActionResponse>(request, RdsMeta.batchTagAddAction,
            hcClient);
    }

    /**
     * 批量删除标签
     *
     * 批量删除标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchTagDelActionRequest 请求对象
     * @return BatchTagDelActionResponse
     */
    public BatchTagDelActionResponse batchTagDelAction(BatchTagDelActionRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.batchTagDelAction);
    }

    /**
     * 批量删除标签
     *
     * 批量删除标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchTagDelActionRequest 请求对象
     * @return SyncInvoker<BatchTagDelActionRequest, BatchTagDelActionResponse>
     */
    public SyncInvoker<BatchTagDelActionRequest, BatchTagDelActionResponse> batchTagDelActionInvoker(
        BatchTagDelActionRequest request) {
        return new SyncInvoker<BatchTagDelActionRequest, BatchTagDelActionResponse>(request, RdsMeta.batchTagDelAction,
            hcClient);
    }

    /**
     * 更改主备实例的数据同步方式
     *
     * 更改主备实例的数据同步方式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeFailoverModeRequest 请求对象
     * @return ChangeFailoverModeResponse
     */
    public ChangeFailoverModeResponse changeFailoverMode(ChangeFailoverModeRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.changeFailoverMode);
    }

    /**
     * 更改主备实例的数据同步方式
     *
     * 更改主备实例的数据同步方式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeFailoverModeRequest 请求对象
     * @return SyncInvoker<ChangeFailoverModeRequest, ChangeFailoverModeResponse>
     */
    public SyncInvoker<ChangeFailoverModeRequest, ChangeFailoverModeResponse> changeFailoverModeInvoker(
        ChangeFailoverModeRequest request) {
        return new SyncInvoker<ChangeFailoverModeRequest, ChangeFailoverModeResponse>(request,
            RdsMeta.changeFailoverMode, hcClient);
    }

    /**
     * 切换主备实例的倒换策略
     *
     * 切换主备实例的倒换策略.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeFailoverStrategyRequest 请求对象
     * @return ChangeFailoverStrategyResponse
     */
    public ChangeFailoverStrategyResponse changeFailoverStrategy(ChangeFailoverStrategyRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.changeFailoverStrategy);
    }

    /**
     * 切换主备实例的倒换策略
     *
     * 切换主备实例的倒换策略.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeFailoverStrategyRequest 请求对象
     * @return SyncInvoker<ChangeFailoverStrategyRequest, ChangeFailoverStrategyResponse>
     */
    public SyncInvoker<ChangeFailoverStrategyRequest, ChangeFailoverStrategyResponse> changeFailoverStrategyInvoker(
        ChangeFailoverStrategyRequest request) {
        return new SyncInvoker<ChangeFailoverStrategyRequest, ChangeFailoverStrategyResponse>(request,
            RdsMeta.changeFailoverStrategy, hcClient);
    }

    /**
     * 设置可维护时间段
     *
     * 设置可维护时间段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeOpsWindowRequest 请求对象
     * @return ChangeOpsWindowResponse
     */
    public ChangeOpsWindowResponse changeOpsWindow(ChangeOpsWindowRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.changeOpsWindow);
    }

    /**
     * 设置可维护时间段
     *
     * 设置可维护时间段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeOpsWindowRequest 请求对象
     * @return SyncInvoker<ChangeOpsWindowRequest, ChangeOpsWindowResponse>
     */
    public SyncInvoker<ChangeOpsWindowRequest, ChangeOpsWindowResponse> changeOpsWindowInvoker(
        ChangeOpsWindowRequest request) {
        return new SyncInvoker<ChangeOpsWindowRequest, ChangeOpsWindowResponse>(request, RdsMeta.changeOpsWindow,
            hcClient);
    }

    /**
     * 复制参数模板
     *
     * 复制参数模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CopyConfigurationRequest 请求对象
     * @return CopyConfigurationResponse
     */
    public CopyConfigurationResponse copyConfiguration(CopyConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.copyConfiguration);
    }

    /**
     * 复制参数模板
     *
     * 复制参数模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CopyConfigurationRequest 请求对象
     * @return SyncInvoker<CopyConfigurationRequest, CopyConfigurationResponse>
     */
    public SyncInvoker<CopyConfigurationRequest, CopyConfigurationResponse> copyConfigurationInvoker(
        CopyConfigurationRequest request) {
        return new SyncInvoker<CopyConfigurationRequest, CopyConfigurationResponse>(request, RdsMeta.copyConfiguration,
            hcClient);
    }

    /**
     * 创建参数模板
     *
     * 创建参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateConfigurationRequest 请求对象
     * @return CreateConfigurationResponse
     */
    public CreateConfigurationResponse createConfiguration(CreateConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.createConfiguration);
    }

    /**
     * 创建参数模板
     *
     * 创建参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateConfigurationRequest 请求对象
     * @return SyncInvoker<CreateConfigurationRequest, CreateConfigurationResponse>
     */
    public SyncInvoker<CreateConfigurationRequest, CreateConfigurationResponse> createConfigurationInvoker(
        CreateConfigurationRequest request) {
        return new SyncInvoker<CreateConfigurationRequest, CreateConfigurationResponse>(request,
            RdsMeta.createConfiguration, hcClient);
    }

    /**
     * 申请域名
     *
     * 申请域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDnsNameRequest 请求对象
     * @return CreateDnsNameResponse
     */
    public CreateDnsNameResponse createDnsName(CreateDnsNameRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.createDnsName);
    }

    /**
     * 申请域名
     *
     * 申请域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDnsNameRequest 请求对象
     * @return SyncInvoker<CreateDnsNameRequest, CreateDnsNameResponse>
     */
    public SyncInvoker<CreateDnsNameRequest, CreateDnsNameResponse> createDnsNameInvoker(CreateDnsNameRequest request) {
        return new SyncInvoker<CreateDnsNameRequest, CreateDnsNameResponse>(request, RdsMeta.createDnsName, hcClient);
    }

    /**
     * 创建数据库实例
     *
     * 创建数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateInstanceRequest 请求对象
     * @return CreateInstanceResponse
     */
    public CreateInstanceResponse createInstance(CreateInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.createInstance);
    }

    /**
     * 创建数据库实例
     *
     * 创建数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateInstanceRequest 请求对象
     * @return SyncInvoker<CreateInstanceRequest, CreateInstanceResponse>
     */
    public SyncInvoker<CreateInstanceRequest, CreateInstanceResponse> createInstanceInvoker(
        CreateInstanceRequest request) {
        return new SyncInvoker<CreateInstanceRequest, CreateInstanceResponse>(request, RdsMeta.createInstance,
            hcClient);
    }

    /**
     * 创建手动备份
     *
     * 创建手动备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateManualBackupRequest 请求对象
     * @return CreateManualBackupResponse
     */
    public CreateManualBackupResponse createManualBackup(CreateManualBackupRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.createManualBackup);
    }

    /**
     * 创建手动备份
     *
     * 创建手动备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateManualBackupRequest 请求对象
     * @return SyncInvoker<CreateManualBackupRequest, CreateManualBackupResponse>
     */
    public SyncInvoker<CreateManualBackupRequest, CreateManualBackupResponse> createManualBackupInvoker(
        CreateManualBackupRequest request) {
        return new SyncInvoker<CreateManualBackupRequest, CreateManualBackupResponse>(request,
            RdsMeta.createManualBackup, hcClient);
    }

    /**
     * 恢复到新实例
     *
     * 恢复到新实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRestoreInstanceRequest 请求对象
     * @return CreateRestoreInstanceResponse
     */
    public CreateRestoreInstanceResponse createRestoreInstance(CreateRestoreInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.createRestoreInstance);
    }

    /**
     * 恢复到新实例
     *
     * 恢复到新实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRestoreInstanceRequest 请求对象
     * @return SyncInvoker<CreateRestoreInstanceRequest, CreateRestoreInstanceResponse>
     */
    public SyncInvoker<CreateRestoreInstanceRequest, CreateRestoreInstanceResponse> createRestoreInstanceInvoker(
        CreateRestoreInstanceRequest request) {
        return new SyncInvoker<CreateRestoreInstanceRequest, CreateRestoreInstanceResponse>(request,
            RdsMeta.createRestoreInstance, hcClient);
    }

    /**
     * 获取扩展日志下载信息
     *
     * 获取扩展日志下载信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateXelLogDownloadRequest 请求对象
     * @return CreateXelLogDownloadResponse
     */
    public CreateXelLogDownloadResponse createXelLogDownload(CreateXelLogDownloadRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.createXelLogDownload);
    }

    /**
     * 获取扩展日志下载信息
     *
     * 获取扩展日志下载信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateXelLogDownloadRequest 请求对象
     * @return SyncInvoker<CreateXelLogDownloadRequest, CreateXelLogDownloadResponse>
     */
    public SyncInvoker<CreateXelLogDownloadRequest, CreateXelLogDownloadResponse> createXelLogDownloadInvoker(
        CreateXelLogDownloadRequest request) {
        return new SyncInvoker<CreateXelLogDownloadRequest, CreateXelLogDownloadResponse>(request,
            RdsMeta.createXelLogDownload, hcClient);
    }

    /**
     * 删除参数模板
     *
     * 删除参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteConfigurationRequest 请求对象
     * @return DeleteConfigurationResponse
     */
    public DeleteConfigurationResponse deleteConfiguration(DeleteConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.deleteConfiguration);
    }

    /**
     * 删除参数模板
     *
     * 删除参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteConfigurationRequest 请求对象
     * @return SyncInvoker<DeleteConfigurationRequest, DeleteConfigurationResponse>
     */
    public SyncInvoker<DeleteConfigurationRequest, DeleteConfigurationResponse> deleteConfigurationInvoker(
        DeleteConfigurationRequest request) {
        return new SyncInvoker<DeleteConfigurationRequest, DeleteConfigurationResponse>(request,
            RdsMeta.deleteConfiguration, hcClient);
    }

    /**
     * 删除数据库实例
     *
     * 删除数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteInstanceRequest 请求对象
     * @return DeleteInstanceResponse
     */
    public DeleteInstanceResponse deleteInstance(DeleteInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.deleteInstance);
    }

    /**
     * 删除数据库实例
     *
     * 删除数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteInstanceRequest 请求对象
     * @return SyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>
     */
    public SyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstanceInvoker(
        DeleteInstanceRequest request) {
        return new SyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>(request, RdsMeta.deleteInstance,
            hcClient);
    }

    /**
     * 删除即时任务
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteJobRequest 请求对象
     * @return DeleteJobResponse
     */
    public DeleteJobResponse deleteJob(DeleteJobRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.deleteJob);
    }

    /**
     * 删除即时任务
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteJobRequest 请求对象
     * @return SyncInvoker<DeleteJobRequest, DeleteJobResponse>
     */
    public SyncInvoker<DeleteJobRequest, DeleteJobResponse> deleteJobInvoker(DeleteJobRequest request) {
        return new SyncInvoker<DeleteJobRequest, DeleteJobResponse>(request, RdsMeta.deleteJob, hcClient);
    }

    /**
     * 删除手动备份
     *
     * 删除手动备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteManualBackupRequest 请求对象
     * @return DeleteManualBackupResponse
     */
    public DeleteManualBackupResponse deleteManualBackup(DeleteManualBackupRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.deleteManualBackup);
    }

    /**
     * 删除手动备份
     *
     * 删除手动备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteManualBackupRequest 请求对象
     * @return SyncInvoker<DeleteManualBackupRequest, DeleteManualBackupResponse>
     */
    public SyncInvoker<DeleteManualBackupRequest, DeleteManualBackupResponse> deleteManualBackupInvoker(
        DeleteManualBackupRequest request) {
        return new SyncInvoker<DeleteManualBackupRequest, DeleteManualBackupResponse>(request,
            RdsMeta.deleteManualBackup, hcClient);
    }

    /**
     * 删除pg_hba.conf文件的单个或多个配置
     *
     * 删除pg_hba.conf文件的单个或多个配置，以priority做唯一标识
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePostgresqlHbaConfRequest 请求对象
     * @return DeletePostgresqlHbaConfResponse
     */
    public DeletePostgresqlHbaConfResponse deletePostgresqlHbaConf(DeletePostgresqlHbaConfRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.deletePostgresqlHbaConf);
    }

    /**
     * 删除pg_hba.conf文件的单个或多个配置
     *
     * 删除pg_hba.conf文件的单个或多个配置，以priority做唯一标识
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePostgresqlHbaConfRequest 请求对象
     * @return SyncInvoker<DeletePostgresqlHbaConfRequest, DeletePostgresqlHbaConfResponse>
     */
    public SyncInvoker<DeletePostgresqlHbaConfRequest, DeletePostgresqlHbaConfResponse> deletePostgresqlHbaConfInvoker(
        DeletePostgresqlHbaConfRequest request) {
        return new SyncInvoker<DeletePostgresqlHbaConfRequest, DeletePostgresqlHbaConfResponse>(request,
            RdsMeta.deletePostgresqlHbaConf, hcClient);
    }

    /**
     * 获取慢日志下载链接
     *
     * 获取慢日志下载链接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DownloadSlowlogRequest 请求对象
     * @return DownloadSlowlogResponse
     */
    public DownloadSlowlogResponse downloadSlowlog(DownloadSlowlogRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.downloadSlowlog);
    }

    /**
     * 获取慢日志下载链接
     *
     * 获取慢日志下载链接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DownloadSlowlogRequest 请求对象
     * @return SyncInvoker<DownloadSlowlogRequest, DownloadSlowlogResponse>
     */
    public SyncInvoker<DownloadSlowlogRequest, DownloadSlowlogResponse> downloadSlowlogInvoker(
        DownloadSlowlogRequest request) {
        return new SyncInvoker<DownloadSlowlogRequest, DownloadSlowlogResponse>(request, RdsMeta.downloadSlowlog,
            hcClient);
    }

    /**
     * 应用参数模板
     *
     * 应用参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param EnableConfigurationRequest 请求对象
     * @return EnableConfigurationResponse
     */
    public EnableConfigurationResponse enableConfiguration(EnableConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.enableConfiguration);
    }

    /**
     * 应用参数模板
     *
     * 应用参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param EnableConfigurationRequest 请求对象
     * @return SyncInvoker<EnableConfigurationRequest, EnableConfigurationResponse>
     */
    public SyncInvoker<EnableConfigurationRequest, EnableConfigurationResponse> enableConfigurationInvoker(
        EnableConfigurationRequest request) {
        return new SyncInvoker<EnableConfigurationRequest, EnableConfigurationResponse>(request,
            RdsMeta.enableConfiguration, hcClient);
    }

    /**
     * 获取审计日志列表
     *
     * 获取审计日志列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAuditlogsRequest 请求对象
     * @return ListAuditlogsResponse
     */
    public ListAuditlogsResponse listAuditlogs(ListAuditlogsRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listAuditlogs);
    }

    /**
     * 获取审计日志列表
     *
     * 获取审计日志列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAuditlogsRequest 请求对象
     * @return SyncInvoker<ListAuditlogsRequest, ListAuditlogsResponse>
     */
    public SyncInvoker<ListAuditlogsRequest, ListAuditlogsResponse> listAuditlogsInvoker(ListAuditlogsRequest request) {
        return new SyncInvoker<ListAuditlogsRequest, ListAuditlogsResponse>(request, RdsMeta.listAuditlogs, hcClient);
    }

    /**
     * 获取备份列表
     *
     * 获取备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBackupsRequest 请求对象
     * @return ListBackupsResponse
     */
    public ListBackupsResponse listBackups(ListBackupsRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listBackups);
    }

    /**
     * 获取备份列表
     *
     * 获取备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBackupsRequest 请求对象
     * @return SyncInvoker<ListBackupsRequest, ListBackupsResponse>
     */
    public SyncInvoker<ListBackupsRequest, ListBackupsResponse> listBackupsInvoker(ListBackupsRequest request) {
        return new SyncInvoker<ListBackupsRequest, ListBackupsResponse>(request, RdsMeta.listBackups, hcClient);
    }

    /**
     * 查询SQLServer可用字符集
     *
     * 查询SQLServer可用字符集
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCollationsRequest 请求对象
     * @return ListCollationsResponse
     */
    public ListCollationsResponse listCollations(ListCollationsRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listCollations);
    }

    /**
     * 查询SQLServer可用字符集
     *
     * 查询SQLServer可用字符集
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCollationsRequest 请求对象
     * @return SyncInvoker<ListCollationsRequest, ListCollationsResponse>
     */
    public SyncInvoker<ListCollationsRequest, ListCollationsResponse> listCollationsInvoker(
        ListCollationsRequest request) {
        return new SyncInvoker<ListCollationsRequest, ListCollationsResponse>(request, RdsMeta.listCollations,
            hcClient);
    }

    /**
     * 获取参数模板列表
     *
     * 获取参数模板列表，包括所有数据库的默认参数模板和用户创建的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListConfigurationsRequest 请求对象
     * @return ListConfigurationsResponse
     */
    public ListConfigurationsResponse listConfigurations(ListConfigurationsRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listConfigurations);
    }

    /**
     * 获取参数模板列表
     *
     * 获取参数模板列表，包括所有数据库的默认参数模板和用户创建的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListConfigurationsRequest 请求对象
     * @return SyncInvoker<ListConfigurationsRequest, ListConfigurationsResponse>
     */
    public SyncInvoker<ListConfigurationsRequest, ListConfigurationsResponse> listConfigurationsInvoker(
        ListConfigurationsRequest request) {
        return new SyncInvoker<ListConfigurationsRequest, ListConfigurationsResponse>(request,
            RdsMeta.listConfigurations, hcClient);
    }

    /**
     * 查询数据库引擎的版本
     *
     * 查询数据库引擎的版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDatastoresRequest 请求对象
     * @return ListDatastoresResponse
     */
    public ListDatastoresResponse listDatastores(ListDatastoresRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listDatastores);
    }

    /**
     * 查询数据库引擎的版本
     *
     * 查询数据库引擎的版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDatastoresRequest 请求对象
     * @return SyncInvoker<ListDatastoresRequest, ListDatastoresResponse>
     */
    public SyncInvoker<ListDatastoresRequest, ListDatastoresResponse> listDatastoresInvoker(
        ListDatastoresRequest request) {
        return new SyncInvoker<ListDatastoresRequest, ListDatastoresResponse>(request, RdsMeta.listDatastores,
            hcClient);
    }

    /**
     * 
     *
     * 批量查询容灾实例信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDrRelationsRequest 请求对象
     * @return ListDrRelationsResponse
     */
    public ListDrRelationsResponse listDrRelations(ListDrRelationsRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listDrRelations);
    }

    /**
     * 
     *
     * 批量查询容灾实例信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDrRelationsRequest 请求对象
     * @return SyncInvoker<ListDrRelationsRequest, ListDrRelationsResponse>
     */
    public SyncInvoker<ListDrRelationsRequest, ListDrRelationsResponse> listDrRelationsInvoker(
        ListDrRelationsRequest request) {
        return new SyncInvoker<ListDrRelationsRequest, ListDrRelationsResponse>(request, RdsMeta.listDrRelations,
            hcClient);
    }

    /**
     * 查询实例可变更规格
     *
     * 查询实例可变更规格
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEngineFlavorsRequest 请求对象
     * @return ListEngineFlavorsResponse
     */
    public ListEngineFlavorsResponse listEngineFlavors(ListEngineFlavorsRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listEngineFlavors);
    }

    /**
     * 查询实例可变更规格
     *
     * 查询实例可变更规格
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEngineFlavorsRequest 请求对象
     * @return SyncInvoker<ListEngineFlavorsRequest, ListEngineFlavorsResponse>
     */
    public SyncInvoker<ListEngineFlavorsRequest, ListEngineFlavorsResponse> listEngineFlavorsInvoker(
        ListEngineFlavorsRequest request) {
        return new SyncInvoker<ListEngineFlavorsRequest, ListEngineFlavorsResponse>(request, RdsMeta.listEngineFlavors,
            hcClient);
    }

    /**
     * 查询数据库错误日志
     *
     * 查询数据库错误日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListErrorLogsRequest 请求对象
     * @return ListErrorLogsResponse
     */
    public ListErrorLogsResponse listErrorLogs(ListErrorLogsRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listErrorLogs);
    }

    /**
     * 查询数据库错误日志
     *
     * 查询数据库错误日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListErrorLogsRequest 请求对象
     * @return SyncInvoker<ListErrorLogsRequest, ListErrorLogsResponse>
     */
    public SyncInvoker<ListErrorLogsRequest, ListErrorLogsResponse> listErrorLogsInvoker(ListErrorLogsRequest request) {
        return new SyncInvoker<ListErrorLogsRequest, ListErrorLogsResponse>(request, RdsMeta.listErrorLogs, hcClient);
    }

    /**
     * 查询数据库错误日志
     *
     * 查询数据库错误日志。(与原v3接口相比修改offset,符合华为云服务开放 API遵从性规范3.0)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListErrorLogsNewRequest 请求对象
     * @return ListErrorLogsNewResponse
     */
    public ListErrorLogsNewResponse listErrorLogsNew(ListErrorLogsNewRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listErrorLogsNew);
    }

    /**
     * 查询数据库错误日志
     *
     * 查询数据库错误日志。(与原v3接口相比修改offset,符合华为云服务开放 API遵从性规范3.0)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListErrorLogsNewRequest 请求对象
     * @return SyncInvoker<ListErrorLogsNewRequest, ListErrorLogsNewResponse>
     */
    public SyncInvoker<ListErrorLogsNewRequest, ListErrorLogsNewResponse> listErrorLogsNewInvoker(
        ListErrorLogsNewRequest request) {
        return new SyncInvoker<ListErrorLogsNewRequest, ListErrorLogsNewResponse>(request, RdsMeta.listErrorLogsNew,
            hcClient);
    }

    /**
     * 
     *
     * 查询实例的错误日志数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListErrorlogForLtsRequest 请求对象
     * @return ListErrorlogForLtsResponse
     */
    public ListErrorlogForLtsResponse listErrorlogForLts(ListErrorlogForLtsRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listErrorlogForLts);
    }

    /**
     * 
     *
     * 查询实例的错误日志数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListErrorlogForLtsRequest 请求对象
     * @return SyncInvoker<ListErrorlogForLtsRequest, ListErrorlogForLtsResponse>
     */
    public SyncInvoker<ListErrorlogForLtsRequest, ListErrorlogForLtsResponse> listErrorlogForLtsInvoker(
        ListErrorlogForLtsRequest request) {
        return new SyncInvoker<ListErrorlogForLtsRequest, ListErrorlogForLtsResponse>(request,
            RdsMeta.listErrorlogForLts, hcClient);
    }

    /**
     * 查询数据库规格
     *
     * 查询数据库规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFlavorsRequest 请求对象
     * @return ListFlavorsResponse
     */
    public ListFlavorsResponse listFlavors(ListFlavorsRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listFlavors);
    }

    /**
     * 查询数据库规格
     *
     * 查询数据库规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFlavorsRequest 请求对象
     * @return SyncInvoker<ListFlavorsRequest, ListFlavorsResponse>
     */
    public SyncInvoker<ListFlavorsRequest, ListFlavorsResponse> listFlavorsInvoker(ListFlavorsRequest request) {
        return new SyncInvoker<ListFlavorsRequest, ListFlavorsResponse>(request, RdsMeta.listFlavors, hcClient);
    }

    /**
     * 查询指定时间点可恢复的库
     *
     * 查询指定时间点可恢复的库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListHistoryDatabaseRequest 请求对象
     * @return ListHistoryDatabaseResponse
     */
    public ListHistoryDatabaseResponse listHistoryDatabase(ListHistoryDatabaseRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listHistoryDatabase);
    }

    /**
     * 查询指定时间点可恢复的库
     *
     * 查询指定时间点可恢复的库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListHistoryDatabaseRequest 请求对象
     * @return SyncInvoker<ListHistoryDatabaseRequest, ListHistoryDatabaseResponse>
     */
    public SyncInvoker<ListHistoryDatabaseRequest, ListHistoryDatabaseResponse> listHistoryDatabaseInvoker(
        ListHistoryDatabaseRequest request) {
        return new SyncInvoker<ListHistoryDatabaseRequest, ListHistoryDatabaseResponse>(request,
            RdsMeta.listHistoryDatabase, hcClient);
    }

    /**
     * 
     *
     * 查询实例大版本升级检查历史。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInspectionHistoriesRequest 请求对象
     * @return ListInspectionHistoriesResponse
     */
    public ListInspectionHistoriesResponse listInspectionHistories(ListInspectionHistoriesRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listInspectionHistories);
    }

    /**
     * 
     *
     * 查询实例大版本升级检查历史。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInspectionHistoriesRequest 请求对象
     * @return SyncInvoker<ListInspectionHistoriesRequest, ListInspectionHistoriesResponse>
     */
    public SyncInvoker<ListInspectionHistoriesRequest, ListInspectionHistoriesResponse> listInspectionHistoriesInvoker(
        ListInspectionHistoriesRequest request) {
        return new SyncInvoker<ListInspectionHistoriesRequest, ListInspectionHistoriesResponse>(request,
            RdsMeta.listInspectionHistories, hcClient);
    }

    /**
     * 获取诊断后的实例数量
     *
     * 获取诊断后的实例数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstanceDiagnosisRequest 请求对象
     * @return ListInstanceDiagnosisResponse
     */
    public ListInstanceDiagnosisResponse listInstanceDiagnosis(ListInstanceDiagnosisRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listInstanceDiagnosis);
    }

    /**
     * 获取诊断后的实例数量
     *
     * 获取诊断后的实例数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstanceDiagnosisRequest 请求对象
     * @return SyncInvoker<ListInstanceDiagnosisRequest, ListInstanceDiagnosisResponse>
     */
    public SyncInvoker<ListInstanceDiagnosisRequest, ListInstanceDiagnosisResponse> listInstanceDiagnosisInvoker(
        ListInstanceDiagnosisRequest request) {
        return new SyncInvoker<ListInstanceDiagnosisRequest, ListInstanceDiagnosisResponse>(request,
            RdsMeta.listInstanceDiagnosis, hcClient);
    }

    /**
     * 查询实例参数修改历史
     *
     * 实例参数修改历史。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstanceParamHistoriesRequest 请求对象
     * @return ListInstanceParamHistoriesResponse
     */
    public ListInstanceParamHistoriesResponse listInstanceParamHistories(ListInstanceParamHistoriesRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listInstanceParamHistories);
    }

    /**
     * 查询实例参数修改历史
     *
     * 实例参数修改历史。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstanceParamHistoriesRequest 请求对象
     * @return SyncInvoker<ListInstanceParamHistoriesRequest, ListInstanceParamHistoriesResponse>
     */
    public SyncInvoker<ListInstanceParamHistoriesRequest, ListInstanceParamHistoriesResponse> listInstanceParamHistoriesInvoker(
        ListInstanceParamHistoriesRequest request) {
        return new SyncInvoker<ListInstanceParamHistoriesRequest, ListInstanceParamHistoriesResponse>(request,
            RdsMeta.listInstanceParamHistories, hcClient);
    }

    /**
     * 查询实例标签
     *
     * 查询实例标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstanceTagsRequest 请求对象
     * @return ListInstanceTagsResponse
     */
    public ListInstanceTagsResponse listInstanceTags(ListInstanceTagsRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listInstanceTags);
    }

    /**
     * 查询实例标签
     *
     * 查询实例标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstanceTagsRequest 请求对象
     * @return SyncInvoker<ListInstanceTagsRequest, ListInstanceTagsResponse>
     */
    public SyncInvoker<ListInstanceTagsRequest, ListInstanceTagsResponse> listInstanceTagsInvoker(
        ListInstanceTagsRequest request) {
        return new SyncInvoker<ListInstanceTagsRequest, ListInstanceTagsResponse>(request, RdsMeta.listInstanceTags,
            hcClient);
    }

    /**
     * 查询数据库实例列表
     *
     * 查询数据库实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstancesRequest 请求对象
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstances(ListInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listInstances);
    }

    /**
     * 查询数据库实例列表
     *
     * 查询数据库实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstancesRequest 请求对象
     * @return SyncInvoker<ListInstancesRequest, ListInstancesResponse>
     */
    public SyncInvoker<ListInstancesRequest, ListInstancesResponse> listInstancesInvoker(ListInstancesRequest request) {
        return new SyncInvoker<ListInstancesRequest, ListInstancesResponse>(request, RdsMeta.listInstances, hcClient);
    }

    /**
     * 获取指定诊断项的诊断结果
     *
     * 获取指定诊断项的诊断结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstancesInfoDiagnosisRequest 请求对象
     * @return ListInstancesInfoDiagnosisResponse
     */
    public ListInstancesInfoDiagnosisResponse listInstancesInfoDiagnosis(ListInstancesInfoDiagnosisRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listInstancesInfoDiagnosis);
    }

    /**
     * 获取指定诊断项的诊断结果
     *
     * 获取指定诊断项的诊断结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstancesInfoDiagnosisRequest 请求对象
     * @return SyncInvoker<ListInstancesInfoDiagnosisRequest, ListInstancesInfoDiagnosisResponse>
     */
    public SyncInvoker<ListInstancesInfoDiagnosisRequest, ListInstancesInfoDiagnosisResponse> listInstancesInfoDiagnosisInvoker(
        ListInstancesInfoDiagnosisRequest request) {
        return new SyncInvoker<ListInstancesInfoDiagnosisRequest, ListInstancesInfoDiagnosisResponse>(request,
            RdsMeta.listInstancesInfoDiagnosis, hcClient);
    }

    /**
     * 获取实例是否能使用极速恢复
     *
     * 批量获取实例是否能在库表恢复时使用极速恢复。
     * 
     * - 调用接口前，您需要了解API 认证鉴权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstancesSupportFastRestoreRequest 请求对象
     * @return ListInstancesSupportFastRestoreResponse
     */
    public ListInstancesSupportFastRestoreResponse listInstancesSupportFastRestore(
        ListInstancesSupportFastRestoreRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listInstancesSupportFastRestore);
    }

    /**
     * 获取实例是否能使用极速恢复
     *
     * 批量获取实例是否能在库表恢复时使用极速恢复。
     * 
     * - 调用接口前，您需要了解API 认证鉴权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstancesSupportFastRestoreRequest 请求对象
     * @return SyncInvoker<ListInstancesSupportFastRestoreRequest, ListInstancesSupportFastRestoreResponse>
     */
    public SyncInvoker<ListInstancesSupportFastRestoreRequest, ListInstancesSupportFastRestoreResponse> listInstancesSupportFastRestoreInvoker(
        ListInstancesSupportFastRestoreRequest request) {
        return new SyncInvoker<ListInstancesSupportFastRestoreRequest, ListInstancesSupportFastRestoreResponse>(request,
            RdsMeta.listInstancesSupportFastRestore, hcClient);
    }

    /**
     * 获取指定ID的任务信息
     *
     * 获取指定ID的任务信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListJobInfoRequest 请求对象
     * @return ListJobInfoResponse
     */
    public ListJobInfoResponse listJobInfo(ListJobInfoRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listJobInfo);
    }

    /**
     * 获取指定ID的任务信息
     *
     * 获取指定ID的任务信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListJobInfoRequest 请求对象
     * @return SyncInvoker<ListJobInfoRequest, ListJobInfoResponse>
     */
    public SyncInvoker<ListJobInfoRequest, ListJobInfoResponse> listJobInfoInvoker(ListJobInfoRequest request) {
        return new SyncInvoker<ListJobInfoRequest, ListJobInfoResponse>(request, RdsMeta.listJobInfo, hcClient);
    }

    /**
     * 获取指定实例和时间范围的任务信息（SQL Server）
     *
     * 获取指定实例和时间范围的任务信息（SQL Server）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListJobInfoDetailRequest 请求对象
     * @return ListJobInfoDetailResponse
     */
    public ListJobInfoDetailResponse listJobInfoDetail(ListJobInfoDetailRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listJobInfoDetail);
    }

    /**
     * 获取指定实例和时间范围的任务信息（SQL Server）
     *
     * 获取指定实例和时间范围的任务信息（SQL Server）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListJobInfoDetailRequest 请求对象
     * @return SyncInvoker<ListJobInfoDetailRequest, ListJobInfoDetailResponse>
     */
    public SyncInvoker<ListJobInfoDetailRequest, ListJobInfoDetailResponse> listJobInfoDetailInvoker(
        ListJobInfoDetailRequest request) {
        return new SyncInvoker<ListJobInfoDetailRequest, ListJobInfoDetailResponse>(request, RdsMeta.listJobInfoDetail,
            hcClient);
    }

    /**
     * 查询跨区域备份列表
     *
     * 查询跨区域备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListOffSiteBackupsRequest 请求对象
     * @return ListOffSiteBackupsResponse
     */
    public ListOffSiteBackupsResponse listOffSiteBackups(ListOffSiteBackupsRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listOffSiteBackups);
    }

    /**
     * 查询跨区域备份列表
     *
     * 查询跨区域备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListOffSiteBackupsRequest 请求对象
     * @return SyncInvoker<ListOffSiteBackupsRequest, ListOffSiteBackupsResponse>
     */
    public SyncInvoker<ListOffSiteBackupsRequest, ListOffSiteBackupsResponse> listOffSiteBackupsInvoker(
        ListOffSiteBackupsRequest request) {
        return new SyncInvoker<ListOffSiteBackupsRequest, ListOffSiteBackupsResponse>(request,
            RdsMeta.listOffSiteBackups, hcClient);
    }

    /**
     * 查询跨区域备份实例列表
     *
     * 查询跨区域备份实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListOffSiteInstancesRequest 请求对象
     * @return ListOffSiteInstancesResponse
     */
    public ListOffSiteInstancesResponse listOffSiteInstances(ListOffSiteInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listOffSiteInstances);
    }

    /**
     * 查询跨区域备份实例列表
     *
     * 查询跨区域备份实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListOffSiteInstancesRequest 请求对象
     * @return SyncInvoker<ListOffSiteInstancesRequest, ListOffSiteInstancesResponse>
     */
    public SyncInvoker<ListOffSiteInstancesRequest, ListOffSiteInstancesResponse> listOffSiteInstancesInvoker(
        ListOffSiteInstancesRequest request) {
        return new SyncInvoker<ListOffSiteInstancesRequest, ListOffSiteInstancesResponse>(request,
            RdsMeta.listOffSiteInstances, hcClient);
    }

    /**
     * 查询跨区域备份可恢复时间段
     *
     * 查询跨区域备份可恢复时间段。
     * 如果您备份策略中的保存天数设置较长，建议您传入查询日期“date”。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListOffSiteRestoreTimesRequest 请求对象
     * @return ListOffSiteRestoreTimesResponse
     */
    public ListOffSiteRestoreTimesResponse listOffSiteRestoreTimes(ListOffSiteRestoreTimesRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listOffSiteRestoreTimes);
    }

    /**
     * 查询跨区域备份可恢复时间段
     *
     * 查询跨区域备份可恢复时间段。
     * 如果您备份策略中的保存天数设置较长，建议您传入查询日期“date”。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListOffSiteRestoreTimesRequest 请求对象
     * @return SyncInvoker<ListOffSiteRestoreTimesRequest, ListOffSiteRestoreTimesResponse>
     */
    public SyncInvoker<ListOffSiteRestoreTimesRequest, ListOffSiteRestoreTimesResponse> listOffSiteRestoreTimesInvoker(
        ListOffSiteRestoreTimesRequest request) {
        return new SyncInvoker<ListOffSiteRestoreTimesRequest, ListOffSiteRestoreTimesResponse>(request,
            RdsMeta.listOffSiteRestoreTimes, hcClient);
    }

    /**
     * 查询实例的pg_hba.conf文件配置
     *
     * 查询实例的pg_hba.conf文件配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPostgresqlHbaInfoRequest 请求对象
     * @return ListPostgresqlHbaInfoResponse
     */
    public ListPostgresqlHbaInfoResponse listPostgresqlHbaInfo(ListPostgresqlHbaInfoRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listPostgresqlHbaInfo);
    }

    /**
     * 查询实例的pg_hba.conf文件配置
     *
     * 查询实例的pg_hba.conf文件配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPostgresqlHbaInfoRequest 请求对象
     * @return SyncInvoker<ListPostgresqlHbaInfoRequest, ListPostgresqlHbaInfoResponse>
     */
    public SyncInvoker<ListPostgresqlHbaInfoRequest, ListPostgresqlHbaInfoResponse> listPostgresqlHbaInfoInvoker(
        ListPostgresqlHbaInfoRequest request) {
        return new SyncInvoker<ListPostgresqlHbaInfoRequest, ListPostgresqlHbaInfoResponse>(request,
            RdsMeta.listPostgresqlHbaInfo, hcClient);
    }

    /**
     * 查询实例的pg_hba.conf文件修改历史
     *
     * 查询实例的pg_hba.conf文件修改历史
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPostgresqlHbaInfoHistoryRequest 请求对象
     * @return ListPostgresqlHbaInfoHistoryResponse
     */
    public ListPostgresqlHbaInfoHistoryResponse listPostgresqlHbaInfoHistory(
        ListPostgresqlHbaInfoHistoryRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listPostgresqlHbaInfoHistory);
    }

    /**
     * 查询实例的pg_hba.conf文件修改历史
     *
     * 查询实例的pg_hba.conf文件修改历史
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPostgresqlHbaInfoHistoryRequest 请求对象
     * @return SyncInvoker<ListPostgresqlHbaInfoHistoryRequest, ListPostgresqlHbaInfoHistoryResponse>
     */
    public SyncInvoker<ListPostgresqlHbaInfoHistoryRequest, ListPostgresqlHbaInfoHistoryResponse> listPostgresqlHbaInfoHistoryInvoker(
        ListPostgresqlHbaInfoHistoryRequest request) {
        return new SyncInvoker<ListPostgresqlHbaInfoHistoryRequest, ListPostgresqlHbaInfoHistoryResponse>(request,
            RdsMeta.listPostgresqlHbaInfoHistory, hcClient);
    }

    /**
     * 查询指定时间点可恢复的表(PostgreSQL)
     *
     * 查询指定时间点可恢复的表(PostgreSQL)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPostgresqlListHistoryTablesRequest 请求对象
     * @return ListPostgresqlListHistoryTablesResponse
     */
    public ListPostgresqlListHistoryTablesResponse listPostgresqlListHistoryTables(
        ListPostgresqlListHistoryTablesRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listPostgresqlListHistoryTables);
    }

    /**
     * 查询指定时间点可恢复的表(PostgreSQL)
     *
     * 查询指定时间点可恢复的表(PostgreSQL)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPostgresqlListHistoryTablesRequest 请求对象
     * @return SyncInvoker<ListPostgresqlListHistoryTablesRequest, ListPostgresqlListHistoryTablesResponse>
     */
    public SyncInvoker<ListPostgresqlListHistoryTablesRequest, ListPostgresqlListHistoryTablesResponse> listPostgresqlListHistoryTablesInvoker(
        ListPostgresqlListHistoryTablesRequest request) {
        return new SyncInvoker<ListPostgresqlListHistoryTablesRequest, ListPostgresqlListHistoryTablesResponse>(request,
            RdsMeta.listPostgresqlListHistoryTables, hcClient);
    }

    /**
     * 
     *
     * 查询预定义标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPredefinedTagRequest 请求对象
     * @return ListPredefinedTagResponse
     */
    public ListPredefinedTagResponse listPredefinedTag(ListPredefinedTagRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listPredefinedTag);
    }

    /**
     * 
     *
     * 查询预定义标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPredefinedTagRequest 请求对象
     * @return SyncInvoker<ListPredefinedTagRequest, ListPredefinedTagResponse>
     */
    public SyncInvoker<ListPredefinedTagRequest, ListPredefinedTagResponse> listPredefinedTagInvoker(
        ListPredefinedTagRequest request) {
        return new SyncInvoker<ListPredefinedTagRequest, ListPredefinedTagResponse>(request, RdsMeta.listPredefinedTag,
            hcClient);
    }

    /**
     * 查询项目标签
     *
     * 查询项目标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProjectTagsRequest 请求对象
     * @return ListProjectTagsResponse
     */
    public ListProjectTagsResponse listProjectTags(ListProjectTagsRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listProjectTags);
    }

    /**
     * 查询项目标签
     *
     * 查询项目标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProjectTagsRequest 请求对象
     * @return SyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse>
     */
    public SyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse> listProjectTagsInvoker(
        ListProjectTagsRequest request) {
        return new SyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse>(request, RdsMeta.listProjectTags,
            hcClient);
    }

    /**
     * 查询回收站
     *
     * 查询回收站实例信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRecycleInstancesRequest 请求对象
     * @return ListRecycleInstancesResponse
     */
    public ListRecycleInstancesResponse listRecycleInstances(ListRecycleInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listRecycleInstances);
    }

    /**
     * 查询回收站
     *
     * 查询回收站实例信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRecycleInstancesRequest 请求对象
     * @return SyncInvoker<ListRecycleInstancesRequest, ListRecycleInstancesResponse>
     */
    public SyncInvoker<ListRecycleInstancesRequest, ListRecycleInstancesResponse> listRecycleInstancesInvoker(
        ListRecycleInstancesRequest request) {
        return new SyncInvoker<ListRecycleInstancesRequest, ListRecycleInstancesResponse>(request,
            RdsMeta.listRecycleInstances, hcClient);
    }

    /**
     * 查询可恢复时间段
     *
     * 查询可恢复时间段。
     * 如果您备份策略中的保存天数设置较长，建议您传入查询日期“date”。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRestoreTimesRequest 请求对象
     * @return ListRestoreTimesResponse
     */
    public ListRestoreTimesResponse listRestoreTimes(ListRestoreTimesRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listRestoreTimes);
    }

    /**
     * 查询可恢复时间段
     *
     * 查询可恢复时间段。
     * 如果您备份策略中的保存天数设置较长，建议您传入查询日期“date”。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRestoreTimesRequest 请求对象
     * @return SyncInvoker<ListRestoreTimesRequest, ListRestoreTimesResponse>
     */
    public SyncInvoker<ListRestoreTimesRequest, ListRestoreTimesResponse> listRestoreTimesInvoker(
        ListRestoreTimesRequest request) {
        return new SyncInvoker<ListRestoreTimesRequest, ListRestoreTimesResponse>(request, RdsMeta.listRestoreTimes,
            hcClient);
    }

    /**
     * 
     *
     * 获取指定实例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSimplifiedInstancesRequest 请求对象
     * @return ListSimplifiedInstancesResponse
     */
    public ListSimplifiedInstancesResponse listSimplifiedInstances(ListSimplifiedInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listSimplifiedInstances);
    }

    /**
     * 
     *
     * 获取指定实例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSimplifiedInstancesRequest 请求对象
     * @return SyncInvoker<ListSimplifiedInstancesRequest, ListSimplifiedInstancesResponse>
     */
    public SyncInvoker<ListSimplifiedInstancesRequest, ListSimplifiedInstancesResponse> listSimplifiedInstancesInvoker(
        ListSimplifiedInstancesRequest request) {
        return new SyncInvoker<ListSimplifiedInstancesRequest, ListSimplifiedInstancesResponse>(request,
            RdsMeta.listSimplifiedInstances, hcClient);
    }

    /**
     * 查询慢日志文件列表
     *
     * 查询慢日志文件列表。
     * 调用该接口取到慢日志文件名后，可以调用接口/v3/{project_id}/instances/{instance_id}/slowlog-download 获取慢日志文件下载链接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSlowLogFileRequest 请求对象
     * @return ListSlowLogFileResponse
     */
    public ListSlowLogFileResponse listSlowLogFile(ListSlowLogFileRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listSlowLogFile);
    }

    /**
     * 查询慢日志文件列表
     *
     * 查询慢日志文件列表。
     * 调用该接口取到慢日志文件名后，可以调用接口/v3/{project_id}/instances/{instance_id}/slowlog-download 获取慢日志文件下载链接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSlowLogFileRequest 请求对象
     * @return SyncInvoker<ListSlowLogFileRequest, ListSlowLogFileResponse>
     */
    public SyncInvoker<ListSlowLogFileRequest, ListSlowLogFileResponse> listSlowLogFileInvoker(
        ListSlowLogFileRequest request) {
        return new SyncInvoker<ListSlowLogFileRequest, ListSlowLogFileResponse>(request, RdsMeta.listSlowLogFile,
            hcClient);
    }

    /**
     * 
     *
     * 查询实例慢日志的统计数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSlowLogStatisticsForLtsRequest 请求对象
     * @return ListSlowLogStatisticsForLtsResponse
     */
    public ListSlowLogStatisticsForLtsResponse listSlowLogStatisticsForLts(ListSlowLogStatisticsForLtsRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listSlowLogStatisticsForLts);
    }

    /**
     * 
     *
     * 查询实例慢日志的统计数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSlowLogStatisticsForLtsRequest 请求对象
     * @return SyncInvoker<ListSlowLogStatisticsForLtsRequest, ListSlowLogStatisticsForLtsResponse>
     */
    public SyncInvoker<ListSlowLogStatisticsForLtsRequest, ListSlowLogStatisticsForLtsResponse> listSlowLogStatisticsForLtsInvoker(
        ListSlowLogStatisticsForLtsRequest request) {
        return new SyncInvoker<ListSlowLogStatisticsForLtsRequest, ListSlowLogStatisticsForLtsResponse>(request,
            RdsMeta.listSlowLogStatisticsForLts, hcClient);
    }

    /**
     * 查询数据库慢日志
     *
     * 查询数据库慢日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSlowLogsRequest 请求对象
     * @return ListSlowLogsResponse
     */
    public ListSlowLogsResponse listSlowLogs(ListSlowLogsRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listSlowLogs);
    }

    /**
     * 查询数据库慢日志
     *
     * 查询数据库慢日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSlowLogsRequest 请求对象
     * @return SyncInvoker<ListSlowLogsRequest, ListSlowLogsResponse>
     */
    public SyncInvoker<ListSlowLogsRequest, ListSlowLogsResponse> listSlowLogsInvoker(ListSlowLogsRequest request) {
        return new SyncInvoker<ListSlowLogsRequest, ListSlowLogsResponse>(request, RdsMeta.listSlowLogs, hcClient);
    }

    /**
     * 查询数据库慢日志
     *
     * 查询数据库慢日志。(与原v3接口相比修改offset,符合华为云服务开放 API遵从性规范3.0)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSlowLogsNewRequest 请求对象
     * @return ListSlowLogsNewResponse
     */
    public ListSlowLogsNewResponse listSlowLogsNew(ListSlowLogsNewRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listSlowLogsNew);
    }

    /**
     * 查询数据库慢日志
     *
     * 查询数据库慢日志。(与原v3接口相比修改offset,符合华为云服务开放 API遵从性规范3.0)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSlowLogsNewRequest 请求对象
     * @return SyncInvoker<ListSlowLogsNewRequest, ListSlowLogsNewResponse>
     */
    public SyncInvoker<ListSlowLogsNewRequest, ListSlowLogsNewResponse> listSlowLogsNewInvoker(
        ListSlowLogsNewRequest request) {
        return new SyncInvoker<ListSlowLogsNewRequest, ListSlowLogsNewResponse>(request, RdsMeta.listSlowLogsNew,
            hcClient);
    }

    /**
     * 
     *
     * 查询实例的慢日志数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSlowlogForLtsRequest 请求对象
     * @return ListSlowlogForLtsResponse
     */
    public ListSlowlogForLtsResponse listSlowlogForLts(ListSlowlogForLtsRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listSlowlogForLts);
    }

    /**
     * 
     *
     * 查询实例的慢日志数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSlowlogForLtsRequest 请求对象
     * @return SyncInvoker<ListSlowlogForLtsRequest, ListSlowlogForLtsResponse>
     */
    public SyncInvoker<ListSlowlogForLtsRequest, ListSlowlogForLtsResponse> listSlowlogForLtsInvoker(
        ListSlowlogForLtsRequest request) {
        return new SyncInvoker<ListSlowlogForLtsRequest, ListSlowlogForLtsResponse>(request, RdsMeta.listSlowlogForLts,
            hcClient);
    }

    /**
     * 获取慢日志统计信息
     *
     * 获取慢日志统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSlowlogStatisticsRequest 请求对象
     * @return ListSlowlogStatisticsResponse
     */
    public ListSlowlogStatisticsResponse listSlowlogStatistics(ListSlowlogStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listSlowlogStatistics);
    }

    /**
     * 获取慢日志统计信息
     *
     * 获取慢日志统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSlowlogStatisticsRequest 请求对象
     * @return SyncInvoker<ListSlowlogStatisticsRequest, ListSlowlogStatisticsResponse>
     */
    public SyncInvoker<ListSlowlogStatisticsRequest, ListSlowlogStatisticsResponse> listSlowlogStatisticsInvoker(
        ListSlowlogStatisticsRequest request) {
        return new SyncInvoker<ListSlowlogStatisticsRequest, ListSlowlogStatisticsResponse>(request,
            RdsMeta.listSlowlogStatistics, hcClient);
    }

    /**
     * 获取SSL证书下载地址
     *
     * 获取SSL证书下载地址
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSslCertDownloadLinkRequest 请求对象
     * @return ListSslCertDownloadLinkResponse
     */
    public ListSslCertDownloadLinkResponse listSslCertDownloadLink(ListSslCertDownloadLinkRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listSslCertDownloadLink);
    }

    /**
     * 获取SSL证书下载地址
     *
     * 获取SSL证书下载地址
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSslCertDownloadLinkRequest 请求对象
     * @return SyncInvoker<ListSslCertDownloadLinkRequest, ListSslCertDownloadLinkResponse>
     */
    public SyncInvoker<ListSslCertDownloadLinkRequest, ListSslCertDownloadLinkResponse> listSslCertDownloadLinkInvoker(
        ListSslCertDownloadLinkRequest request) {
        return new SyncInvoker<ListSslCertDownloadLinkRequest, ListSslCertDownloadLinkResponse>(request,
            RdsMeta.listSslCertDownloadLink, hcClient);
    }

    /**
     * 查询数据库磁盘类型
     *
     * 查询数据库磁盘类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStorageTypesRequest 请求对象
     * @return ListStorageTypesResponse
     */
    public ListStorageTypesResponse listStorageTypes(ListStorageTypesRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listStorageTypes);
    }

    /**
     * 查询数据库磁盘类型
     *
     * 查询数据库磁盘类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStorageTypesRequest 请求对象
     * @return SyncInvoker<ListStorageTypesRequest, ListStorageTypesResponse>
     */
    public SyncInvoker<ListStorageTypesRequest, ListStorageTypesResponse> listStorageTypesInvoker(
        ListStorageTypesRequest request) {
        return new SyncInvoker<ListStorageTypesRequest, ListStorageTypesResponse>(request, RdsMeta.listStorageTypes,
            hcClient);
    }

    /**
     * 
     *
     * 查询实例大版本升级历史信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListUpgradeHistoriesRequest 请求对象
     * @return ListUpgradeHistoriesResponse
     */
    public ListUpgradeHistoriesResponse listUpgradeHistories(ListUpgradeHistoriesRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listUpgradeHistories);
    }

    /**
     * 
     *
     * 查询实例大版本升级历史信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListUpgradeHistoriesRequest 请求对象
     * @return SyncInvoker<ListUpgradeHistoriesRequest, ListUpgradeHistoriesResponse>
     */
    public SyncInvoker<ListUpgradeHistoriesRequest, ListUpgradeHistoriesResponse> listUpgradeHistoriesInvoker(
        ListUpgradeHistoriesRequest request) {
        return new SyncInvoker<ListUpgradeHistoriesRequest, ListUpgradeHistoriesResponse>(request,
            RdsMeta.listUpgradeHistories, hcClient);
    }

    /**
     * 查询扩展日志文件列表
     *
     * 查询扩展日志文件列表。
     * 查询扩展日志文件列表，可以调用接口/v3/{project_id}/instances/{instance_id}/xellog-download 获取扩展日志下载链接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListXellogFilesRequest 请求对象
     * @return ListXellogFilesResponse
     */
    public ListXellogFilesResponse listXellogFiles(ListXellogFilesRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listXellogFiles);
    }

    /**
     * 查询扩展日志文件列表
     *
     * 查询扩展日志文件列表。
     * 查询扩展日志文件列表，可以调用接口/v3/{project_id}/instances/{instance_id}/xellog-download 获取扩展日志下载链接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListXellogFilesRequest 请求对象
     * @return SyncInvoker<ListXellogFilesRequest, ListXellogFilesResponse>
     */
    public SyncInvoker<ListXellogFilesRequest, ListXellogFilesResponse> listXellogFilesInvoker(
        ListXellogFilesRequest request) {
        return new SyncInvoker<ListXellogFilesRequest, ListXellogFilesResponse>(request, RdsMeta.listXellogFiles,
            hcClient);
    }

    /**
     * 迁移主备实例的备机
     *
     * 迁移主备实例的备机
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param MigrateFollowerRequest 请求对象
     * @return MigrateFollowerResponse
     */
    public MigrateFollowerResponse migrateFollower(MigrateFollowerRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.migrateFollower);
    }

    /**
     * 迁移主备实例的备机
     *
     * 迁移主备实例的备机
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param MigrateFollowerRequest 请求对象
     * @return SyncInvoker<MigrateFollowerRequest, MigrateFollowerResponse>
     */
    public SyncInvoker<MigrateFollowerRequest, MigrateFollowerResponse> migrateFollowerInvoker(
        MigrateFollowerRequest request) {
        return new SyncInvoker<MigrateFollowerRequest, MigrateFollowerResponse>(request, RdsMeta.migrateFollower,
            hcClient);
    }

    /**
     * 修改pg_hba.conf文件的单个或多个配置
     *
     * 修改/新增pg_hba.conf文件的单个或多个配置，以priority做唯一标识，priority不存在的新增，存在的修改
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ModifyPostgresqlHbaConfRequest 请求对象
     * @return ModifyPostgresqlHbaConfResponse
     */
    public ModifyPostgresqlHbaConfResponse modifyPostgresqlHbaConf(ModifyPostgresqlHbaConfRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.modifyPostgresqlHbaConf);
    }

    /**
     * 修改pg_hba.conf文件的单个或多个配置
     *
     * 修改/新增pg_hba.conf文件的单个或多个配置，以priority做唯一标识，priority不存在的新增，存在的修改
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ModifyPostgresqlHbaConfRequest 请求对象
     * @return SyncInvoker<ModifyPostgresqlHbaConfRequest, ModifyPostgresqlHbaConfResponse>
     */
    public SyncInvoker<ModifyPostgresqlHbaConfRequest, ModifyPostgresqlHbaConfResponse> modifyPostgresqlHbaConfInvoker(
        ModifyPostgresqlHbaConfRequest request) {
        return new SyncInvoker<ModifyPostgresqlHbaConfRequest, ModifyPostgresqlHbaConfResponse>(request,
            RdsMeta.modifyPostgresqlHbaConf, hcClient);
    }

    /**
     * 恢复到已有实例
     *
     * 恢复到已有实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestoreExistInstanceRequest 请求对象
     * @return RestoreExistInstanceResponse
     */
    public RestoreExistInstanceResponse restoreExistInstance(RestoreExistInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.restoreExistInstance);
    }

    /**
     * 恢复到已有实例
     *
     * 恢复到已有实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestoreExistInstanceRequest 请求对象
     * @return SyncInvoker<RestoreExistInstanceRequest, RestoreExistInstanceResponse>
     */
    public SyncInvoker<RestoreExistInstanceRequest, RestoreExistInstanceResponse> restoreExistInstanceInvoker(
        RestoreExistInstanceRequest request) {
        return new SyncInvoker<RestoreExistInstanceRequest, RestoreExistInstanceResponse>(request,
            RdsMeta.restoreExistInstance, hcClient);
    }

    /**
     * 表级时间点恢复(MySQL)
     *
     * 表级时间点恢复(MySQL)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestoreTablesRequest 请求对象
     * @return RestoreTablesResponse
     */
    public RestoreTablesResponse restoreTables(RestoreTablesRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.restoreTables);
    }

    /**
     * 表级时间点恢复(MySQL)
     *
     * 表级时间点恢复(MySQL)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestoreTablesRequest 请求对象
     * @return SyncInvoker<RestoreTablesRequest, RestoreTablesResponse>
     */
    public SyncInvoker<RestoreTablesRequest, RestoreTablesResponse> restoreTablesInvoker(RestoreTablesRequest request) {
        return new SyncInvoker<RestoreTablesRequest, RestoreTablesResponse>(request, RdsMeta.restoreTables, hcClient);
    }

    /**
     * 表级时间点恢复(MySQL)
     *
     * 表级时间点恢复(MySQL)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestoreTablesNewRequest 请求对象
     * @return RestoreTablesNewResponse
     */
    public RestoreTablesNewResponse restoreTablesNew(RestoreTablesNewRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.restoreTablesNew);
    }

    /**
     * 表级时间点恢复(MySQL)
     *
     * 表级时间点恢复(MySQL)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestoreTablesNewRequest 请求对象
     * @return SyncInvoker<RestoreTablesNewRequest, RestoreTablesNewResponse>
     */
    public SyncInvoker<RestoreTablesNewRequest, RestoreTablesNewResponse> restoreTablesNewInvoker(
        RestoreTablesNewRequest request) {
        return new SyncInvoker<RestoreTablesNewRequest, RestoreTablesNewResponse>(request, RdsMeta.restoreTablesNew,
            hcClient);
    }

    /**
     * 恢复到已有实例
     *
     * 恢复到已有实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestoreToExistingInstanceRequest 请求对象
     * @return RestoreToExistingInstanceResponse
     */
    public RestoreToExistingInstanceResponse restoreToExistingInstance(RestoreToExistingInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.restoreToExistingInstance);
    }

    /**
     * 恢复到已有实例
     *
     * 恢复到已有实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestoreToExistingInstanceRequest 请求对象
     * @return SyncInvoker<RestoreToExistingInstanceRequest, RestoreToExistingInstanceResponse>
     */
    public SyncInvoker<RestoreToExistingInstanceRequest, RestoreToExistingInstanceResponse> restoreToExistingInstanceInvoker(
        RestoreToExistingInstanceRequest request) {
        return new SyncInvoker<RestoreToExistingInstanceRequest, RestoreToExistingInstanceResponse>(request,
            RdsMeta.restoreToExistingInstance, hcClient);
    }

    /**
     * 设置审计日志策略
     *
     * 设置审计日志策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetAuditlogPolicyRequest 请求对象
     * @return SetAuditlogPolicyResponse
     */
    public SetAuditlogPolicyResponse setAuditlogPolicy(SetAuditlogPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.setAuditlogPolicy);
    }

    /**
     * 设置审计日志策略
     *
     * 设置审计日志策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetAuditlogPolicyRequest 请求对象
     * @return SyncInvoker<SetAuditlogPolicyRequest, SetAuditlogPolicyResponse>
     */
    public SyncInvoker<SetAuditlogPolicyRequest, SetAuditlogPolicyResponse> setAuditlogPolicyInvoker(
        SetAuditlogPolicyRequest request) {
        return new SyncInvoker<SetAuditlogPolicyRequest, SetAuditlogPolicyResponse>(request, RdsMeta.setAuditlogPolicy,
            hcClient);
    }

    /**
     * 设置自动扩容策略
     *
     * 设置实例存储空间自动扩容策略，按扩容量扣除存储费用。
     * 可用存储空间小于设置值或者10GB时，自动扩容当前存储空间的15%（非10倍数向上取整，账户余额不足，会导致自动扩容失败）。
     * 设置只读实例自动扩容与主实例自动扩容互不影响，对只读实例设置自动扩容时，可选择大于或等于主实例的存储空间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetAutoEnlargePolicyRequest 请求对象
     * @return SetAutoEnlargePolicyResponse
     */
    public SetAutoEnlargePolicyResponse setAutoEnlargePolicy(SetAutoEnlargePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.setAutoEnlargePolicy);
    }

    /**
     * 设置自动扩容策略
     *
     * 设置实例存储空间自动扩容策略，按扩容量扣除存储费用。
     * 可用存储空间小于设置值或者10GB时，自动扩容当前存储空间的15%（非10倍数向上取整，账户余额不足，会导致自动扩容失败）。
     * 设置只读实例自动扩容与主实例自动扩容互不影响，对只读实例设置自动扩容时，可选择大于或等于主实例的存储空间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetAutoEnlargePolicyRequest 请求对象
     * @return SyncInvoker<SetAutoEnlargePolicyRequest, SetAutoEnlargePolicyResponse>
     */
    public SyncInvoker<SetAutoEnlargePolicyRequest, SetAutoEnlargePolicyResponse> setAutoEnlargePolicyInvoker(
        SetAutoEnlargePolicyRequest request) {
        return new SyncInvoker<SetAutoEnlargePolicyRequest, SetAutoEnlargePolicyResponse>(request,
            RdsMeta.setAutoEnlargePolicy, hcClient);
    }

    /**
     * 设置自动备份策略
     *
     * 设置自动备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetBackupPolicyRequest 请求对象
     * @return SetBackupPolicyResponse
     */
    public SetBackupPolicyResponse setBackupPolicy(SetBackupPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.setBackupPolicy);
    }

    /**
     * 设置自动备份策略
     *
     * 设置自动备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetBackupPolicyRequest 请求对象
     * @return SyncInvoker<SetBackupPolicyRequest, SetBackupPolicyResponse>
     */
    public SyncInvoker<SetBackupPolicyRequest, SetBackupPolicyResponse> setBackupPolicyInvoker(
        SetBackupPolicyRequest request) {
        return new SyncInvoker<SetBackupPolicyRequest, SetBackupPolicyResponse>(request, RdsMeta.setBackupPolicy,
            hcClient);
    }

    /**
     * 设置binlog本地保留时长
     *
     * 修改指定实例的binlog本地保留时长。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetBinlogClearPolicyRequest 请求对象
     * @return SetBinlogClearPolicyResponse
     */
    public SetBinlogClearPolicyResponse setBinlogClearPolicy(SetBinlogClearPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.setBinlogClearPolicy);
    }

    /**
     * 设置binlog本地保留时长
     *
     * 修改指定实例的binlog本地保留时长。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetBinlogClearPolicyRequest 请求对象
     * @return SyncInvoker<SetBinlogClearPolicyRequest, SetBinlogClearPolicyResponse>
     */
    public SyncInvoker<SetBinlogClearPolicyRequest, SetBinlogClearPolicyResponse> setBinlogClearPolicyInvoker(
        SetBinlogClearPolicyRequest request) {
        return new SyncInvoker<SetBinlogClearPolicyRequest, SetBinlogClearPolicyResponse>(request,
            RdsMeta.setBinlogClearPolicy, hcClient);
    }

    /**
     * 设置跨区域备份策略
     *
     * 设置跨区域备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetOffSiteBackupPolicyRequest 请求对象
     * @return SetOffSiteBackupPolicyResponse
     */
    public SetOffSiteBackupPolicyResponse setOffSiteBackupPolicy(SetOffSiteBackupPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.setOffSiteBackupPolicy);
    }

    /**
     * 设置跨区域备份策略
     *
     * 设置跨区域备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetOffSiteBackupPolicyRequest 请求对象
     * @return SyncInvoker<SetOffSiteBackupPolicyRequest, SetOffSiteBackupPolicyResponse>
     */
    public SyncInvoker<SetOffSiteBackupPolicyRequest, SetOffSiteBackupPolicyResponse> setOffSiteBackupPolicyInvoker(
        SetOffSiteBackupPolicyRequest request) {
        return new SyncInvoker<SetOffSiteBackupPolicyRequest, SetOffSiteBackupPolicyResponse>(request,
            RdsMeta.setOffSiteBackupPolicy, hcClient);
    }

    /**
     * 设置秒级监控策略
     *
     * 设置实例秒级监控策略，约五分钟后生效，对于1秒监控和5秒监控，计费方式为按需付费（每小时扣费一次）。
     * 设置只读实例秒级监控与主实例互不影响。
     * 规格变更到4U以下的实例，秒级监控功能会自动关闭。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetSecondLevelMonitorRequest 请求对象
     * @return SetSecondLevelMonitorResponse
     */
    public SetSecondLevelMonitorResponse setSecondLevelMonitor(SetSecondLevelMonitorRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.setSecondLevelMonitor);
    }

    /**
     * 设置秒级监控策略
     *
     * 设置实例秒级监控策略，约五分钟后生效，对于1秒监控和5秒监控，计费方式为按需付费（每小时扣费一次）。
     * 设置只读实例秒级监控与主实例互不影响。
     * 规格变更到4U以下的实例，秒级监控功能会自动关闭。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetSecondLevelMonitorRequest 请求对象
     * @return SyncInvoker<SetSecondLevelMonitorRequest, SetSecondLevelMonitorResponse>
     */
    public SyncInvoker<SetSecondLevelMonitorRequest, SetSecondLevelMonitorResponse> setSecondLevelMonitorInvoker(
        SetSecondLevelMonitorRequest request) {
        return new SyncInvoker<SetSecondLevelMonitorRequest, SetSecondLevelMonitorResponse>(request,
            RdsMeta.setSecondLevelMonitor, hcClient);
    }

    /**
     * 修改安全组
     *
     * 修改安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetSecurityGroupRequest 请求对象
     * @return SetSecurityGroupResponse
     */
    public SetSecurityGroupResponse setSecurityGroup(SetSecurityGroupRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.setSecurityGroup);
    }

    /**
     * 修改安全组
     *
     * 修改安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetSecurityGroupRequest 请求对象
     * @return SyncInvoker<SetSecurityGroupRequest, SetSecurityGroupResponse>
     */
    public SyncInvoker<SetSecurityGroupRequest, SetSecurityGroupResponse> setSecurityGroupInvoker(
        SetSecurityGroupRequest request) {
        return new SyncInvoker<SetSecurityGroupRequest, SetSecurityGroupResponse>(request, RdsMeta.setSecurityGroup,
            hcClient);
    }

    /**
     * 慢日志敏感信息的开关
     *
     * V3慢日志敏感信息的开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetSensitiveSlowLogRequest 请求对象
     * @return SetSensitiveSlowLogResponse
     */
    public SetSensitiveSlowLogResponse setSensitiveSlowLog(SetSensitiveSlowLogRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.setSensitiveSlowLog);
    }

    /**
     * 慢日志敏感信息的开关
     *
     * V3慢日志敏感信息的开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetSensitiveSlowLogRequest 请求对象
     * @return SyncInvoker<SetSensitiveSlowLogRequest, SetSensitiveSlowLogResponse>
     */
    public SyncInvoker<SetSensitiveSlowLogRequest, SetSensitiveSlowLogResponse> setSensitiveSlowLogInvoker(
        SetSensitiveSlowLogRequest request) {
        return new SyncInvoker<SetSensitiveSlowLogRequest, SetSensitiveSlowLogResponse>(request,
            RdsMeta.setSensitiveSlowLog, hcClient);
    }

    /**
     * 生成审计日志下载链接
     *
     * 生成审计日志下载链接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAuditlogDownloadLinkRequest 请求对象
     * @return ShowAuditlogDownloadLinkResponse
     */
    public ShowAuditlogDownloadLinkResponse showAuditlogDownloadLink(ShowAuditlogDownloadLinkRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.showAuditlogDownloadLink);
    }

    /**
     * 生成审计日志下载链接
     *
     * 生成审计日志下载链接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAuditlogDownloadLinkRequest 请求对象
     * @return SyncInvoker<ShowAuditlogDownloadLinkRequest, ShowAuditlogDownloadLinkResponse>
     */
    public SyncInvoker<ShowAuditlogDownloadLinkRequest, ShowAuditlogDownloadLinkResponse> showAuditlogDownloadLinkInvoker(
        ShowAuditlogDownloadLinkRequest request) {
        return new SyncInvoker<ShowAuditlogDownloadLinkRequest, ShowAuditlogDownloadLinkResponse>(request,
            RdsMeta.showAuditlogDownloadLink, hcClient);
    }

    /**
     * 查询审计日志策略
     *
     * 查询审计日志策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAuditlogPolicyRequest 请求对象
     * @return ShowAuditlogPolicyResponse
     */
    public ShowAuditlogPolicyResponse showAuditlogPolicy(ShowAuditlogPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.showAuditlogPolicy);
    }

    /**
     * 查询审计日志策略
     *
     * 查询审计日志策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAuditlogPolicyRequest 请求对象
     * @return SyncInvoker<ShowAuditlogPolicyRequest, ShowAuditlogPolicyResponse>
     */
    public SyncInvoker<ShowAuditlogPolicyRequest, ShowAuditlogPolicyResponse> showAuditlogPolicyInvoker(
        ShowAuditlogPolicyRequest request) {
        return new SyncInvoker<ShowAuditlogPolicyRequest, ShowAuditlogPolicyResponse>(request,
            RdsMeta.showAuditlogPolicy, hcClient);
    }

    /**
     * 查询自动扩容策略
     *
     * 查询实例存储空间自动扩容策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAutoEnlargePolicyRequest 请求对象
     * @return ShowAutoEnlargePolicyResponse
     */
    public ShowAutoEnlargePolicyResponse showAutoEnlargePolicy(ShowAutoEnlargePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.showAutoEnlargePolicy);
    }

    /**
     * 查询自动扩容策略
     *
     * 查询实例存储空间自动扩容策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAutoEnlargePolicyRequest 请求对象
     * @return SyncInvoker<ShowAutoEnlargePolicyRequest, ShowAutoEnlargePolicyResponse>
     */
    public SyncInvoker<ShowAutoEnlargePolicyRequest, ShowAutoEnlargePolicyResponse> showAutoEnlargePolicyInvoker(
        ShowAutoEnlargePolicyRequest request) {
        return new SyncInvoker<ShowAutoEnlargePolicyRequest, ShowAutoEnlargePolicyResponse>(request,
            RdsMeta.showAutoEnlargePolicy, hcClient);
    }

    /**
     * 
     *
     * 查询实例可升级的目标版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAvailableVersionRequest 请求对象
     * @return ShowAvailableVersionResponse
     */
    public ShowAvailableVersionResponse showAvailableVersion(ShowAvailableVersionRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.showAvailableVersion);
    }

    /**
     * 
     *
     * 查询实例可升级的目标版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAvailableVersionRequest 请求对象
     * @return SyncInvoker<ShowAvailableVersionRequest, ShowAvailableVersionResponse>
     */
    public SyncInvoker<ShowAvailableVersionRequest, ShowAvailableVersionResponse> showAvailableVersionInvoker(
        ShowAvailableVersionRequest request) {
        return new SyncInvoker<ShowAvailableVersionRequest, ShowAvailableVersionResponse>(request,
            RdsMeta.showAvailableVersion, hcClient);
    }

    /**
     * 获取备份下载链接
     *
     * 获取备份下载链接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBackupDownloadLinkRequest 请求对象
     * @return ShowBackupDownloadLinkResponse
     */
    public ShowBackupDownloadLinkResponse showBackupDownloadLink(ShowBackupDownloadLinkRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.showBackupDownloadLink);
    }

    /**
     * 获取备份下载链接
     *
     * 获取备份下载链接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBackupDownloadLinkRequest 请求对象
     * @return SyncInvoker<ShowBackupDownloadLinkRequest, ShowBackupDownloadLinkResponse>
     */
    public SyncInvoker<ShowBackupDownloadLinkRequest, ShowBackupDownloadLinkResponse> showBackupDownloadLinkInvoker(
        ShowBackupDownloadLinkRequest request) {
        return new SyncInvoker<ShowBackupDownloadLinkRequest, ShowBackupDownloadLinkResponse>(request,
            RdsMeta.showBackupDownloadLink, hcClient);
    }

    /**
     * 查询自动备份策略
     *
     * 查询自动备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBackupPolicyRequest 请求对象
     * @return ShowBackupPolicyResponse
     */
    public ShowBackupPolicyResponse showBackupPolicy(ShowBackupPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.showBackupPolicy);
    }

    /**
     * 查询自动备份策略
     *
     * 查询自动备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBackupPolicyRequest 请求对象
     * @return SyncInvoker<ShowBackupPolicyRequest, ShowBackupPolicyResponse>
     */
    public SyncInvoker<ShowBackupPolicyRequest, ShowBackupPolicyResponse> showBackupPolicyInvoker(
        ShowBackupPolicyRequest request) {
        return new SyncInvoker<ShowBackupPolicyRequest, ShowBackupPolicyResponse>(request, RdsMeta.showBackupPolicy,
            hcClient);
    }

    /**
     * 获取binlog本地保留时长
     *
     * 查寻指定实例的binlog本地保留时长。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBinlogClearPolicyRequest 请求对象
     * @return ShowBinlogClearPolicyResponse
     */
    public ShowBinlogClearPolicyResponse showBinlogClearPolicy(ShowBinlogClearPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.showBinlogClearPolicy);
    }

    /**
     * 获取binlog本地保留时长
     *
     * 查寻指定实例的binlog本地保留时长。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBinlogClearPolicyRequest 请求对象
     * @return SyncInvoker<ShowBinlogClearPolicyRequest, ShowBinlogClearPolicyResponse>
     */
    public SyncInvoker<ShowBinlogClearPolicyRequest, ShowBinlogClearPolicyResponse> showBinlogClearPolicyInvoker(
        ShowBinlogClearPolicyRequest request) {
        return new SyncInvoker<ShowBinlogClearPolicyRequest, ShowBinlogClearPolicyResponse>(request,
            RdsMeta.showBinlogClearPolicy, hcClient);
    }

    /**
     * 获取指定参数模板的参数
     *
     * 获取指定参数模板的参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowConfigurationRequest 请求对象
     * @return ShowConfigurationResponse
     */
    public ShowConfigurationResponse showConfiguration(ShowConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.showConfiguration);
    }

    /**
     * 获取指定参数模板的参数
     *
     * 获取指定参数模板的参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowConfigurationRequest 请求对象
     * @return SyncInvoker<ShowConfigurationRequest, ShowConfigurationResponse>
     */
    public SyncInvoker<ShowConfigurationRequest, ShowConfigurationResponse> showConfigurationInvoker(
        ShowConfigurationRequest request) {
        return new SyncInvoker<ShowConfigurationRequest, ShowConfigurationResponse>(request, RdsMeta.showConfiguration,
            hcClient);
    }

    /**
     * 查询实例ipv6域名。
     *
     * 查询实例ipv6域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDnsNameRequest 请求对象
     * @return ShowDnsNameResponse
     */
    public ShowDnsNameResponse showDnsName(ShowDnsNameRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.showDnsName);
    }

    /**
     * 查询实例ipv6域名。
     *
     * 查询实例ipv6域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDnsNameRequest 请求对象
     * @return SyncInvoker<ShowDnsNameRequest, ShowDnsNameResponse>
     */
    public SyncInvoker<ShowDnsNameRequest, ShowDnsNameResponse> showDnsNameInvoker(ShowDnsNameRequest request) {
        return new SyncInvoker<ShowDnsNameRequest, ShowDnsNameResponse>(request, RdsMeta.showDnsName, hcClient);
    }

    /**
     * 
     *
     * 查询实例ipv4域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDomainNameRequest 请求对象
     * @return ShowDomainNameResponse
     */
    public ShowDomainNameResponse showDomainName(ShowDomainNameRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.showDomainName);
    }

    /**
     * 
     *
     * 查询实例ipv4域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDomainNameRequest 请求对象
     * @return SyncInvoker<ShowDomainNameRequest, ShowDomainNameResponse>
     */
    public SyncInvoker<ShowDomainNameRequest, ShowDomainNameResponse> showDomainNameInvoker(
        ShowDomainNameRequest request) {
        return new SyncInvoker<ShowDomainNameRequest, ShowDomainNameResponse>(request, RdsMeta.showDomainName,
            hcClient);
    }

    /**
     * 查询跨云容灾复制状态
     *
     * 建立跨云容灾关系后，查询主实例和灾备实例间的复制状态及延迟。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDrReplicaStatusRequest 请求对象
     * @return ShowDrReplicaStatusResponse
     */
    public ShowDrReplicaStatusResponse showDrReplicaStatus(ShowDrReplicaStatusRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.showDrReplicaStatus);
    }

    /**
     * 查询跨云容灾复制状态
     *
     * 建立跨云容灾关系后，查询主实例和灾备实例间的复制状态及延迟。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDrReplicaStatusRequest 请求对象
     * @return SyncInvoker<ShowDrReplicaStatusRequest, ShowDrReplicaStatusResponse>
     */
    public SyncInvoker<ShowDrReplicaStatusRequest, ShowDrReplicaStatusResponse> showDrReplicaStatusInvoker(
        ShowDrReplicaStatusRequest request) {
        return new SyncInvoker<ShowDrReplicaStatusRequest, ShowDrReplicaStatusResponse>(request,
            RdsMeta.showDrReplicaStatus, hcClient);
    }

    /**
     * 获取指定实例的参数模板
     *
     * 获取指定实例的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowInstanceConfigurationRequest 请求对象
     * @return ShowInstanceConfigurationResponse
     */
    public ShowInstanceConfigurationResponse showInstanceConfiguration(ShowInstanceConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.showInstanceConfiguration);
    }

    /**
     * 获取指定实例的参数模板
     *
     * 获取指定实例的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowInstanceConfigurationRequest 请求对象
     * @return SyncInvoker<ShowInstanceConfigurationRequest, ShowInstanceConfigurationResponse>
     */
    public SyncInvoker<ShowInstanceConfigurationRequest, ShowInstanceConfigurationResponse> showInstanceConfigurationInvoker(
        ShowInstanceConfigurationRequest request) {
        return new SyncInvoker<ShowInstanceConfigurationRequest, ShowInstanceConfigurationResponse>(request,
            RdsMeta.showInstanceConfiguration, hcClient);
    }

    /**
     * 查询跨区域备份策略
     *
     * 查询跨区域备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowOffSiteBackupPolicyRequest 请求对象
     * @return ShowOffSiteBackupPolicyResponse
     */
    public ShowOffSiteBackupPolicyResponse showOffSiteBackupPolicy(ShowOffSiteBackupPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.showOffSiteBackupPolicy);
    }

    /**
     * 查询跨区域备份策略
     *
     * 查询跨区域备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowOffSiteBackupPolicyRequest 请求对象
     * @return SyncInvoker<ShowOffSiteBackupPolicyRequest, ShowOffSiteBackupPolicyResponse>
     */
    public SyncInvoker<ShowOffSiteBackupPolicyRequest, ShowOffSiteBackupPolicyResponse> showOffSiteBackupPolicyInvoker(
        ShowOffSiteBackupPolicyRequest request) {
        return new SyncInvoker<ShowOffSiteBackupPolicyRequest, ShowOffSiteBackupPolicyResponse>(request,
            RdsMeta.showOffSiteBackupPolicy, hcClient);
    }

    /**
     * 查询配额
     *
     * 查询当前项目下资源配额情况。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowQuotasRequest 请求对象
     * @return ShowQuotasResponse
     */
    public ShowQuotasResponse showQuotas(ShowQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.showQuotas);
    }

    /**
     * 查询配额
     *
     * 查询当前项目下资源配额情况。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowQuotasRequest 请求对象
     * @return SyncInvoker<ShowQuotasRequest, ShowQuotasResponse>
     */
    public SyncInvoker<ShowQuotasRequest, ShowQuotasResponse> showQuotasInvoker(ShowQuotasRequest request) {
        return new SyncInvoker<ShowQuotasRequest, ShowQuotasResponse>(request, RdsMeta.showQuotas, hcClient);
    }

    /**
     * 查询回收站的回收策略。
     *
     * 查询回收站的回收策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRecyclePolicyRequest 请求对象
     * @return ShowRecyclePolicyResponse
     */
    public ShowRecyclePolicyResponse showRecyclePolicy(ShowRecyclePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.showRecyclePolicy);
    }

    /**
     * 查询回收站的回收策略。
     *
     * 查询回收站的回收策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRecyclePolicyRequest 请求对象
     * @return SyncInvoker<ShowRecyclePolicyRequest, ShowRecyclePolicyResponse>
     */
    public SyncInvoker<ShowRecyclePolicyRequest, ShowRecyclePolicyResponse> showRecyclePolicyInvoker(
        ShowRecyclePolicyRequest request) {
        return new SyncInvoker<ShowRecyclePolicyRequest, ShowRecyclePolicyResponse>(request, RdsMeta.showRecyclePolicy,
            hcClient);
    }

    /**
     * 获取实例的复制状态。
     *
     * 获取实例的复制状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowReplicationStatusRequest 请求对象
     * @return ShowReplicationStatusResponse
     */
    public ShowReplicationStatusResponse showReplicationStatus(ShowReplicationStatusRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.showReplicationStatus);
    }

    /**
     * 获取实例的复制状态。
     *
     * 获取实例的复制状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowReplicationStatusRequest 请求对象
     * @return SyncInvoker<ShowReplicationStatusRequest, ShowReplicationStatusResponse>
     */
    public SyncInvoker<ShowReplicationStatusRequest, ShowReplicationStatusResponse> showReplicationStatusInvoker(
        ShowReplicationStatusRequest request) {
        return new SyncInvoker<ShowReplicationStatusRequest, ShowReplicationStatusResponse>(request,
            RdsMeta.showReplicationStatus, hcClient);
    }

    /**
     * 查询秒级监控策略
     *
     * 查询实例秒级监控策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSecondLevelMonitoringRequest 请求对象
     * @return ShowSecondLevelMonitoringResponse
     */
    public ShowSecondLevelMonitoringResponse showSecondLevelMonitoring(ShowSecondLevelMonitoringRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.showSecondLevelMonitoring);
    }

    /**
     * 查询秒级监控策略
     *
     * 查询实例秒级监控策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSecondLevelMonitoringRequest 请求对象
     * @return SyncInvoker<ShowSecondLevelMonitoringRequest, ShowSecondLevelMonitoringResponse>
     */
    public SyncInvoker<ShowSecondLevelMonitoringRequest, ShowSecondLevelMonitoringResponse> showSecondLevelMonitoringInvoker(
        ShowSecondLevelMonitoringRequest request) {
        return new SyncInvoker<ShowSecondLevelMonitoringRequest, ShowSecondLevelMonitoringResponse>(request,
            RdsMeta.showSecondLevelMonitoring, hcClient);
    }

    /**
     * 根据实例id查询sqlserver TDE状态
     *
     * 根据实例id查询sqlserver TDE状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTdeStatusRequest 请求对象
     * @return ShowTdeStatusResponse
     */
    public ShowTdeStatusResponse showTdeStatus(ShowTdeStatusRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.showTdeStatus);
    }

    /**
     * 根据实例id查询sqlserver TDE状态
     *
     * 根据实例id查询sqlserver TDE状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTdeStatusRequest 请求对象
     * @return SyncInvoker<ShowTdeStatusRequest, ShowTdeStatusResponse>
     */
    public SyncInvoker<ShowTdeStatusRequest, ShowTdeStatusResponse> showTdeStatusInvoker(ShowTdeStatusRequest request) {
        return new SyncInvoker<ShowTdeStatusRequest, ShowTdeStatusResponse>(request, RdsMeta.showTdeStatus, hcClient);
    }

    /**
     * 
     *
     * 查询大版本检查状态或升级状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowUpgradeDbMajorVersionStatusRequest 请求对象
     * @return ShowUpgradeDbMajorVersionStatusResponse
     */
    public ShowUpgradeDbMajorVersionStatusResponse showUpgradeDbMajorVersionStatus(
        ShowUpgradeDbMajorVersionStatusRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.showUpgradeDbMajorVersionStatus);
    }

    /**
     * 
     *
     * 查询大版本检查状态或升级状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowUpgradeDbMajorVersionStatusRequest 请求对象
     * @return SyncInvoker<ShowUpgradeDbMajorVersionStatusRequest, ShowUpgradeDbMajorVersionStatusResponse>
     */
    public SyncInvoker<ShowUpgradeDbMajorVersionStatusRequest, ShowUpgradeDbMajorVersionStatusResponse> showUpgradeDbMajorVersionStatusInvoker(
        ShowUpgradeDbMajorVersionStatusRequest request) {
        return new SyncInvoker<ShowUpgradeDbMajorVersionStatusRequest, ShowUpgradeDbMajorVersionStatusResponse>(request,
            RdsMeta.showUpgradeDbMajorVersionStatus, hcClient);
    }

    /**
     * 手动倒换主备
     *
     * 手动倒换主备.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartFailoverRequest 请求对象
     * @return StartFailoverResponse
     */
    public StartFailoverResponse startFailover(StartFailoverRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.startFailover);
    }

    /**
     * 手动倒换主备
     *
     * 手动倒换主备.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartFailoverRequest 请求对象
     * @return SyncInvoker<StartFailoverRequest, StartFailoverResponse>
     */
    public SyncInvoker<StartFailoverRequest, StartFailoverResponse> startFailoverInvoker(StartFailoverRequest request) {
        return new SyncInvoker<StartFailoverRequest, StartFailoverResponse>(request, RdsMeta.startFailover, hcClient);
    }

    /**
     * 扩容数据库实例的磁盘空间
     *
     * 扩容数据库实例的磁盘空间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartInstanceEnlargeVolumeActionRequest 请求对象
     * @return StartInstanceEnlargeVolumeActionResponse
     */
    public StartInstanceEnlargeVolumeActionResponse startInstanceEnlargeVolumeAction(
        StartInstanceEnlargeVolumeActionRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.startInstanceEnlargeVolumeAction);
    }

    /**
     * 扩容数据库实例的磁盘空间
     *
     * 扩容数据库实例的磁盘空间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartInstanceEnlargeVolumeActionRequest 请求对象
     * @return SyncInvoker<StartInstanceEnlargeVolumeActionRequest, StartInstanceEnlargeVolumeActionResponse>
     */
    public SyncInvoker<StartInstanceEnlargeVolumeActionRequest, StartInstanceEnlargeVolumeActionResponse> startInstanceEnlargeVolumeActionInvoker(
        StartInstanceEnlargeVolumeActionRequest request) {
        return new SyncInvoker<StartInstanceEnlargeVolumeActionRequest, StartInstanceEnlargeVolumeActionResponse>(
            request, RdsMeta.startInstanceEnlargeVolumeAction, hcClient);
    }

    /**
     * 重启数据库实例
     *
     * 重启数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartInstanceRestartActionRequest 请求对象
     * @return StartInstanceRestartActionResponse
     */
    public StartInstanceRestartActionResponse startInstanceRestartAction(StartInstanceRestartActionRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.startInstanceRestartAction);
    }

    /**
     * 重启数据库实例
     *
     * 重启数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartInstanceRestartActionRequest 请求对象
     * @return SyncInvoker<StartInstanceRestartActionRequest, StartInstanceRestartActionResponse>
     */
    public SyncInvoker<StartInstanceRestartActionRequest, StartInstanceRestartActionResponse> startInstanceRestartActionInvoker(
        StartInstanceRestartActionRequest request) {
        return new SyncInvoker<StartInstanceRestartActionRequest, StartInstanceRestartActionResponse>(request,
            RdsMeta.startInstanceRestartAction, hcClient);
    }

    /**
     * 单机转主备实例
     *
     * 单机转主备实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartInstanceSingleToHaActionRequest 请求对象
     * @return StartInstanceSingleToHaActionResponse
     */
    public StartInstanceSingleToHaActionResponse startInstanceSingleToHaAction(
        StartInstanceSingleToHaActionRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.startInstanceSingleToHaAction);
    }

    /**
     * 单机转主备实例
     *
     * 单机转主备实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartInstanceSingleToHaActionRequest 请求对象
     * @return SyncInvoker<StartInstanceSingleToHaActionRequest, StartInstanceSingleToHaActionResponse>
     */
    public SyncInvoker<StartInstanceSingleToHaActionRequest, StartInstanceSingleToHaActionResponse> startInstanceSingleToHaActionInvoker(
        StartInstanceSingleToHaActionRequest request) {
        return new SyncInvoker<StartInstanceSingleToHaActionRequest, StartInstanceSingleToHaActionResponse>(request,
            RdsMeta.startInstanceSingleToHaAction, hcClient);
    }

    /**
     * 设置回收站策略
     *
     * 设置回收站策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartRecyclePolicyRequest 请求对象
     * @return StartRecyclePolicyResponse
     */
    public StartRecyclePolicyResponse startRecyclePolicy(StartRecyclePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.startRecyclePolicy);
    }

    /**
     * 设置回收站策略
     *
     * 设置回收站策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartRecyclePolicyRequest 请求对象
     * @return SyncInvoker<StartRecyclePolicyRequest, StartRecyclePolicyResponse>
     */
    public SyncInvoker<StartRecyclePolicyRequest, StartRecyclePolicyResponse> startRecyclePolicyInvoker(
        StartRecyclePolicyRequest request) {
        return new SyncInvoker<StartRecyclePolicyRequest, StartRecyclePolicyResponse>(request,
            RdsMeta.startRecyclePolicy, hcClient);
    }

    /**
     * 变更数据库实例的规格
     *
     * 变更数据库实例的规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartResizeFlavorActionRequest 请求对象
     * @return StartResizeFlavorActionResponse
     */
    public StartResizeFlavorActionResponse startResizeFlavorAction(StartResizeFlavorActionRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.startResizeFlavorAction);
    }

    /**
     * 变更数据库实例的规格
     *
     * 变更数据库实例的规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartResizeFlavorActionRequest 请求对象
     * @return SyncInvoker<StartResizeFlavorActionRequest, StartResizeFlavorActionResponse>
     */
    public SyncInvoker<StartResizeFlavorActionRequest, StartResizeFlavorActionResponse> startResizeFlavorActionInvoker(
        StartResizeFlavorActionRequest request) {
        return new SyncInvoker<StartResizeFlavorActionRequest, StartResizeFlavorActionResponse>(request,
            RdsMeta.startResizeFlavorAction, hcClient);
    }

    /**
     * 开启实例
     *
     * 停止实例以节省费用，在停止数据库实例后，支持手动重新开启实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartupInstanceRequest 请求对象
     * @return StartupInstanceResponse
     */
    public StartupInstanceResponse startupInstance(StartupInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.startupInstance);
    }

    /**
     * 开启实例
     *
     * 停止实例以节省费用，在停止数据库实例后，支持手动重新开启实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartupInstanceRequest 请求对象
     * @return SyncInvoker<StartupInstanceRequest, StartupInstanceResponse>
     */
    public SyncInvoker<StartupInstanceRequest, StartupInstanceResponse> startupInstanceInvoker(
        StartupInstanceRequest request) {
        return new SyncInvoker<StartupInstanceRequest, StartupInstanceResponse>(request, RdsMeta.startupInstance,
            hcClient);
    }

    /**
     * 停止实例
     *
     * 实例进行关机，通过暂时停止按需实例以节省费用，实例默认停止七天。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopInstanceRequest 请求对象
     * @return StopInstanceResponse
     */
    public StopInstanceResponse stopInstance(StopInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.stopInstance);
    }

    /**
     * 停止实例
     *
     * 实例进行关机，通过暂时停止按需实例以节省费用，实例默认停止七天。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopInstanceRequest 请求对象
     * @return SyncInvoker<StopInstanceRequest, StopInstanceResponse>
     */
    public SyncInvoker<StopInstanceRequest, StopInstanceResponse> stopInstanceInvoker(StopInstanceRequest request) {
        return new SyncInvoker<StopInstanceRequest, StopInstanceResponse>(request, RdsMeta.stopInstance, hcClient);
    }

    /**
     * 设置SSL数据加密
     *
     * 设置SSL数据加密。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SwitchSslRequest 请求对象
     * @return SwitchSslResponse
     */
    public SwitchSslResponse switchSsl(SwitchSslRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.switchSsl);
    }

    /**
     * 设置SSL数据加密
     *
     * 设置SSL数据加密。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SwitchSslRequest 请求对象
     * @return SyncInvoker<SwitchSslRequest, SwitchSslResponse>
     */
    public SyncInvoker<SwitchSslRequest, SwitchSslResponse> switchSslInvoker(SwitchSslRequest request) {
        return new SyncInvoker<SwitchSslRequest, SwitchSslResponse>(request, RdsMeta.switchSsl, hcClient);
    }

    /**
     * 修改参数模板参数
     *
     * 修改参数模板参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateConfigurationRequest 请求对象
     * @return UpdateConfigurationResponse
     */
    public UpdateConfigurationResponse updateConfiguration(UpdateConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.updateConfiguration);
    }

    /**
     * 修改参数模板参数
     *
     * 修改参数模板参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateConfigurationRequest 请求对象
     * @return SyncInvoker<UpdateConfigurationRequest, UpdateConfigurationResponse>
     */
    public SyncInvoker<UpdateConfigurationRequest, UpdateConfigurationResponse> updateConfigurationInvoker(
        UpdateConfigurationRequest request) {
        return new SyncInvoker<UpdateConfigurationRequest, UpdateConfigurationResponse>(request,
            RdsMeta.updateConfiguration, hcClient);
    }

    /**
     * 修改内网地址
     *
     * 修改内网地址
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDataIpRequest 请求对象
     * @return UpdateDataIpResponse
     */
    public UpdateDataIpResponse updateDataIp(UpdateDataIpRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.updateDataIp);
    }

    /**
     * 修改内网地址
     *
     * 修改内网地址
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDataIpRequest 请求对象
     * @return SyncInvoker<UpdateDataIpRequest, UpdateDataIpResponse>
     */
    public SyncInvoker<UpdateDataIpRequest, UpdateDataIpResponse> updateDataIpInvoker(UpdateDataIpRequest request) {
        return new SyncInvoker<UpdateDataIpRequest, UpdateDataIpResponse>(request, RdsMeta.updateDataIp, hcClient);
    }

    /**
     * 修改域名
     *
     * 修改域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDnsNameRequest 请求对象
     * @return UpdateDnsNameResponse
     */
    public UpdateDnsNameResponse updateDnsName(UpdateDnsNameRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.updateDnsName);
    }

    /**
     * 修改域名
     *
     * 修改域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDnsNameRequest 请求对象
     * @return SyncInvoker<UpdateDnsNameRequest, UpdateDnsNameResponse>
     */
    public SyncInvoker<UpdateDnsNameRequest, UpdateDnsNameResponse> updateDnsNameInvoker(UpdateDnsNameRequest request) {
        return new SyncInvoker<UpdateDnsNameRequest, UpdateDnsNameResponse>(request, RdsMeta.updateDnsName, hcClient);
    }

    /**
     * 修改指定实例的参数
     *
     * 修改指定实例的参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateInstanceConfigurationRequest 请求对象
     * @return UpdateInstanceConfigurationResponse
     */
    public UpdateInstanceConfigurationResponse updateInstanceConfiguration(UpdateInstanceConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.updateInstanceConfiguration);
    }

    /**
     * 修改指定实例的参数
     *
     * 修改指定实例的参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateInstanceConfigurationRequest 请求对象
     * @return SyncInvoker<UpdateInstanceConfigurationRequest, UpdateInstanceConfigurationResponse>
     */
    public SyncInvoker<UpdateInstanceConfigurationRequest, UpdateInstanceConfigurationResponse> updateInstanceConfigurationInvoker(
        UpdateInstanceConfigurationRequest request) {
        return new SyncInvoker<UpdateInstanceConfigurationRequest, UpdateInstanceConfigurationResponse>(request,
            RdsMeta.updateInstanceConfiguration, hcClient);
    }

    /**
     * 修改指定实例的参数
     *
     * 修改指定实例的参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateInstanceConfigurationAsyncRequest 请求对象
     * @return UpdateInstanceConfigurationAsyncResponse
     */
    public UpdateInstanceConfigurationAsyncResponse updateInstanceConfigurationAsync(
        UpdateInstanceConfigurationAsyncRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.updateInstanceConfigurationAsync);
    }

    /**
     * 修改指定实例的参数
     *
     * 修改指定实例的参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateInstanceConfigurationAsyncRequest 请求对象
     * @return SyncInvoker<UpdateInstanceConfigurationAsyncRequest, UpdateInstanceConfigurationAsyncResponse>
     */
    public SyncInvoker<UpdateInstanceConfigurationAsyncRequest, UpdateInstanceConfigurationAsyncResponse> updateInstanceConfigurationAsyncInvoker(
        UpdateInstanceConfigurationAsyncRequest request) {
        return new SyncInvoker<UpdateInstanceConfigurationAsyncRequest, UpdateInstanceConfigurationAsyncResponse>(
            request, RdsMeta.updateInstanceConfigurationAsync, hcClient);
    }

    /**
     * 修改实例名称
     *
     * 修改实例名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateInstanceNameRequest 请求对象
     * @return UpdateInstanceNameResponse
     */
    public UpdateInstanceNameResponse updateInstanceName(UpdateInstanceNameRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.updateInstanceName);
    }

    /**
     * 修改实例名称
     *
     * 修改实例名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateInstanceNameRequest 请求对象
     * @return SyncInvoker<UpdateInstanceNameRequest, UpdateInstanceNameResponse>
     */
    public SyncInvoker<UpdateInstanceNameRequest, UpdateInstanceNameResponse> updateInstanceNameInvoker(
        UpdateInstanceNameRequest request) {
        return new SyncInvoker<UpdateInstanceNameRequest, UpdateInstanceNameResponse>(request,
            RdsMeta.updateInstanceName, hcClient);
    }

    /**
     * 修改数据库端口
     *
     * 修改数据库端口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePortRequest 请求对象
     * @return UpdatePortResponse
     */
    public UpdatePortResponse updatePort(UpdatePortRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.updatePort);
    }

    /**
     * 修改数据库端口
     *
     * 修改数据库端口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePortRequest 请求对象
     * @return SyncInvoker<UpdatePortRequest, UpdatePortResponse>
     */
    public SyncInvoker<UpdatePortRequest, UpdatePortResponse> updatePortInvoker(UpdatePortRequest request) {
        return new SyncInvoker<UpdatePortRequest, UpdatePortResponse>(request, RdsMeta.updatePort, hcClient);
    }

    /**
     * 修改实例备注信息
     *
     * 修改指定数据库实例的备注信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePostgresqlInstanceAliasRequest 请求对象
     * @return UpdatePostgresqlInstanceAliasResponse
     */
    public UpdatePostgresqlInstanceAliasResponse updatePostgresqlInstanceAlias(
        UpdatePostgresqlInstanceAliasRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.updatePostgresqlInstanceAlias);
    }

    /**
     * 修改实例备注信息
     *
     * 修改指定数据库实例的备注信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePostgresqlInstanceAliasRequest 请求对象
     * @return SyncInvoker<UpdatePostgresqlInstanceAliasRequest, UpdatePostgresqlInstanceAliasResponse>
     */
    public SyncInvoker<UpdatePostgresqlInstanceAliasRequest, UpdatePostgresqlInstanceAliasResponse> updatePostgresqlInstanceAliasInvoker(
        UpdatePostgresqlInstanceAliasRequest request) {
        return new SyncInvoker<UpdatePostgresqlInstanceAliasRequest, UpdatePostgresqlInstanceAliasResponse>(request,
            RdsMeta.updatePostgresqlInstanceAlias, hcClient);
    }

    /**
     * sqlserverTDE开关
     *
     * sqlserverTDE开关。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTdeStatusRequest 请求对象
     * @return UpdateTdeStatusResponse
     */
    public UpdateTdeStatusResponse updateTdeStatus(UpdateTdeStatusRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.updateTdeStatus);
    }

    /**
     * sqlserverTDE开关
     *
     * sqlserverTDE开关。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTdeStatusRequest 请求对象
     * @return SyncInvoker<UpdateTdeStatusRequest, UpdateTdeStatusResponse>
     */
    public SyncInvoker<UpdateTdeStatusRequest, UpdateTdeStatusResponse> updateTdeStatusInvoker(
        UpdateTdeStatusRequest request) {
        return new SyncInvoker<UpdateTdeStatusRequest, UpdateTdeStatusResponse>(request, RdsMeta.updateTdeStatus,
            hcClient);
    }

    /**
     * 
     *
     * PostgreSQL数据库升级大版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpgradeDbMajorVersionRequest 请求对象
     * @return UpgradeDbMajorVersionResponse
     */
    public UpgradeDbMajorVersionResponse upgradeDbMajorVersion(UpgradeDbMajorVersionRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.upgradeDbMajorVersion);
    }

    /**
     * 
     *
     * PostgreSQL数据库升级大版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpgradeDbMajorVersionRequest 请求对象
     * @return SyncInvoker<UpgradeDbMajorVersionRequest, UpgradeDbMajorVersionResponse>
     */
    public SyncInvoker<UpgradeDbMajorVersionRequest, UpgradeDbMajorVersionResponse> upgradeDbMajorVersionInvoker(
        UpgradeDbMajorVersionRequest request) {
        return new SyncInvoker<UpgradeDbMajorVersionRequest, UpgradeDbMajorVersionResponse>(request,
            RdsMeta.upgradeDbMajorVersion, hcClient);
    }

    /**
     * 
     *
     * 大版本升级前进行升级检查。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpgradeDbMajorVersionPreCheckRequest 请求对象
     * @return UpgradeDbMajorVersionPreCheckResponse
     */
    public UpgradeDbMajorVersionPreCheckResponse upgradeDbMajorVersionPreCheck(
        UpgradeDbMajorVersionPreCheckRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.upgradeDbMajorVersionPreCheck);
    }

    /**
     * 
     *
     * 大版本升级前进行升级检查。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpgradeDbMajorVersionPreCheckRequest 请求对象
     * @return SyncInvoker<UpgradeDbMajorVersionPreCheckRequest, UpgradeDbMajorVersionPreCheckResponse>
     */
    public SyncInvoker<UpgradeDbMajorVersionPreCheckRequest, UpgradeDbMajorVersionPreCheckResponse> upgradeDbMajorVersionPreCheckInvoker(
        UpgradeDbMajorVersionPreCheckRequest request) {
        return new SyncInvoker<UpgradeDbMajorVersionPreCheckRequest, UpgradeDbMajorVersionPreCheckResponse>(request,
            RdsMeta.upgradeDbMajorVersionPreCheck, hcClient);
    }

    /**
     * 升级内核小版本
     *
     * 对实例进行小版本升级。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpgradeDbVersionRequest 请求对象
     * @return UpgradeDbVersionResponse
     */
    public UpgradeDbVersionResponse upgradeDbVersion(UpgradeDbVersionRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.upgradeDbVersion);
    }

    /**
     * 升级内核小版本
     *
     * 对实例进行小版本升级。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpgradeDbVersionRequest 请求对象
     * @return SyncInvoker<UpgradeDbVersionRequest, UpgradeDbVersionResponse>
     */
    public SyncInvoker<UpgradeDbVersionRequest, UpgradeDbVersionResponse> upgradeDbVersionInvoker(
        UpgradeDbVersionRequest request) {
        return new SyncInvoker<UpgradeDbVersionRequest, UpgradeDbVersionResponse>(request, RdsMeta.upgradeDbVersion,
            hcClient);
    }

    /**
     * 升级内核小版本
     *
     * 对实例进行小版本升级。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpgradeDbVersionNewRequest 请求对象
     * @return UpgradeDbVersionNewResponse
     */
    public UpgradeDbVersionNewResponse upgradeDbVersionNew(UpgradeDbVersionNewRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.upgradeDbVersionNew);
    }

    /**
     * 升级内核小版本
     *
     * 对实例进行小版本升级。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpgradeDbVersionNewRequest 请求对象
     * @return SyncInvoker<UpgradeDbVersionNewRequest, UpgradeDbVersionNewResponse>
     */
    public SyncInvoker<UpgradeDbVersionNewRequest, UpgradeDbVersionNewResponse> upgradeDbVersionNewInvoker(
        UpgradeDbVersionNewRequest request) {
        return new SyncInvoker<UpgradeDbVersionNewRequest, UpgradeDbVersionNewResponse>(request,
            RdsMeta.upgradeDbVersionNew, hcClient);
    }

    /**
     * 查询API版本列表
     *
     * 查询API版本列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApiVersionRequest 请求对象
     * @return ListApiVersionResponse
     */
    public ListApiVersionResponse listApiVersion(ListApiVersionRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listApiVersion);
    }

    /**
     * 查询API版本列表
     *
     * 查询API版本列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApiVersionRequest 请求对象
     * @return SyncInvoker<ListApiVersionRequest, ListApiVersionResponse>
     */
    public SyncInvoker<ListApiVersionRequest, ListApiVersionResponse> listApiVersionInvoker(
        ListApiVersionRequest request) {
        return new SyncInvoker<ListApiVersionRequest, ListApiVersionResponse>(request, RdsMeta.listApiVersion,
            hcClient);
    }

    /**
     * 查询API版本列表
     *
     * 查询API版本列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApiVersionNewRequest 请求对象
     * @return ListApiVersionNewResponse
     */
    public ListApiVersionNewResponse listApiVersionNew(ListApiVersionNewRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listApiVersionNew);
    }

    /**
     * 查询API版本列表
     *
     * 查询API版本列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApiVersionNewRequest 请求对象
     * @return SyncInvoker<ListApiVersionNewRequest, ListApiVersionNewResponse>
     */
    public SyncInvoker<ListApiVersionNewRequest, ListApiVersionNewResponse> listApiVersionNewInvoker(
        ListApiVersionNewRequest request) {
        return new SyncInvoker<ListApiVersionNewRequest, ListApiVersionNewResponse>(request, RdsMeta.listApiVersionNew,
            hcClient);
    }

    /**
     * 查询指定的API版本信息
     *
     * 查询指定的API版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowApiVersionRequest 请求对象
     * @return ShowApiVersionResponse
     */
    public ShowApiVersionResponse showApiVersion(ShowApiVersionRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.showApiVersion);
    }

    /**
     * 查询指定的API版本信息
     *
     * 查询指定的API版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowApiVersionRequest 请求对象
     * @return SyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse>
     */
    public SyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse> showApiVersionInvoker(
        ShowApiVersionRequest request) {
        return new SyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse>(request, RdsMeta.showApiVersion,
            hcClient);
    }

    /**
     * 授权数据库帐号
     *
     * 授权数据库帐号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AllowDbUserPrivilegeRequest 请求对象
     * @return AllowDbUserPrivilegeResponse
     */
    public AllowDbUserPrivilegeResponse allowDbUserPrivilege(AllowDbUserPrivilegeRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.allowDbUserPrivilege);
    }

    /**
     * 授权数据库帐号
     *
     * 授权数据库帐号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AllowDbUserPrivilegeRequest 请求对象
     * @return SyncInvoker<AllowDbUserPrivilegeRequest, AllowDbUserPrivilegeResponse>
     */
    public SyncInvoker<AllowDbUserPrivilegeRequest, AllowDbUserPrivilegeResponse> allowDbUserPrivilegeInvoker(
        AllowDbUserPrivilegeRequest request) {
        return new SyncInvoker<AllowDbUserPrivilegeRequest, AllowDbUserPrivilegeResponse>(request,
            RdsMeta.allowDbUserPrivilege, hcClient);
    }

    /**
     * 创建数据库
     *
     * 创建数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDatabaseRequest 请求对象
     * @return CreateDatabaseResponse
     */
    public CreateDatabaseResponse createDatabase(CreateDatabaseRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.createDatabase);
    }

    /**
     * 创建数据库
     *
     * 创建数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDatabaseRequest 请求对象
     * @return SyncInvoker<CreateDatabaseRequest, CreateDatabaseResponse>
     */
    public SyncInvoker<CreateDatabaseRequest, CreateDatabaseResponse> createDatabaseInvoker(
        CreateDatabaseRequest request) {
        return new SyncInvoker<CreateDatabaseRequest, CreateDatabaseResponse>(request, RdsMeta.createDatabase,
            hcClient);
    }

    /**
     * 创建数据库用户
     *
     * 在指定实例中创建数据库帐号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDbUserRequest 请求对象
     * @return CreateDbUserResponse
     */
    public CreateDbUserResponse createDbUser(CreateDbUserRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.createDbUser);
    }

    /**
     * 创建数据库用户
     *
     * 在指定实例中创建数据库帐号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDbUserRequest 请求对象
     * @return SyncInvoker<CreateDbUserRequest, CreateDbUserResponse>
     */
    public SyncInvoker<CreateDbUserRequest, CreateDbUserResponse> createDbUserInvoker(CreateDbUserRequest request) {
        return new SyncInvoker<CreateDbUserRequest, CreateDbUserResponse>(request, RdsMeta.createDbUser, hcClient);
    }

    /**
     * 删除数据库
     *
     * 删除数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDatabaseRequest 请求对象
     * @return DeleteDatabaseResponse
     */
    public DeleteDatabaseResponse deleteDatabase(DeleteDatabaseRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.deleteDatabase);
    }

    /**
     * 删除数据库
     *
     * 删除数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDatabaseRequest 请求对象
     * @return SyncInvoker<DeleteDatabaseRequest, DeleteDatabaseResponse>
     */
    public SyncInvoker<DeleteDatabaseRequest, DeleteDatabaseResponse> deleteDatabaseInvoker(
        DeleteDatabaseRequest request) {
        return new SyncInvoker<DeleteDatabaseRequest, DeleteDatabaseResponse>(request, RdsMeta.deleteDatabase,
            hcClient);
    }

    /**
     * 删除数据库用户
     *
     * 删除数据库用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDbUserRequest 请求对象
     * @return DeleteDbUserResponse
     */
    public DeleteDbUserResponse deleteDbUser(DeleteDbUserRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.deleteDbUser);
    }

    /**
     * 删除数据库用户
     *
     * 删除数据库用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDbUserRequest 请求对象
     * @return SyncInvoker<DeleteDbUserRequest, DeleteDbUserResponse>
     */
    public SyncInvoker<DeleteDbUserRequest, DeleteDbUserResponse> deleteDbUserInvoker(DeleteDbUserRequest request) {
        return new SyncInvoker<DeleteDbUserRequest, DeleteDbUserResponse>(request, RdsMeta.deleteDbUser, hcClient);
    }

    /**
     * 查询指定用户的已授权数据库
     *
     * 查询指定用户的已授权数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAuthorizedDatabasesRequest 请求对象
     * @return ListAuthorizedDatabasesResponse
     */
    public ListAuthorizedDatabasesResponse listAuthorizedDatabases(ListAuthorizedDatabasesRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listAuthorizedDatabases);
    }

    /**
     * 查询指定用户的已授权数据库
     *
     * 查询指定用户的已授权数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAuthorizedDatabasesRequest 请求对象
     * @return SyncInvoker<ListAuthorizedDatabasesRequest, ListAuthorizedDatabasesResponse>
     */
    public SyncInvoker<ListAuthorizedDatabasesRequest, ListAuthorizedDatabasesResponse> listAuthorizedDatabasesInvoker(
        ListAuthorizedDatabasesRequest request) {
        return new SyncInvoker<ListAuthorizedDatabasesRequest, ListAuthorizedDatabasesResponse>(request,
            RdsMeta.listAuthorizedDatabases, hcClient);
    }

    /**
     * 查询指定数据库的已授权用户
     *
     * 查询指定数据库的已授权用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAuthorizedDbUsersRequest 请求对象
     * @return ListAuthorizedDbUsersResponse
     */
    public ListAuthorizedDbUsersResponse listAuthorizedDbUsers(ListAuthorizedDbUsersRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listAuthorizedDbUsers);
    }

    /**
     * 查询指定数据库的已授权用户
     *
     * 查询指定数据库的已授权用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAuthorizedDbUsersRequest 请求对象
     * @return SyncInvoker<ListAuthorizedDbUsersRequest, ListAuthorizedDbUsersResponse>
     */
    public SyncInvoker<ListAuthorizedDbUsersRequest, ListAuthorizedDbUsersResponse> listAuthorizedDbUsersInvoker(
        ListAuthorizedDbUsersRequest request) {
        return new SyncInvoker<ListAuthorizedDbUsersRequest, ListAuthorizedDbUsersResponse>(request,
            RdsMeta.listAuthorizedDbUsers, hcClient);
    }

    /**
     * 查询数据库列表
     *
     * 查询数据库列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDatabasesRequest 请求对象
     * @return ListDatabasesResponse
     */
    public ListDatabasesResponse listDatabases(ListDatabasesRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listDatabases);
    }

    /**
     * 查询数据库列表
     *
     * 查询数据库列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDatabasesRequest 请求对象
     * @return SyncInvoker<ListDatabasesRequest, ListDatabasesResponse>
     */
    public SyncInvoker<ListDatabasesRequest, ListDatabasesResponse> listDatabasesInvoker(ListDatabasesRequest request) {
        return new SyncInvoker<ListDatabasesRequest, ListDatabasesResponse>(request, RdsMeta.listDatabases, hcClient);
    }

    /**
     * 查询数据库用户列表
     *
     * 查询数据库用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDbUsersRequest 请求对象
     * @return ListDbUsersResponse
     */
    public ListDbUsersResponse listDbUsers(ListDbUsersRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listDbUsers);
    }

    /**
     * 查询数据库用户列表
     *
     * 查询数据库用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDbUsersRequest 请求对象
     * @return SyncInvoker<ListDbUsersRequest, ListDbUsersResponse>
     */
    public SyncInvoker<ListDbUsersRequest, ListDbUsersResponse> listDbUsersInvoker(ListDbUsersRequest request) {
        return new SyncInvoker<ListDbUsersRequest, ListDbUsersResponse>(request, RdsMeta.listDbUsers, hcClient);
    }

    /**
     * 重置数据库密码
     *
     * 重置数据库密码.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetPwdRequest 请求对象
     * @return ResetPwdResponse
     */
    public ResetPwdResponse resetPwd(ResetPwdRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.resetPwd);
    }

    /**
     * 重置数据库密码
     *
     * 重置数据库密码.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetPwdRequest 请求对象
     * @return SyncInvoker<ResetPwdRequest, ResetPwdResponse>
     */
    public SyncInvoker<ResetPwdRequest, ResetPwdResponse> resetPwdInvoker(ResetPwdRequest request) {
        return new SyncInvoker<ResetPwdRequest, ResetPwdResponse>(request, RdsMeta.resetPwd, hcClient);
    }

    /**
     * 解除数据库帐号权限
     *
     * 解除数据库帐号权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RevokeRequest 请求对象
     * @return RevokeResponse
     */
    public RevokeResponse revoke(RevokeRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.revoke);
    }

    /**
     * 解除数据库帐号权限
     *
     * 解除数据库帐号权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RevokeRequest 请求对象
     * @return SyncInvoker<RevokeRequest, RevokeResponse>
     */
    public SyncInvoker<RevokeRequest, RevokeResponse> revokeInvoker(RevokeRequest request) {
        return new SyncInvoker<RevokeRequest, RevokeResponse>(request, RdsMeta.revoke, hcClient);
    }

    /**
     * 设置数据库账号密码
     *
     * 设置数据库账号密码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetDbUserPwdRequest 请求对象
     * @return SetDbUserPwdResponse
     */
    public SetDbUserPwdResponse setDbUserPwd(SetDbUserPwdRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.setDbUserPwd);
    }

    /**
     * 设置数据库账号密码
     *
     * 设置数据库账号密码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetDbUserPwdRequest 请求对象
     * @return SyncInvoker<SetDbUserPwdRequest, SetDbUserPwdResponse>
     */
    public SyncInvoker<SetDbUserPwdRequest, SetDbUserPwdResponse> setDbUserPwdInvoker(SetDbUserPwdRequest request) {
        return new SyncInvoker<SetDbUserPwdRequest, SetDbUserPwdResponse>(request, RdsMeta.setDbUserPwd, hcClient);
    }

    /**
     * 设置数据库用户只读参数
     *
     * 根据业务需求，设置数据库用户只读
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetReadOnlySwitchRequest 请求对象
     * @return SetReadOnlySwitchResponse
     */
    public SetReadOnlySwitchResponse setReadOnlySwitch(SetReadOnlySwitchRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.setReadOnlySwitch);
    }

    /**
     * 设置数据库用户只读参数
     *
     * 根据业务需求，设置数据库用户只读
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetReadOnlySwitchRequest 请求对象
     * @return SyncInvoker<SetReadOnlySwitchRequest, SetReadOnlySwitchResponse>
     */
    public SyncInvoker<SetReadOnlySwitchRequest, SetReadOnlySwitchResponse> setReadOnlySwitchInvoker(
        SetReadOnlySwitchRequest request) {
        return new SyncInvoker<SetReadOnlySwitchRequest, SetReadOnlySwitchResponse>(request, RdsMeta.setReadOnlySwitch,
            hcClient);
    }

    /**
     * 修改指定实例的数据库备注
     *
     * 修改指定实例中的数据库备注。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDatabaseRequest 请求对象
     * @return UpdateDatabaseResponse
     */
    public UpdateDatabaseResponse updateDatabase(UpdateDatabaseRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.updateDatabase);
    }

    /**
     * 修改指定实例的数据库备注
     *
     * 修改指定实例中的数据库备注。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDatabaseRequest 请求对象
     * @return SyncInvoker<UpdateDatabaseRequest, UpdateDatabaseResponse>
     */
    public SyncInvoker<UpdateDatabaseRequest, UpdateDatabaseResponse> updateDatabaseInvoker(
        UpdateDatabaseRequest request) {
        return new SyncInvoker<UpdateDatabaseRequest, UpdateDatabaseResponse>(request, RdsMeta.updateDatabase,
            hcClient);
    }

    /**
     * 修改数据库用户名备注
     *
     * 修改数据库用户名备注
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDbUserCommentRequest 请求对象
     * @return UpdateDbUserCommentResponse
     */
    public UpdateDbUserCommentResponse updateDbUserComment(UpdateDbUserCommentRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.updateDbUserComment);
    }

    /**
     * 修改数据库用户名备注
     *
     * 修改数据库用户名备注
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDbUserCommentRequest 请求对象
     * @return SyncInvoker<UpdateDbUserCommentRequest, UpdateDbUserCommentResponse>
     */
    public SyncInvoker<UpdateDbUserCommentRequest, UpdateDbUserCommentResponse> updateDbUserCommentInvoker(
        UpdateDbUserCommentRequest request) {
        return new SyncInvoker<UpdateDbUserCommentRequest, UpdateDbUserCommentResponse>(request,
            RdsMeta.updateDbUserComment, hcClient);
    }

    /**
     * 授权数据库帐号
     *
     * 在指定实例的数据库中, 设置帐号的权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AllowDbPrivilegeRequest 请求对象
     * @return AllowDbPrivilegeResponse
     */
    public AllowDbPrivilegeResponse allowDbPrivilege(AllowDbPrivilegeRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.allowDbPrivilege);
    }

    /**
     * 授权数据库帐号
     *
     * 在指定实例的数据库中, 设置帐号的权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AllowDbPrivilegeRequest 请求对象
     * @return SyncInvoker<AllowDbPrivilegeRequest, AllowDbPrivilegeResponse>
     */
    public SyncInvoker<AllowDbPrivilegeRequest, AllowDbPrivilegeResponse> allowDbPrivilegeInvoker(
        AllowDbPrivilegeRequest request) {
        return new SyncInvoker<AllowDbPrivilegeRequest, AllowDbPrivilegeResponse>(request, RdsMeta.allowDbPrivilege,
            hcClient);
    }

    /**
     * 数据库代理规格变更
     *
     * 数据库代理实例进行规格变更。
     * 
     * - 调用接口前，您需要了解API 认证鉴权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeProxyScaleRequest 请求对象
     * @return ChangeProxyScaleResponse
     */
    public ChangeProxyScaleResponse changeProxyScale(ChangeProxyScaleRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.changeProxyScale);
    }

    /**
     * 数据库代理规格变更
     *
     * 数据库代理实例进行规格变更。
     * 
     * - 调用接口前，您需要了解API 认证鉴权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeProxyScaleRequest 请求对象
     * @return SyncInvoker<ChangeProxyScaleRequest, ChangeProxyScaleResponse>
     */
    public SyncInvoker<ChangeProxyScaleRequest, ChangeProxyScaleResponse> changeProxyScaleInvoker(
        ChangeProxyScaleRequest request) {
        return new SyncInvoker<ChangeProxyScaleRequest, ChangeProxyScaleResponse>(request, RdsMeta.changeProxyScale,
            hcClient);
    }

    /**
     * 修改读写分离阈值
     *
     * 修改指定实例的读写分离延时阈值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeTheDelayThresholdRequest 请求对象
     * @return ChangeTheDelayThresholdResponse
     */
    public ChangeTheDelayThresholdResponse changeTheDelayThreshold(ChangeTheDelayThresholdRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.changeTheDelayThreshold);
    }

    /**
     * 修改读写分离阈值
     *
     * 修改指定实例的读写分离延时阈值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeTheDelayThresholdRequest 请求对象
     * @return SyncInvoker<ChangeTheDelayThresholdRequest, ChangeTheDelayThresholdResponse>
     */
    public SyncInvoker<ChangeTheDelayThresholdRequest, ChangeTheDelayThresholdResponse> changeTheDelayThresholdInvoker(
        ChangeTheDelayThresholdRequest request) {
        return new SyncInvoker<ChangeTheDelayThresholdRequest, ChangeTheDelayThresholdResponse>(request,
            RdsMeta.changeTheDelayThreshold, hcClient);
    }

    /**
     * 创建数据库
     *
     * 在指定实例中创建数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePostgresqlDatabaseRequest 请求对象
     * @return CreatePostgresqlDatabaseResponse
     */
    public CreatePostgresqlDatabaseResponse createPostgresqlDatabase(CreatePostgresqlDatabaseRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.createPostgresqlDatabase);
    }

    /**
     * 创建数据库
     *
     * 在指定实例中创建数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePostgresqlDatabaseRequest 请求对象
     * @return SyncInvoker<CreatePostgresqlDatabaseRequest, CreatePostgresqlDatabaseResponse>
     */
    public SyncInvoker<CreatePostgresqlDatabaseRequest, CreatePostgresqlDatabaseResponse> createPostgresqlDatabaseInvoker(
        CreatePostgresqlDatabaseRequest request) {
        return new SyncInvoker<CreatePostgresqlDatabaseRequest, CreatePostgresqlDatabaseResponse>(request,
            RdsMeta.createPostgresqlDatabase, hcClient);
    }

    /**
     * 创建数据库SCHEMA
     *
     * 在指定实例的数据库中, 创建数据库schema。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePostgresqlDatabaseSchemaRequest 请求对象
     * @return CreatePostgresqlDatabaseSchemaResponse
     */
    public CreatePostgresqlDatabaseSchemaResponse createPostgresqlDatabaseSchema(
        CreatePostgresqlDatabaseSchemaRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.createPostgresqlDatabaseSchema);
    }

    /**
     * 创建数据库SCHEMA
     *
     * 在指定实例的数据库中, 创建数据库schema。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePostgresqlDatabaseSchemaRequest 请求对象
     * @return SyncInvoker<CreatePostgresqlDatabaseSchemaRequest, CreatePostgresqlDatabaseSchemaResponse>
     */
    public SyncInvoker<CreatePostgresqlDatabaseSchemaRequest, CreatePostgresqlDatabaseSchemaResponse> createPostgresqlDatabaseSchemaInvoker(
        CreatePostgresqlDatabaseSchemaRequest request) {
        return new SyncInvoker<CreatePostgresqlDatabaseSchemaRequest, CreatePostgresqlDatabaseSchemaResponse>(request,
            RdsMeta.createPostgresqlDatabaseSchema, hcClient);
    }

    /**
     * 创建数据库用户
     *
     * 在指定实例中创建数据库用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePostgresqlDbUserRequest 请求对象
     * @return CreatePostgresqlDbUserResponse
     */
    public CreatePostgresqlDbUserResponse createPostgresqlDbUser(CreatePostgresqlDbUserRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.createPostgresqlDbUser);
    }

    /**
     * 创建数据库用户
     *
     * 在指定实例中创建数据库用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePostgresqlDbUserRequest 请求对象
     * @return SyncInvoker<CreatePostgresqlDbUserRequest, CreatePostgresqlDbUserResponse>
     */
    public SyncInvoker<CreatePostgresqlDbUserRequest, CreatePostgresqlDbUserResponse> createPostgresqlDbUserInvoker(
        CreatePostgresqlDbUserRequest request) {
        return new SyncInvoker<CreatePostgresqlDbUserRequest, CreatePostgresqlDbUserResponse>(request,
            RdsMeta.createPostgresqlDbUser, hcClient);
    }

    /**
     * 创建插件
     *
     * 在指定数据库上创建插件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePostgresqlExtensionRequest 请求对象
     * @return CreatePostgresqlExtensionResponse
     */
    public CreatePostgresqlExtensionResponse createPostgresqlExtension(CreatePostgresqlExtensionRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.createPostgresqlExtension);
    }

    /**
     * 创建插件
     *
     * 在指定数据库上创建插件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePostgresqlExtensionRequest 请求对象
     * @return SyncInvoker<CreatePostgresqlExtensionRequest, CreatePostgresqlExtensionResponse>
     */
    public SyncInvoker<CreatePostgresqlExtensionRequest, CreatePostgresqlExtensionResponse> createPostgresqlExtensionInvoker(
        CreatePostgresqlExtensionRequest request) {
        return new SyncInvoker<CreatePostgresqlExtensionRequest, CreatePostgresqlExtensionResponse>(request,
            RdsMeta.createPostgresqlExtension, hcClient);
    }

    /**
     * 删除数据库
     *
     * 删除数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePostgresqlDatabaseRequest 请求对象
     * @return DeletePostgresqlDatabaseResponse
     */
    public DeletePostgresqlDatabaseResponse deletePostgresqlDatabase(DeletePostgresqlDatabaseRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.deletePostgresqlDatabase);
    }

    /**
     * 删除数据库
     *
     * 删除数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePostgresqlDatabaseRequest 请求对象
     * @return SyncInvoker<DeletePostgresqlDatabaseRequest, DeletePostgresqlDatabaseResponse>
     */
    public SyncInvoker<DeletePostgresqlDatabaseRequest, DeletePostgresqlDatabaseResponse> deletePostgresqlDatabaseInvoker(
        DeletePostgresqlDatabaseRequest request) {
        return new SyncInvoker<DeletePostgresqlDatabaseRequest, DeletePostgresqlDatabaseResponse>(request,
            RdsMeta.deletePostgresqlDatabase, hcClient);
    }

    /**
     * 删除数据库用户
     *
     * 删除数据库用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePostgresqlDbUserRequest 请求对象
     * @return DeletePostgresqlDbUserResponse
     */
    public DeletePostgresqlDbUserResponse deletePostgresqlDbUser(DeletePostgresqlDbUserRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.deletePostgresqlDbUser);
    }

    /**
     * 删除数据库用户
     *
     * 删除数据库用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePostgresqlDbUserRequest 请求对象
     * @return SyncInvoker<DeletePostgresqlDbUserRequest, DeletePostgresqlDbUserResponse>
     */
    public SyncInvoker<DeletePostgresqlDbUserRequest, DeletePostgresqlDbUserResponse> deletePostgresqlDbUserInvoker(
        DeletePostgresqlDbUserRequest request) {
        return new SyncInvoker<DeletePostgresqlDbUserRequest, DeletePostgresqlDbUserResponse>(request,
            RdsMeta.deletePostgresqlDbUser, hcClient);
    }

    /**
     * 删除插件
     *
     * 在指定数据库上删除插件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePostgresqlExtensionRequest 请求对象
     * @return DeletePostgresqlExtensionResponse
     */
    public DeletePostgresqlExtensionResponse deletePostgresqlExtension(DeletePostgresqlExtensionRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.deletePostgresqlExtension);
    }

    /**
     * 删除插件
     *
     * 在指定数据库上删除插件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePostgresqlExtensionRequest 请求对象
     * @return SyncInvoker<DeletePostgresqlExtensionRequest, DeletePostgresqlExtensionResponse>
     */
    public SyncInvoker<DeletePostgresqlExtensionRequest, DeletePostgresqlExtensionResponse> deletePostgresqlExtensionInvoker(
        DeletePostgresqlExtensionRequest request) {
        return new SyncInvoker<DeletePostgresqlExtensionRequest, DeletePostgresqlExtensionResponse>(request,
            RdsMeta.deletePostgresqlExtension, hcClient);
    }

    /**
     * 查询数据库SCHEMA列表
     *
     * 查询指定实例的数据库SCHEMA列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPostgresqlDatabaseSchemasRequest 请求对象
     * @return ListPostgresqlDatabaseSchemasResponse
     */
    public ListPostgresqlDatabaseSchemasResponse listPostgresqlDatabaseSchemas(
        ListPostgresqlDatabaseSchemasRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listPostgresqlDatabaseSchemas);
    }

    /**
     * 查询数据库SCHEMA列表
     *
     * 查询指定实例的数据库SCHEMA列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPostgresqlDatabaseSchemasRequest 请求对象
     * @return SyncInvoker<ListPostgresqlDatabaseSchemasRequest, ListPostgresqlDatabaseSchemasResponse>
     */
    public SyncInvoker<ListPostgresqlDatabaseSchemasRequest, ListPostgresqlDatabaseSchemasResponse> listPostgresqlDatabaseSchemasInvoker(
        ListPostgresqlDatabaseSchemasRequest request) {
        return new SyncInvoker<ListPostgresqlDatabaseSchemasRequest, ListPostgresqlDatabaseSchemasResponse>(request,
            RdsMeta.listPostgresqlDatabaseSchemas, hcClient);
    }

    /**
     * 查询数据库列表
     *
     * 查询指定实例中的数据库列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPostgresqlDatabasesRequest 请求对象
     * @return ListPostgresqlDatabasesResponse
     */
    public ListPostgresqlDatabasesResponse listPostgresqlDatabases(ListPostgresqlDatabasesRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listPostgresqlDatabases);
    }

    /**
     * 查询数据库列表
     *
     * 查询指定实例中的数据库列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPostgresqlDatabasesRequest 请求对象
     * @return SyncInvoker<ListPostgresqlDatabasesRequest, ListPostgresqlDatabasesResponse>
     */
    public SyncInvoker<ListPostgresqlDatabasesRequest, ListPostgresqlDatabasesResponse> listPostgresqlDatabasesInvoker(
        ListPostgresqlDatabasesRequest request) {
        return new SyncInvoker<ListPostgresqlDatabasesRequest, ListPostgresqlDatabasesResponse>(request,
            RdsMeta.listPostgresqlDatabases, hcClient);
    }

    /**
     * 查询数据库用户列表
     *
     * 在指定实例中查询数据库用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPostgresqlDbUserPaginatedRequest 请求对象
     * @return ListPostgresqlDbUserPaginatedResponse
     */
    public ListPostgresqlDbUserPaginatedResponse listPostgresqlDbUserPaginated(
        ListPostgresqlDbUserPaginatedRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listPostgresqlDbUserPaginated);
    }

    /**
     * 查询数据库用户列表
     *
     * 在指定实例中查询数据库用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPostgresqlDbUserPaginatedRequest 请求对象
     * @return SyncInvoker<ListPostgresqlDbUserPaginatedRequest, ListPostgresqlDbUserPaginatedResponse>
     */
    public SyncInvoker<ListPostgresqlDbUserPaginatedRequest, ListPostgresqlDbUserPaginatedResponse> listPostgresqlDbUserPaginatedInvoker(
        ListPostgresqlDbUserPaginatedRequest request) {
        return new SyncInvoker<ListPostgresqlDbUserPaginatedRequest, ListPostgresqlDbUserPaginatedResponse>(request,
            RdsMeta.listPostgresqlDbUserPaginated, hcClient);
    }

    /**
     * 查询插件
     *
     * 获取指定数据库的插件信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPostgresqlExtensionRequest 请求对象
     * @return ListPostgresqlExtensionResponse
     */
    public ListPostgresqlExtensionResponse listPostgresqlExtension(ListPostgresqlExtensionRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listPostgresqlExtension);
    }

    /**
     * 查询插件
     *
     * 获取指定数据库的插件信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPostgresqlExtensionRequest 请求对象
     * @return SyncInvoker<ListPostgresqlExtensionRequest, ListPostgresqlExtensionResponse>
     */
    public SyncInvoker<ListPostgresqlExtensionRequest, ListPostgresqlExtensionResponse> listPostgresqlExtensionInvoker(
        ListPostgresqlExtensionRequest request) {
        return new SyncInvoker<ListPostgresqlExtensionRequest, ListPostgresqlExtensionResponse>(request,
            RdsMeta.listPostgresqlExtension, hcClient);
    }

    /**
     * 解除数据库帐号权限
     *
     * 解除数据库帐号权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RevokePostgresqlDbPrivilegeRequest 请求对象
     * @return RevokePostgresqlDbPrivilegeResponse
     */
    public RevokePostgresqlDbPrivilegeResponse revokePostgresqlDbPrivilege(RevokePostgresqlDbPrivilegeRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.revokePostgresqlDbPrivilege);
    }

    /**
     * 解除数据库帐号权限
     *
     * 解除数据库帐号权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RevokePostgresqlDbPrivilegeRequest 请求对象
     * @return SyncInvoker<RevokePostgresqlDbPrivilegeRequest, RevokePostgresqlDbPrivilegeResponse>
     */
    public SyncInvoker<RevokePostgresqlDbPrivilegeRequest, RevokePostgresqlDbPrivilegeResponse> revokePostgresqlDbPrivilegeInvoker(
        RevokePostgresqlDbPrivilegeRequest request) {
        return new SyncInvoker<RevokePostgresqlDbPrivilegeRequest, RevokePostgresqlDbPrivilegeResponse>(request,
            RdsMeta.revokePostgresqlDbPrivilege, hcClient);
    }

    /**
     * 查询数据库代理可变更的规格
     *
     * 查询数据库代理可变更的规格信息。
     * 
     * - 调用接口前，您需要了解API 认证鉴权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchQueryScaleComputeFlavorsRequest 请求对象
     * @return SearchQueryScaleComputeFlavorsResponse
     */
    public SearchQueryScaleComputeFlavorsResponse searchQueryScaleComputeFlavors(
        SearchQueryScaleComputeFlavorsRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.searchQueryScaleComputeFlavors);
    }

    /**
     * 查询数据库代理可变更的规格
     *
     * 查询数据库代理可变更的规格信息。
     * 
     * - 调用接口前，您需要了解API 认证鉴权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchQueryScaleComputeFlavorsRequest 请求对象
     * @return SyncInvoker<SearchQueryScaleComputeFlavorsRequest, SearchQueryScaleComputeFlavorsResponse>
     */
    public SyncInvoker<SearchQueryScaleComputeFlavorsRequest, SearchQueryScaleComputeFlavorsResponse> searchQueryScaleComputeFlavorsInvoker(
        SearchQueryScaleComputeFlavorsRequest request) {
        return new SyncInvoker<SearchQueryScaleComputeFlavorsRequest, SearchQueryScaleComputeFlavorsResponse>(request,
            RdsMeta.searchQueryScaleComputeFlavors, hcClient);
    }

    /**
     * 查询数据库代理可变更的规格
     *
     * 查询数据库代理可变更的规格信息。
     * 
     * - 调用接口前，您需要了解API 认证鉴权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchQueryScaleFlavorsRequest 请求对象
     * @return SearchQueryScaleFlavorsResponse
     */
    public SearchQueryScaleFlavorsResponse searchQueryScaleFlavors(SearchQueryScaleFlavorsRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.searchQueryScaleFlavors);
    }

    /**
     * 查询数据库代理可变更的规格
     *
     * 查询数据库代理可变更的规格信息。
     * 
     * - 调用接口前，您需要了解API 认证鉴权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchQueryScaleFlavorsRequest 请求对象
     * @return SyncInvoker<SearchQueryScaleFlavorsRequest, SearchQueryScaleFlavorsResponse>
     */
    public SyncInvoker<SearchQueryScaleFlavorsRequest, SearchQueryScaleFlavorsResponse> searchQueryScaleFlavorsInvoker(
        SearchQueryScaleFlavorsRequest request) {
        return new SyncInvoker<SearchQueryScaleFlavorsRequest, SearchQueryScaleFlavorsResponse>(request,
            RdsMeta.searchQueryScaleFlavors, hcClient);
    }

    /**
     * 设置数据库用户权限
     *
     * 设置数据库用户权限：只读或可读写。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetDatabaseUserPrivilegeRequest 请求对象
     * @return SetDatabaseUserPrivilegeResponse
     */
    public SetDatabaseUserPrivilegeResponse setDatabaseUserPrivilege(SetDatabaseUserPrivilegeRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.setDatabaseUserPrivilege);
    }

    /**
     * 设置数据库用户权限
     *
     * 设置数据库用户权限：只读或可读写。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetDatabaseUserPrivilegeRequest 请求对象
     * @return SyncInvoker<SetDatabaseUserPrivilegeRequest, SetDatabaseUserPrivilegeResponse>
     */
    public SyncInvoker<SetDatabaseUserPrivilegeRequest, SetDatabaseUserPrivilegeResponse> setDatabaseUserPrivilegeInvoker(
        SetDatabaseUserPrivilegeRequest request) {
        return new SyncInvoker<SetDatabaseUserPrivilegeRequest, SetDatabaseUserPrivilegeResponse>(request,
            RdsMeta.setDatabaseUserPrivilege, hcClient);
    }

    /**
     * 重置数据库帐号密码
     *
     * 重置指定数据库帐号的密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetPostgresqlDbUserPwdRequest 请求对象
     * @return SetPostgresqlDbUserPwdResponse
     */
    public SetPostgresqlDbUserPwdResponse setPostgresqlDbUserPwd(SetPostgresqlDbUserPwdRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.setPostgresqlDbUserPwd);
    }

    /**
     * 重置数据库帐号密码
     *
     * 重置指定数据库帐号的密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetPostgresqlDbUserPwdRequest 请求对象
     * @return SyncInvoker<SetPostgresqlDbUserPwdRequest, SetPostgresqlDbUserPwdResponse>
     */
    public SyncInvoker<SetPostgresqlDbUserPwdRequest, SetPostgresqlDbUserPwdResponse> setPostgresqlDbUserPwdInvoker(
        SetPostgresqlDbUserPwdRequest request) {
        return new SyncInvoker<SetPostgresqlDbUserPwdRequest, SetPostgresqlDbUserPwdResponse>(request,
            RdsMeta.setPostgresqlDbUserPwd, hcClient);
    }

    /**
     * 查询数据库代理信息
     *
     * 查询指定实例的数据库代理详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowInformationAboutDatabaseProxyRequest 请求对象
     * @return ShowInformationAboutDatabaseProxyResponse
     */
    public ShowInformationAboutDatabaseProxyResponse showInformationAboutDatabaseProxy(
        ShowInformationAboutDatabaseProxyRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.showInformationAboutDatabaseProxy);
    }

    /**
     * 查询数据库代理信息
     *
     * 查询指定实例的数据库代理详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowInformationAboutDatabaseProxyRequest 请求对象
     * @return SyncInvoker<ShowInformationAboutDatabaseProxyRequest, ShowInformationAboutDatabaseProxyResponse>
     */
    public SyncInvoker<ShowInformationAboutDatabaseProxyRequest, ShowInformationAboutDatabaseProxyResponse> showInformationAboutDatabaseProxyInvoker(
        ShowInformationAboutDatabaseProxyRequest request) {
        return new SyncInvoker<ShowInformationAboutDatabaseProxyRequest, ShowInformationAboutDatabaseProxyResponse>(
            request, RdsMeta.showInformationAboutDatabaseProxy, hcClient);
    }

    /**
     * 获取实例指定参数的值
     *
     * 获取实例指定参数的值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPostgresqlParamValueRequest 请求对象
     * @return ShowPostgresqlParamValueResponse
     */
    public ShowPostgresqlParamValueResponse showPostgresqlParamValue(ShowPostgresqlParamValueRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.showPostgresqlParamValue);
    }

    /**
     * 获取实例指定参数的值
     *
     * 获取实例指定参数的值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPostgresqlParamValueRequest 请求对象
     * @return SyncInvoker<ShowPostgresqlParamValueRequest, ShowPostgresqlParamValueResponse>
     */
    public SyncInvoker<ShowPostgresqlParamValueRequest, ShowPostgresqlParamValueResponse> showPostgresqlParamValueInvoker(
        ShowPostgresqlParamValueRequest request) {
        return new SyncInvoker<ShowPostgresqlParamValueRequest, ShowPostgresqlParamValueResponse>(request,
            RdsMeta.showPostgresqlParamValue, hcClient);
    }

    /**
     * 开启数据库代理
     *
     * 为指定实例开启数据库代理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartDatabaseProxyRequest 请求对象
     * @return StartDatabaseProxyResponse
     */
    public StartDatabaseProxyResponse startDatabaseProxy(StartDatabaseProxyRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.startDatabaseProxy);
    }

    /**
     * 开启数据库代理
     *
     * 为指定实例开启数据库代理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartDatabaseProxyRequest 请求对象
     * @return SyncInvoker<StartDatabaseProxyRequest, StartDatabaseProxyResponse>
     */
    public SyncInvoker<StartDatabaseProxyRequest, StartDatabaseProxyResponse> startDatabaseProxyInvoker(
        StartDatabaseProxyRequest request) {
        return new SyncInvoker<StartDatabaseProxyRequest, StartDatabaseProxyResponse>(request,
            RdsMeta.startDatabaseProxy, hcClient);
    }

    /**
     * 关闭数据库代理
     *
     * 为指定实例关闭数据库代理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopDatabaseProxyRequest 请求对象
     * @return StopDatabaseProxyResponse
     */
    public StopDatabaseProxyResponse stopDatabaseProxy(StopDatabaseProxyRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.stopDatabaseProxy);
    }

    /**
     * 关闭数据库代理
     *
     * 为指定实例关闭数据库代理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopDatabaseProxyRequest 请求对象
     * @return SyncInvoker<StopDatabaseProxyRequest, StopDatabaseProxyResponse>
     */
    public SyncInvoker<StopDatabaseProxyRequest, StopDatabaseProxyResponse> stopDatabaseProxyInvoker(
        StopDatabaseProxyRequest request) {
        return new SyncInvoker<StopDatabaseProxyRequest, StopDatabaseProxyResponse>(request, RdsMeta.stopDatabaseProxy,
            hcClient);
    }

    /**
     * 
     *
     * 数据库帐号授权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDbUserPrivilegeRequest 请求对象
     * @return UpdateDbUserPrivilegeResponse
     */
    public UpdateDbUserPrivilegeResponse updateDbUserPrivilege(UpdateDbUserPrivilegeRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.updateDbUserPrivilege);
    }

    /**
     * 
     *
     * 数据库帐号授权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDbUserPrivilegeRequest 请求对象
     * @return SyncInvoker<UpdateDbUserPrivilegeRequest, UpdateDbUserPrivilegeResponse>
     */
    public SyncInvoker<UpdateDbUserPrivilegeRequest, UpdateDbUserPrivilegeResponse> updateDbUserPrivilegeInvoker(
        UpdateDbUserPrivilegeRequest request) {
        return new SyncInvoker<UpdateDbUserPrivilegeRequest, UpdateDbUserPrivilegeResponse>(request,
            RdsMeta.updateDbUserPrivilege, hcClient);
    }

    /**
     * 修改指定实例的数据库备注
     *
     * 修改指定实例中的数据库备注。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePostgresqlDatabaseRequest 请求对象
     * @return UpdatePostgresqlDatabaseResponse
     */
    public UpdatePostgresqlDatabaseResponse updatePostgresqlDatabase(UpdatePostgresqlDatabaseRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.updatePostgresqlDatabase);
    }

    /**
     * 修改指定实例的数据库备注
     *
     * 修改指定实例中的数据库备注。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePostgresqlDatabaseRequest 请求对象
     * @return SyncInvoker<UpdatePostgresqlDatabaseRequest, UpdatePostgresqlDatabaseResponse>
     */
    public SyncInvoker<UpdatePostgresqlDatabaseRequest, UpdatePostgresqlDatabaseResponse> updatePostgresqlDatabaseInvoker(
        UpdatePostgresqlDatabaseRequest request) {
        return new SyncInvoker<UpdatePostgresqlDatabaseRequest, UpdatePostgresqlDatabaseResponse>(request,
            RdsMeta.updatePostgresqlDatabase, hcClient);
    }

    /**
     * 修改数据库用户名备注
     *
     * 修改数据库用户名备注
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePostgresqlDbUserCommentRequest 请求对象
     * @return UpdatePostgresqlDbUserCommentResponse
     */
    public UpdatePostgresqlDbUserCommentResponse updatePostgresqlDbUserComment(
        UpdatePostgresqlDbUserCommentRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.updatePostgresqlDbUserComment);
    }

    /**
     * 修改数据库用户名备注
     *
     * 修改数据库用户名备注
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePostgresqlDbUserCommentRequest 请求对象
     * @return SyncInvoker<UpdatePostgresqlDbUserCommentRequest, UpdatePostgresqlDbUserCommentResponse>
     */
    public SyncInvoker<UpdatePostgresqlDbUserCommentRequest, UpdatePostgresqlDbUserCommentResponse> updatePostgresqlDbUserCommentInvoker(
        UpdatePostgresqlDbUserCommentRequest request) {
        return new SyncInvoker<UpdatePostgresqlDbUserCommentRequest, UpdatePostgresqlDbUserCommentResponse>(request,
            RdsMeta.updatePostgresqlDbUserComment, hcClient);
    }

    /**
     * 修改实例指定参数的值
     *
     * 修改实例指定参数的值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePostgresqlParameterValueRequest 请求对象
     * @return UpdatePostgresqlParameterValueResponse
     */
    public UpdatePostgresqlParameterValueResponse updatePostgresqlParameterValue(
        UpdatePostgresqlParameterValueRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.updatePostgresqlParameterValue);
    }

    /**
     * 修改实例指定参数的值
     *
     * 修改实例指定参数的值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePostgresqlParameterValueRequest 请求对象
     * @return SyncInvoker<UpdatePostgresqlParameterValueRequest, UpdatePostgresqlParameterValueResponse>
     */
    public SyncInvoker<UpdatePostgresqlParameterValueRequest, UpdatePostgresqlParameterValueResponse> updatePostgresqlParameterValueInvoker(
        UpdatePostgresqlParameterValueRequest request) {
        return new SyncInvoker<UpdatePostgresqlParameterValueRequest, UpdatePostgresqlParameterValueResponse>(request,
            RdsMeta.updatePostgresqlParameterValue, hcClient);
    }

    /**
     * 修改读写分离权重
     *
     * 修改指定实例的读写分离权重。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateReadWeightRequest 请求对象
     * @return UpdateReadWeightResponse
     */
    public UpdateReadWeightResponse updateReadWeight(UpdateReadWeightRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.updateReadWeight);
    }

    /**
     * 修改读写分离权重
     *
     * 修改指定实例的读写分离权重。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateReadWeightRequest 请求对象
     * @return SyncInvoker<UpdateReadWeightRequest, UpdateReadWeightResponse>
     */
    public SyncInvoker<UpdateReadWeightRequest, UpdateReadWeightResponse> updateReadWeightInvoker(
        UpdateReadWeightRequest request) {
        return new SyncInvoker<UpdateReadWeightRequest, UpdateReadWeightResponse>(request, RdsMeta.updateReadWeight,
            hcClient);
    }

    /**
     * 授权数据库帐号
     *
     * 授权数据库帐号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AllowSqlserverDbUserPrivilegeRequest 请求对象
     * @return AllowSqlserverDbUserPrivilegeResponse
     */
    public AllowSqlserverDbUserPrivilegeResponse allowSqlserverDbUserPrivilege(
        AllowSqlserverDbUserPrivilegeRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.allowSqlserverDbUserPrivilege);
    }

    /**
     * 授权数据库帐号
     *
     * 授权数据库帐号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AllowSqlserverDbUserPrivilegeRequest 请求对象
     * @return SyncInvoker<AllowSqlserverDbUserPrivilegeRequest, AllowSqlserverDbUserPrivilegeResponse>
     */
    public SyncInvoker<AllowSqlserverDbUserPrivilegeRequest, AllowSqlserverDbUserPrivilegeResponse> allowSqlserverDbUserPrivilegeInvoker(
        AllowSqlserverDbUserPrivilegeRequest request) {
        return new SyncInvoker<AllowSqlserverDbUserPrivilegeRequest, AllowSqlserverDbUserPrivilegeResponse>(request,
            RdsMeta.allowSqlserverDbUserPrivilege, hcClient);
    }

    /**
     * 添加MSDTC
     *
     * 添加MSDTC相关主机host地址
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchAddMsdtcsRequest 请求对象
     * @return BatchAddMsdtcsResponse
     */
    public BatchAddMsdtcsResponse batchAddMsdtcs(BatchAddMsdtcsRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.batchAddMsdtcs);
    }

    /**
     * 添加MSDTC
     *
     * 添加MSDTC相关主机host地址
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchAddMsdtcsRequest 请求对象
     * @return SyncInvoker<BatchAddMsdtcsRequest, BatchAddMsdtcsResponse>
     */
    public SyncInvoker<BatchAddMsdtcsRequest, BatchAddMsdtcsResponse> batchAddMsdtcsInvoker(
        BatchAddMsdtcsRequest request) {
        return new SyncInvoker<BatchAddMsdtcsRequest, BatchAddMsdtcsResponse>(request, RdsMeta.batchAddMsdtcs,
            hcClient);
    }

    /**
     * 创建数据库
     *
     * 创建数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSqlserverDatabaseRequest 请求对象
     * @return CreateSqlserverDatabaseResponse
     */
    public CreateSqlserverDatabaseResponse createSqlserverDatabase(CreateSqlserverDatabaseRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.createSqlserverDatabase);
    }

    /**
     * 创建数据库
     *
     * 创建数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSqlserverDatabaseRequest 请求对象
     * @return SyncInvoker<CreateSqlserverDatabaseRequest, CreateSqlserverDatabaseResponse>
     */
    public SyncInvoker<CreateSqlserverDatabaseRequest, CreateSqlserverDatabaseResponse> createSqlserverDatabaseInvoker(
        CreateSqlserverDatabaseRequest request) {
        return new SyncInvoker<CreateSqlserverDatabaseRequest, CreateSqlserverDatabaseResponse>(request,
            RdsMeta.createSqlserverDatabase, hcClient);
    }

    /**
     * 创建数据库用户
     *
     * 创建数据库用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSqlserverDbUserRequest 请求对象
     * @return CreateSqlserverDbUserResponse
     */
    public CreateSqlserverDbUserResponse createSqlserverDbUser(CreateSqlserverDbUserRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.createSqlserverDbUser);
    }

    /**
     * 创建数据库用户
     *
     * 创建数据库用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSqlserverDbUserRequest 请求对象
     * @return SyncInvoker<CreateSqlserverDbUserRequest, CreateSqlserverDbUserResponse>
     */
    public SyncInvoker<CreateSqlserverDbUserRequest, CreateSqlserverDbUserResponse> createSqlserverDbUserInvoker(
        CreateSqlserverDbUserRequest request) {
        return new SyncInvoker<CreateSqlserverDbUserRequest, CreateSqlserverDbUserResponse>(request,
            RdsMeta.createSqlserverDbUser, hcClient);
    }

    /**
     * 删除数据库
     *
     * 删除数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSqlserverDatabaseRequest 请求对象
     * @return DeleteSqlserverDatabaseResponse
     */
    public DeleteSqlserverDatabaseResponse deleteSqlserverDatabase(DeleteSqlserverDatabaseRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.deleteSqlserverDatabase);
    }

    /**
     * 删除数据库
     *
     * 删除数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSqlserverDatabaseRequest 请求对象
     * @return SyncInvoker<DeleteSqlserverDatabaseRequest, DeleteSqlserverDatabaseResponse>
     */
    public SyncInvoker<DeleteSqlserverDatabaseRequest, DeleteSqlserverDatabaseResponse> deleteSqlserverDatabaseInvoker(
        DeleteSqlserverDatabaseRequest request) {
        return new SyncInvoker<DeleteSqlserverDatabaseRequest, DeleteSqlserverDatabaseResponse>(request,
            RdsMeta.deleteSqlserverDatabase, hcClient);
    }

    /**
     * 删除数据库
     *
     * 删除数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSqlserverDatabaseExRequest 请求对象
     * @return DeleteSqlserverDatabaseExResponse
     */
    public DeleteSqlserverDatabaseExResponse deleteSqlserverDatabaseEx(DeleteSqlserverDatabaseExRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.deleteSqlserverDatabaseEx);
    }

    /**
     * 删除数据库
     *
     * 删除数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSqlserverDatabaseExRequest 请求对象
     * @return SyncInvoker<DeleteSqlserverDatabaseExRequest, DeleteSqlserverDatabaseExResponse>
     */
    public SyncInvoker<DeleteSqlserverDatabaseExRequest, DeleteSqlserverDatabaseExResponse> deleteSqlserverDatabaseExInvoker(
        DeleteSqlserverDatabaseExRequest request) {
        return new SyncInvoker<DeleteSqlserverDatabaseExRequest, DeleteSqlserverDatabaseExResponse>(request,
            RdsMeta.deleteSqlserverDatabaseEx, hcClient);
    }

    /**
     * 删除数据库用户
     *
     * 删除数据库用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSqlserverDbUserRequest 请求对象
     * @return DeleteSqlserverDbUserResponse
     */
    public DeleteSqlserverDbUserResponse deleteSqlserverDbUser(DeleteSqlserverDbUserRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.deleteSqlserverDbUser);
    }

    /**
     * 删除数据库用户
     *
     * 删除数据库用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSqlserverDbUserRequest 请求对象
     * @return SyncInvoker<DeleteSqlserverDbUserRequest, DeleteSqlserverDbUserResponse>
     */
    public SyncInvoker<DeleteSqlserverDbUserRequest, DeleteSqlserverDbUserResponse> deleteSqlserverDbUserInvoker(
        DeleteSqlserverDbUserRequest request) {
        return new SyncInvoker<DeleteSqlserverDbUserRequest, DeleteSqlserverDbUserResponse>(request,
            RdsMeta.deleteSqlserverDbUser, hcClient);
    }

    /**
     * 查询指定数据库的已授权用户
     *
     * 查询指定数据库的已授权用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAuthorizedSqlserverDbUsersRequest 请求对象
     * @return ListAuthorizedSqlserverDbUsersResponse
     */
    public ListAuthorizedSqlserverDbUsersResponse listAuthorizedSqlserverDbUsers(
        ListAuthorizedSqlserverDbUsersRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listAuthorizedSqlserverDbUsers);
    }

    /**
     * 查询指定数据库的已授权用户
     *
     * 查询指定数据库的已授权用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAuthorizedSqlserverDbUsersRequest 请求对象
     * @return SyncInvoker<ListAuthorizedSqlserverDbUsersRequest, ListAuthorizedSqlserverDbUsersResponse>
     */
    public SyncInvoker<ListAuthorizedSqlserverDbUsersRequest, ListAuthorizedSqlserverDbUsersResponse> listAuthorizedSqlserverDbUsersInvoker(
        ListAuthorizedSqlserverDbUsersRequest request) {
        return new SyncInvoker<ListAuthorizedSqlserverDbUsersRequest, ListAuthorizedSqlserverDbUsersResponse>(request,
            RdsMeta.listAuthorizedSqlserverDbUsers, hcClient);
    }

    /**
     * 查询MSDTC的hosts信息
     *
     * 查询MSDTC的hosts信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMsdtcHostsRequest 请求对象
     * @return ListMsdtcHostsResponse
     */
    public ListMsdtcHostsResponse listMsdtcHosts(ListMsdtcHostsRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listMsdtcHosts);
    }

    /**
     * 查询MSDTC的hosts信息
     *
     * 查询MSDTC的hosts信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMsdtcHostsRequest 请求对象
     * @return SyncInvoker<ListMsdtcHostsRequest, ListMsdtcHostsResponse>
     */
    public SyncInvoker<ListMsdtcHostsRequest, ListMsdtcHostsResponse> listMsdtcHostsInvoker(
        ListMsdtcHostsRequest request) {
        return new SyncInvoker<ListMsdtcHostsRequest, ListMsdtcHostsResponse>(request, RdsMeta.listMsdtcHosts,
            hcClient);
    }

    /**
     * 查询数据库列表
     *
     * 查询数据库列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSqlserverDatabasesRequest 请求对象
     * @return ListSqlserverDatabasesResponse
     */
    public ListSqlserverDatabasesResponse listSqlserverDatabases(ListSqlserverDatabasesRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listSqlserverDatabases);
    }

    /**
     * 查询数据库列表
     *
     * 查询数据库列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSqlserverDatabasesRequest 请求对象
     * @return SyncInvoker<ListSqlserverDatabasesRequest, ListSqlserverDatabasesResponse>
     */
    public SyncInvoker<ListSqlserverDatabasesRequest, ListSqlserverDatabasesResponse> listSqlserverDatabasesInvoker(
        ListSqlserverDatabasesRequest request) {
        return new SyncInvoker<ListSqlserverDatabasesRequest, ListSqlserverDatabasesResponse>(request,
            RdsMeta.listSqlserverDatabases, hcClient);
    }

    /**
     * 查询数据库用户列表
     *
     * 查询数据库用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSqlserverDbUsersRequest 请求对象
     * @return ListSqlserverDbUsersResponse
     */
    public ListSqlserverDbUsersResponse listSqlserverDbUsers(ListSqlserverDbUsersRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listSqlserverDbUsers);
    }

    /**
     * 查询数据库用户列表
     *
     * 查询数据库用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSqlserverDbUsersRequest 请求对象
     * @return SyncInvoker<ListSqlserverDbUsersRequest, ListSqlserverDbUsersResponse>
     */
    public SyncInvoker<ListSqlserverDbUsersRequest, ListSqlserverDbUsersResponse> listSqlserverDbUsersInvoker(
        ListSqlserverDbUsersRequest request) {
        return new SyncInvoker<ListSqlserverDbUsersRequest, ListSqlserverDbUsersResponse>(request,
            RdsMeta.listSqlserverDbUsers, hcClient);
    }

    /**
     * 修改实例字符集
     *
     * 修改实例字符集。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ModifyCollationRequest 请求对象
     * @return ModifyCollationResponse
     */
    public ModifyCollationResponse modifyCollation(ModifyCollationRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.modifyCollation);
    }

    /**
     * 修改实例字符集
     *
     * 修改实例字符集。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ModifyCollationRequest 请求对象
     * @return SyncInvoker<ModifyCollationRequest, ModifyCollationResponse>
     */
    public SyncInvoker<ModifyCollationRequest, ModifyCollationResponse> modifyCollationInvoker(
        ModifyCollationRequest request) {
        return new SyncInvoker<ModifyCollationRequest, ModifyCollationResponse>(request, RdsMeta.modifyCollation,
            hcClient);
    }

    /**
     * 解除数据库帐号权限
     *
     * 解除数据库帐号权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RevokeSqlserverDbUserPrivilegeRequest 请求对象
     * @return RevokeSqlserverDbUserPrivilegeResponse
     */
    public RevokeSqlserverDbUserPrivilegeResponse revokeSqlserverDbUserPrivilege(
        RevokeSqlserverDbUserPrivilegeRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.revokeSqlserverDbUserPrivilege);
    }

    /**
     * 解除数据库帐号权限
     *
     * 解除数据库帐号权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RevokeSqlserverDbUserPrivilegeRequest 请求对象
     * @return SyncInvoker<RevokeSqlserverDbUserPrivilegeRequest, RevokeSqlserverDbUserPrivilegeResponse>
     */
    public SyncInvoker<RevokeSqlserverDbUserPrivilegeRequest, RevokeSqlserverDbUserPrivilegeResponse> revokeSqlserverDbUserPrivilegeInvoker(
        RevokeSqlserverDbUserPrivilegeRequest request) {
        return new SyncInvoker<RevokeSqlserverDbUserPrivilegeRequest, RevokeSqlserverDbUserPrivilegeResponse>(request,
            RdsMeta.revokeSqlserverDbUserPrivilege, hcClient);
    }

    /**
     * 收缩数据库日志
     *
     * 收缩数据库日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetInstancesDbShrinkRequest 请求对象
     * @return SetInstancesDbShrinkResponse
     */
    public SetInstancesDbShrinkResponse setInstancesDbShrink(SetInstancesDbShrinkRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.setInstancesDbShrink);
    }

    /**
     * 收缩数据库日志
     *
     * 收缩数据库日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetInstancesDbShrinkRequest 请求对象
     * @return SyncInvoker<SetInstancesDbShrinkRequest, SetInstancesDbShrinkResponse>
     */
    public SyncInvoker<SetInstancesDbShrinkRequest, SetInstancesDbShrinkResponse> setInstancesDbShrinkInvoker(
        SetInstancesDbShrinkRequest request) {
        return new SyncInvoker<SetInstancesDbShrinkRequest, SetInstancesDbShrinkResponse>(request,
            RdsMeta.setInstancesDbShrink, hcClient);
    }

}
