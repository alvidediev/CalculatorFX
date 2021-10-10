package main;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

public class MainWindowController implements Initializable {
    @FXML private Pane titlePane;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        titlePane.setOnMousePressed(mouseEvent -> {

        });
        titlePane.setOnMouseDragged(mouseEvent -> {
            
        });

    }
}
