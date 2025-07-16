package tema_14_07;

//Creează clasa Forma cu metoda aria(). Creează clasele Cerc și Exercitii.Dreptunghi care suprascriu metoda și returnează valorile calculate. Apelează aria() pentru fiecare folosind un vector de tip Forma.
public class Forma {
    public double aria() {
        return 0;
    }

    public static class Cerc extends Forma {
        double raza;

        public Cerc(double r) {
            raza = r;
        }

        @Override
        public double aria() {
            return 3.14 * raza * raza;
        }
    }

    public static class Dreptunghi extends Forma {
        double lungime, latime;

        public Dreptunghi(double l, double L) {
            lungime = l;
            latime = L;
        }

        @Override
        public double aria() {
            return lungime * latime;
        }
    }

    public static class Test {
        public static void main(String[] args) {
            Forma[] forme = new Forma[2];
            forme[0] = new Cerc(3);
            forme[1] = new Dreptunghi(4, 5);

            for (Forma f : forme) {
                System.out.println("Aria este: " + f.aria());
            }
        }
    }
}
