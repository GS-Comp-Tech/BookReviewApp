package com.gscomptech.BookReviewService.Repository;

import com.gscomptech.BookReviewService.Entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends MongoRepository<Book, Integer> {
}
