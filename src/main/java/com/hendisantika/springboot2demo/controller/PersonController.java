package com.hendisantika.springboot2demo.controller;

import lombok.NonNull;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.PersonService;

import java.beans.ConstructorProperties;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot2-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 29/12/19
 * Time: 06.27
 */
@RestController
@RequestMapping({"/person"})
class PersonController {
    @NonNull
    private final PersonService persons;

    @ConstructorProperties({"persons"})
    PersonController(@NonNull PersonService persons) {
        if (persons == null) {
            throw new NullPointerException("persons");
        } else {
            this.persons = persons;
        }
    }
}
