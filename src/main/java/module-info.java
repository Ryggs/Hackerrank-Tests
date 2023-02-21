module com.example.hackerrank {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hackerrank to javafx.fxml;
    exports com.example.hackerrank;
}