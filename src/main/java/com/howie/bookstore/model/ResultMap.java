package com.howie.bookstore.model;

import org.springframework.stereotype.Component;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA
 *
 * @Author yuanhaoyue swithaoy@gmail.com
 * @Description 接口返回对象
 * @Date 2018-03-17
 * @Time 22:25
 */
@Component
public class ResultMap extends HashMap<String, Object> {
    public ResultMap() {
    }

    public ResultMap success() {
        this.put("result", "success");
        return this;
    }

    public ResultMap fail() {
        this.put("result", "fail");
        return this;
    }

    public ResultMap fail1() {
        this.put("result", "fail-1");
        return this;
    }

    public ResultMap fail2() {
        this.put("result", "fail-2");
        return this;
    }

    public ResultMap message(Object message) {
        this.put("message", message);
        return this;
    }
}

