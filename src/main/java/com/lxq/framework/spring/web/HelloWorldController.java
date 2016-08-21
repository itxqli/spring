package com.lxq.framework.spring.web;

import com.lxq.framework.spring.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lxq on 2016/8/21.
 */
@Controller
@RequestMapping("/say")
public class HelloWorldController {
    @Autowired
    private HelloWorldService helloWorldService;

    @RequestMapping("/hello")
    public String sayHello() {
        //write
        return "hello";
    }
}
