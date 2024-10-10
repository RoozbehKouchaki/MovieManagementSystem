module com.example.javafundamentalsassignment {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens com.example.javafundamentalsassignment to javafx.fxml;
    exports com.example.javafundamentalsassignment;
}