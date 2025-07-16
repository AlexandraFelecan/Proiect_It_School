
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introdu numele tau: ");
        String nume = sc.nextLine();
        System.out.println("Introdu varsta: ");
        int varsta = sc.nextInt();
        System.out.println("Salut, " + nume + " ai " + varsta +" ani.");
        sc.close();
    }
}

