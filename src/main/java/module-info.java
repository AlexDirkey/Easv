module com.example.flerevinduer {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.flerevinduer to javafx.fxml;
    exports com.example.flerevinduer;
    exports com.example.flerevinduer.controller;
    opens com.example.flerevinduer.controller to javafx.fxml;
}