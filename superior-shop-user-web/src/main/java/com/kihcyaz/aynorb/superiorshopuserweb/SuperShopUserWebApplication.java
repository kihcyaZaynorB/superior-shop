package com.kihcyaz.aynorb.superiorshopuserweb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.kihcyaz.aynorb.superiorshopuserweb.dao")
public class SuperShopUserWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(SuperShopUserWebApplication.class, args);
    }

}
