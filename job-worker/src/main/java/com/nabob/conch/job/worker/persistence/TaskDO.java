package com.nabob.conch.job.worker.persistence;

import lombok.Data;

/**
 * todo Task
 *
 * @author Adam
 * @date 2021/2/18
 */
@Data
public class TaskDO {

    /**
     * TaskId
     *
     * 层次命名法，可以表示 Map 后的父子关系，如 0.1.2 代表 rootTask map 的第一个 task map 的第二个 task
     */
    private String taskId;

    /**
     * JobId
     */
    private String jobId;

    /**
     * InstanceId
     */
    private String instanceId;

    /**
     * 任务名称
     */
    private String taskName;

    /**
     * 任务参数
     */
    private String taskContent;

    /**
     * todo 对于JobTracker为workerAddress，对于普通Worker为jobTrackerAddress
     */
    private String address;

    /**
     * 任务状态，0～10代表 JobTracker 使用，11～20代表普通Worker使用
     */
    private int status;

    /**
     * 执行结果
     */
    private String result;

    /**
     * 创建时间
     */
    private long createdTime;

    /**
     * 最后修改时间
     */
    private long lastModifiedTime;
}
