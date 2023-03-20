package com.gscomptech.BookReviewService.Entity;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "review")
public class BookReview {
    public int id;
    public String bookId;

    public String username;

    public String reviewComment;

    public int rating;

    public Date time;

    public BookReview() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getReviewComment() {
        return reviewComment;
    }

    public void setReviewComment(String reviewComment) {
        this.reviewComment = reviewComment;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
