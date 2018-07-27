package com.example.cloudconfigclient;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableZuulProxy
@SpringCloudApplication
@RestController
@RefreshScope
@EnableCircuitBreaker
public class CloudconfigclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudconfigclientApplication.class, args);
    }
    @RequestMapping("/hi")
    @HystrixCommand(fallbackMethod="getFallback")
    public String hi(String s){
//        throw new RuntimeException("hei");
        return "heihei";
    }

    public String getFallback(String a){
        return "嘿嘿";
    }
}
