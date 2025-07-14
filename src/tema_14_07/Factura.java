package tema_14_07;

import java.time.LocalDate;

public class Factura {

    String nrFactura;
    double valoare;
    LocalDate data;

    public Factura (String nr, double val, LocalDate d){
        nrFactura = nr;
        valoare = val;
        data = d;
    }

    public void afiseazaFactura(){
        System.out.println("tema_14_07.Factura cu nr: " + nrFactura + " in valoare de: " + valoare +" lei din data de " + data);
    }

    public static void main(String[]args){
        Factura f = new Factura("F124", 250.55, LocalDate.now());
        f.afiseazaFactura();
    }
}
