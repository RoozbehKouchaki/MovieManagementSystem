package com.example.javafundamentalsassignment;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Label errorLabel;

    private UserDatabase userDatabase = new UserDatabase();

    @FXML
    private void handleLogin() {
        System.out.println("Login button pressed");

        String username = usernameField.getText();
        String password = passwordField.getText();

        System.out.println("Username entered: " + username);
        System.out.println("Password entered: " + password);

        User user = userDatabase.authenticate(username, password);

        if (user != null) {
            errorLabel.setText("Login successful!");
            System.out.println("Login successful for user: " + user.getUsername());
        } else {
            errorLabel.setText("Invalid username or password.");
            System.out.println("Login failed.");
        }
    }
}