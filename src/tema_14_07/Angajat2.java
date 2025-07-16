package tema_14_07;

/*Creează clasa Angajat cu metoda afiseazaFunctie(). Creează clasele Programator și Tester care o suprascriu.
 Creează un vector de Angajat cu obiecte diferite și apelează metoda pentru fiecare.*/

public class Angajat2 {

    public void afiseazaFunctie() {
        System.out.println("Angajat");
    }

    static class Programator extends Angajat2 {
        @Override
        public void afiseazaFunctie() {
            System.out.println("Programator");
        }
    }

    static class Tester extends Angajat2 {
        public void afiseazaFunctie() {
            System.out.println("Tester");
        }
    }

    public static void main(String[] args) {
        Angajat2[] angajati = new Angajat2[3];
        angajati[0] = new Programator();
        angajati[1] = new Tester();
        angajati[2] = new Angajat2();

        for (int i = 0; i < angajati.length; i++) {
            angajati[i].afiseazaFunctie();
        }
    }
}