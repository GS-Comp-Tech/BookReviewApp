package com.gscomptech.BookReviewService.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableMethodSecurity
public class DemoController {

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/admin")
    public ResponseEntity<String> printAdmins() {
        return ResponseEntity.ok("Yes, I'm the admin");
    }


    @PreAuthorize("hasRole('NORMAL')")
    @GetMapping("/normal")
    public ResponseEntity<String> printNormal() {
        return ResponseEntity.ok("Yes, I'm a Normal user");
    }


    @GetMapping("/public")
    public ResponseEntity<String> printPublic() {
        return ResponseEntity.ok("Yes, I'm a Public user");
    }

}
