package com.gscomptech.BookReviewService.Controller;

import com.gscomptech.BookReviewService.Service.BookService;
import com.gscomptech.BookReviewService.Entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class BookController {

    @Autowired
    BookService bookService;
    @GetMapping("/book")
    public Page<Book> getBooks(Pageable pageable) {
        return bookService.getAllBooks(pageable);
    }

    @GetMapping("/book/{id}")
    public Optional<Book> getBook(@PathVariable int id) {
        return bookService.getBookById(id);
    }

    @PostMapping("/book")
    public Book createBook(@RequestBody Book book) {
        return bookService.createBook(book);
    }

    @PutMapping("/book/{id}")
    public Book updateBook(@PathVariable int id, @RequestBody Book book) {
        return bookService.updateBook(id, book);
    }

    @DeleteMapping("/book/{id}")
    public void deleteBook(@PathVariable int id) {
        bookService.deleteBook(id);
    }

}
