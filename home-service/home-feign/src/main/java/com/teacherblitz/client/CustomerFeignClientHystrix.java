package com.teacherblitz.client;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author teacherblitz
 * @version v1.0
 * @description 服务熔断器
 * @date 2019/9/10 22:22
 */
@Component
public class CustomerFeignClientHystrix implements CustomerFeignClient{

    @Override
    public Map<String, Object> getCustomer(Integer id) {
        Map<String, Object> retMap = new HashMap<>(2);
        retMap.put("message","服务已熔断");
        return retMap;
    }
}
