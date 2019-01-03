package com.howie.bookstore.dao;

import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA
 *
 * @Author yuanhaoyue swithaoy@gmail.com
 * @Description
 * @Date 2019-01-03
 * @Time 18:01
 */
@Repository
public interface UserMapper {
    String getPassword(String username);

}
