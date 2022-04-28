package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

import java.io.IOException;

public class NewProfileController {

    public TextField npTitleTxt;
    public ImageView npUserProfileImage;
    public TextArea npInputUserLoginTxtBox;

        public TextField userInputTextBox;
        @FXML
    public void switchToSelectFunctionMenu(ActionEvent actionEvent) throws IOException {
            App.setRoot("SelectFunctionMenu");
        }

    public void switchToNewStudent(ActionEvent actionEvent) throws IOException {
                App.setRoot("NewStudent");
            }


    public void switchToNewTutor(ActionEvent actionEvent) throws IOException {
            App.setRoot("NewTutor");
    }
}
