package com.teacherblitz.controller;

import com.teacherblitz.service.ICustomerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author teacherblitz
 * @version v1.0
 * @description 客户端Controller
 * @date 2019/9/9 22:05
 */
@RestController
@AllArgsConstructor
public class CustomerController {

    private final ICustomerService customerService;

    /**
     * 根据id获取客户
     * @param id
     * @return
     */
    @RequestMapping("/get/customer")
    public Map<String,Object> getCustomer(Integer id){
        Map<String, Object> retMap = customerService.getCustomerById(id);
        return retMap;
    }

}
