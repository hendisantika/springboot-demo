package com.hendisantika.springboot2demo.controller;

import com.hendisantika.springboot2demo.SpringBoot2DemoApplication;
import io.restassured.RestAssured;
import org.junit.Before;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import static io.restassured.RestAssured.preemptive;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot2-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 29/12/19
 * Time: 06.50
 */
@SpringBootTest(classes = {SpringBoot2DemoApplication.class}, webEnvironment = RANDOM_PORT)
class PersonControllerTest {
    @Value("${local.server.port}")
    private int port;

    @Before
    public void setUp() {
        RestAssured.authentication = preemptive().basic("admin", "passw0rd");
    }
}