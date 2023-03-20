package com.gscomptech.BookReviewService.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {

        httpSecurity.authorizeHttpRequests()
                .requestMatchers(HttpMethod.POST, "/login").permitAll()
                .requestMatchers(HttpMethod.POST, "/user").permitAll()
                .requestMatchers("/**").authenticated()
                .and()
                .formLogin();

        return httpSecurity.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    /*
    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails admin = User.withUsername("admin").password(passwordEncoder().encode("admin")).roles("ADMIN").build();
        UserDetails normal = User.withUsername("normal").password(passwordEncoder().encode("normal")).roles("NORMAL").build();

        InMemoryUserDetailsManager userDetailsManager = new InMemoryUserDetailsManager(admin, normal);
        return userDetailsManager;
    } */
}
