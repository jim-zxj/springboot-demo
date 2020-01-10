package org.example.quartz.service;

import com.github.pagehelper.PageInfo;
import org.example.quartz.entity.domain.JobAndTrigger;

/**
 * @author zhangxiangji
 * @date 2020/1/10 14:04
 * @description
 */
public interface JobService {

    /**
     * 查询定时任务列表
     *
     * @param currentPage 当前页
     * @param pageSize    每页条数
     * @return 定时任务列表
     */
    PageInfo<JobAndTrigger> list(Integer currentPage, Integer pageSize);
}