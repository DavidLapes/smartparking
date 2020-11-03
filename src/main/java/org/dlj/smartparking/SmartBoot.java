package org.dlj.smartparking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
@ComponentScan( basePackages = {
        "org.dlj.smartparking",
        "org.dlj.smartparking.config",
        "org.dlj.smartparking.security",
        "org.dlj.smartparking.exceptions",
        "org.dlj.smartparking.repository",
        "org.dlj.smartparking.rest.service",
        "org.dlj.smartparking.rest.service.impl",
        "org.dlj.smartparking.rest.controller"
})
public class SmartBoot {

    public static void main(final String[] args) {
        SpringApplication.run(SmartBoot.class, args);
    }

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
