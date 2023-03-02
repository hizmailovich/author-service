package com.solvd.author.web.controller;

import com.solvd.author.domain.Author;
import com.solvd.author.service.AuthorService;
import com.solvd.author.web.dto.AuthorDto;
import com.solvd.author.web.dto.mapper.AuthorMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/authors")
public class AuthorController {

    private final AuthorService authorService;
    private final AuthorMapper authorMapper;

    @GetMapping()
    public List<AuthorDto> getAll() {
        List<Author> authors = authorService.retrieveAll();
        return authorMapper.toDto(authors);
    }

    @GetMapping("/{authorId}")
    public Boolean isExists(@PathVariable Long authorId) {
        return authorService.isExists(authorId);
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public AuthorDto create(@Validated @RequestBody AuthorDto authorDto) {
        Author author = authorMapper.toEntity(authorDto);
        author = authorService.create(author);
        return authorMapper.toDto(author);
    }

}
