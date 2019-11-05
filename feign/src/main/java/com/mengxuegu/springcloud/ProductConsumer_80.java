package com.mengxuegu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Auther: 梦学谷
 */
@EnableEurekaClient
@SpringBootApplication
//会扫描指定包下面使用@FeignClient标识的接口
@EnableFeignClients(basePackages = "com.mengxuegu.springcloud.service")
public class ProductConsumer_80 {
    public static void main(String[] args) {
        SpringApplication.run(ProductConsumer_80.class, args);
    }

}
