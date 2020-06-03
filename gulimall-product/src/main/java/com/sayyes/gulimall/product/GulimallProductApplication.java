package com.sayyes.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1、整合mybatis-plus
 *      1）gulimall-common添加依赖，product模块添加common依赖
 *      2）配置
 *          a)配置数据源
 *          b)配置mybatis-plus的参数（使用MapperScan注解扫描；告诉mybatis-plus的sql映射文件）
 *
 */
@MapperScan("com.sayyes.gulimall.product.dao")
@SpringBootApplication
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}
