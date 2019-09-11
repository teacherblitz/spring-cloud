package com.teacherblitz.service.impl;

import com.teacherblitz.client.CustomerFeignClient;
import com.teacherblitz.service.ICustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author teacherblitz
 * @version v1.0
 * @description 客户端Service实现
 * @date 2019/9/10 22:34
 */
@Slf4j
@Service
public class CustomerServiceImpl implements ICustomerService {

    private final CustomerFeignClient customerFeignClient;

    @Autowired
    public CustomerServiceImpl(CustomerFeignClient customerFeignClient) {
        this.customerFeignClient = customerFeignClient;
    }

    @Override
    public Map<String, Object> getCustomerMap(Integer custId) {
        log.info("调用eureka server发送参数：{}", custId);
        if(null == custId){
            throw new RuntimeException("客户端ID为空");
        }
        Map<String,Object> retMap = customerFeignClient.getCustomer(custId);
        log.info("调用eureka server返回结果：{}", retMap);
        return retMap;
    }
}
