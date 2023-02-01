package sample.test123;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Arrays;

public class HelloApplication extends Application {

    private static Stage mainstage;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 467, 567);
        stage.setTitle("Home Page");
        stage.setResizable(false);
        stage.setScene(scene);
        mainstage = stage;
        stage.show();

/*
        JSerialComm jSerialComm = new JSerialComm();
        jSerialComm.openPort("COM4");
        while (true) {
            byte[] data = jSerialComm.readData();
            if (data.length > 0) {
                String s = new String(data);
                System.out.print(s);
            }
        } */


    }


    public static void gotoscreen(String locatie) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(sample.test123.HelloApplication.class.getResource(locatie + ".fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 467, 567);
        mainstage.setTitle("List Page");
        mainstage.setResizable(false);
        mainstage.setScene(scene);
        mainstage.show();
    }


    public static void main(String[] args) {
        launch();
    }
}