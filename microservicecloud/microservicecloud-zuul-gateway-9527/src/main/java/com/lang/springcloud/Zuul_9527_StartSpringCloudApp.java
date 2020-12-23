package com.lang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class Zuul_9527_StartSpringCloudApp {
    public static void main(String[] args) {
        // 请求测试:
        // 直接访问: http://localhost:8001/dept/get/2
        // 通过网关zuul来访问: http://localhost:9527/microservicecloud-dept/dept/get/2
        /**
         * 访问 http://GATEWAY:GATEWAY_PORT/想要访问的Eureka服务id的小写/**      将会访问到 
         *  http://想要访问的Eureka服务id的小写:该服务端口/**
         */
        SpringApplication.run(Zuul_9527_StartSpringCloudApp.class, args);
    }
}
