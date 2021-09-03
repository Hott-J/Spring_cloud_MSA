package com.example.apigatewayservice.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// yml 역할을 자바단에서 처리
//컨트롤러 단에서 @RequestHeadedr 이용해서 헤더값을 넣어줌
// localhost:8000/first-service/** 실행하면 헤더 필터 들어간뒤에 uri에 있는 값 포워딩
//@Configuration
public class FilterConfig {
//    @Bean
    public RouteLocator gateway(RouteLocatorBuilder builder) {
        return builder.routes() // path 호출되면 filter 적용하고 uri로 이동시켜줌
                .route(r -> r.path("/first-service/**")
                            .filters(f -> f.addRequestHeader("first-request","first-request-header")
                                            .addResponseHeader("first-response","first-response-header"))
                            .uri("http://localhost:8081"))
                .route(r -> r.path("/second-service/**")
                        .filters(f -> f.addRequestHeader("second-request","second-request-header")
                                .addResponseHeader("second-response","second-response-header"))
                        .uri("http://localhost:8082"))
                .build();
    }
}
