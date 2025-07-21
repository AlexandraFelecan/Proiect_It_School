package exercitii_16_07;

import java.util.Scanner;

/*


4. Citește un număr și calculează suma cifrelor pare și suma cifrelor impare separat.
5. Afișează doar valorile distincte dintr-un array (ignorând duplicatele).
6. Citește 3 numere și verifică dacă pot forma un triunghi valid (condiție: suma oricăror 2 laturi > a treia).
 */
public class Exercitii {

    public static void main(String[]args){

        // 1. Citește un număr N de la tastatură și afișează toate pătratele perfecte ≤ N (ex: 1, 4, 9, 16…).
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdu un numar N:");
        int N = sc.nextInt();

        System.out.println("Patrate perfect <= cu " + N + ":");
        for (int i = 1; i * i <= N; i++){
            System.out.println(i * i);
        }

        // 2. Citește un array de n numere întregi și identifică numărul cu cea mai mare frecvență (și câte ori apare).
        System.out.println(" Introdu numere: ");
        int n = sc.nextInt();
        int[] numere = new int[n];
        System.out.println("Introdu " + n + " numere:");
        for (int i = 0; i < n; i++) {
            numere[i] = sc.nextInt();
        }

        int maxFrecventa = 0;
        int celMaiFrecvent = numere[0];

        for (int i = 0; i < n; i++) {
            int frecventa = 0;
            for (int j = 0; j < n; j++) {
                if (numere[i] == numere[j]) {
                    frecventa++;
                }
            }
            if (frecventa > maxFrecventa) {
                maxFrecventa = frecventa;
                celMaiFrecvent = numere[i];
            }
        }

        System.out.println("Numărul cu cea mai mare frecvență este: " + celMaiFrecvent);
        System.out.println("Apare de " + maxFrecventa + " ori.");

        // 3. Verifică dacă un număr introdus are doar cifre pare (ex: 248 – valid, 123 – invalid).



        sc.close();
    }

}
