package com.howie.bookstore.controller;

import com.howie.bookstore.dao.ReaderMapper;
import com.howie.bookstore.dao.StatisticsMapper;
import com.howie.bookstore.model.ResultMap;
import com.howie.bookstore.model.Statistics;
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
 * @Date 2019-01-03
 * @Time 17:12
 */
@RestController
public class StatisticsController {
    private final ResultMap resultMap;
    private final StatisticsMapper statisticsMapper;

    @Autowired
    public StatisticsController(ResultMap resultMap, StatisticsMapper statisticsMapper) {
        this.resultMap = resultMap;
        this.statisticsMapper = statisticsMapper;
    }

    @RequestMapping(value = "/statistics", method = RequestMethod.GET)
    public ResultMap statistics() {
        List<Statistics> list = statisticsMapper.getStatistics();
        Statistics total = statisticsMapper.getTotalAmount();
        total.setCategory("总量");
        list.add(total);
        return resultMap.success().message(list);
    }

}
