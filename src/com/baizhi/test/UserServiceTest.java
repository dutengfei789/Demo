package com.baizhi.test;

import com.baizhi.dao.UserDao;
import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.Map;
import java.util.Set;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class UserServiceTest {
    @Autowired
    private UserService service;
    @Autowired
    private UserDao dao;


    @Test
    public void findUserByUserNameAndPwd() {
        //boolean login = service.findUserByUserNameAndPwd("张三", "123456");
        //System.out.println("login = " + login);
    }

    @Test
    public void findAll() {
        String username=null;
        int page=1,rows=3;
//        IPage<User> iPage = new Page<>(1, 1);

        QueryWrapper<User> queryWrapper = new QueryWrapper<>();

        queryWrapper.eq("user_naem", username);

//        IPage<User> userPage = dao.selectPage(iPage, null);
//        List<User> records = userPage.getRecords();
        Page<User> Page = new Page<>(1, 3);
        IPage<User> userIPage= dao.selectPage(Page, null);



        IPage<Map<String, Object>> mapIPage = dao.selectMapsPage(userIPage, null);
        long pages = mapIPage.getPages();
        List<Map<String, Object>> records = mapIPage.getRecords();
        for (Map<String, Object> record : records) {
            Object user_id = record.get("USER_ID");
            System.out.println("user_id = " + user_id);
        }
//        records.forEach(System.out::println);

    }
    @Test
    public void test(){
        List<User> list = dao.selectList(null);
    }

    @Test
    public void findUserByPage() {
        Map map = service.findUserByPage("程", 1, 3);
        List<User> list= (List<User>) map.get("rows");
        list.forEach(System.out::println);
        Long integer= (Long) map.get("total");
        System.out.println("integer = " + integer);
    }
}