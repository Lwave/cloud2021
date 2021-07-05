package com.dt.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Auther Du Tao
 * @Date 2021-06-26 18:47
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka7001 {
    public static void main(String[] args) {
        SpringApplication.run(Eureka7001.class, args);
    }

}