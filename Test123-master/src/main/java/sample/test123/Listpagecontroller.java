package sample.test123;

import com.gluonhq.charm.glisten.control.BottomNavigationButton;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class Listpagecontroller {

    @FXML
    private BottomNavigationButton BtHome;

    @FXML
    private BottomNavigationButton BtUser;

    @FXML
    private ListView<String> ListItem01;

    @FXML
    private ListView<String> ListItem02;

    @FXML
    private Label Label02;

    @FXML
    private Label Label01;

    @FXML
    private Label Label03;

    @FXML
    private ListView<String> ListItem03;

    @FXML
    void GotoHome(MouseEvent event) throws IOException {
        HelloApplication.gotoscreen("hello-view");

    }

    @FXML
    void Gotoshop(MouseEvent event) throws IOException {
        HelloApplication.gotoscreen("List page");
    }

}
