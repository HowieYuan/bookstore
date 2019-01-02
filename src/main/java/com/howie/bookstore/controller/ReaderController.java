package com.howie.bookstore.controller;

import com.howie.bookstore.dao.BookMapper;
import com.howie.bookstore.dao.ReaderMapper;
import com.howie.bookstore.model.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA
 *
 * @Author yuanhaoyue swithaoy@gmail.com
 * @Description
 * @Date 2019-01-02
 * @Time 12:55
 */
@RestController
public class ReaderController {
    private final ResultMap resultMap;
    private final ReaderMapper readerMapper;

    @Autowired
    public ReaderController(ResultMap resultMap, ReaderMapper readerMapper) {
        this.resultMap = resultMap;
        this.readerMapper = readerMapper;
    }


    @RequestMapping(value = "/reader", method = RequestMethod.GET)
    public ResultMap getReaders() {
        return resultMap.success().message(readerMapper.getReaders());
    }
}
