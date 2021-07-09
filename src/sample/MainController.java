package sample;

import java.util.ArrayList;
import java.util.List;

public class MainController {


    public static List<String> resultadoBusqueda;



    public static void Busqueda() {
        resultadoBusqueda = new ArrayList<>();
        resultadoBusqueda.add("BUSQUEDA 1");
        resultadoBusqueda.add("BUSQUEDA 2");

    }

    public static List<String> getResultadoBusqueda() {
        return resultadoBusqueda;
    }

    public static void setResultadoBusqueda(List<String> resultadoBusqueda) {
        MainController.resultadoBusqueda = resultadoBusqueda;
    }
}
