module com.example.projectwebbrowser2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;


    opens com.example.projectwebbrowser2 to javafx.fxml;
    exports com.example.projectwebbrowser2;
    exports javaApp;
}