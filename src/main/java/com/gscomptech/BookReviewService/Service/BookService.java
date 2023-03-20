package com.gscomptech.BookReviewService.Service;

import com.gscomptech.BookReviewService.Repository.BookRepository;
import com.gscomptech.BookReviewService.Entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;
    public Page<Book> getAllBooks(Pageable pageable) {
        return bookRepository.findAll(pageable);
    }

    public Optional<Book> getBookById(int id) {
        return bookRepository.findById(id);
    }

    public Book updateBook(int id, Book book) {
        return bookRepository.save(book);
    }

    public void deleteBook(int id) {
        bookRepository.deleteById(id);
    }

    public Book createBook(Book book) {
        return bookRepository.save(book);
    }
}
