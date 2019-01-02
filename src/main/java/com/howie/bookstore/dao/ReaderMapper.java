package com.howie.bookstore.dao;

import com.howie.bookstore.model.Reader;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created with IntelliJ IDEA
 *
 * @Author yuanhaoyue swithaoy@gmail.com
 * @Description
 * @Date 2019-01-02
 * @Time 12:56
 */
@Repository
public interface ReaderMapper {
    List<Reader> getReaders();

    Reader getReader(Integer purchaserId);
}
