package com.example.flerevinduer.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.Parent;

import java.io.IOException;

public class MainWindowController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick()  throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/Window1Controller.fxml"));
        Parent scene = loader.load();

        Stage stage = new Stage();
        stage.setScene(new Scene(scene));
        stage.show();

        Window1 controller =  loader.getController();
        controller.setParent(this);
    }

    public void setName(String nameParam) {

        welcomeText.setText(nameParam);
    }




}