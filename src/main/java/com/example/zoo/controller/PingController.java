package com.example.zoo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liwenqiang on 2018/6/2 19:06
 */
@RestController
public class PingController {

    @RequestMapping(value = "/ping")
    public String ping() {
        return "Hello spring boot";
    }

}
