module com.example.checkersapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.checkersapp to javafx.fxml;
    exports com.example.checkersapp;
}