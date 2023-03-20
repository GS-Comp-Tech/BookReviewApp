package com.gscomptech.BookReviewService.Repository;

import com.gscomptech.BookReviewService.Entity.BookReview;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookReviewRepository extends MongoRepository<BookReview, Integer> {
    BookReview findByUsernameAndBookId(String username, String bookId);

    void deleteByBookIdAndUsername(String bookId, String username);
}
