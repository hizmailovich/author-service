package com.solvd.author.service;

import com.solvd.author.domain.Author;

import java.util.List;

public interface AuthorService {

    List<Author> retrieveAll();

    Author create(Author author);

    Boolean isExists(Long authorId);

}
