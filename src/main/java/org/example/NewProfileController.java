package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

import java.io.IOException;

public class NewProfileController {

    public TextField npTitleTxt;
    public ImageView npUserProfileImage;
    public Button npNewStudentButton;
    public Button npNewTeacherButton;

    public void switchToNewStudent(ActionEvent actionEvent) throws IOException {
        App.setRoot("NewStudent");
    }
    public void switchToNewTutor(ActionEvent actionEvent) throws IOException {
        App.setRoot("NewTutor");
    }
}


