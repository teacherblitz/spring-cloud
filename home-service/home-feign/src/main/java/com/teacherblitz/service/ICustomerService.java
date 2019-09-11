package com.teacherblitz.service;

import java.util.Map;

/**
 * @description 客户端Service
 * @author teacherblitz
 * @date 2019/9/10 22:33
 * @version v1.0
 */
public interface ICustomerService {

    /**
     * 获取CustomerMap对象
     * @param custId
     * @return
     */
    Map<String,Object> getCustomerMap(Integer custId);
}
