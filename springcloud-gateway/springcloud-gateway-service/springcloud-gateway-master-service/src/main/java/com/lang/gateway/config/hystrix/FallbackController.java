package com.lang.gateway.config.hystrix;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * 网关断路器
 * @ClassName: FallbackController
 * @author HuangLang
 * @date 2021年1月4日 上午11:07:32
 */
@RestController
public class FallbackController {

    /**
     * 
     * 网关断路器
     * @Title: fallback
     * @return
     * @return: String
     */
    @RequestMapping("/fallback")
    public String fallback() {
        return "I'm Spring Cloud Gateway fallback.";
    }
}
