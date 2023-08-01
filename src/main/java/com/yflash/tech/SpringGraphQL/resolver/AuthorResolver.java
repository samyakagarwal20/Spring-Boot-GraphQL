package com.yflash.tech.SpringGraphQL.resolver;

import com.yflash.tech.SpringGraphQL.entity.AuthorEntity;
import com.yflash.tech.SpringGraphQL.service.AuthorService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AuthorResolver implements GraphQLQueryResolver, GraphQLMutationResolver {

    @Autowired
    AuthorService authorService;

    public List<AuthorEntity> findAllAuthors() {
        return authorService.findAllAuthors();
    }

    public long countAuthors() {
        return authorService.countAuthors();
    }

    public AuthorEntity newAuthor(String firstName, String lastName) {
        return authorService.newAuthor(firstName, lastName);
    }

}
