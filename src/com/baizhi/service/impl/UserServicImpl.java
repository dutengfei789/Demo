package com.baizhi.service.impl;

import com.baizhi.dao.UserDao;
import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServicImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public String findUserByUserNameAndPwd(String userName, String pwd) {

        QueryWrapper<User> queryWrapper= new QueryWrapper<>();
        queryWrapper.eq("user_naem", userName).eq("pwd", pwd);
//        Map map = new HashMap();
//        map.put("user_name", userName);
//        map.put("pwd", pwd);
        User user = userDao.selectOne(queryWrapper);
        if (user != null) {
            return "true";
        }

        return "false";

    }

    @Override
    public List<User> findAll() {
        List<User> list = userDao.selectList(null);
        return list;
    }

    @Override
    public Map findUserByPage(String username, int page, int rows) {
        Map map = new HashMap();

//        IPage<User> iPage = new Page<>(page, rows);

        Page<User> iPage = new Page<>(page, rows);
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        if (username != null) {
            queryWrapper.like("user_naem", username);
        }
        IPage<User> userPage = userDao.selectPage(iPage, queryWrapper);
        List<User> records = userPage.getRecords();
        long total = userPage.getTotal();
//        IPage<Map<String, Object>> mapIPage = userDao.selectMapsPage(userPage, queryWrapper);
//        List<Map<String, Object>> records = mapIPage.getRecords();
//        long pages = mapIPage.getPages();
//        Integer integer = userDao.selectCount(queryWrapper);
        //返回页元素内容
        map.put("rows", records);
        //查询的页数
        map.put("total", total);
        return map;
    }

    @Override
    public void updateById(User user) {
        userDao.updateById(user);
    }

    @Override
    public void insertUser(User user) {
        userDao.insertUser(user);

    }

    @Override
    public void deleteIds(Integer[] ids) {

        List<Integer> list = Arrays.asList(ids);
        userDao.deleteBatchIds(list);

    }

}
