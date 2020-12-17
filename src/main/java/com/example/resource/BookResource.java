package com.example.resource;

import com.example.dto.BookDTO;
import com.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookResource {
    @Autowired
    private BookService bookService;

    @GetMapping("/books/{id}")
    public BookDTO getBookById(final @PathVariable Long id){
        return bookService.getBookById(id);
    }

    @GetMapping("/books")
    public List<BookDTO> getAllBooks(){
        return bookService.getAllBooks();
    }

    @PostMapping("/books")
    public BookDTO createBook(final @RequestBody BookDTO bookDTO){
        return bookService.createBook(bookDTO);
    }

    @PutMapping("/books")
    public BookDTO updateBook(final @RequestBody BookDTO bookDTO){
        return bookService.updateBook(bookDTO);
    }

    @DeleteMapping("/books/{id}")
    public void deleteBookById(final @PathVariable Long id){
        bookService.deleteBookById(id);
    }
}
