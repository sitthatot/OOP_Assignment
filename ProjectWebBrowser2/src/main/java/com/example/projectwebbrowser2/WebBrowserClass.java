package com.example.projectwebbrowser2;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
import javafx.scene.web.WebHistory;
import javafx.stage.Stage;
import javafx.scene.web.WebView;


public class WebBrowserClass {
    private final WebView webView = new WebView();
    private final TextField urlInput = new TextField();
    private final WebHistory webHistory;

    WebBrowserClass() {
        urlInput.setText("https://www.google.com");
        urlInput.setMaxWidth(2000);
        urlInput.setMinWidth(300);
        webView.getEngine().load(urlInput.getText());
        webHistory = webView.getEngine().getHistory();

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setVgap(8);
        gridPane.setHgap(10);
        Scene scene = new Scene(gridPane, 1270, 720);
        Stage stage = new Stage();
        webView.prefHeightProperty().bind(stage.heightProperty());
        webView.prefWidthProperty().bind(stage.widthProperty());

        urlInput.setOnKeyPressed(event -> {
            if (event.getCode().equals(KeyCode.ENTER)) {
                System.out.println("Search! by enter");
                loadUrl();
            }
        });

        webView.getEngine().locationProperty().addListener((ov, oldstr, newstr) -> {
            urlInput.setText(newstr);
            System.out.println("work");
        });
        webView.setOnKeyPressed(event -> {
            if (event.getCode().equals(KeyCode.F5)) {
                System.out.println("refresh");
                webView.getEngine().reload();
            }
        });
        Button home = new Button("HOME");
        home.setPrefWidth(100);
        home.setOnAction(actionEvent -> {
            System.out.println("Home");
            webView.getEngine().load("https://www.google.com");
        });

        Button backward = new Button("<-");
        backward.setPrefWidth(100);
        backward.setVisible(true);
        backward.setOnAction(actionEvent -> {
            System.out.println("<-");
            webHistory.go(-1);
        });

        Button forward = new Button("->");
        forward.setPrefWidth(100);
        forward.setOnAction(actionEvent -> {
            System.out.println("->");
            webHistory.go(1);
        });

        Button search = new Button("Search");
        search.setPrefWidth(100);
        search.setOnAction(actionEvent -> {
            System.out.println("Search!");
            loadUrl();
        });

        MenuBar menuBar = new MenuBar();
        menuBar.setPrefWidth(110);
        Menu more = new Menu("More");
        MenuItem sourceCode = new MenuItem("Source code");
        MenuItem refresh = new MenuItem("Refresh");
        more.getItems().addAll(sourceCode, refresh);
        menuBar.getMenus().addAll(more);

        sourceCode.setOnAction(actionEvent -> {
            try {
                System.out.println("View src code");
                showText("Source of " + webView.getEngine().getTitle(), stage,
                        (String) webView.getEngine().executeScript("document.documentElement.outerHTML"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());

            }
        });

        refresh.setOnAction(actionEvent -> {
            try {
                System.out.println("refreshing web");
                webView.getEngine().reload();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        });

        urlInput.setPrefWidth(1600);
        GridPane.setConstraints(home, 0, 0);
        GridPane.setConstraints(backward, 1, 0);
        GridPane.setConstraints(forward, 2, 0);
        GridPane.setConstraints(urlInput, 3, 0);
        GridPane.setConstraints(search, 4, 0);
        GridPane.setConstraints(menuBar, 5, 0);
        GridPane.setConstraints(webView, 0, 1, 6, 1);
        gridPane.getChildren().addAll(home, backward, forward, urlInput, search, menuBar, webView);

        stage.setScene(scene);
        stage.setFullScreen(true);
        stage.setTitle("Cheezy Broswer");
        stage.show();
    }

    private void showText(String title, Stage stage, String text) {
        TextArea root = new TextArea(text);
        Scene secondScene = new Scene(root, 700, 600);
        Stage secondStage = new Stage();
        secondStage.setTitle(title);
        secondStage.setScene(secondScene);
        secondStage.initOwner(stage);
        secondStage.show();
    }

    private void loadUrl() {
        String URL = urlInput.getText();
        if (!URL.contains(".")) {
            webView.getEngine().load("https://www.google.com/search?q=" + URL);
        } else if (!URL.startsWith("http://") && !URL.startsWith("https://")) {
            URL = "https://" + URL;
            webView.getEngine().load(URL);
        }
    }
}

