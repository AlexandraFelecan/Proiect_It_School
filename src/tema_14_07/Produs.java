package tema_14_07;
// Creează o clasă Produs cu final String codProdus, inițializat în constructor. Creează și o metodă afiseazaDetalii(). În main(), încearcă să modifici codul (trebuie să apară eroare).
public class Produs {

    final String codProdus;

    public Produs(String codProdus) {
        this.codProdus = codProdus;
    }

    public void afiseazaDetalii(){
        System.out.println("Cod produs: " + codProdus);
    }

    public static void main(String[] args){
        Produs p = new Produs("XYZ254475");
        p.afiseazaDetalii();

//        p.codProdus = "ABC658465";
    }
}
