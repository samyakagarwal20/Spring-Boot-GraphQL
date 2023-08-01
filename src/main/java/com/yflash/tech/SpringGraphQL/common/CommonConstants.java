package com.yflash.tech.SpringGraphQL.common;

public final class CommonConstants {

    private CommonConstants() {}

    public static final String BAD_REQUEST_ERROR_CODE = "E_10001";
    public static final String DETAILS_NOT_FOUND_ERROR_CODE = "E_10002";
    public static final String INTERNAL_SERVER_ERROR_CODE = "E_10003";

    public static final String HTTP_STATUS_MESSAGE_BAD_REQUEST = "Bad Request";
    public static final String HTTP_STATUS_MESSAGE_DETAILS_NOT_FOUND = "Details Not Found";
    public static final String HTTP_STATUS_MESSAGE_INTERNAL_SERVER_ERROR = "Internal Server Error";
    public static final String GENERIC_EXCEPTION_MESSAGE = "One or more validation errors occurred";

    public static final String USER_NOT_FOUND = "User details not found with the given id!";

    /** BookEntity fields */
    public static final String BOOK_ID = "book_id";
    public static final String BOOK_TITLE = "book_title";
    public static final String BOOK_ISBN = "book_isbn";
    public static final String BOOK_PAGE_COUNT = "book_pageCount";

    /** AuthorEntity fields */
    public static final String AUTHOR_ID = "author_id";
    public static final String AUTHOR_FIRST_NAME = "author_firstName";
    public static final String AUTHOR_LAST_NAME = "author_lastName";

}
