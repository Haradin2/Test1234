package sample.test123;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class ScanPage {

    @FXML
    private Button BtBack;

    @FXML
    void GoBack(MouseEvent event) throws IOException {
        HelloApplication.gotoscreen("hello-view");
    }
    @FXML
    void ProductManuallyPage(MouseEvent event) throws IOException {
        HelloApplication.gotoscreen("ProductManuallyPage");
    }
}
