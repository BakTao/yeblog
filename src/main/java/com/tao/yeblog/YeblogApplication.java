package com.tao.yeblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication(scanBasePackages = "com.tao.yeblog")
public class YeblogApplication {

    public static void main(String[] args) {
        SpringApplication.run(YeblogApplication.class, args);
    }

}
