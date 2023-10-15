package com.demo.dev.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class baseApi {
    //sample api
    @GetMapping("tutorial/api/hello")
    @ResponseBody
    public String hello() {
        return "Hello,Sudharsan";
    }

    //handle api with param
    @GetMapping("tutorial/api/param")
    @ResponseBody
    public String helloWithQueryParam(@RequestParam String name) {
        return "hello" + name +"!";
    }

    //handle api with path param
    @GetMapping("tutorial/api/path/param")
    @ResponseBody
    public String helloWithPathParam(@PathVariable String name){
        return "Hello" + name + "!";
    }

}
