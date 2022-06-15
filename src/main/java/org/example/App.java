package org.example;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    public static ObservableList<Student> students = FXCollections.observableArrayList();
    public static ObservableList<Tutor> tutors = FXCollections.observableArrayList();
    public static int chosenStudent =0;

    @Override
    public void start(Stage stage) throws IOException {
        loadStudents();
        scene = new Scene(loadFXML("LoginScreen"));
        stage.setScene(scene);
        stage.show();
    }

    private void loadStudents() throws IOException {
        //load students from saved file
        //open and read Json for any previously saved data
        Gson gson = new Gson();
        try (Reader reader = new FileReader("students.json")) {
            // convert JSON file to Java Object
            ArrayList<Student> imports = gson.fromJson(reader, new TypeToken<ArrayList<Student>>() {
            }.getType());
            students = FXCollections.observableArrayList(imports);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}