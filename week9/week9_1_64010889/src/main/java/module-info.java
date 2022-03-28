module com.example.week9_2_64010889 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.week9_2_64010889 to javafx.fxml;
    exports com.example.week9_2_64010889;
}