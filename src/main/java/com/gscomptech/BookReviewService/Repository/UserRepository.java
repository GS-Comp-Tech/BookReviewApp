package com.gscomptech.BookReviewService.Repository;

import com.gscomptech.BookReviewService.Entity.DemoUser;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<DemoUser, String> {
    DemoUser findByUsername(String username);
}
