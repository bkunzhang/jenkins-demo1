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
        //try(InputStream in = HelloController.class.getClassLoader().getResourceAsStream("1.txt")) {
        //    InputStreamReader reader = new InputStreamReader(in);
        //    BufferedReader br = new BufferedReader(reader);
        // 关闭最外层的流就行，其close方法会调用内层流的close方法（一层一层向内调用了最内层的IO类的close方法，这也就是装饰者模式。）
        try (BufferedReader br = new BufferedReader(new InputStreamReader(HelloController.class.getClassLoader().getResourceAsStream("1.txt")))) {
            StringBuilder stringBuilder = new StringBuilder();
            String line = null;
            while ((line = br.readLine()) != null) {
                stringBuilder.append(line + "\n");
            }
            return stringBuilder.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
