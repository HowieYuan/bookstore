package com.howie.bookstore.dao;

import com.howie.bookstore.model.Order;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created with IntelliJ IDEA
 *
 * @Author yuanhaoyue swithaoy@gmail.com
 * @Description
 * @Date 2019-01-02
 * @Time 13:28
 */
@Repository
public interface OrderMapper {
    List<Order> getOrders();
}
