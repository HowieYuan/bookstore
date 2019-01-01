package com.howie.bookstore.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.howie.bookstore.dao.BookMapper;
import com.howie.bookstore.model.BookInformation;
import com.howie.bookstore.model.BookVo;
import com.howie.bookstore.model.ResultMap;
import com.howie.bookstore.util.HttpUtils;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA
 *
 * @Author yuanhaoyue swithaoy@gmail.com
 * @Description
 * @Date 2018-12-31
 * @Time 22:14
 */
@RestController
public class BookController {
    private final ResultMap resultMap;
    private final BookMapper bookMapper;

    @Autowired
    public BookController(ResultMap resultMap, BookMapper bookMapper) {
        this.resultMap = resultMap;
        this.bookMapper = bookMapper;
    }

    @RequestMapping(value = "/book", method = RequestMethod.GET)
    public ResultMap getBooks() {
        return resultMap.success().message(bookMapper.getBooks());
    }

    @RequestMapping(value = "/bookInformation/{id}", method = RequestMethod.GET)
    public ResultMap getBookInformation(@PathVariable("id") int id) {
        BookInformation bookInformation = bookMapper.getBookInformation(id);
        return resultMap.success().message(bookInformation);
    }
}
