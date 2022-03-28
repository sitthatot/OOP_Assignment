package com.example.week9_4_64010889;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.input.KeyCode;

import java.io.IOException;

public class HelloApplication extends Application {
        @Override // Override the start method on the Application class
        public void start(Stage primaryStage) {
            // Create a car
            CarPane pane = new CarPane();

            // Create and register handles
            pane.setOnMousePressed(e -> pane.pause());
            pane.setOnMouseReleased(e -> pane.play());

            pane.setOnKeyPressed(e -> {
                if (e.getCode() == KeyCode.UP) {
                    pane.increaseSpeed();
                }
                else if (e.getCode() == KeyCode.DOWN) {
                    pane.decreaseSpeed();
                }
            });

            // Create a scene and place it in the stage
            Scene scene = new Scene(pane, 600, 100);
            primaryStage.setTitle("Exercise_15_29"); // Set the stage title
            primaryStage.setScene(scene); // Place the scene in the stage
            primaryStage.show(); // Display the stage

            pane.requestFocus(); // Request focus
        }

    public static void main(String[] args) {
        launch();
    }
}