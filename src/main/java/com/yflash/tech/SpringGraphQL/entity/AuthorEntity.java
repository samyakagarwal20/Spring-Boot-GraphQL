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
@Table(name = "Author")
public class AuthorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = CommonConstants.AUTHOR_ID, nullable = false)
    private Long id;

    @Column(name = CommonConstants.AUTHOR_FIRST_NAME, nullable = false)
    private String firstName;

    @Column(name = CommonConstants.AUTHOR_LAST_NAME, nullable = false)
    private String lastName;

}
