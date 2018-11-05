package com.yqlbd.cloud05configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Cloud05ConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Cloud05ConfigServerApplication.class, args);
    }
}
