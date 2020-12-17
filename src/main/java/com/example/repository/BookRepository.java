package com.example.repository;

import com.example.entity.Book;
import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {
    public Book getDummyBook(){
        return new Book(1L, "some title", 124, "name");
    }
}
