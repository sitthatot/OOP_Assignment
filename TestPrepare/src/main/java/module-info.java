module com.example.testprepare {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;


    opens com.example.testprepare to javafx.fxml;
    exports com.example.testprepare;
}