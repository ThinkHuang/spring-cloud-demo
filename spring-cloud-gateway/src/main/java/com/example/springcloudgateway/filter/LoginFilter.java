package com.example.springcloudgateway.filter;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @ClassName: LoginFilter
 * @Description:
 * @Author: huangyejun
 * @Date: 2023/5/6 11:21
 * @Version: v1.0
 */
@Component
public class LoginFilter implements GlobalFilter {

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        System.out.println("执行了自定义的全局过滤器");
        //1.获取请求参数access-token
        String token = exchange.getRequest().getQueryParams().getFirst("access-token");
        //2.判断是否存在
        if(token == null) {
            //3.如果不存在 : 认证失败
            System.out.println("没有登录");
            exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
            return exchange.getResponse().setComplete(); //请求结束
        }
        //4.如果存在,继续执行
        return chain.filter(exchange); //继续向下执行
    }
}
