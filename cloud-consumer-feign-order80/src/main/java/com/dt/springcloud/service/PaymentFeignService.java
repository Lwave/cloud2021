package com.dt.springcloud.service;

import com.dt.springcloud.entities.CommonResult;
import com.dt.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Auther Du Tao
 * @Date 2021-06-30 17:12
 */
//openFeign  1.服务之间的调用  2.实现负载均衡功能
@Component
@FeignClient("CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {

    //消費者controller的地址
    @GetMapping(value = "/payment/get/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);
}