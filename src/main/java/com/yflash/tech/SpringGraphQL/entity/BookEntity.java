package com.yflash.tech.SpringGraphQL.entity;

import com.yflash.tech.SpringGraphQL.common.CommonConstants;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Book")
public class BookEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = CommonConstants.BOOK_ID, nullable = false)
    private Long id;

    @Column(name = CommonConstants.BOOK_TITLE, nullable = false)
    private String title;

    @Column(name = CommonConstants.BOOK_ISBN, nullable = false)
    private String isbn;

    @Column(name = CommonConstants.BOOK_PAGE_COUNT, nullable = false)
    private int pageCount;

    @ManyToOne
    @JoinColumn(name = "author_id", nullable = false, updatable = false)
    private AuthorEntity author;

}
