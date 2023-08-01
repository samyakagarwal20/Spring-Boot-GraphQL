package com.yflash.tech.SpringGraphQL.service.impl;

import com.yflash.tech.SpringGraphQL.entity.AuthorEntity;
import com.yflash.tech.SpringGraphQL.repository.AuthorRepository;
import com.yflash.tech.SpringGraphQL.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    AuthorRepository authorRepository;

    @Override
    public List<AuthorEntity> findAllAuthors() {
        return authorRepository.findAll();
    }

    @Override
    public long countAuthors() {
        return authorRepository.count();
    }

    @Override
    public AuthorEntity newAuthor(String firstName, String lastName) {
        AuthorEntity author = AuthorEntity.builder()
                .firstName(firstName)
                .lastName(lastName)
                .build();
        return authorRepository.save(author);
    }
}
