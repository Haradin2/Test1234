package sample.test123;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class ProductManually {

    @FXML
    private Button BtKilo;



    @FXML
    private Button BtBack;

    @FXML
    void Goback(MouseEvent event) throws IOException {
        HelloApplication.gotoscreen("hello-view");
    }
    @FXML
    void ProductManuallyPage(MouseEvent event) throws IOException {
        HelloApplication.gotoscreen("ProductManuallyPage");
    }

}
