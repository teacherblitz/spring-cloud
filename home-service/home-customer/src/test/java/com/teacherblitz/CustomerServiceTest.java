package com.teacherblitz;

import com.teacherblitz.service.ICustomerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;

/**
 * @author teacherblitz
 * @version v1.0
 * @description
 * @date 2019/9/9 22:58
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Application.class},webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class CustomerServiceTest {

    @Autowired
    private ICustomerService customerService;

    @Test
    public void fun(){
        Map<String, Object> custMap = customerService.getCustomerById(1);
        custMap.forEach((key,value) -> System.out.println(key+":"+value));
    }
}
