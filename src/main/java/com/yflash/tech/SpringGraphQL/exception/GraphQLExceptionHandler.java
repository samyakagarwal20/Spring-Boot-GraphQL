package com.yflash.tech.SpringGraphQL.exception;

import graphql.GraphQLException;
import graphql.kickstart.spring.error.ThrowableGraphQLError;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Component
public class GraphQLExceptionHandler {

    @ExceptionHandler(GraphQLException.class)
    public ThrowableGraphQLError handleException(GraphQLException exception) {
        return new ThrowableGraphQLError(exception);
    }

    @ExceptionHandler(BadRequestException.class)
    public ThrowableGraphQLError handleException(BadRequestException exception) {
        return new ThrowableGraphQLError(exception, String.join("\n", exception.getErrorMessages()));
    }

    @ExceptionHandler(RuntimeException.class)
    public ThrowableGraphQLError handleException(RuntimeException exception) {
        return new ThrowableGraphQLError(exception, "Internal Server Error");
    }

}
