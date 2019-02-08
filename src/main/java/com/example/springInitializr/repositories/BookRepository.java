package com.example.springInitializr.repositories;

import com.example.springInitializr.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
