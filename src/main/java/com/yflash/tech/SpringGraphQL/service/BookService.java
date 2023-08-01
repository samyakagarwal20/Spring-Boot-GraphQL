package com.yflash.tech.SpringGraphQL.service;

import com.yflash.tech.SpringGraphQL.entity.BookEntity;

import java.util.List;

public interface BookService {

    List<BookEntity> findAllBooks();
    long countBooks();
    BookEntity newBook(String title, String isbn, int pageCount, long authorId);
    boolean deleteBook(Long id);

}
