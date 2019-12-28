package com.hendisantika.springboot2demo.service;

import com.hendisantika.springboot2demo.model.Person;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot2-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 29/12/19
 * Time: 06.25
 */
public interface PersonService {
    Person johnSmith();

    String hello(Person person);
}