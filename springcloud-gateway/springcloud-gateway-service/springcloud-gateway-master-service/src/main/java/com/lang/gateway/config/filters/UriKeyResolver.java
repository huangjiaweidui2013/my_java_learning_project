package com.lang.gateway.config.filters;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;

/**
 * 
 * 网关限流过滤器
 * @ClassName: UriKeyResolver
 * @author HuangLang
 * @date 2021年1月4日 上午11:02:55
 */
public class UriKeyResolver implements KeyResolver{

    /**
     * 
     * 根据请求的 uri 限流
     * @Title: resolve
     * @param exchange
     * @return
     */
    @Override
    public Mono<String> resolve(ServerWebExchange exchange) {
        return Mono.just(exchange.getRequest().getURI().getPath());
    }

}
