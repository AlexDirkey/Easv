module com.example.verdensbedstelommeregner {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.verdensbedstelommeregner to javafx.fxml;
    exports com.example.verdensbedstelommeregner;
}