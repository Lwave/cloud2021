package com.dt.springcloud.controller;

import com.dt.springcloud.entities.CommonResult;
import com.dt.springcloud.entities.Payment;
import com.dt.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Auther Du Tao
 * @Date 2021-06-30 18:23
 */
@RestController
@Slf4j
public class OrderFeignController {

    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        log.info("通过openFeign调用");
        return paymentFeignService.getPaymentById(id);
    }
    //redis--------緩存，
    //openFeign----服務之間的調用

}