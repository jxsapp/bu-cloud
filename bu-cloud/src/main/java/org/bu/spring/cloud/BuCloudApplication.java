package org.bu.spring.cloud;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class BuCloudApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(BuCloudApplication.class).web(true).run(args);
    }

}

