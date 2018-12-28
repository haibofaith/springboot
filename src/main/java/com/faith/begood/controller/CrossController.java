package com.faith.begood.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

/**
 * @author:haibo.xiong
 * @date:2018/12/28
 * @description:跨域访问处理
 */
@RestController
public class CrossController {
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/products8088")
    @CrossOrigin(origins = "http://localhost:8088")
    @ResponseBody
    public String getProduct(){
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        return restTemplate.exchange("http://localhost:8088/futureTwo/a/dockerMysql",
                HttpMethod.GET, entity, String.class).getBody();
    }

}
