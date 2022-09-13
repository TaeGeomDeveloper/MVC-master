# MVC

## 데이터베이스

use gntp;

create table library
(
    book_seq         integer auto_increment primary key,
    book_title       varchar(255) not null,
    book_author      varchar(255) not null,
    book_price       integer      not null,
    book_image       varchar(255) not null,
    book_attachments varchar(255)
);

select * from library;
