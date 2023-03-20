package com.gscomptech.BookReviewService.Service;

import com.gscomptech.BookReviewService.Entity.BookReview;
import com.gscomptech.BookReviewService.Repository.BookReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BookReviewService {
    @Autowired
    BookReviewRepository bookReviewRepository;

    public Page<BookReview> getAllBookReviews(String bookId, Pageable pageable) {
        //bookReviewRepository.findAll();
        return null;
    }

    public BookReview getBookReviewByUser(String username, String bookId) {
       return bookReviewRepository.findByUsernameAndBookId(username, bookId);
    }

    public BookReview getBookRating(String bookId) {
        return null;
    }

    public BookReview createReview(String bookId, BookReview bookReview) {
        return bookReviewRepository.save(bookReview);
    }

    public void deleteReview(String bookId, String username) {
        bookReviewRepository.deleteByBookIdAndUsername(bookId, username);
    }
}
