package Exercitii;

import java.time.LocalDate;
import java.util.Scanner;

public class Exercitii {
    //class Exercitii.Dreptunghi {
//
//    int calcAria(int lungime, int latime) {
//        return lungime * latime;
//    }
//}
//
//class Temperatura {
//    double transforma(double celsius) {
//        return (celsius * 9 / 5) + 32;
//    }
//}
//
//class Banca {
//    double sold = 0;
//
//    void depoziteaza(double suma) {
//        sold = sold + suma;
//    }
//
//    void retrage(double suma) {
//        sold = sold - suma;
//    }
//}
//
//class Examen {
//    double faMedia(double a, double b, double c){
//        return (a+b+c)/3;
//    }
//}
//
//class Timp {
//    String transforma(int minute) {
//        int ore = minute / 60;
//        int min = minute % 60;
//        return ore + "h" + min + "min";
//    }
//}
//
//class PretTVA {
//    double calculeazaTVA(double pretBrut) {
//        return pretBrut * 1.19;
//    }
//}

    //class Vehicul{
//    void ruleaza(){
//        System.out.println("Vehiculul se deplaseaza");
//    }
//}
//
//class Exercitii.Masina extends Vehicul{
//    void accelereaza(){
//        System.out.println("Exercitii.Masina accelereaza");
//    }
//}
//
//class Electrica extends Exercitii.Masina{
//    void incarca (){
//        System.out.println("Exercitii.Masina electrica se incarca");
//    }
//}
//class Exercitii.Persoana {
//    double media;
//}
//
//class Elev extends Exercitii.Persoana {
//    void afiseazaMedia() {
//        if (media >= 5.0) {
//            System.out.println("Promovat!");
//        } else {
//            System.out.println("Nepromovat!");
//        }
//    }
//}
//
//class Bateria {
//    int bateria;
//    int nivel;
//
//    void calculeazaBateria() {
//        if (nivel < bateria * 0.20) {
//            System.out.println("Baterie sub 20%!");
//        } else {
//            System.out.println("Baterie suficienta");
//        }
//    }
//}
//
//class Vehicul {
//
//    String tipVehicul(int roti) {
//        switch (roti) {
//            case 2:
//                return "Motocicletă";
//            case 3:
//                return "Mototriciclu";
//            case 4:
//                return "Mașină";
//            case 6:
//                return "Camion mic";
//            case 8:
//                return "Camion mare";
//            default:
//                return "Necunoscut";
//        }
//    }
//}
//
//class Angajat {
//    void calculeazaBonus(double salariu, int vechimeAni) {
//        double bonus;
//        if (vechimeAni > 5) {
//            bonus = salariu * 0.20;
//        } else {
//            bonus = salariu * 0.10;
//        }
//        System.out.println("Bonusul este: " + bonus);
//    }
//}
//
//class Exercitii.Student {
//    void verificareBursa(double media) {
//        if (media >= 8.5) {
//            System.out.println("Studentul primeste bursa!");
//        } else {
//            System.out.println("Studentul nu primeste bursa!");
//        }
//    }
//}
//
//class Magazin {
//    double calculeazaTotal(double[] preturi) {
//        double total = 0;
//        for (int i = 0; i < preturi.length; i++) {
//            total += preturi[i];
//        }
//        return total;
//    }
//}
//
//class Dispozitiv {
//    int procentBaterie;
//
//    void verificaBaterie() {
//        if (procentBaterie < 15) {
//            System.out.println("Avertisment: Bateria este sub 15%!");
//        } else {
//            System.out.println("Bateria este suficientă.");
//        }
//    }
//}
//
//class Autobuz {
//    int pasageri;
//    int capacitate;
//
//    void verificaStare() {
//        if (pasageri == 0) {
//            System.out.println("Autobuzul este gol");
//        } else if (pasageri <= capacitate / 2) {
//            System.out.println("Autobuzul este pe jumătate");
//        } else {
//            System.out.println("Autobuzul este plin");
//        }
//    }
//}

       /*  //if(conditia){}
        int nota = 10;
        if (nota >= 5 && nota < 9) {
            System.out.println("Esti admins!");
        } else if (nota == 9) {
            System.out.println("Esti admis cu felicitari!");
        } else if (nota == 10) {
            System.out.println("Esti admis! Esti primul pe tara!");
        } else {
            System.out.println("Esti respins!");
        }

        int varsta = 16;
        String acces = (varsta>=18) ? "Permis":"Interzis";
        System.out.println(acces); */

    // switch (valoare){
    // case valoare:1
    // break;
    // case valoare 2:
    //brake
    //default;
    // }

      /*  int zi = 5;
        switch (zi) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Thursday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Unknown day");
        } */

    //while(conditia){
    // }
      /*  int i = 1;
        while(i<=5){
            System.out.println("i= " + i);
            i++;
            System.out.println("dupa incrementare: " + i);
        } */

    //do { code....
    // } while (conditie);

     /*   int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i<4);
        */
    // for (int i = start; conditie; actualizare){
    // }
      /*  for (int i = 5; i>=0; i--){
            System.out.println("Pasul este: " + i);
        } */

       /* int numar = 15;
        if (numar > 0) {
            System.out.println(numar + " este un numar intreg pozitiv");
        } else if (numar < 0) {
            System.out.println(numar + " este un numar negativ");
        } else {
            System.out.println(numar + " este zero");
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println("Valoarea este: " + i);
        }

        int number = 1;
        int suma = 0;

        do {
            suma += number;
            number++;
        } while (number <= 100);
        System.out.println("Suma numerelor de la 1 la 100 este: " + suma);

        String litera = "e";
        switch (litera) {
            case "a", "e", "i", "o", "u":
                System.out.println("Este o vocală.");
                break;
            default:
                System.out.println("Este o consoană.");
        }

        if (numar % 3 == 0 && numar % 5 == 0) {
            System.out.println("Numărul este divizibil atât cu 3, cât și cu 5.");
        } else {
            System.out.println("Numărul NU este divizibil cu ambele.");
        }

        if (numar <= 12) {
            System.out.println("Copil");
        } else if (numar >= 13 && numar <= 17) {
            System.out.println("Adolescent");
        } else if (numar >= 18) {
            System.out.println("Adult 18+");
        } else {
            System.out.println("Varsta este invalida");
        }

        int x = 1;
        do {
            System.out.println(x);
            x++;
        } while (x <= 5); */

//        int[] note = {8, 9, 5, 4, 10};
//        for (int i = 0; i<note.length; i++){
//            System.out.println("Nota: " + note[i]);
//        }

//        String[] culori = {"Rosu", "Verde", "Albastru", "Roz", "Galben"};
//        String cautat = "Galben";
//
//        for(int i = 0; i<culori.length; i++){
//            if(culori[i].equals(cautat)){
//                System.out.println("Elementul " + cautat + " se afla la indexul: " + i);
//                break;
//            }
//        }
//        int[][] matrice = {
//                {10, 20, 70},
//                {30, 40, 80},
//                {50, 60, 90}
//        };
//        int cautat = 80;
//        for (int i = 0; i < matrice.length; i++) {
//            for (int j = 0; j < matrice[i].length; j++) {
//                if (matrice[i][j] == cautat) {
//                    System.out.println("Elementul " + cautat + " se afla la indexul:  [" + i + "][" + j + "]");
//                }
//            }
//            System.out.println();
//        }

    // for-each
//        String[] animale = {"Pisica", "Caine", "Cal", "Soim"};
//        animale[3] = "Porumbel";
//        for (String animal : animale) {
//            System.out.println("Exercitii.Animal: " + animal);
//        }

//        try {
//            int val = 10 / 0;
//            System.out.println(val);
//        } catch (ArithmeticException e) {
//            System.out.println("Aritmetica invalida");
//        } catch (NullPointerException e) {
//            System.out.println("Variabila este nula");
//        }

//        try (FileWriter fw = new FileWriter("exemplu.txt")) {
//            fw.write("Linia1\nLinia2\nLinia3");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        try {
//            FileWriter fw = new FileWriter("exemplu2.txt");
//            fw.write("Linia1\nLinia2\nLinia3");
//            {
//                fw.close();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            Scanner sc = new Scanner(new File("exemplu.txt"));
//            while (sc.hasNextLine()) {
//                System.out.println(sc.nextLine());
//            }
//            sc.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        File f = new File("exemplu2.txt");
//        if (f.exists() && f.delete()) {
//        }
//        System.out.println("Fisierul a fost sters");

//        String linieDeSters = "Exercitii.Masina";
//        try {
//            File input = new File("exemplu.txt");
//            File temp = new File("temp.txt");
//
//            BufferedReader reader = new BufferedReader(new FileReader(input));
//            BufferedWriter writer = new BufferedWriter(new FileWriter(temp));
//
//            String linie;
//            while ((linie = reader.readLine()) != null) {
//                if (!linie.trim().equals(linieDeSters)) {
//                    writer.write(linie + System.lineSeparator());
//                }
//            }
//            reader.close();
//            writer.close();
//            input.delete();
//            temp.renameTo(input);
//            System.out.println("Linia a fost stearsa");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        int[] numere = {1, 2, 3, 4, 5};
//        for (int i = 0; i < numere.length; i++) {
//            if (numere[i] % 2 == 0) {
//                System.out.println("Numarul: " + numere[i]);
//            }
//        }
//
//        int[][] matrice = {
//                {1, 16, 30},
//                {2, 7, 15},
//                {5, 9, 10}
//        };
//        for (int i = 0; i < matrice.length; i++) {
//            for (int j = 0; j < matrice[i].length; j++) {
//                if (matrice[i][j] > 10) {
//                    System.out.println(matrice[i][j] + " este mai mare decat 10");
//                }
//            }
//        }
//
//        int suma = 0;
//        for (int numar : numere) {
//            suma += numar;
//        }
//        System.out.println("Suma numerelor este: " + suma);
//
//        String[] fructe = {"mar", "banana", "portocala", "kiwi", "strugure"};
//        String fruct = "banana";
//        for (int i = 0; i < fructe.length; i++) {
//            if (fructe[i] == fruct) {
//                System.out.println("Fructul " + fruct + " se afla la indexul:  [" + i + "]");
//            }
//        }
//
//        int cautat = 15;
//        for (int i = 0; i < matrice.length; i++) {
//            for (int j = 0; j < matrice[i].length; j++) {
//                if (matrice[i][j] == cautat) {
//                    System.out.println("Elementul " + cautat + " se afla la indexul:  [" + i + "][" + j + "]");
//                }
//            }
//            System.out.println();
//        }
//
//        try {
//            String txt = null;
//            System.out.println(txt.length());
//        } catch (NullPointerException e) {
//            System.out.println("Variabila este nula");
//        }
//
//        try (FileWriter fw = new FileWriter("tema.txt")) {
//            fw.write("tema1\ntema2\ntema3");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            Scanner sc = new Scanner(new File("tema.txt"));
//            while (sc.hasNextLine()) {
//                System.out.println(sc.nextLine());
//            }
//            sc.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        File f = new File("tema2.txt");
//        if (f.exists() && f.delete()) {
//        }
//        System.out.println("Fisierul a fost sters");
//
//        String erase = "tema2";
//        try {
//            File input = new File("tema.txt");
//            File temp = new File("temp.txt");
//
//            BufferedReader reader = new BufferedReader(new FileReader(input));
//            BufferedWriter writer = new BufferedWriter(new FileWriter(temp));
//
//            String linie;
//            while ((linie = reader.readLine()) != null) {
//                if (!linie.trim().equals(erase)) {
//                    writer.write(linie + System.lineSeparator());
//                }
//            }
//            reader.close();
//            writer.close();
//            input.delete();
//            temp.renameTo(input);
//            System.out.println("Linia a fost stearsa");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        Exercitii.Dreptunghi d = new Exercitii.Dreptunghi();
//        System.out.println("Aria dreptunghiului este: " + d.calcAria(8, 7));
//
//        Temperatura t = new Temperatura();
//        System.out.println("25 grade Celsius sunt echivalentul a: " + t.transforma(25) + " grade Fahrenheit");
//
//        Banca cont = new Banca();
//        cont.depoziteaza(152.33);
//        System.out.println("Soldul dupa depozitare este: " + cont.sold);
//
//        cont.retrage(44);
//        System.out.println("Soldul dupa retragere este: " + cont.sold);
//
//        Examen medie = new Examen();
//        System.out.println("Media este: " + medie.faMedia(10, 7, 9));
//
//        Timp timp = new Timp();
//        System.out.println("130 minute = " + timp.transforma(130));
//
//        PretTVA pret = new PretTVA();
//        System.out.println("Preț cu TVA: " + pret.calculeazaTVA(100));

//        Elev e = new Elev();
//        e.media = 5.45;
//        e.afiseazaMedia();
//
//        Bateria b = new Bateria();
//        b.bateria = 100;
//        b.nivel = 19;
//        b.calculeazaBateria();
//
//        Vehicul v = new Vehicul();
//        System.out.println(v.tipVehicul(5));
//        System.out.println(v.tipVehicul(6));
//        System.out.println(v.tipVehicul(4));
//
//        Angajat a = new Angajat();
//        a.calculeazaBonus(4000, 10);
//        a.calculeazaBonus(4000, 3);
//
//        double sold = 3400;
//        double rataDobanda = 0.01;
//
//        for (int i = 0; i < 6; i++) {
//            sold += sold * rataDobanda;
//        }
//
//        System.out.println("Sold final după 6 luni: " + sold);
//
//        int totalPagini = 10;
//        int pagina = 7;
//
//        while (pagina <= totalPagini) {
//            System.out.println("Citim pagina " + pagina);
//            pagina++;
//        }
//
//        Exercitii.Student s = new Exercitii.Student();
//        s.verificareBursa(7.5);
//        s.verificareBursa(8.65);
//
//        LocalDate dataExpirare = LocalDate.of(2025, 12, 31);
//        LocalDate azi = LocalDate.now();
//
//        if (azi.isBefore(dataExpirare) || azi.isEqual(dataExpirare)) {
//            System.out.println("Produsul este valabil.");
//        } else {
//            System.out.println("Produsul este expirat.");
//        }
//
//        Magazin m = new Magazin();
//        double[] preturi = {10.5, 24.6, 15.99, 8.25};
//        double total = m.calculeazaTotal(preturi);
//        System.out.println("Totalul este: " + total);
//
//        Dispozitiv d = new Dispozitiv();
//        d.procentBaterie = 10;
//        d.verificaBaterie();
//
//        Autobuz autobuz = new Autobuz();
//        autobuz.capacitate = 50;
//        autobuz.pasageri = 0;
//        autobuz.verificaStare();
//
//        autobuz.pasageri = 20;
//        autobuz.verificaStare();
//
//        autobuz.pasageri = 40;
//        autobuz.verificaStare();

//        Exercitii.Utilizator u = new Exercitii.Utilizator("secret123");
//        System.out.println(u.parola);


//        Caine caine = new Caine();
//        caine.arataRespira();  // merge, e apel din subclasa Caine
//
//        Exercitii.Animal animal = new Exercitii.Animal();
//        animal.respira();
//
//        Vehicul v1 = new Bicicleta();
//        Vehicul v2 = new Masina2();
//
//        v1.porneste();
//        v2.porneste();

//
//    Scanner sc = new Scanner(System.in);
//        System.out.println("Introdu numele tau: ");
//    String nume = sc.nextLine();
//        System.out.println("Introdu varsta: ");
//    int varsta = sc.nextInt();
//        System.out.println("Salut, " + nume + " ai " + varsta +" ani.");
//        sc.close();
//Scanner sc = new Scanner(System.in);
//        System.out.println("Ce varsta ai?");
//    int varsta = sc.nextInt();
//    int anCurent = LocalDate.now().getYear();
//    int anNastere = anCurent - varsta;
//
//        System.out.println("Te-ai nascut in: " + anNastere);
//        sc.close();

}
