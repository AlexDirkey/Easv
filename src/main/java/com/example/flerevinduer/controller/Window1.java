package com.example.flerevinduer.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Window1 {

    private MainWindowController parent;

    @FXML
    private TextField txtName;

  @FXML
    private void onButtonClick(ActionEvent actionEvent) {

        String nameFromTextField = txtName.getText();

        System.out.println(nameFromTextField);

        parent.setName(nameFromTextField);
  }
  public void setParent(MainWindowController parentParam){
      parent = parentParam;
  }
}
