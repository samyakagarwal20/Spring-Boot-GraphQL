package com.yflash.tech.SpringGraphQL.repository;

import com.yflash.tech.SpringGraphQL.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<BookEntity,Long> {
}
