package com.baizhi.controller;

import com.baizhi.entity.Book;
import com.baizhi.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping("findBooksByCategoryId")
    @ResponseBody
    public Map findBooksByCategoryId(String bookName,int categoryId,int page,int rows) {

        Map map=bookService.findBooksByCategoryId(bookName, categoryId, page, rows);

        return map;
    }
}
