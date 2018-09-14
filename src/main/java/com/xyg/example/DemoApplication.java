package com.xyg.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Author: Mr.Deng
 * Date: 2018/9/14
 * Desc: @SpringBootConfiguration来标注一个主程序类，说明这是一个springboot应用
 */
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        //springboot应用启动起来,run方法里第一个是应用主程序类名，第二个是应用参数
        SpringApplication.run(DemoApplication.class, args);
    }
}
