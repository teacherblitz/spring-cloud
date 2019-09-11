package com.teacherblitz.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @author teacherblitz
 * @version v1.0
 * @description feign客户端调用实例
 * @date 2019/9/10 22:17
 */
@FeignClient(value = "home-customer",fallback = CustomerFeignClientHystrix.class)
public interface CustomerFeignClient {

    /**
     * 获取customer服务
     * @param id
     * @return
     */
    @RequestMapping("/home-customer/get/customer")
    Map<String,Object> getCustomer(Integer id);
}
