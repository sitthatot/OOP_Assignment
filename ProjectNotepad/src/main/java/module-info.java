module com.example.projectnotepad {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.projectnotepad to javafx.fxml;
    exports com.example.projectnotepad;
}