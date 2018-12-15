package com.baizhi.entity;

import java.util.List;

public class Category {
    private int categoryId;
    private String categoryName;
    private List<Category> categories;

    public Category() {
    }

    public Category(int categoryId, String categoryName, List<Category> categories) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.categories = categories;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                ", categories=" + categories +
                '}';
    }
}
