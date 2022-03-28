package com.example.week9_2_64010889;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        //Create pane
        GridPane pane = new GridPane();

        //node
        FileInputStream china_stream = new FileInputStream("F:/KMITL/OOP/LABS/week9/images/china.png");
        FileInputStream uk_stream = new FileInputStream("F:/KMITL/OOP/LABS/week9/images/uk.png");
        FileInputStream canada_streme = new FileInputStream("F:/KMITL/OOP/LABS/week9/images/canada.png");
        FileInputStream usa_stream = new FileInputStream("F:/KMITL/OOP/LABS/week9/images/usa.png");

        Image imageChina = new Image(china_stream);
        Image imageUk = new Image(uk_stream);
        Image imageCanada = new Image(canada_streme);
        Image imageUsa = new Image(usa_stream);

        ImageView imageViewChina = new ImageView(imageChina);
        ImageView imageViewUk = new ImageView(imageUk);
        ImageView imageViewCanada = new ImageView(imageCanada);
        ImageView imageViewUsa = new ImageView(imageUsa);

        //Resize
        imageViewChina.setFitWidth(288);
        imageViewChina.setFitHeight(192);
        imageViewUk.setFitWidth(288);
        imageViewUk.setFitHeight(144);
        imageViewCanada.setFitWidth(288);
        imageViewCanada.setFitHeight(144);
        imageViewUsa.setFitWidth(288);
        imageViewUsa.setFitHeight(144);

        //ใส่ pane
        pane.add(imageViewChina,0,1);
        pane.add(imageViewUk,0,0);
        pane.add(imageViewCanada,1,0);
        pane.add(imageViewUsa,1,1);

        //Create scene
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Exercise_14_01");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}