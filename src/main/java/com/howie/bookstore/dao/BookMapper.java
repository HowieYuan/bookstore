package com.howie.bookstore.dao;

import com.howie.bookstore.model.Book;
import com.howie.bookstore.model.BookInformation;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created with IntelliJ IDEA
 *
 * @Author yuanhaoyue swithaoy@gmail.com
 * @Description
 * @Date 2018-12-31
 * @Time 22:33
 */
@Repository
public interface BookMapper {
    List<Book> getBooks();

    BookInformation getBookInformation(int id);
}