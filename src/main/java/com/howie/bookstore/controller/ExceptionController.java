package com.howie.bookstore.controller;

import com.howie.bookstore.model.ResultMap;
import org.apache.shiro.ShiroException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * Created with IntelliJ IDEA
 *
 * @Author yuanhaoyue swithaoy@gmail.com
 * @Description 异常处理
 * @Date 2018-04-09
 * @Time 17:09
 */
@RestControllerAdvice
public class ExceptionController {
    private final ResultMap resultMap;

    @Autowired
    public ExceptionController(ResultMap resultMap) {
        this.resultMap = resultMap;
    }

    // 捕捉shiro的异常
    @ExceptionHandler(ShiroException.class)
    public ResultMap handle401() {
        return resultMap.fail().message("您没有权限访问！");
    }

    // 捕捉其他所有异常
    @ExceptionHandler(Exception.class)
    public ResultMap globalException(Throwable ex) {
        return resultMap.fail().message("访问出错，无法访问: " + ex.getMessage());
    }
}
