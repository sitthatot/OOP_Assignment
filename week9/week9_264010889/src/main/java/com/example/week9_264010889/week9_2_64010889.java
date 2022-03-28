package com.example.week9_264010889;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.control.TextField;
import javafx.geometry.Insets;

import java.io.IOException;

public class week9_2_64010889 extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        GridPane pane = new GridPane();
        pane.setPadding(new Insets(5,5,5,5));
        //เว้นบนล่าง แต่ละช่อง
        pane.setHgap(10);
        pane.setVgap(10);

        for (int i = 0; i < 10; i++) {//Column
            for (int j = 0; j < 10; j++) {//Row
                TextField text = new TextField();//สร้าง text box
                text.setPrefColumnCount(1);//ความกว้างกล่อง อ้างจากขนาด character
                text.setText(String.valueOf((int)(Math.random()*2)));//เลข 2 ตัว 0 กับ 1
                pane.add(text, i, j);//coordinate
            }
        }

        Scene scene = new Scene(pane);
        primaryStage.setTitle("Exercise_14_07");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}