package com.ralph.graylogdemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TestController {
    @GetMapping("log")
    public String log()
    {
        log.error("error--错误！");
        log.warn("warn--警告");
        log.info("info--消息");
        log.debug("debug--调试");
        return "success";
    }
}
