package es.logixs;

import es.logixs.domain.Factura;

import java.util.List;

public  abstract  class ImpresoraFactura {

    abstract void imprimir (List<Factura> lista) ;
    public  static ImpresoraFactura getInstance(String tipo) {

        ImpresoraFactura impresora=null;

        try {
            impresora=(ImpresoraFactura) Class.forName("es.logixs.ImpresoraFactura"+tipo).newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return impresora;
    }
}
