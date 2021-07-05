package com.dt.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @Auther Du Tao
 * @Date 2021-06-30 15:46
 */
public interface LoadBalance {

ServiceInstance instance(List<ServiceInstance> serviceInstances);


}