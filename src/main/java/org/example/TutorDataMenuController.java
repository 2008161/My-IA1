package org.example;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class TutorDataMenuController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }

    public void switchToSelectFunctionMenu(ActionEvent actionEvent) {
    }
    public void switchToLoginScreen(ActionEvent actionEvent) throws IOException {
        App.setRoot("LoginScreen");
    }

    public void switchToChangeUser(ActionEvent actionEvent) throws IOException {
        App.setRoot("ChangeUser");
    }
}
