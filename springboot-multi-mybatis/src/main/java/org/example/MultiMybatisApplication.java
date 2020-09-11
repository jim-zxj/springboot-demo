package org.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import javax.sql.DataSource;

/**
 * @Description TODO
 * @Author zhangxiangji
 * @Date 2020-09-09 10:49
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@MapperScan(basePackages = "org.example.mapper")
public class MultiMybatisApplication {
    public static void main(String[] args) {
        SpringApplication.run(MultiMybatisApplication.class, args);
    }
}
