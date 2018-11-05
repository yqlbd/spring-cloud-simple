package com.yqlbd.cloud01eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Cloud01EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Cloud01EurekaServerApplication.class, args);
    }
}
