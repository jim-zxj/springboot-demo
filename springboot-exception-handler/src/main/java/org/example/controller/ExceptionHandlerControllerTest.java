package org.example.controller;

import org.example.constant.Status;
import org.example.exception.JsonException;
import org.example.exception.PageException;
import org.example.model.ApiResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author zhangxiangji
 * @date 2020/1/8 14:15
 * @description
 */
@Controller
public class ExceptionHandlerControllerTest {

    @GetMapping("/json")
    @ResponseBody
    public ApiResponse jsonException() {
        throw new JsonException(Status.UNKNOWN_ERROR);
    }

    @GetMapping("/page")
    public ModelAndView pageException() {
        throw new PageException(Status.UNKNOWN_ERROR);
    }
}
