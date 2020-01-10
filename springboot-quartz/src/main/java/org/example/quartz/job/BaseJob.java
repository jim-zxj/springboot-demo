package org.example.quartz.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * @author zhangxiangji
 * @date 2020/1/10 14:02
 * @description
 */
public interface BaseJob extends Job {

    @Override
    void execute(JobExecutionContext context) throws JobExecutionException;
}
