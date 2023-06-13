package es.logixs;

import es.logixs.domain.Factura;

import java.util.List;

public class ImpresoraFacturaCeros extends ImpresoraFactura{


    void imprimir (List<Factura> lista) {

        for (Factura f :lista) {
            System.out.println("000000000000");
            System.out.println(f.getNumero());
            System.out.println(f.getConcepto());
            System.out.println(f.getImporte());
            System.out.println("0000000000000");
        }
    }
}
