package sample;

import java.util.ArrayList;
import java.util.List;

public class MainController {


    public static List<String> resultadoBusqueda;
    public static Integer seleccionBusqueda;



    public static void Busqueda() {
        resultadoBusqueda = new ArrayList<>();
        resultadoBusqueda.add("BUSQUEDA 1");
        resultadoBusqueda.add("BUSQUEDA 2");

    }

    public static String getCodigoSeleccionado() {
        return resultadoBusqueda.get(seleccionBusqueda);
    }

    public static List<String> getResultadoBusqueda() {
        return resultadoBusqueda;
    }

    public static void setResultadoBusqueda(List<String> resultadoBusqueda) {
        MainController.resultadoBusqueda = resultadoBusqueda;
    }

    public static Integer getSeleccionBusqueda() {
        return seleccionBusqueda;
    }

    public static void setSeleccionBusqueda(Integer seleccionBusqueda) {
        MainController.seleccionBusqueda = seleccionBusqueda;
    }
}
