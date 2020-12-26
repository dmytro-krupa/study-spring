package com.example.mapper;

import com.example.dto.BookDTO;
import com.example.entity.Book;
import org.springframework.stereotype.Component;

@Component
public class BookToBookDTOMapper {
    public Book toEntity(final BookDTO bookDTO){
        final Book book = new Book();

        book.setId(bookDTO.getId());
        book.setAuthorName(bookDTO.getAuthorName());
        book.setPrice(bookDTO.getPrice());
        book.setTitle(bookDTO.getTitle());

        return book;
    }

    public BookDTO toDTO(final Book book){
        final BookDTO bookDTO = new BookDTO();

        bookDTO.setId(book.getId());
        bookDTO.setAuthorName(book.getAuthorName());
        bookDTO.setPrice(book.getPrice());
        bookDTO.setTitle(book.getTitle());

        return bookDTO;
    }
}
