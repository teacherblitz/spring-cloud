package com.teacherblitz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author teacherblitz
 * @version v1.0
 * @description 服务消费端
 * @date 2019/9/9 21:31
 */
@EnableEurekaClient
@SpringBootApplication
public class CustomerApplication {

    /**
     * 消费端启动入口
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(CustomerApplication.class, args);
    }
}
