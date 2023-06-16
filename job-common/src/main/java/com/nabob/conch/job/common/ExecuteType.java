package com.nabob.conch.job.common;

/**
 * 任务执行类型 定义
 *
 * @author Adam
 * @date 2021/2/18
 */
public enum ExecuteType {

    /**
     * 单机
     */
    STANDALONE,

    /**
     * 广播
     */
    BROADCAST,

    /**
     * Map Reduce
     */
    MAP_REDUCE

}
