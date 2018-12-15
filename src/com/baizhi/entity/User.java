package com.baizhi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("t_user")
public class User {

    @TableId("user_id")
    private int userId;
    @TableField("user_naem")
    private String userName;
    @TableField("pwd")
    private String pwd;

    public User(int userId, String userName, String pwd) {
        this.userId = userId;
        this.userName = userName;
        this.pwd = pwd;
    }

    public User() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
