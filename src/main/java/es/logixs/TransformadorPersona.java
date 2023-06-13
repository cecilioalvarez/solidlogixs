package es.logixs;

import java.util.ArrayList;
import java.util.List;

public class TransformadorPersona {
    public  Persona transformar(String linea) {
            String[] datos = linea.split("\\|");
            return  new Persona(datos[0], datos[1], Integer.parseInt(datos[2]));
        }
}
