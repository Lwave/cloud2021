package com.dt.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Auther Du Tao
 * @Date 2021-06-30 17:10
 */
@SpringBootApplication
@EnableFeignClients
public class OrderFeignPayment80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeignPayment80.class,args);
    }
}