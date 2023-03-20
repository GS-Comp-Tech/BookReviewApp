package com.gscomptech.BookReviewService.Service;

import com.gscomptech.BookReviewService.Entity.DemoUser;
import com.gscomptech.BookReviewService.Entity.DemoUserDetails;
import com.gscomptech.BookReviewService.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class MongoUserDetailsService implements UserDetailsService {

    @Autowired
    public UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        DemoUser demoUser = userRepository.findByUsername(username);
        if(demoUser == null) {
            throw new UsernameNotFoundException(username);
        } else {
            UserDetails details = new DemoUserDetails(demoUser);
            return details;
        }
    }
}
