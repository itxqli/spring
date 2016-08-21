package com.lxq.framework.spring.dao.impl;

import com.lxq.framework.spring.dao.HelloWorldDao;
import com.lxq.framework.spring.domain.Hello;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.UUID;

/**
 * Created by lxq on 2016/8/21.
 */
@Repository
public class HelloWorldDaoSimpleImpl implements HelloWorldDao {
    @Override
    public Hello sayHello() {
        return new Hello(UUID.randomUUID().toString(), "how are you?", new Date());
    }
}
