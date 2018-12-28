package com.faith.begood.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author:haibo.xiong
 * @date:2018/12/28
 * @description:
 */
@Controller
public class WebController {
    @RequestMapping(value = "/index")
    public String index() {
        return "index";
    }
}
