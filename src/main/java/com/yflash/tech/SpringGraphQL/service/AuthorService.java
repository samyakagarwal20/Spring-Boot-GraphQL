package com.yflash.tech.SpringGraphQL.service;

import com.yflash.tech.SpringGraphQL.entity.AuthorEntity;

import java.util.List;

public interface AuthorService {

    List<AuthorEntity> findAllAuthors();
    long countAuthors();
    AuthorEntity newAuthor(String firstName, String lastName);

}
