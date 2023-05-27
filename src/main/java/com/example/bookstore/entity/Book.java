package com.example.bookstore.entity;

import com.example.bookstore.Validator.annotation.ValidCategoryId;
import com.example.bookstore.Validator.annotation.ValidCategoryId;
import com.example.bookstore.Validator.annotation.ValidUserId;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import  lombok.Data;
import lombok.NonNull;

@Data
@Entity
@Table(name= "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    @NotEmpty(message = "Title mus be empty")
    @Size(max = 50 ,min=1, message ="Title must be less than 50 characters")
    private String title;

    @Column(name = "author")
    private String author;

    @Column(name = "price")
    @NotNull(message = "Price is required")
    private Double price;

    @ManyToOne
    @JoinColumn(name = "category_id")
    @ValidCategoryId
    private Category category;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    @ValidUserId
    private User user;
}
