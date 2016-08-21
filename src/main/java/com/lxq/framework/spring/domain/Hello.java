package com.lxq.framework.spring.domain;

import java.util.Date;

/**
 * Created by lxq on 2016/8/21.
 */
public class Hello {
    private String id;
    private String msg;
    private Date sayDate;

    public Hello(String id, String msg, Date sayDate) {
        this.id = id;
        this.msg = msg;
        this.sayDate = sayDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Date getSayDate() {
        return sayDate;
    }

    public void setSayDate(Date sayDate) {
        this.sayDate = sayDate;
    }
}
