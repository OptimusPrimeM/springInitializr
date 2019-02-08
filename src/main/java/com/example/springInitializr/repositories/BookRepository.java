package com.example.springInitializr.repositories;

import com.example.springInitializr.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookRepository extends JpaRepository<Book, Long> {
}
