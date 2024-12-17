package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @version 1.0
 * @Author：alex
 * @Date：2024/12/17 10:39
 * @Descirption xxx
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableDiscoveryClient
public class GatewayAppMain {
    public static void main(String[] args) {
        SpringApplication.run(GatewayAppMain.class,args);
    }
}
