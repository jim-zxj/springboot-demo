package org.example.mybatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author zhangxiangji
 * @date 2020/1/9 9:38
 * @description
 */
//@MapperScan("org.example.mybatis.mapper")
@SpringBootApplication
@MapperScan(basePackages = {"org.example.mybatis.tkMapper"})
public class SpringbootMybatisApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisApplication.class, args);
    }
}
