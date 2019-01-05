package com.howie.bookstore.model;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

/**
 * Created with IntelliJ IDEA
 *
 * @Author yuanhaoyue swithaoy@gmail.com
 * @Description
 * @Date 2019-01-03
 * @Time 17:16
 */
public class Statistics extends BaseRowModel {
    @ExcelProperty(value = "图书类目", index = 0)
    private String category;

    @ExcelProperty(value = "销量", index = 1)
    private int sales;

    @ExcelProperty(value = "销售额", index = 2)
    private int amount;

    @ExcelProperty(value = "书本数目", index = 3)
    private int bookNum;

    public Statistics() {
    }

    public Statistics(String category, int sales, int amount, int bookNum) {
        this.category = category;
        this.sales = sales;
        this.amount = amount;
        this.bookNum = bookNum;
    }

    public int getBookNum() {
        return bookNum;
    }

    public void setBookNum(int bookNum) {
        this.bookNum = bookNum;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Statistics{" +
                "category='" + category + '\'' +
                ", sales=" + sales +
                ", amount=" + amount +
                '}';
    }
}
