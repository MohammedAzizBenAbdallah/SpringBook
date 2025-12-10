package com.library.book_management.controller;

public class UpdateBookRequest {
    private String id;
    private Double price;

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public Double getPrice() { return price; }
    public void setPrice(Double price) { this.price = price; }
}
