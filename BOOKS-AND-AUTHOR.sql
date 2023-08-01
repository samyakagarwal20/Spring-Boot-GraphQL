create database pracDB;

show databases;
use pracDB;
show tables;

create table Author (
        author_id bigint not null auto_increment,
        author_firstName varchar(255) not null,
        author_lastName varchar(255) not null,
        primary key (author_id)
	);

create table Book (
        book_id bigint not null auto_increment,
        book_isbn varchar(255) not null,
        book_pageCount integer not null,
        book_title varchar(255) not null,
        author_id bigint not null,
        primary key (book_id),
        foreign key (author_id) references Author (author_id)
    );

show tables;

insert into Author(author_firstName, author_lastName) values('Jonathan', 'Swift');
insert into Author(author_firstName, author_lastName) values('Bram', 'Stoker');

select * from Author;

insert into Book(book_title, book_isbn, book_pageCount, author_id) values('Gulliver’s Travels', 'BN23947120', 129, 1);
insert into Book(book_title, book_isbn, book_pageCount, author_id) values('Dracula', 'BN12984650', 174, 2);

select * from Book;