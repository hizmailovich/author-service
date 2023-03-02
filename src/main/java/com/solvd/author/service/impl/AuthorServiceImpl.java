package com.solvd.author.service.impl;

import com.solvd.author.domain.Author;
import com.solvd.author.persistence.AuthorRepository;
import com.solvd.author.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    @Override
    public List<Author> retrieveAll() {
        return authorRepository.findAll();
    }

    @Override
    public Author create(Author author) {
        return authorRepository.save(author);
    }

    @Override
    public Boolean isExists(Long authorId) {
        return authorRepository.existsById(authorId);
    }

}
