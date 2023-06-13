package es.logixs;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {


        LectorFichero lector = new LectorFichero("datos3.txt");
        TransformadorPersona transformador= new TransformadorPersona();
        List<String> lineas = lector.leerLineas();
        List<Persona> personas= new ArrayList<Persona>();
        Procesador<Persona> procesador= new Procesador<Persona>(lineas,transformador::transformar);

        personas= procesador.transformar();

        for (Persona p: personas) {

            System.out.println(p.getNombre());
            System.out.println(p.getApellidos());
            System.out.println(p.getEdad());
        }

    }
}