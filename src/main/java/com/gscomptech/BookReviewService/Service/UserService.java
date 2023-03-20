package com.gscomptech.BookReviewService.Service;

import com.gscomptech.BookReviewService.Repository.UserRepository;
import com.gscomptech.BookReviewService.Entity.DemoUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public Page<DemoUser> getAllUsers(Pageable pageable) {
        return userRepository.findAll(pageable);
    }

    public DemoUser createUser(DemoUser demouser) {
        return userRepository.save(demouser);
    }

    public DemoUser updateUser(String username, DemoUser demouser) {
        return userRepository.save(demouser);
    }

    public void deleteUser(String username) {
        DemoUser demoUser = userRepository.findByUsername(username);
        if(demoUser != null) {
            userRepository.delete(demoUser);
        }
    }

    public DemoUser getUser(String username) {
        return userRepository.findByUsername(username);
    }
}
