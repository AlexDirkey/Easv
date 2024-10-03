package com.example.verdensbedstelommeregner;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private Button onButtonAddition;
    @FXML
    private Button onButtonMinus;
    @FXML
    private Button onButtonMultiply;
    @FXML
    private Button onButtonDivide;
    @FXML
    private TextField inPut;
    @FXML
    private Label lblResult;
    @FXML
    private Label welcomeText;



    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}


