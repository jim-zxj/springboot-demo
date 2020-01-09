package org.example.service;

import org.example.entity.User;
import org.springframework.boot.autoconfigure.security.SecurityProperties;

/**
 * @author zhangxiangji
 * @date 2020/1/9 14:06
 * @description
 */
public interface UserService {
    /**
     * 保存或修改用户
     *
     * @param user 用户对象
     * @return 操作结果
     */
    User saveOrUpdate(User user);

    /**
     * 获取用户
     *
     * @param id key值
     * @return 返回结果
     */
    User get(Long id);

    /**
     * 删除
     *
     * @param id key值
     */
    void delete(Long id);
}
