package org.example.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.entity.User;
import org.example.mapper.UserMapper;
import org.example.service.DataSourceService;
import org.springframework.stereotype.Service;

/**
 * @Description TODO
 * @Author zhangxiangji
 * @Date 2020-09-10 14:09
 */
@DS("master")
@Service
public class DataSourceServiceImpl extends ServiceImpl<UserMapper, User> implements DataSourceService {


    /**
     * 使用第二个数据源
     */
    @DS("slave")
    @Override
    public void addUser(User user) {
        baseMapper.insert(user);
    }
}
