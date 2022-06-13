package com.boot.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/")
@Slf4j
public class MainController {

    @RequestMapping(method = RequestMethod.GET)
    public String testRest() {
        return "Hello The Service Magazin is up";
    }

}