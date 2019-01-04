package com.prins.bk.controller;

import com.prins.bk.service.ICountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author prinswu
 * @version v1.0
 * @since v1.0 2019-01-04
 */
@RestController
public class CountController {

    @Autowired
    private ICountService countService;

    @GetMapping(value = "/count")
    public int getCount() {
        return countService.getCount();
    }

    @PostMapping(value = "/count")
    public int addCount() {
        return countService.addCount();
    }
}
