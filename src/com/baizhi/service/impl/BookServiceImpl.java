package com.baizhi.service.impl;

import com.baizhi.dao.BookDao;
import com.baizhi.dao.CategoryDao;
import com.baizhi.entity.Book;
import com.baizhi.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private CategoryDao categoryDao;
    @Autowired
    private BookDao bookDao;

    @Override
    public Map findBooksByCategoryId(String bookName, int categoryId, int page, int rows) {

        List<Integer> list = new ArrayList<>();
        Map map = new HashMap();

        //根据传的id判断是否空
        if(categoryId>0){
        //如果不为空，则判断id分类级别
            List<Integer> ids=categoryDao.findCategoryIdByParentId(categoryId);

            //根据返回的list判断，当list为空时，为二级类型
            //当返回的list不为空时，为一级类
            if (ids == null || ids.size() == 0) {
                list.add(categoryId);
            }else {
                list = ids;
            }
        }

        //处理bookName
        if (bookName == null || "".equals(bookName)) {
            bookName=null;
        }else {
            bookName = "%" + bookName + "%";
        }

        //分页
        int start =(page-1)* rows+1;
        int end = page * rows;

        List<Book> books=bookDao.findBooksByCategoryId(bookName,list, start, end);

        //查询书籍数
        Integer total = bookDao.findBookCountByCategoryId(bookName, list);

        map.put("total", total);
        map.put("rows", books);

        return map;
    }
}
