package com.brady.accounting.controller;

import com.brady.accounting.model.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Brady on 2020/4/12.
 */

@RestController
public class HelloController {

    private AtomicLong counter = new AtomicLong();

    @RequestMapping("v1/greeting/{name}")
    public Greeting sayHello(@PathVariable("name") String name) {
        return new Greeting(counter.incrementAndGet(), name);
    }
}
