package com.example.projectnotepad;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainClass extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        NotePadClass notePadClass = new NotePadClass();
    }

    public static void main(String[] args) {
        launch();
    }
}