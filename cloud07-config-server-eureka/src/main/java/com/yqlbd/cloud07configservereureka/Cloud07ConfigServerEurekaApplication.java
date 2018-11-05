package com.yqlbd.cloud07configservereureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class Cloud07ConfigServerEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(Cloud07ConfigServerEurekaApplication.class, args);
    }
}
