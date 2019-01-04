package com.prins.bk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author prinswu
 * @version v1.0
 * @since v1.0 2019-01-04
 */
@SpringBootApplication(scanBasePackages = "com.prins.bk")
public class BackendApplication {
    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
    }
}
