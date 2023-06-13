package es.logixs;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Procesador<T> {

    private Function<String,T> transformador;
    private List<String> lineas;
    private List<T> listaRetorno=new ArrayList<T>();

    public Procesador(List<String> lineas ,Function<String, T> transformador) {
        this.transformador = transformador;
        this.lineas=lineas;
    }

    public List<T> transformar() {

        for (String linea :lineas) {

            if (!linea.contains("*")) {
                if (!linea.contains("null"))
                    listaRetorno.add(transformador.apply(linea));
            }

        }
        return listaRetorno;
    }
}
