package com.lang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
//在启动类中添加 @EnableEurekaServer 注解表示此工程是注册中心
@EnableEurekaServer
public class SpringCloudGatewayRegistryServiceApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudGatewayRegistryServiceApplication.class, args);
    }

}
