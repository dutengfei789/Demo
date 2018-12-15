package com.baizhi.controller;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;


@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("login")
    public void login(String username, String pwd, HttpServletResponse response) throws IOException {
        //boolean login = userService.findUserByUserNameAndPwd(username, pwd);
        //response.getWriter().write(login+"");
    }

    @RequestMapping("findUserByPage")
    @ResponseBody
    public Map findUserByPage(String username, int page, int rows) {
//        System.out.println("page = " + page);
//        System.out.println("rows = " + rows);
        return userService.findUserByPage(username,page , rows);
    }

    //修改用户
    @RequestMapping("updateById")
    @ResponseBody
    public boolean updateById(User user) {
        System.out.println("user = " + user);
        try {
            userService.updateById(user);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    @RequestMapping("insertUser")
    @ResponseBody
    public boolean insertUser(User user) {
        try {
            userService.insertUser(user);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    //批量删除id
    @RequestMapping("deleteIds")
    @ResponseBody
    public Boolean deleteIds(Integer[] ids) {
        try {
            userService.deleteIds(ids);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

}
