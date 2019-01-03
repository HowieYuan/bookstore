package com.howie.bookstore.controller;

import com.howie.bookstore.dao.UserMapper;
import com.howie.bookstore.model.ResultMap;
import com.howie.bookstore.util.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;

/**
 * Created with IntelliJ IDEA
 *
 * @Author yuanhaoyue swithaoy@gmail.com
 * @Description
 * @Date 2019-01-03
 * @Time 18:05
 */
@RestController
public class LoginController {
    private final ResultMap resultMap;
    private final UserMapper userMapper;

    @Autowired
    public LoginController(ResultMap resultMap, UserMapper userMapper) {
        this.resultMap = resultMap;
        this.userMapper = userMapper;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResultMap login(@RequestParam("username") String username,
                           @RequestParam("password") String password) {
        String realPassword = userMapper.getPassword(username);
        if (realPassword == null) {
            return resultMap.fail().message("用户名错误");
        } else if (!realPassword.equals(password)) {
            return resultMap.fail().message("密码错误");
        } else {
            return resultMap.success().message(JWTUtil.createToken(username));
        }
    }

    @RequestMapping(path = "/unauthorized/{message}")
    public ResultMap unauthorized(@PathVariable String message) throws UnsupportedEncodingException {
        return resultMap.success().message(message);
    }
}
