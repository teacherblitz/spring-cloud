package com.teacherblitz.service.impl;

import com.teacherblitz.service.ICustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author teacherblitz
 * @version v1.0
 * @description 客户端Service实现
 * @date 2019/9/9 22:06
 */
@Slf4j
@Service
public class CustomerServiceImpl implements ICustomerService {

    @Override
    public Map<String, Object> getCustomerById(Integer id) {
        log.info("客户端ID->{}", id);
        Map<String, Object> retMap = new HashMap<>(2);
        retMap.put("customerName","字节跳动");
        retMap.put("customerDesc","深圳字节跳动集团");
        return retMap;
    }
}
