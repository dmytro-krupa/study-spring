package com.example.service;

import com.example.dto.BookDTO;

import java.util.List;

public interface BookService {
    BookDTO getBookById(Long id);
    List<BookDTO> getAllBooks();
    BookDTO createBook(BookDTO bookDTO);
    BookDTO updateBook(BookDTO bookDTO);
    void deleteBookById(Long id);

}
