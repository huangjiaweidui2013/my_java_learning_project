package com.lang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import com.lang.gateway.config.filters.TokenFilter;
import com.lang.gateway.config.filters.UriKeyResolver;

@SpringBootApplication
@EnableEurekaClient
public class SpringcloudGatewayMasterServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringcloudGatewayMasterServiceApplication.class, args);
    }
    
    /**
     * 
     * 配置限流 Bean
     * @Title: uriKeyResolver
     * @return
     * @return: UriKeyResolver
     */
    @Bean(name = "uriKeyResolver")
    public UriKeyResolver uriKeyResolver() {
        return new UriKeyResolver();
    }
    
    /**
     * 
     * 配置认证过滤器 Bean
     * @Title: tokenFilter
     * @return
     * @return: TokenFilter
     */
    @Bean(name = "tokenFilter")
    public TokenFilter tokenFilter() {
        return new TokenFilter();
    }
}
