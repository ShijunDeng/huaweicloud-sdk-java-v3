package com.huaweicloud.sdk.mrs.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * AddJobs
 */
public class AddJobs  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_type")
    
    @JacksonXmlProperty(localName = "job_type")
    
    private Integer jobType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_name")
    
    @JacksonXmlProperty(localName = "job_name")
    
    private String jobName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="jar_path")
    
    @JacksonXmlProperty(localName = "jar_path")
    
    private String jarPath;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="arguments")
    
    @JacksonXmlProperty(localName = "arguments")
    
    private String arguments;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="input")
    
    @JacksonXmlProperty(localName = "input")
    
    private String input;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="output")
    
    @JacksonXmlProperty(localName = "output")
    
    private String output;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_log")
    
    @JacksonXmlProperty(localName = "job_log")
    
    private String jobLog;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="hive_script_path")
    
    @JacksonXmlProperty(localName = "hive_script_path")
    
    private String hiveScriptPath;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="hql")
    
    @JacksonXmlProperty(localName = "hql")
    
    private String hql;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="shutdown_cluster")
    
    @JacksonXmlProperty(localName = "shutdown_cluster")
    
    private Boolean shutdownCluster;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="submit_job_once_cluster_run")
    
    @JacksonXmlProperty(localName = "submit_job_once_cluster_run")
    
    private Boolean submitJobOnceClusterRun;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="file_action")
    
    @JacksonXmlProperty(localName = "file_action")
    
    private String fileAction;

    public AddJobs withJobType(Integer jobType) {
        this.jobType = jobType;
        return this;
    }

    


    /**
     * 作业类型码。 - 1：MapReduce - 2：Spark - 3：Hive Script - 4：HiveSQL（当前不支持） - 5：DistCp，导入、导出数据，（当前不支持）。 - 6：Spark Script - 7：Spark SQL，提交SQL语句，（当前不支持）。
     * @return jobType
     */
    public Integer getJobType() {
        return jobType;
    }

    public void setJobType(Integer jobType) {
        this.jobType = jobType;
    }

    

    public AddJobs withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    


    /**
     * 作业名称。 只能由字母、数字、中划线和下划线组成，并且长度为1～64个字符。  说明： 不同作业的名称允许相同，但不建议设置相同。
     * @return jobName
     */
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    

    public AddJobs withJarPath(String jarPath) {
        this.jarPath = jarPath;
        return this;
    }

    


    /**
     * 执行程序Jar包或sql文件地址，需要满足如下要求： - 最多为1023字符，不能包含;|&>,<'$特殊字符，且不可为空或全空格。 - 文件可存储于HDFS或者OBS中，不同的文件系统对应的路径存在差异。    - OBS：以“s3a://”开头。不支持KMS加密的文件或程序。    - HDFS：以“/”开头。 - Spark Script需要以“.sql”结尾，MapReduce和Spark Jar需要以“.jar”结尾，sql和jar不区分大小写。
     * @return jarPath
     */
    public String getJarPath() {
        return jarPath;
    }

    public void setJarPath(String jarPath) {
        this.jarPath = jarPath;
    }

    

    public AddJobs withArguments(String arguments) {
        this.arguments = arguments;
        return this;
    }

    


    /**
     * 程序执行的关键参数，该参数由用户程序内的函数指定，MRS只负责参数的传入。 最多为150000字符，不能包含;|&>'<$特殊字符，可为空。
     * @return arguments
     */
    public String getArguments() {
        return arguments;
    }

    public void setArguments(String arguments) {
        this.arguments = arguments;
    }

    

    public AddJobs withInput(String input) {
        this.input = input;
        return this;
    }

    


    /**
     * 数据输入地址。 文件可存储于HDFS或者OBS中，不同的文件系统对应的路径存在差异。 - OBS：以“s3a://”开头。不支持KMS加密的文件或程序。 - HDFS：以“/”开头。  最多为1023字符，不能包含;|&>'<$特殊字符，可为空。
     * @return input
     */
    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    

    public AddJobs withOutput(String output) {
        this.output = output;
        return this;
    }

    


    /**
     * 数据输出地址。 文件可存储于HDFS或者OBS中，不同的文件系统对应的路径存在差异。 - OBS：以“s3a://”开头。 - HDFS：以“/”开头。  如果该路径不存在，系统会自动创建。 最多为1023字符，不能包含;|&>'<$特殊字符，可为空。
     * @return output
     */
    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    

    public AddJobs withJobLog(String jobLog) {
        this.jobLog = jobLog;
        return this;
    }

    


    /**
     * 作业日志存储地址，该日志信息记录作业运行状态。 文件可存储于HDFS或者OBS中，不同的文件系统对应的路径存在差异。 - OBS：以“s3a://”开头。 - HDFS：以“/”开头。  最多为1023字符，不能包含;|&>'<$特殊字符，可为空。
     * @return jobLog
     */
    public String getJobLog() {
        return jobLog;
    }

    public void setJobLog(String jobLog) {
        this.jobLog = jobLog;
    }

    

    public AddJobs withHiveScriptPath(String hiveScriptPath) {
        this.hiveScriptPath = hiveScriptPath;
        return this;
    }

    


    /**
     * sql程序路径，仅Spark Script和Hive Script作业需要使用此参数。需要满足如下要求： - 最多为1023字符，不能包含;|&><'$特殊字符，且不可为空或全空格。 - 文件可存储于HDFS或者OBS中，不同的文件系统对应的路径存在差异。     - OBS：以“s3a://”开头。不支持KMS加密的文件或程序。     - HDFS：以“/”开头。 - 需要以“.sql”结尾，sql不区分大小写。
     * @return hiveScriptPath
     */
    public String getHiveScriptPath() {
        return hiveScriptPath;
    }

    public void setHiveScriptPath(String hiveScriptPath) {
        this.hiveScriptPath = hiveScriptPath;
    }

    

    public AddJobs withHql(String hql) {
        this.hql = hql;
        return this;
    }

    


    /**
     * HQL脚本语句。
     * @return hql
     */
    public String getHql() {
        return hql;
    }

    public void setHql(String hql) {
        this.hql = hql;
    }

    

    public AddJobs withShutdownCluster(Boolean shutdownCluster) {
        this.shutdownCluster = shutdownCluster;
        return this;
    }

    


    /**
     * 作业执行完成后，是否删除集群。  - true：是  - false：否
     * @return shutdownCluster
     */
    public Boolean getShutdownCluster() {
        return shutdownCluster;
    }

    public void setShutdownCluster(Boolean shutdownCluster) {
        this.shutdownCluster = shutdownCluster;
    }

    

    public AddJobs withSubmitJobOnceClusterRun(Boolean submitJobOnceClusterRun) {
        this.submitJobOnceClusterRun = submitJobOnceClusterRun;
        return this;
    }

    


    /**
     * - true：创建集群同时提交作业  - false：单独提交作业  此处应设置为true。
     * @return submitJobOnceClusterRun
     */
    public Boolean getSubmitJobOnceClusterRun() {
        return submitJobOnceClusterRun;
    }

    public void setSubmitJobOnceClusterRun(Boolean submitJobOnceClusterRun) {
        this.submitJobOnceClusterRun = submitJobOnceClusterRun;
    }

    

    public AddJobs withFileAction(String fileAction) {
        this.fileAction = fileAction;
        return this;
    }

    


    /**
     * 数据导入导出。 - import - export
     * @return fileAction
     */
    public String getFileAction() {
        return fileAction;
    }

    public void setFileAction(String fileAction) {
        this.fileAction = fileAction;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddJobs addJobs = (AddJobs) o;
        return Objects.equals(this.jobType, addJobs.jobType) &&
            Objects.equals(this.jobName, addJobs.jobName) &&
            Objects.equals(this.jarPath, addJobs.jarPath) &&
            Objects.equals(this.arguments, addJobs.arguments) &&
            Objects.equals(this.input, addJobs.input) &&
            Objects.equals(this.output, addJobs.output) &&
            Objects.equals(this.jobLog, addJobs.jobLog) &&
            Objects.equals(this.hiveScriptPath, addJobs.hiveScriptPath) &&
            Objects.equals(this.hql, addJobs.hql) &&
            Objects.equals(this.shutdownCluster, addJobs.shutdownCluster) &&
            Objects.equals(this.submitJobOnceClusterRun, addJobs.submitJobOnceClusterRun) &&
            Objects.equals(this.fileAction, addJobs.fileAction);
    }
    @Override
    public int hashCode() {
        return Objects.hash(jobType, jobName, jarPath, arguments, input, output, jobLog, hiveScriptPath, hql, shutdownCluster, submitJobOnceClusterRun, fileAction);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddJobs {\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
        sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
        sb.append("    jarPath: ").append(toIndentedString(jarPath)).append("\n");
        sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
        sb.append("    jobLog: ").append(toIndentedString(jobLog)).append("\n");
        sb.append("    hiveScriptPath: ").append(toIndentedString(hiveScriptPath)).append("\n");
        sb.append("    hql: ").append(toIndentedString(hql)).append("\n");
        sb.append("    shutdownCluster: ").append(toIndentedString(shutdownCluster)).append("\n");
        sb.append("    submitJobOnceClusterRun: ").append(toIndentedString(submitJobOnceClusterRun)).append("\n");
        sb.append("    fileAction: ").append(toIndentedString(fileAction)).append("\n");
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

