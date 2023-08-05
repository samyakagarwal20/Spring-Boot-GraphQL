package com.yflash.tech.SpringGraphQL.service.impl;

import com.yflash.tech.SpringGraphQL.common.CommonConstants;
import com.yflash.tech.SpringGraphQL.entity.AuthorEntity;
import com.yflash.tech.SpringGraphQL.entity.BookEntity;
import com.yflash.tech.SpringGraphQL.exception.BadRequestException;
import com.yflash.tech.SpringGraphQL.repository.BookRepository;
import com.yflash.tech.SpringGraphQL.service.BookService;
import graphql.GraphQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookRepository bookRepository;

    @Override
    public List<BookEntity> findAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public long countBooks() {
        return bookRepository.count();
    }

    @Override
    public BookEntity newBook(String title, String isbn, int pageCount, long authorId) {
        BookEntity book = BookEntity.builder()
                .title(title)
                .isbn(isbn)
                .pageCount(pageCount)
                .author(AuthorEntity.builder().id(authorId).build())
                .build();
        return bookRepository.save(book);
    }

    @Override
    public boolean deleteBook(Long id) {
        bookRepository.deleteById(id);
        return true;
    }

    @Override
    public boolean testBadRequestException() {
        throw new BadRequestException(CommonConstants.GENERIC_EXCEPTION_MESSAGE, CommonConstants.BAD_REQUEST_ERROR_CODE, List.of("bad request initiated"));
    }

    @Override
    public boolean testCustomExceptionHandler() {
        throw new GraphQLException("Custom error handler invoked");
    }

    @Override
    public boolean testRuntimeExceptionHandler() {
        throw new RuntimeException("Runtime Exception invoked");
    }
}
