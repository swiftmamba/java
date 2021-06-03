package com.swift;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
// mapperScan 在启动类这里配置，配置dao接口的包路径，将dao接口加入spring容器
@MapperScan(basePackages ="com.swift.dao")
// 开启事务
@EnableTransactionManagement
public class SweetApplication {

    public static void main(String[] args) {
        SpringApplication.run(SweetApplication.class, args);
    }

}
