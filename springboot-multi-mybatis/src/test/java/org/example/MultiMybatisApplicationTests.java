package org.example;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.example.entity.User;
import org.example.service.DataSourceService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Description TODO
 * @Author zhangxiangji
 * @Date 2020-09-10 14:33
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class MultiMybatisApplicationTests {
    @Autowired
    private DataSourceService dataSourceService;

    @Test
    public void addUser() {
//        User userMaster = User.builder().name("主库添加").age(20).build();
//        dataSourceService.addUser(userMaster);

        User userS = User.builder().name("从库添加").age(20).build();
        dataSourceService.addUser(userS);

    }

    /**
     * 从库查询
     */
    @Test
    public void testListUser() {
        List<User> list = dataSourceService.list(new QueryWrapper<>());
        System.out.println(list);
    }
}
