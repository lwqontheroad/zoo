package com.example.zoo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liwenqiang on 2018/6/2 19:06
 */
@RestController
public class PingController {
    private static final Logger LOGGER = LoggerFactory.getLogger(PingController.class);

    @RequestMapping(value = "/ping")
    public String ping() {
        LOGGER.info("AccessLogBegin interface=/ping");
        return "Hello spring boot";
    }

}
