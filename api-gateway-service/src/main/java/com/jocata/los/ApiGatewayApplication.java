package com.jocata.los;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayApplication.class, args);
    }

    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("auth-service", r -> r.path("/auth/**")
                        .uri("lb://AUTH-SERVICE"))
                .route("user-service", r -> r.path("/api/users/**")
                        .uri("lb://USER-SERVICE"))
                .route("loan-service", r -> r.path("/api/loans/**")
                        .uri("lb://LOAN-APPLICATION-SERVICE"))
                .route("document-service", r -> r.path("/api/documents/**")
                        .uri("lb://DOCUMENT-SERVICE"))
                .route("approval-service", r -> r.path("/api/approvals/**")
                        .uri("lb://APPROVAL-SERVICE"))
                .route("disbursement-service", r -> r.path("/api/disbursements/**")
                        .uri("lb://DISBURSEMENT-SERVICE"))
                .route("notification-service", r -> r.path("/api/notifications/**")
                        .uri("lb://NOTIFICATION-SERVICE"))
                .build();
    }
}