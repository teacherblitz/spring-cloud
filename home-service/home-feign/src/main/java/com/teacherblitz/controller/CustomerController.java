package com.teacherblitz.controller;

import com.teacherblitz.service.ICustomerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author teacherblitz
 * @version v1.0
 * @description
 * @date 2019/9/10 23:25
 */
@RestController
@AllArgsConstructor
public class CustomerController {
    private final ICustomerService customerService;

    /**
     * 获取customer对象
     * @param custId
     * @return
     */
    @RequestMapping("/getCustomer")
    public Map<String,Object> getCustomer(@RequestParam("id") Integer custId){
        Map<String, Object> retMap = new HashMap<>(2);
        try {
            retMap = customerService.getCustomerMap(custId);
        }catch (Exception e){
            retMap.put("code","0001");
            retMap.put("msg",e.getMessage());
        }
        return retMap;
    }
}
