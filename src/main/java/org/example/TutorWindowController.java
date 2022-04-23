package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

import java.io.IOException;

public class TutorWindowController {

    public TextField twTitleTxt;
    public ImageView twProfileImage;
    public TableView twCriterionTable;
    public TableColumn twCriterionTableCriterion;
    public TableColumn twCriterionPercentage;
    public TableView twSpecsTable;
    public TableColumn twSpecsTableSchool;
    public TableColumn twSpecsTableGrade;
    public TableColumn twSpecsTableAlumn;
    public TableColumn twSpecsTableAge;
    public TableColumn twSpecsTableSession;

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
