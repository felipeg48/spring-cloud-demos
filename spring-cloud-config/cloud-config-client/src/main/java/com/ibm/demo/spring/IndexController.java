package com.ibm.demo.spring;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
@RequestMapping("/")
public class IndexController {

    private String message = null;
    SimpleConfigurationProperties simpleConfigurationProperties;
    public IndexController(@Value("${app.msg:Unknown}") String message, SimpleConfigurationProperties simpleConfigurationProperties){
        log.info(message);
        this.message = message;
        this.simpleConfigurationProperties = simpleConfigurationProperties;
    }

    @GetMapping("/")
    public SimpleConfigurationProperties getProperties(){
        return this.simpleConfigurationProperties;
    }

    @GetMapping("/msg")
    public String getMessage(){
        return this.message;
    }
}
