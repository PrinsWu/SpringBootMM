package com.prins.app.service;

import org.springframework.stereotype.Service;

/**
 * @author prinswu
 * @version v1.0
 * @since v1.0 2019-01-04
 */
@Service
public class HelloService implements IHelloService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name + "!";
    }
}
