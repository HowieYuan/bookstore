package com.howie.bookstore.controller;

import com.howie.bookstore.dao.BookMapper;
import com.howie.bookstore.model.Book;
import com.howie.bookstore.model.BookInformation;
import com.howie.bookstore.model.ResultMap;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created with IntelliJ IDEA
 *
 * @Author yuanhaoyue swithaoy@gmail.com
 * @Description
 * @Date 2018-12-31
 * @Time 22:14
 */
@RestController
public class BookController {
    private final ResultMap resultMap;
    private final BookMapper bookMapper;

    @Autowired
    public BookController(ResultMap resultMap, BookMapper bookMapper) {
        this.resultMap = resultMap;
        this.bookMapper = bookMapper;
    }

    @RequestMapping(value = "/book", method = RequestMethod.GET)
    @RequiresRoles("admin")
    public ResultMap getBooks() {
        return resultMap.success().message(bookMapper.getBooks());
    }

    @RequestMapping(value = "/bookInformation/{id}", method = RequestMethod.GET)
    @RequiresRoles("admin")
    public ResultMap getBookInformation(@PathVariable("id") int id) {
        BookInformation bookInformation = bookMapper.getBookInformation(id);
        return resultMap.success().message(bookInformation);
    }

    @RequestMapping(value = "/bookInformation", method = RequestMethod.POST)
    @RequiresRoles("admin")
    public ResultMap updateBookInformation(BookInformation bookInformation) {
        bookMapper.updateBookInformation(bookInformation);
        return resultMap.success().message("修改成功");
    }

    @RequestMapping(value = "/bookInformation/add", method = RequestMethod.POST)
    @RequiresRoles("admin")
    public ResultMap addBookInformation(BookInformation bookInformation) {
        bookMapper.addBookInformation(bookInformation);
        return resultMap.success().message("添加成功");
    }

    @RequestMapping(value = "/bookInformation/delete", method = RequestMethod.POST)
    @RequiresRoles("admin")
    public ResultMap deleteBookInformation(int id) {
        bookMapper.deleteBookInformation(id);
        return resultMap.success().message("删除成功");
    }

    @RequestMapping(value = "/book/{bookName}", method = RequestMethod.GET)
    @RequiresRoles("admin")
    public ResultMap searchBookByName(@PathVariable("bookName") String bookName) {
        List<Book> list = bookMapper.searchBookByName(bookName);
        return resultMap.success().message(list);
    }
}
