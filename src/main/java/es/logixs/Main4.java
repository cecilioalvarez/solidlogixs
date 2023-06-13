package es.logixs;

import es.logixs.domain.Factura;

import java.util.ArrayList;
import java.util.List;

public class Main4 {
    public static void main(String[] args) {

        //SRP
        LectorFichero lector = new LectorFichero("datos.txt");
        TransformadorFactura transformador = new TransformadorFactura();
        List<String> lineas = lector.leerLineas();


        List<Factura> facturas = new ArrayList<Factura>();

        for (String linea : lineas) {

            facturas.add(transformador.transformar(linea));
        }


        ImpresoraFactura impresora = ImpresoraFactura.getInstance("Ceros");

        impresora.imprimir(facturas);

    }
}