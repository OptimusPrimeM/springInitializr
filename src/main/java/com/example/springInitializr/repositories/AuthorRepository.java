package com.example.springInitializr.repositories;

import com.example.springInitializr.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
