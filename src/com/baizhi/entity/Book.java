package com.baizhi.entity;

import java.util.Date;

public class Book {
    private int bookId;
    private String bookName;
    private String author;
    private Date putawayDate ;
    private Double bookPrice;

    public Book() {
    }

    public Book(int bookId, String bookName, String author, Date putawayDate, Double bookPrice) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.putawayDate = putawayDate;
        this.bookPrice = bookPrice;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getPutawayDate() {
        return putawayDate;
    }

    public void setPutawayDate(Date putawayDate) {
        this.putawayDate = putawayDate;
    }

    public Double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(Double bookPrice) {
        this.bookPrice = bookPrice;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", putawayDate=" + putawayDate +
                ", bookPrice=" + bookPrice +
                '}';
    }
}
