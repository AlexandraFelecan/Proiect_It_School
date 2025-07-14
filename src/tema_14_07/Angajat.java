package tema_14_07;

public class Angajat {

    String nume;
    String functie;
    double salariu;

    public Angajat(String n, String f, double s) {
        nume = n;
        functie = f;
        salariu = s;
    }

    public void calculeazaBonus() {
        double bonus;
        if (functie.equals("Manager")) {
            bonus = salariu * 0.10;
        } else {
            bonus = salariu * 0.05;
        }
        double salariuTotal = salariu + bonus;
        System.out.println("Salariul total pentru " + nume + " este: " + salariuTotal);
    }

    public static void main(String[] args) {
        Angajat a1 = new Angajat("Ion Ionescu", "Manager", 5000);
        Angajat a2 = new Angajat("Maria Marinescu", "Tester", 4000);

        a1.calculeazaBonus();
        a2.calculeazaBonus();
    }
}
