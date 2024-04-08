module org.example.projectruby {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.projectruby to javafx.fxml;
    exports org.example.projectruby;
}