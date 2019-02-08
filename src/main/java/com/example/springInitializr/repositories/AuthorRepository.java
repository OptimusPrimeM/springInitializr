package com.example.springInitializr.repositories;

import com.example.springInitializr.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long>{
}
