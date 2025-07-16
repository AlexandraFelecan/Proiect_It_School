package Exercitii;

public class Carte {
    String titlu;

    public Carte() {
        titlu = "Exercitii.Carte necunoscută";
    }

    public Carte(String t) {
        titlu = t;
    }

    // Metodă separată de afișare
    public void afiseazaTitlu() {
        System.out.println("Titlul cartii: " + titlu);
    }

    public static void main(String[] args) {
        Carte c1 = new Carte();
        c1.afiseazaTitlu();

        Carte c2 = new Carte("Micul Print");
        c2.afiseazaTitlu();
    }
}
