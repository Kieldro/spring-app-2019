package com.kieldro

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.servlet.config.annotation.CorsRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@SpringBootApplication
class App {

    static void main(String[] args) {
        SpringApplication.run(App.class, args)
        System.out.println('Hello world!')
    }

//    WebMvcConfigurer corsConfigurer() {
//        return new WebMvcConfigurer() {
//            @Override
//            void addCorsMappings(CorsRegistry registry) {
//                registry.addMapping("/greeting").allowedOrigins("http://localhost:3000");
//            }
//        };
//    }
}

