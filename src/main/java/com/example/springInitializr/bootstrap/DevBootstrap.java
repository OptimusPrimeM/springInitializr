package com.example.springInitializr.bootstrap;

import com.example.springInitializr.model.Author;
import com.example.springInitializr.model.Book;
import com.example.springInitializr.model.Publisher;
import com.example.springInitializr.repositories.AuthorRepository;
import com.example.springInitializr.repositories.BookRepository;
import com.example.springInitializr.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;


@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        initData();
    }


    private void initData(){
        //Optimus
        Author eric = new Author("Optimus", "Prime");
        Publisher steven = new Publisher("Steven Spilberg", "USA");
        Book cybertron =  new Book("Cybertron","1234",steven);
        eric.getBooks().add(cybertron);
        cybertron.getAuthors().add(eric);

        authorRepository.save(eric);
        publisherRepository.save(steven);
        bookRepository.save(cybertron);

        //Avengers
        Author iron = new Author("Iron", "Man");
        Publisher marvelUni = new Publisher("Marvel Universe", "Canada");
        Book marvel =  new Book("Marvel","2356",marvelUni);
        iron.getBooks().add(marvel);
        marvel.getAuthors().add(iron);

        authorRepository.save(iron);
        publisherRepository.save(marvelUni);
        bookRepository.save(marvel);

    }
}
