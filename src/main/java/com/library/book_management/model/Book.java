package com.library.book_management.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.annotations.AnyDiscriminatorImplicitValues;
import org.hibernate.validator.constraints.ISBN;

import javax.annotation.processing.Generated;


@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column
    @NotBlank
    private String title;

    @Column
    @NotBlank
    private String author;

    @Column
    @NotBlank
    @ISBN(type = ISBN.Type.ANY, message = "Invalid ISBN")
    private String isbn;

    @Column
    @Min(value = 5, message = "Book must cost 5$ or higher")
    private double price;

    @Column
    @Min(value = 0, message = "Quantity cannot be negative")
    private int quantity;

    @Column
    private String category;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }


    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public String getCategory() { return category; }

    // FIXED
    public void setCategory(String category) {
        this.category = category;
    }
}
