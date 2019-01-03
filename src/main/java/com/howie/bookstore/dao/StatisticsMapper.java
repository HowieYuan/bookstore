package com.howie.bookstore.dao;

import com.howie.bookstore.model.Statistics;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created with IntelliJ IDEA
 *
 * @Author yuanhaoyue swithaoy@gmail.com
 * @Description
 * @Date 2019-01-03
 * @Time 17:15
 */
@Repository
public interface StatisticsMapper {
    List<Statistics> getStatistics();

    Statistics getTotalAmount();
}
