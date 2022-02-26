package com.dcb.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    Logger logger = LoggerFactory.getLogger(HomeController.class);

    @GetMapping("/hello")
    public String hello() {
        logger.error("FATAL ERROR");
        logger.info("logging levels TRACE< DEBUG < INFO< WARN < ERROR");
        return "welcome to daily code buffer";
    }
}
