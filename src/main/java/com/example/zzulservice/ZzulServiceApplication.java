package com.example.zzulservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

@SpringBootApplication
@EnableZuulProxy
public class ZzulServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZzulServiceApplication.class, args);
    }

}
