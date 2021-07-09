package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

public class Buscador implements Initializable {

    @FXML
    TextField Texto;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void buscar() {
        if (!Texto.getText().isEmpty()) {
            MainController.Busqueda();
        }
    }
}
