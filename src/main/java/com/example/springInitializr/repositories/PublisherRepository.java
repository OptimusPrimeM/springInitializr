package com.example.springInitializr.repositories;

import com.example.springInitializr.model.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
