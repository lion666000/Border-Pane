module com.example.border_styl {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.border_styl to javafx.fxml;
    exports com.example.border_styl;
}