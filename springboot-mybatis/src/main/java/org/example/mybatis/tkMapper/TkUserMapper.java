package org.example.mybatis.tkMapper;

import org.example.mybatis.entity.User;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author zhangxiangji
 * @date 2020/1/9 9:54
 * @description
 */
@Component
public interface TkUserMapper extends Mapper<User>, MySqlMapper<User> {
}
