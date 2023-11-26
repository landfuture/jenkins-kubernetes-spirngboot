package com.jhooq.demo.Jhooqdockerdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JhooqDockerDemoController {

    @GetMapping("/hello")
    public String hello() {


        return "Docker Demo - Hello Jhooq - hello - cjsss --- 13 \n";

    }

    @GetMapping("/cjsss")
    public String cjsss() {


        return "Docker Demo - Hello Jhooq - cjsss --- 14 \n";

    }
}