package com.goku.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * Created by nbfujx on 2017/10/19.
 */
// Spring Boot 应用的标识
@SpringBootApplication
@MapperScan("com.goku.mybatis.mapper")
@ServletComponentScan
public class WebapiApplication {

    public static void main(String[] args) {
        // 程序启动入口
        // 启动嵌入式的 Tomcat 并初始化 Spring 环境及其各 Spring 组件
        SpringApplication.run(WebapiApplication.class,args);
    }
}
