package com.baizhi.service;

import com.baizhi.entity.Book;

import java.util.List;
import java.util.Map;

public interface BookService {
    Map findBooksByCategoryId(String bookName, int categoryId, int page, int rows);
}
