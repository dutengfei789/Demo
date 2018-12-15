package com.baizhi.controller;

import com.baizhi.entity.Category;
import com.baizhi.entity.TreeNode;
import com.baizhi.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class CotergoryController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping("findCategories")
    @ResponseBody
    public List<TreeNode> findCategories() {
        List<TreeNode> categories=categoryService.findCategories();
        return categories;
    }
}
