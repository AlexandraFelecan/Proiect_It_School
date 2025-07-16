package Exercitii;

public class Masina {
    String marca;
    int an;

    public Masina(String m, int a) {
        marca = m;
        an = a;
    }

    public void afiseazaDetalii() {
        System.out.println("Exercitii.Masina: " + marca + ", An: " + an);
    }

    public static void main(String[] args) {
        Masina m = new Masina("Dacia", 2022);
        m.afiseazaDetalii();
    }
}

