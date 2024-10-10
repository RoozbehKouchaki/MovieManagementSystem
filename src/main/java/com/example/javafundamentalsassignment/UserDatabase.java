package com.example.javafundamentalsassignment;

import java.util.HashMap;
import java.util.Map;

public class UserDatabase {
    private Map<String, User> users = new HashMap<>();

    public UserDatabase() {
        // Add example users
        users.put("admin", new User("admin", "password123", "Admin"));
        users.put("user", new User("user", "password456", "User"));
    }

    public User authenticate(String username, String password) {
        User user = users.get(username);
        return (user != null && user.getPassword().equals(password)) ? user : null;
    }
}