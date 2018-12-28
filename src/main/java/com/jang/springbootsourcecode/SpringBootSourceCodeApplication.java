package com.jang.springbootsourcecode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@SpringBootApplication

public class SpringBootSourceCodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootSourceCodeApplication.class, args);
    }
    @Bean
    public User getUser(){
        User user =new User();
        return user;
    }

}
