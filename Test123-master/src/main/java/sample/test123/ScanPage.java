package sample.test123;


import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class ScanPage {

    @FXML
    void GoBack(MouseEvent event) throws IOException {
        HelloApplication.gotoscreen("hello-view");
    }

}
