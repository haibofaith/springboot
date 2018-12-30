package com.faith.begood.controller;

import com.faith.begood.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

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

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/template/products")
    public String getProductList() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity <String> entity = new HttpEntity<String>(headers);

        return restTemplate.exchange("http://localhost:8004/hello",
                HttpMethod.GET, entity, String.class).getBody();
    }

    @RequestMapping(value = "/template/products", method = RequestMethod.POST)
    public String createProducts(@RequestBody Product product) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<Product> entity = new HttpEntity<Product>(product,headers);

        return restTemplate.exchange(
                "http://localhost:8004/hello", HttpMethod.POST, entity, String.class).getBody();
    }

    @RequestMapping(value = "/template/products/{id}", method = RequestMethod.PUT)
    public String updateProduct(@PathVariable("id") String id, @RequestBody Product product) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<Product> entity = new HttpEntity<Product>(product,headers);

        return restTemplate.exchange(
                "http://localhost:8004/products/"+id, HttpMethod.PUT, entity, String.class).getBody();
    }

    @Value("${welcometext}")
    private String welcometext;

    @RequestMapping("/netconfig")
    public String netconfig() {
        return welcometext;
    }
}
