package com.nabob.conch.job.worker.persistence;

import java.util.Collection;
import java.util.List;

/**
 * 任务持久化接口
 *
 * @author Adam
 * @date 2021/2/18
 */
public interface TaskDAO {

    /**
     * 初始化任务表
     */
    boolean initTable();

    /**
     * 插入任务数据
     */
    boolean save(TaskDO task);
    boolean batchSave(Collection<TaskDO> tasks);

    /**
     * 更新任务数据，必须有主键 instanceId + taskId
     */
    boolean update(TaskDO task);

    TaskDO selectByKey(String instanceId, String taskId);

    List<TaskDO> simpleQuery(SimpleTaskQuery query);

}
