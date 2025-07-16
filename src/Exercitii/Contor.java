package Exercitii;

public class Contor {
    static int numarTotal = 0;

    public Contor() {
        numarTotal++;
    }

    public static void afiseazaNumarTotal() {
        System.out.println("Numar total obiecte: " + numarTotal);
    }

    public static void main(String[] args) {
        Contor c1 = new Contor();
        Contor.afiseazaNumarTotal();

        Contor c2 = new Contor();
        Contor.afiseazaNumarTotal();

        Contor c3 = new Contor();
        Contor.afiseazaNumarTotal();
    }
}
