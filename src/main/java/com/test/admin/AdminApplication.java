package com.test.admin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @author zhengchunfeng
 * @version 1.0
 * @className AdminApplication
 * @description SpringBoot Admin 监控
 * @date 2019/12/5 10:39
 */
@EnableAdminServer
@SpringBootApplication
@ServletComponentScan
public class AdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class, args);
    }
}
