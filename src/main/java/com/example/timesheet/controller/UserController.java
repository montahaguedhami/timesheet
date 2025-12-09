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
            new User("John", "Doe", "john@example.com"),    // 3 paramètres
            new User("Jane", "Smith", "jane@example.com")   // 3 paramètres
        );
    }
    
    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        // Créer un user puis setter l'ID
        User user = new User("Test", "User", "test@example.com");
        user.setId(id);
        return user;
    }
}
