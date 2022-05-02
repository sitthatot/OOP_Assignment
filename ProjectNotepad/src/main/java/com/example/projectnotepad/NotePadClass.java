package com.example.projectnotepad;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileWriter;

public class NotePadClass {
    NotePadClass(){
        MenuBar menuBar = new MenuBar();

        Menu file = new Menu("File");
        Menu edit = new Menu("Edit");
        Menu format = new Menu("Format");
        Menu view = new Menu("View");
        Menu help = new Menu("Help");

        MenuItem New = new MenuItem("New");
        MenuItem open = new MenuItem("Open");
        MenuItem save = new MenuItem("Save");
        MenuItem saveAs = new MenuItem("Save as");

        file.getItems().addAll(New,open,save,saveAs);
        menuBar.getMenus().addAll(file,edit,format,view,help);

        TextArea textArea = new TextArea();
        textArea.setMaxWidth(600);
        textArea.setMaxHeight(500);

        save.setOnAction(actionEvent -> {
            FileChooser fileChooser = new FileChooser();
            FileChooser.ExtensionFilter ext = new FileChooser.ExtensionFilter("txt files","*.txt");
            File saveFile = fileChooser.showSaveDialog(null);
            try {
                FileWriter fileWriter = new FileWriter(saveFile);
                fileWriter.write(textArea.getText());
                fileWriter.close();
            }catch (Exception ex){
                System.out.println(ex.getMessage());
            }
        });



        GridPane gridPane = new GridPane();
        gridPane.add(menuBar,0,0);
        gridPane.add(textArea,0,1);

        Group group = new Group();
        group.getChildren().add(gridPane);

        Scene scene = new Scene(group);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setMaxWidth(600);
        stage.setMaxHeight(500);
        stage.show();
    }
}
