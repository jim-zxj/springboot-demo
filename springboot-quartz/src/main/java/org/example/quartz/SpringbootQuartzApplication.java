package org.example.quartz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author zhangxiangji
 * @date 2020/1/10 14:08
 * @description
 */
@SpringBootApplication
@MapperScan(basePackages = {"org.example.quartz.mapper"})
public class SpringbootQuartzApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootQuartzApplication.class, args);
    }
}
