package es.logixs;

import es.logixs.domain.Factura;

import java.util.List;

public class ImpresoraFacturaGuiones extends ImpresoraFactura{


    void imprimir (List<Factura> lista) {

        for (Factura f :lista) {
            System.out.println("---------------");
            System.out.println(f.getNumero());
            System.out.println(f.getConcepto());
            System.out.println(f.getImporte());
            System.out.println("----------------");
        }
    }
}
