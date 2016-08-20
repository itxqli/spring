package com.lxq.framework.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lxq on 2016/8/21.
 */
@Controller
@RequestMapping("/")
public class HelloWorldController {
    @RequestMapping("/hello.html")
    public String sayHello() {
        return "helloworld";
    }
}
