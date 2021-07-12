package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ResulBusq implements Initializable {

    @FXML
    ListView listaBusqueda;



    @Override
    public void initialize(URL location, ResourceBundle resources) {

        listaBusqueda.getItems().addAll(MainController.resultadoBusqueda);


    }

    public void MouseClick(MouseEvent event) {
        if (event.getClickCount() == 2) {
            int id = listaBusqueda.getSelectionModel().getSelectedIndex();
            System.out.println(MainController.resultadoBusqueda.get(id));
            MainController.setSeleccionBusqueda(id);

            ((Node)(event.getSource())).getScene().getWindow().hide();


        }
    }


}
