package com.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collections;

@SpringBootApplication
@Controller
public class StartApplication {
    @ResponseBody
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "Hello";
    }

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(StartApplication.class);
        app.setDefaultProperties(Collections
                .singletonMap("server.port", "80"));
        app.run(args);
    }
}