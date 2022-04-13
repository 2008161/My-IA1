package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;

public class ChangeUserController {

        public TextField userInputTextBox;
        @FXML
    public void switchToSelectFunctionMenu(ActionEvent actionEvent) throws IOException {
        App.setRoot("SelectFunctionMenu");
    }
}
