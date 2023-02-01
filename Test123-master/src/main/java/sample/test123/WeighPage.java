package sample.test123;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.TextFlow;

import java.io.IOException;

public class WeighPage {

    @FXML
    private Button BtKilo;

    @FXML
    private TextField WeighBox;

    @FXML
    private Button BtBack;

    @FXML
    void Goback(MouseEvent event) throws IOException {
        HelloApplication.gotoscreen("hello-view");
    }
    @FXML
    void StartReading(ActionEvent event) {
        JSerialComm jSerialComm = new JSerialComm();
        jSerialComm.openPort("COM4");
            byte[] data = jSerialComm.readData();
            if (data.length > 0) {
                String s = new String(data);
                WeighBox.setText(s);
            }
        jSerialComm.closePort();
    }
}
