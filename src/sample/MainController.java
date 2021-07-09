package sample;

import java.util.ArrayList;
import java.util.List;

public class MainController {
    private static MainController instancia = null;

    public static List<String> resultadoBusqueda;

    public MainController() {

    }

    public List<String> resultadoBusqueda() {
        resultadoBusqueda = new ArrayList<>();
        resultadoBusqueda.add("BUSQUEDA 1");
        resultadoBusqueda.add("BUSQUEDA 2");
        return resultadoBusqueda;
    }

    public static MainController getInstance()
    {
        if (instancia == null)
            instancia = new MainController();

        return instancia;
    }
}
