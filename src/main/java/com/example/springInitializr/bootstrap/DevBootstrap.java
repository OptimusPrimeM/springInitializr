package com.example.springInitializr.bootstrap;

import com.example.springInitializr.model.Author;
import com.example.springInitializr.model.Book;
import com.example.springInitializr.repositories.AuthorRepository;
import com.example.springInitializr.repositories.BookRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;


@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        initData();
    }


    private void initData(){
        //Optimus
        Author eric = new Author("Optimus", "Prime");
        Book cybertron =  new Book("Cybertron","1234","Steven Spilberg");
        eric.getBooks().add(cybertron);
        cybertron.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(cybertron);

        //Avengers
        Author iron = new Author("Iron", "Man");
        Book marvel =  new Book("Marvel","2356","Marvel Universe");
        iron.getBooks().add(marvel);
        marvel.getAuthors().add(iron);

        authorRepository.save(iron);
        bookRepository.save(marvel);

    }
}
