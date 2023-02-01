package sample.test123;

import javafx.fxml.FXML;
import javafx.scene.control.Label;


public class productManuallyTest {
    @FXML
    private Label weightLabel;

    @FXML
    private void getWeight() {
        // Code to communicate with the load cell and get the weight data
        double weight = 10.0; // sample weight data
        weightLabel.setText(String.valueOf(weight));
    }
}