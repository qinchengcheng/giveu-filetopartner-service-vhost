package com.giveu.giveufiletopartnerservicevhost;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.giveu.giveufiletopartnerservicevhost.dao")
public class GiveuFiletopartnerServiceVhostApplication {

    public static void main(String[] args) {
        SpringApplication.run(GiveuFiletopartnerServiceVhostApplication.class, args);
    }
}
