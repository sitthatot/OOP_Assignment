package com.example.projectwebbrowser2;

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class MainClass extends Application {
    public void start(Stage primaryStage) throws IOException {
        WebBrowserClass webBrowserClass = new WebBrowserClass();

    }

    public static void main(String[] args) {
        launch();
    }
}
