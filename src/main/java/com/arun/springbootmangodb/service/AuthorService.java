package com.arun.springbootmangodb.service;

import com.arun.springbootmangodb.model.Author;

import java.util.List;

public interface AuthorService {

    List<Author> getAllAuthors();

    Author addAuthor(Author author);
}
