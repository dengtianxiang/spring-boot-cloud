package com.xyg.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: Mr.Deng
 * Date: 2018/9/14
 * Desc: 编写Controller层，发送hello请求
 */

@RestController
public class HelloController {


    @RequestMapping("/hello")
    public String Hello(){
       return "Hello World！";
    }
}
