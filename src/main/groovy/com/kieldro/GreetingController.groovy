package com.kieldro

import org.springframework.web.bind.annotation.CrossOrigin

import java.util.concurrent.atomic.AtomicLong
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class GreetingController {

    private static final String template = "Hello, %s!"
    private final AtomicLong counter = new AtomicLong()

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping("/greeting")
    Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name))
    }
}