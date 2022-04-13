package org.example;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class LoginScreenController {

    String hardCodedPassword = "RU2004";

    public TextField userInputTextBox;
@FXML
    public void switchToSelectFunctionMenu(ActionEvent actionEvent) throws IOException {

    if(userInputTextBox.getText().equals(hardCodedPassword)){
        App.setRoot("SelectFunctionMenu");
    }
    }
}
