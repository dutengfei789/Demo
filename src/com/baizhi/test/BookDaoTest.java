package com.baizhi.test;

import com.baizhi.dao.BookDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class BookDaoTest {

    @Autowired
    private BookDao bookDao;
    @Test
    public void findBooksByCategoryId() {
        bookDao.findBooksByCategoryId("%头疼%",new ArrayList<>(),1,3).forEach(System.out::println);
    }

    @Test
    public void findBookCountByCategoryId() {
        Integer bookCountByCategoryId = bookDao.findBookCountByCategoryId("%头疼%", Arrays.asList(5, 6));
        System.out.println("bookCountByCategoryId = " + bookCountByCategoryId);
    }
}