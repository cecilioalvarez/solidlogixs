package es.logixs;

import java.util.ArrayList;
import java.util.List;

public class FormateadorFacturas {

    public List<String> format(List<String> lineas, String delimitador) {

        List<String> nuevasLineas = new ArrayList<>();

        for (String linea : lineas) {

            nuevasLineas.add(delimitador + linea + delimitador);
        }
        return nuevasLineas;
    }
}

