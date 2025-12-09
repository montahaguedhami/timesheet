package com.example.timesheet.controller;

import com.example.timesheet.entity.User;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    
    @GetMapping
    public List<User> getAllUsers() {
        return Arrays.asList(
            new User(1L, "John", "Doe", "john@example.com"),
            new User(2L, "Jane", "Smith", "jane@example.com")
        );
    }
    
    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        return new User(id, "Test", "User", "test@example.com");
    }
}
