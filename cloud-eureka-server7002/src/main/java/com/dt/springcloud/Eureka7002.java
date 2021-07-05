package com.dt.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Auther Du Tao
 * @Date 2021-06-27 23:07
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka7002 {
    public static void main(String[] args) {
        SpringApplication.run(Eureka7002.class, args);
    }

}