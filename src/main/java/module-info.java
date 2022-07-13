module com.example.java_120522 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.java_120522 to javafx.fxml;
    exports com.example.java_120522;
}