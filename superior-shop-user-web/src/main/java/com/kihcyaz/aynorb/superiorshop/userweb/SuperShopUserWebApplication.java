package com.kihcyaz.aynorb.superiorshop.userweb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.kihcyaz.aynorb.superiorshop.userweb.dao")
public class SuperShopUserWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(SuperShopUserWebApplication.class, args);
    }

}
