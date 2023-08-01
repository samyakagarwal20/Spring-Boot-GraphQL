package com.yflash.tech.SpringGraphQL.resolver;

import com.yflash.tech.SpringGraphQL.entity.BookEntity;
import com.yflash.tech.SpringGraphQL.service.BookService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookResolver implements GraphQLQueryResolver, GraphQLMutationResolver {

    @Autowired
    BookService bookService;

    public List<BookEntity> findAllBooks() {
        return bookService.findAllBooks();
    }

    public long countBooks() {
        return bookService.countBooks();
    }

    public BookEntity newBook(String title, String isbn, int pageCount, long authorId) {
        return bookService.newBook(title, isbn, pageCount, authorId);
    }

    public boolean deleteBook(Long id) {
        return bookService.deleteBook(id);
    }

}
