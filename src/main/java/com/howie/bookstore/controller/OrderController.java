package com.howie.bookstore.controller;

import com.howie.bookstore.dao.OrderMapper;
import com.howie.bookstore.dao.ReaderMapper;
import com.howie.bookstore.model.Order;
import com.howie.bookstore.model.Reader;
import com.howie.bookstore.model.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created with IntelliJ IDEA
 *
 * @Author yuanhaoyue swithaoy@gmail.com
 * @Description
 * @Date 2019-01-02
 * @Time 13:28
 */
@RestController
public class OrderController {
    private final ResultMap resultMap;
    private final OrderMapper orderMapper;
    private final ReaderMapper readerMapper;

    @Autowired
    public OrderController(ResultMap resultMap, OrderMapper orderMapper, ReaderMapper readerMapper) {
        this.resultMap = resultMap;
        this.orderMapper = orderMapper;
        this.readerMapper = readerMapper;
    }


    @RequestMapping(value = "/order", method = RequestMethod.GET)
    public ResultMap getOrders() {
        List<Order> list = orderMapper.getOrders();
        for (Order order : list) {
            Reader reader = readerMapper.getReader(order.getPurchaserId());
            order.setReader(reader);
        }
        return resultMap.success().message(list);
    }

}
