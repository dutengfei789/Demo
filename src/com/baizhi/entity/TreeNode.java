package com.baizhi.entity;

import java.util.List;

public class TreeNode {
    private String id;
    private String text;
    private String state="open";
    private boolean checked;
    private String attributes;
    private List<TreeNode> children;

    public TreeNode() {
    }

    public TreeNode(String id, String text, String state, boolean checked, String attributes, List<TreeNode> children) {
        this.id = id;
        this.text = text;
        this.state = state;
        this.checked = checked;
        this.attributes = attributes;
        this.children = children;
    }

    public TreeNode(String id, String text, List<TreeNode> children) {
        this.id = id;
        this.text = text;
        this.children = children;
    }

    public TreeNode(String id, String text) {
        this.id = id;
        this.text = text;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public String getAttributes() {
        return attributes;
    }

    public void setAttributes(String attributes) {
        this.attributes = attributes;
    }

    public List<TreeNode> getChildren() {
        return children;
    }

    public void setChildren(List<TreeNode> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "id='" + id + '\'' +
                ", text='" + text + '\'' +
                ", state='" + state + '\'' +
                ", checked=" + checked +
                ", attributes='" + attributes + '\'' +
                ", children=" + children +
                '}';
    }
}
