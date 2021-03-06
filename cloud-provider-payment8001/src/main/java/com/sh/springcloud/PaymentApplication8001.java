package com.sh.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.stereotype.Repository;

import java.util.concurrent.atomic.AtomicInteger;

@SpringBootApplication
@MapperScan(basePackages = "com.sh.springcloud.dao", annotationClass = Repository.class)
@EnableEurekaClient
public class PaymentApplication8001 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication8001.class, args);
    }
}
