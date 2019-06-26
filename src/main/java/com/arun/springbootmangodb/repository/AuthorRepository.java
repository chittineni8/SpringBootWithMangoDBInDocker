package com.arun.springbootmangodb.repository;

import com.arun.springbootmangodb.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
