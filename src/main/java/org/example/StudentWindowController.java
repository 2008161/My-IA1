package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

import java.io.IOException;

public class StudentWindowController {

    public TextField swTitleTxt;
    public ImageView swProfileImage;
    public TableView swAttributesTable;
    public TableColumn swTableSchoolAttribute;
    public TableColumn swTableGradeAttribute;
    public TableColumn swTableTutorAttribute;
    public TableColumn swTableAgeAttribute;
    public TableColumn swTableSessionAttribute;

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
    public void switchToLoginScreen(ActionEvent actionEvent) throws IOException {
        App.setRoot("LoginScreen");
    }

    public void switchToChangeUser(ActionEvent actionEvent) throws IOException {
        App.setRoot("ChangeUser");
    }
}
