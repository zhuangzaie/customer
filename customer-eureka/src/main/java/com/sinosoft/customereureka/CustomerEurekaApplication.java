package com.sinosoft.customereureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CustomerEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run (CustomerEurekaApplication.class, args);
    }

}
