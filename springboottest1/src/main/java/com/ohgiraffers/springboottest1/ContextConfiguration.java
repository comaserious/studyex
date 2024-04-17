package com.ohgiraffers.springboottest1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfiguration {
    @Value("${test.name}")
    private String name;
    @Value("${test.age}")
    private int age;
    @Value("${test.email}")
    private String email;

    @Bean
    public Object test(){


        System.out.println("name : "+name);


        return new Object();
    }
}
