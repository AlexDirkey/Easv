package com.example.calc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField txtValue1;

    @FXML
    private label lblOperator;

    @FMXL
    private TextField getTxtValue1;

    @FMXL
    private Button buttonPlus;

    @FMXL
    private Button buttonMinus;

    @FMXL
    private Button buttonMultiply;

    @FMXL
    private Button buttonDivide;

    @FMXL
    private Button buttonCalc;

    @FMXL
    private Button lblResult;

    public void onPlusOperation (ActionEvent actionEvent){
        lblOperator.setText("+");
    }
    public vod onCalculate (ActionEvent actionEvent) {

        int value1 = Integer.parseInt(txtValue1.getText());
        int value2 = Integer.parseInt(txtValue2.getText());
        if (lblOperator.getText() == "+")
        {
            int result = value1 + value2;
            lblResult.setText(result + "");
        }
        else if (lblOperator == "-")
        {
            int result = value1 - value2;
            lblResult.setText(result + "");
        }
        {
            int result = value1 * value2;
            lblResult.setText(result + "");
        }
        {
            int result = value1 / value2;
            lblResult.setText(result + "");
        }
    }

}