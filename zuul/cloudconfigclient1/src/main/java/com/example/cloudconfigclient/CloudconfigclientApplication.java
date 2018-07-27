package com.example.cloudconfigclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableZuulProxy
@SpringCloudApplication
@RestController
public class CloudconfigclientApplication {

    private String foo;
    public static void main(String[] args) {
        SpringApplication.run(CloudconfigclientApplication.class, args);
    }
    @RequestMapping("/hi")
    public String hi(){
        return "hahha";
    }
}
