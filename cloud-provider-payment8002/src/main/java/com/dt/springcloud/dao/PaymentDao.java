package com.dt.springcloud.dao;

import com.dt.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Auther Du Tao
 * @Date 2021-06-25 17:15
 */
@Mapper
public interface PaymentDao {

      int create(Payment payment);
      Payment getPaymentById(@Param("id") Long id);
}