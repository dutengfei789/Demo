package com.baizhi.controller;

import com.baizhi.entity.TreeNode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class TreeNodeController {



    @RequestMapping("getTree")
    @ResponseBody
    public List<TreeNode> getTree(){
        //创建controller层数据
        TreeNode treeNodeController = new TreeNode("10101011", "TreeNodeController");
        TreeNode userController = new TreeNode("10101012", "UserController");

        //添加com.baizhi层数据
        List<TreeNode> controller = Arrays.asList(treeNodeController, userController);
        TreeNode controller1 = new TreeNode("101010", "controller", controller);
        TreeNode dao = new TreeNode("101011", "dao");
        TreeNode entity = new TreeNode("101012", "entity");
        TreeNode service = new TreeNode("101013", "service");
        TreeNode test= new TreeNode("101014", "test");

        //创建src层数据
        List<TreeNode> baizhi = Arrays.asList(controller1, dao, entity, service, test);
        TreeNode src = new TreeNode("1010", "src", baizhi);
        TreeNode web = new TreeNode("1011", "web");
        TreeNode config = new TreeNode("1012", "config");

        //最外层easyui_day2
        List<TreeNode> easyui = Arrays.asList(src, web, config);
        TreeNode treeNode = new TreeNode("10", "easyui_day2  D:/java/javaCode/FrameworkCode/easyui_day2", easyui);

        //做为结果返回
        List<TreeNode> list = Arrays.asList(treeNode);


        return list;
    }
}
