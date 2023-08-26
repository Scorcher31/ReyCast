module com.example.raycast {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens com.example.raycast to javafx.fxml;
    exports com.example.raycast;
}