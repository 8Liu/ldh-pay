package com.liudehuang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author liudehuang
 * @date 2019/5/13 9:05
 */
@MapperScan("com.liudehuang.pay.dao")
@SpringBootApplication
public class PayApp {
    public static void main(String[] args) {
        SpringApplication.run(PayApp.class,args);
    }
}
