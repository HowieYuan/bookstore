package com.howie.bookstore.controller;

import com.howie.bookstore.config.excel.ExcelUtil;
import com.howie.bookstore.dao.ReaderMapper;
import com.howie.bookstore.dao.StatisticsMapper;
import com.howie.bookstore.model.ResultMap;
import com.howie.bookstore.model.Statistics;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
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
    @RequiresRoles("admin")
    public ResultMap statistics() {
        List<Statistics> list = statisticsMapper.getStatistics();
        Statistics total = statisticsMapper.getTotalAmount();
        total.setCategory("总量");
        list.add(total);
        return resultMap.success().message(list);
    }

    @RequestMapping(value = "/statistics/export", method = RequestMethod.GET)
    @RequiresRoles("admin")
    public void exportStatistics(HttpServletResponse response) throws IOException {
        List<Statistics> list = statisticsMapper.getStatistics();
        Statistics total = statisticsMapper.getTotalAmount();
        total.setCategory("总量");
        list.add(total);
        String fileName = "图书销售统计报表";
        String sheetName = "各类目销售统计";
        response.setHeader("content-type", "application/octet-stream");
        ExcelUtil.writeExcel(response, list, fileName, sheetName, new Statistics());
    }

}
