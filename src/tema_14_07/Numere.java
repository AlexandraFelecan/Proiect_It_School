package tema_14_07;

// Creează o metodă sumaPare(int[] numere) care parcurge un array și adună toate numerele pare folosind for.
// Creează o metodă care afișează “Număr: X” pentru fiecare număr de la 1 la 5, folosind while.
// Creează o metodă mediaPozitivelor(int[] valori) care returnează media numerelor pozitive dintr-un array.
public class Numere {

    public static int sumaPare(int[] numere) {
        int suma = 0;
        for (int i = 0; i < numere.length; i++) {
            if (numere[i] % 2 == 0) {
                suma += numere[i];
            }
        }
        return suma;
    }

    public void afiseazaNumere() {
        int i = 1;
        while (i <= 5) {
            System.out.println("Număr: " + i);
            i++;
        }
    }

    public double mediaPozitivelor(int[] valori) {
        int suma = 0;
        int contor = 0;

        for (int i = 0; i < valori.length; i++) {
            if (valori[i] > 0) {
                suma = suma + valori[i];
                contor = contor + 1;
            }
        }

        if (contor == 0) {
            return 0;
        }

        return (double) suma / contor;
    }

    public static void main(String[] args) {
        int[] valori = {6, 22, 10, 18};
        int rezultat = sumaPare(valori);
        System.out.println("Suma numerelor pare este: " + rezultat);

        Numere n = new Numere();
        n.afiseazaNumere();

        Numere pozitive = new Numere();
        int[] sir = { 2, -1, 4, 0, -5, 3 };
        System.out.println("Media numerelor pozitive este: " + pozitive.mediaPozitivelor(sir));

    }
}
