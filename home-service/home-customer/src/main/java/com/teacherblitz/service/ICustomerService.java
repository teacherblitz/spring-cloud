package com.teacherblitz.service;

import java.util.Map;

/**
 * @author teacherblitz
 * @version v1.0
 * @description 客户端Service
 * @date 2019/9/9 22:05
 */
public interface ICustomerService {

    /**
     * 根据id获取客户
     * @param id
     * @return
     */
    Map<String,Object> getCustomerById(Integer id);
}
