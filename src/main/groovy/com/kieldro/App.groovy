package com.kieldro

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class App {

    static void main(String[] args) {
        SpringApplication.run(App.class, args)
        System.out.println('Hello world!')
    }
}

