package com.gscomptech.BookReviewService.Controller;

import com.gscomptech.BookReviewService.Entity.BookReview;
import com.gscomptech.BookReviewService.Service.BookReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookReviewController {

    @Autowired
    BookReviewService bookReviewService;

    @GetMapping("/review/{bookid}")
    public Page<BookReview> getAllBookReviews(@PathVariable String bookId, Pageable pageable) {
        return bookReviewService.getAllBookReviews(bookId, pageable);
    }

    @GetMapping("/review/{bookid}/{username}")
    public BookReview getBookReviewByUser(@PathVariable String username, @PathVariable String bookId) {
        return bookReviewService.getBookReviewByUser(username, bookId);
    }

    @GetMapping("/review/rating/{bookid}")
    public BookReview getBookRating(@PathVariable String bookId) {
        return bookReviewService.getBookRating(bookId);
    }

    @PostMapping("/review/{bookid}")
    public BookReview createReview(@PathVariable String bookId, @RequestBody BookReview bookReview) {
        return bookReviewService.createReview(bookId, bookReview);
    }

    @DeleteMapping("/review/{bookid}/{username}")
    public void deleteReview(@PathVariable String bookId, @PathVariable String username) {
        bookReviewService.deleteReview(bookId, username);
    }
}
