package com.bk.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @author bkunzh
 * @date 2022/9/3
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public Object hello() {
        System.out.println("hello in");
        try {
            TimeUnit.SECONDS.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "hello " + new Date().toString();
    }

    // todo hyper-v虚拟机请求该接口获得docker容器id
    // wget http://192.168.3.7:8080/txt
    @RequestMapping("/txt")
    public String getTxt() {
        
        return "abc:" + new Date();
    }
}
