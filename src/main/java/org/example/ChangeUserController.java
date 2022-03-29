package org.example;

import javafx.fxml.FXML;

import java.io.IOException;

public class ChangeUserController {

    @FXML
    public void switchToSelectFunctionMenu() throws IOException {
        App.setRoot("SelectFunctionMenu");
    }
}
