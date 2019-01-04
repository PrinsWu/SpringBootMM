package com.prins.app.controller;

import com.prins.app.service.IHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author prinswu
 * @version v1.0
 * @since v1.0 2019-01-04
 */
@RestController
public class HelloController {

    @Autowired
    private IHelloService helloService;

    @GetMapping(value = "/hello/{name}")
    public String hello(@PathVariable(name = "name") String name) {
        return helloService.sayHello(name);
    }
}
