package tema_14_07;

public class Vehicul {
    int vitezaMaxima;

    public Vehicul(int vitezaMaxima) {
        this.vitezaMaxima = vitezaMaxima;
    }
}

class Masina extends Vehicul {
    String marca;

    public Masina(int vitezaMaxima, String marca) {
        super(vitezaMaxima);
        this.marca = marca;
    }

    public void afiseaza() {
        System.out.println("Marca: " + marca + ", Viteza Maxima: " + vitezaMaxima);
    }

    public static void main(String[] args) {
        Masina m = new Masina(220, "Toyota");
        m.afiseaza();
    }
}

