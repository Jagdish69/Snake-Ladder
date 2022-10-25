module com.example.snakelarder {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.snakelarder to javafx.fxml;
    exports com.example.snakelarder;
}