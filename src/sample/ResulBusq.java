package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class ResulBusq implements Initializable {

    @FXML
    ListView listaBusqueda;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        listaBusqueda.getItems().addAll(MainController.resultadoBusqueda);


    }
}
