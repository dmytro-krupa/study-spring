package com.example.service.impl;

import com.example.dto.BookDTO;
import com.example.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Override
    public BookDTO getBookById(final Long id) {

        return null;
    }

    @Override
    public List<BookDTO> getAllBooks() {
        return null;
    }

    @Override
    public BookDTO createBook(final BookDTO bookDTO) {
        return null;
    }

    @Override
    public BookDTO updateBook(final BookDTO bookDTO) {
        return null;
    }

    @Override
    public void deleteBookById(final Long id) {

    }
}
