package com.lx.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(){
        return "hell spring boot!";
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(){
        return "this is a test";
    }
}


