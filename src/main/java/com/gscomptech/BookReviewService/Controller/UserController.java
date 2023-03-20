package com.gscomptech.BookReviewService.Controller;

import com.gscomptech.BookReviewService.Service.UserService;
import com.gscomptech.BookReviewService.Entity.DemoUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/user")
    public Page<DemoUser> getUsers(Pageable pageable) {
        return userService.getAllUsers(pageable);
    }

    @GetMapping("/user/{username}")
    public DemoUser getUser(@PathVariable String username) {
        return userService.getUser(username);
    }

    @PostMapping("/user")
    public DemoUser createUser(@RequestBody DemoUser demouser) {
        return userService.createUser(demouser);
    }

    @PutMapping("/user")
    public DemoUser updateUser(@PathVariable String username,@RequestBody DemoUser demouser) {
        return userService.updateUser(username, demouser);
    }

    @DeleteMapping("/user")
    public void deleteUser(String username) {
        userService.deleteUser(username);
    }
}
