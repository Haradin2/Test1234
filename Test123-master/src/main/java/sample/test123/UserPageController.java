package sample.test123;

import com.gluonhq.charm.glisten.control.BottomNavigationButton;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class UserPageController {

    @FXML
    private BottomNavigationButton BtShop;

    @FXML
    private BottomNavigationButton BtHome;

    @FXML
    private BottomNavigationButton BtUser;

    @FXML
    void GoToUser(MouseEvent event) throws IOException {
    HelloApplication.gotoscreen("userpage");
    }

    @FXML
    void GotoHome(MouseEvent event) throws IOException {
        HelloApplication.gotoscreen("hello-view");
    }

    @FXML
    void Gotoshop(MouseEvent event) throws IOException {
        HelloApplication.gotoscreen("list page");
    }

}
