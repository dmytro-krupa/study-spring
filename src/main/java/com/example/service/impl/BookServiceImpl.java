package com.example.service.impl;

import com.example.dto.BookDTO;
import com.example.mapper.BookToBookDTOMapper;
import com.example.repository.BookRepository;
import com.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private BookToBookDTOMapper bookToBookDTOMapper;

    @Override
    public BookDTO getBookById(final Long id) {

        return bookToBookDTOMapper.toDTO(bookRepository.getDummyBook());
    }

    @Override
    public List<BookDTO> getAllBooks() {
        return Collections.singletonList(bookToBookDTOMapper.toDTO(bookRepository.getDummyBook()));
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
