package com.hs.produce.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 🦑bys
 * @date 2021/2/23 16:45
 */
@RestController
public class DemoController {
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Value("${produceName}")
    private String name;

    @GetMapping("send")
    public String send(){
        log.info("啥");
        return name;
    }
}