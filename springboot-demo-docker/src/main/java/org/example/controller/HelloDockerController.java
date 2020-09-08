package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description TODO
 * @Author zhangxiangji
 * @Date 2020-09-08 16:25
 */
@Controller
public class HelloDockerController {
    @GetMapping
    public String hello() {
        return "hello docker";
    }
}
