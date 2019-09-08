package com.teacherblitz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author teacherblitz
 * @version v1.0
 * @description Eureka服务端
 * @date 2019/9/8 10:56
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {

    /**
     * 启动Eureka服务
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}
