package com.teacherblitz;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author teacherblitz
 * @version v1.0
 * @description zuul网关
 * @date 2019/9/8 14:39
 */
@EnableZuulProxy
@SpringCloudApplication
public class ZuulGatewayApplication {

    /**
     * 启动zuul网关
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(ZuulGatewayApplication.class, args);
    }
}
