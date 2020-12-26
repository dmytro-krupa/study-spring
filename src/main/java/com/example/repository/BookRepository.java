package com.example.repository;

import com.example.entity.Book;
import com.example.exception.ServiceException;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class BookRepository {

    @PostConstruct
    public void init(){
        savedBooks = new ArrayList<>();
    }

    private static Long lastId = 1L;
    private List<Book> savedBooks;

    public Book getBookById(final Long id){
        return savedBooks.stream()
                .filter(e -> e.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new ServiceException(400, "Book with id: " + id + " not found ", null));
    }

    public List<Book> getAllBooks(){
        return savedBooks;
    }

    public Book createBook(final Book book){
        if(book.getId() != null){
            throw new ServiceException(400, "Book shouldn't have an id ", null);
        }

        ++lastId;
        book.setId(lastId);

        savedBooks.add(book);

        return book;
    }

    public Book updateBook(final Book book){
        if(book.getId() == null){
            throw new ServiceException(400, "User shouldn't have an id ", null);
        }

        final Book savedBook = getBookById(book.getId());


        savedBook.setTitle(book.getTitle());
        savedBook.setPrice(book.getPrice());
        savedBook.setAuthorName(book.getAuthorName());

        return savedBook;
    }

    public void deleteBookById(final Long id){
        if(id == null){
            throw new ServiceException(400, "Id isn't specified", null);
        }

        savedBooks.stream()
                .filter(e -> e.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new ServiceException(400, "Book with id: " + id + " not found ", null));

        savedBooks = savedBooks.stream()
                .filter(e -> !e.getId().equals(id))
                .collect(Collectors.toList());

    }
}
