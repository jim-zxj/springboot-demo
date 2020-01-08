package org.example.controller;

import cn.hutool.core.lang.Dict;
import cn.hutool.core.util.StrUtil;
import org.example.annotation.UserAgentAnnotation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangxiangji
 * @date 2020/1/8 13:57
 * @description
 */
@RestController
public class AopControllerTest {
    /**
     * 测试方法
     *
     * @param who 测试参数
     * @return {@link Dict}
     */
    @GetMapping("/test")
    @UserAgentAnnotation("test")
    public Dict test(String who) {
        return Dict.create().set("who", StrUtil.isBlank(who) ? "me" : who);
    }
}
