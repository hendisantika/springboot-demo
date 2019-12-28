package com.hendisantika.springboot2demo;

import lombok.Value;
import org.springframework.boot.test.context.SpringBootTest;
import retrofit2.Retrofit;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot2-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 29/12/19
 * Time: 06.48
 */
@SpringBootTest(classes = {SpringBoot2DemoApplication.class}, webEnvironment = RANDOM_PORT)
public class PersonControllerRetrofitTest {

    @Value("${local.server.port}")
    private int port;

    private Retrofit retrofit;
}
