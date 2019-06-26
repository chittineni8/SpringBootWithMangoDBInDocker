package com.arun.springbootmangodb.controller;

import com.arun.springbootmangodb.model.Author;
import com.arun.springbootmangodb.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthorController {

    private final AuthorService authorService;

    @Autowired
    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping("/authors/v1/author")
    public ResponseEntity<List<Author>> getAllAuthors() {
        List<Author> allAuthors = authorService.getAllAuthors();
        return new ResponseEntity<>(allAuthors, HttpStatus.OK);
    }

    @PostMapping("/authors/v1/author")
    public ResponseEntity<Author> addAuthor(@RequestBody Author author) {
        Author author1 = authorService.addAuthor(author);
        return new ResponseEntity<>(author1, HttpStatus.CREATED);
    }
}
