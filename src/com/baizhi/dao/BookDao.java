package com.baizhi.dao;

import com.baizhi.entity.Book;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookDao extends BaseMapper<Book> {
    List<Book> findBooksByCategoryId(@Param("bookName") String bookName, @Param("list") List<Integer> list, @Param("start") int start, @Param("end") int end);

    Integer findBookCountByCategoryId(@Param("bookName") String bookName, @Param("list") List<Integer> list);
}
