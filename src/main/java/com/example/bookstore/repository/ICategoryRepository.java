package com.example.bookstore.repository;

import com.example.bookstore.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.bookstore.entity.Book;
@Repository
public interface ICategoryRepository extends JpaRepository<Category, Long> {
}
