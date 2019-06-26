package com.arun.springbootmangodb.service;

import com.arun.springbootmangodb.model.Author;
import com.arun.springbootmangodb.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    @Autowired
    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public List<Author> getAllAuthors() {
        List<Author> authors = new ArrayList<>();
        Iterable<Author> all = authorRepository.findAll();
        all.iterator().forEachRemaining(authors::add);
        return authors;
    }

    @Override
    public Author addAuthor(Author author) {
        authorRepository.save(author);
        return author;
    }
}
