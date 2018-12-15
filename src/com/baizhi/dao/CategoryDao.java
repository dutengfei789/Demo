package com.baizhi.dao;

import com.baizhi.entity.Category;
import com.baizhi.entity.TreeNode;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

public interface CategoryDao extends BaseMapper<Category> {
    List<TreeNode> findCategories();

    List<Integer> findCategoryIdByParentId(int categoryId);
}
