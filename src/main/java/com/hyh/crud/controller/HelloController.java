package com.hyh.crud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author HuangYuhan
 * @version 1.0
 * @date 2020/6/16 - 16:57
 */
@Controller
public class HelloController {

    @RequestMapping("hello")
    @ResponseBody
    public String hello() {
        return "hello world";
    }


    @RequestMapping("ht")
    public String helloth() {
        return "index";
    }
}
