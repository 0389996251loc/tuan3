package com.example.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.bookstore.entity.Book;
@Repository
public interface IBookRepository extends JpaRepository<Book, Long> {
}
