package tema_14_07;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

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
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String formattedDate = sdf.format(date);
        System.out.println("tema_14_07.Factura cu nr: " + nrFactura + " in valoare de: " + valoare +" lei din data de " + formattedDate);
    }

    public static void main(String[]args){
        Factura f = new Factura("F124", 250.55, LocalDate.now());
        f.afiseazaFactura();
    }
}
