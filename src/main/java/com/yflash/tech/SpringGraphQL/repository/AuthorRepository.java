package com.yflash.tech.SpringGraphQL.repository;

import com.yflash.tech.SpringGraphQL.entity.AuthorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<AuthorEntity,Long> {
}
