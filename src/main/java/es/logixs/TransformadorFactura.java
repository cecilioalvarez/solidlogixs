package es.logixs;

import es.logixs.domain.Factura;

public class TransformadorFactura {
    public Factura transformar(String linea) {
            String[] datos = linea.split(",");
            return new Factura(Integer.parseInt(datos[0]), datos[1], Double.parseDouble(datos[2]));
    }
}
