package com.fsn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 首先：将该对象交给spring容器管理
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/list")
    public String toList(){
            return "list";
    }

}
