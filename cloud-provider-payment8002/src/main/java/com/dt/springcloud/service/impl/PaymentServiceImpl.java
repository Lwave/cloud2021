package com.dt.springcloud.service.impl;

import com.dt.springcloud.dao.PaymentDao;
import com.dt.springcloud.entities.Payment;
import com.dt.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Auther Du Tao
 * @Date 2021-06-25 17:30
 */

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }

}