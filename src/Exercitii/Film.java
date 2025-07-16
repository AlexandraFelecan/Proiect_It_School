package Exercitii;

public class Film {
    String titlu;
    double rating;

    public Film(String t) {
        titlu = t;
        rating = 0;
    }

    public Film(String t, double r) {
        titlu = t;
        rating = r;
    }

    public void afiseazaFilm() {
        System.out.println("Exercitii.Film: " + titlu + ", Rating: " + rating);
    }

    public static void main(String[] args) {
        Film f1 = new Film("Interstellar");
        f1.afiseazaFilm();

        Film f2 = new Film("Inception", 9.0);
        f2.afiseazaFilm();
    }
}
