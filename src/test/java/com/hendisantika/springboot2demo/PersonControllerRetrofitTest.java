package com.hendisantika.springboot2demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.OkHttpClient;
import org.junit.Before;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

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

    @Before
    public void setUp() {
        final OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(new BasicAuthInterceptor("admin", "passw0rd"))
                .build();

        retrofit = new Retrofit.Builder()
                .baseUrl("http://localhost:" + port)
                .client(client)
                .addConverterFactory(JacksonConverterFactory.create(new ObjectMapper()))
                .build();
    }
}
