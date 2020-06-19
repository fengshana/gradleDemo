package com.fsn.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fsn.modle.UserInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class TestController {
    @GetMapping("/test")
    public String test(){

        List list= Arrays.asList(
                new UserInfo("张三", 21, 1, "描述张三"),
                new UserInfo("李四", 22, 0, "描述李四"),
                new UserInfo("王五", 23, 1, "描述王五"),
                new UserInfo("赵六", 24, 1, "描述赵六")
        );



        return "hello fsn!!!!";
    }
}
