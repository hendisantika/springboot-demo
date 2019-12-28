package com.hendisantika.springboot2demo;

import com.hendisantika.springboot2demo.model.Person;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot2-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 29/12/19
 * Time: 06.48
 */
public interface PersonApi {

    @GET("/person/johnsmith")
    Call<Person> johnSmith();
}