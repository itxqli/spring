package com.lxq.framework.spring.service.impl;


import com.lxq.framework.spring.dao.HelloWorldDao;
import com.lxq.framework.spring.domain.Hello;
import com.lxq.framework.spring.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lxq on 2016/8/21.
 */
@Service
public class HelloWorldServiceSimpleImpl implements HelloWorldService {
    @Autowired
    private HelloWorldDao helloWorldDao;

    @Override
    public Hello getSay() {
        return helloWorldDao.sayHello();
    }
}
