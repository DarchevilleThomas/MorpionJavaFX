module org.morpion{
    requires javafx.controls;
    requires javafx.fxml;

    opens org.morpion to javafx.fxml;
    exports org.morpion;
}