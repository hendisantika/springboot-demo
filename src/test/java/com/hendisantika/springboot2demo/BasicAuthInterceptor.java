package com.hendisantika.springboot2demo;

import okhttp3.Credentials;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot2-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 29/12/19
 * Time: 06.47
 */
final class BasicAuthInterceptor implements Interceptor {

    private final String credentials;

    BasicAuthInterceptor(final String user, final String password) {
        this.credentials = Credentials.basic(user, password);
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        final Request request = chain.request();
        final Request authenticatedRequest = request.newBuilder()
                .header("Authorization", credentials).build();
        return chain.proceed(authenticatedRequest);
    }

}