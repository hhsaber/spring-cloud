package com.example.oauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@EnableDiscoveryClient
//@EnableFeignClients
//@EntityScan("com.xuecheng.framework.domain.ucenter")//扫描实体类
//@ComponentScan(basePackages={"com.xuecheng.api"})//扫描接口
//@ComponentScan(basePackages={"com.xuecheng.framework"})//扫描common下的所有类
@SpringBootApplication
public class SpingCloudSecurityOauth2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpingCloudSecurityOauth2Application.class, args);
    }

}
