package org.example;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;

public class TutorDataMenuController {

    public TextField tdmTitleTxt;
    public ChoiceBox tdmDropBox;
    public ImageView tdmLogo;

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
