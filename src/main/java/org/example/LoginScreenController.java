package org.example;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class LoginScreenController {

    public TextField userInputTextBox;
@FXML
    public void switchToSelectFunctionMenu(ActionEvent actionEvent) throws IOException {
        App.setRoot("FunctionMenu");
    }
}
