package com.hendisantika.springboot2demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot2-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 22/12/20
 * Time: 11.23
 */
@RestController
@RequestMapping("/")
public class IndexController {
    @GetMapping
    public String index() {
        return "Hello World! " + LocalDateTime.now();
    }
}
