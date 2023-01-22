module sample.test123 {
    requires javafx.controls;
    requires javafx.fxml;
    requires charm.glisten;
    requires java.sql;


    opens sample.test123 to javafx.fxml;
    exports sample.test123;
}