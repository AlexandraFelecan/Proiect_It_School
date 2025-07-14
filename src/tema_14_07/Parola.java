package tema_14_07;

public class Parola {

    public void verificaParola(String parola) {
        if (parola.length() < 8) {
            System.out.println("Parola este prea scurtă.");
        } else if (!parola.contains("!") && !parola.contains("@") && !parola.contains("#")) {
            System.out.println("Parola trebuie să conțină un caracter special (!, @ sau #).");
        } else if (parola.equals(parola.toLowerCase())) {
            System.out.println("Parola trebuie să conțină o literă mare.");
        } else {
            System.out.println("Parola este validă.");
        }
    }

    public static void main(String[] args) {
        Parola v = new Parola();
        v.verificaParola("test123");
        v.verificaParola("test1234");
        v.verificaParola("Test1234");
        v.verificaParola("Test1234!");

    }
}
