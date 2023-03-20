package com.gscomptech.BookReviewService.Entity;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class DemoUserDetails implements UserDetails {

    private DemoUser demoUser;
    public DemoUserDetails(DemoUser demoUser) {
        this.demoUser = demoUser;
    }


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorities = new ArrayList<>(demoUser.roles.size());
        for (String role : demoUser.roles) {
            Assert.isTrue(!role.startsWith("ROLE_"),
                    () -> role + " cannot start with ROLE_ (it is automatically added)");
            authorities.add(new SimpleGrantedAuthority("ROLE_" + role));
        }
        return authorities;
    }

    @Override
    public String getPassword() {
        return demoUser.getPassword();
    }

    @Override
    public String getUsername() {
        return demoUser.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
