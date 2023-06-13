package es.logixs;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //SRP
        LectorFichero lector = new LectorFichero("datos.txt");
        TransformadorFactura transformador= new TransformadorFactura();
        List<String> lineas = lector.leerLineas();


        List<Factura> facturas= new ArrayList<Factura>();

        for (String linea :lineas) {

            facturas.add(transformador.transformar(linea));
        }


        for (Factura f: facturas) {

            System.out.println(f.getNumero());
            System.out.println(f.getConcepto());
            System.out.println(f.getImporte());
        }

    }
}