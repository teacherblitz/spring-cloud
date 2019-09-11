package com.teacherblitz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author teacherblitz
 * @version v1.0
 * @description Feign消费端
 * @date 2019/9/10 21:27
 */
@EnableFeignClients
@EnableCircuitBreaker
@EnableEurekaClient
@SpringBootApplication
public class FeignApplication {

    /**
     * Feign消费端启动类
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(FeignApplication.class, args);
    }
}
