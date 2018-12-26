package com.faith.begood.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:haibo.xiong
 * @date:2018/12/18
 * @description:
 */
@RestController
public class HelloController {


    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
    @Value("${spring.application.name}")
    private String name;

    @RequestMapping("/hello")
    public String hello() {
        return name;
    }
}
