module com.example.testfinal {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;

    opens com.example.testfinal to javafx.fxml;
    exports com.example.testfinal;
}