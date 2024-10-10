package com.example.javafundamentalsassignment;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Load the login.fxml file
        Parent root = FXMLLoader.load(getClass().getResource("/login.fxml"));
        primaryStage.setTitle("Login");
        primaryStage.setScene(new Scene(root, 400, 400));
        primaryStage.setResizable(true);  // Allow resizing
        primaryStage.show();  // Show the window
    }

    public static void main(String[] args) {
        launch(args);  // Launch the JavaFX application
    }
}