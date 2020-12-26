package com.example.service.impl;

import com.example.dto.BookDTO;
import com.example.exception.ServiceException;
import com.example.mapper.BookToBookDTOMapper;
import com.example.repository.BookRepository;
import com.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private BookToBookDTOMapper bookToBookDTOMapper;

    @Override
    public BookDTO getBookById(final Long id) {

        return bookToBookDTOMapper.toDTO(bookRepository.getBookById(id));
    }

    @Override
    public List<BookDTO> getAllBooks() {
        return bookRepository.getAllBooks().stream()
                .map(e -> bookToBookDTOMapper.toDTO(e))
                .collect(Collectors.toList());
    }

    @Override
    public BookDTO createBook(final BookDTO bookDTO) {
        if(bookDTO.getId() != null){
            throw new ServiceException(400, "Book shouldn't have an id ", null);
        }

        return bookToBookDTOMapper.toDTO(bookRepository.createBook(bookToBookDTOMapper.toEntity(bookDTO)));
    }

    @Override
    public BookDTO updateBook(final BookDTO bookDTO) {
        if(bookDTO.getId() == null){
            throw new ServiceException(400, "Book have an id ", null);
        }

        return bookToBookDTOMapper.toDTO(bookRepository.updateBook(bookToBookDTOMapper.toEntity(bookDTO)));
    }

    @Override
    public void deleteBookById(final Long id) {
        bookRepository.deleteBookById(id);
    }
}
