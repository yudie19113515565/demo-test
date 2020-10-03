package com.imooc.demo.gitdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestGitDemoController {

    @RequestMapping("/git/index")
    public String index(){
        return "这是git的测试"+"  测试成功了!";
    }
}
