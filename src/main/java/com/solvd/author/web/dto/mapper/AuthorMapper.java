package com.solvd.author.web.dto.mapper;

import com.solvd.author.domain.Author;
import com.solvd.author.web.dto.AuthorDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AuthorMapper {

    Author toEntity(AuthorDto authorDto);

    AuthorDto toDto(Author author);

    List<AuthorDto> toDto(List<Author> author);

}
