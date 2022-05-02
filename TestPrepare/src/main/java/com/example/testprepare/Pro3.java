package com.example.testprepare;

import javafx.application.Application;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.File;
import java.io.IOException;

public class Pro3 extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Media media = new Media(new File("F:\\KMITL\\OOP\\TestPrepare\\2U_intro.mp4").toURI().toURL().toExternalForm());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        MediaView mediaView = new MediaView(mediaPlayer);
        mediaView.fitWidthProperty().bind(stage.widthProperty());
        mediaPlayer.play();
        Button rewind = new Button("<<");
        rewind.setOnAction(actionEvent -> {
            mediaPlayer.seek(Duration.ZERO);
        });

        Button play = new Button("||");

        play.setOnAction(actionEvent -> {
            if(play.getText().equals(">")){
                mediaPlayer.play();
                play.setText("||");
            }
            else {
                mediaPlayer.pause();
                play.setText(">");
            }
        });

        Label label = new Label("Volume");

        Slider volumeSlider = new Slider();
        volumeSlider.setOrientation(Orientation.VERTICAL);
        volumeSlider.setValue(mediaPlayer.getVolume() * 100);
        volumeSlider.valueProperty().addListener(new InvalidationListener() {
            @Override
            public void invalidated(Observable observable) {
                mediaPlayer.setVolume(volumeSlider.getValue() / 100);
            }
        });

        Label volumeValue = new Label(Double.toString(volumeSlider.getValue()));
        volumeSlider.valueProperty().addListener(new ChangeListener<Number>() {
            public void changed(ObservableValue<? extends Number> ov, Number old_val, Number new_val) {
                volumeValue.setText(String.format("%0f", new_val));
            }
        });

        HBox controlPanel = new HBox(20);
        controlPanel.getChildren().addAll(rewind,play,label,volumeSlider,volumeValue);
        controlPanel.setAlignment(Pos.CENTER);

        VBox VideoScreen = new VBox(20);
        VideoScreen.getChildren().addAll(mediaView,controlPanel);

        Scene scene = new Scene(VideoScreen, 1200, 800);
        stage.setTitle("Sittha MediaPlayer");
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch();
    }
}