package tema_14_07;

// Creează o metodă verificaCategorieVarsta(int varsta) care returnează „Copil”, „Adolescent”, „Adult”, „Senior” în funcție de vârstă (folosește if..else if).
public class Varsta {

    public String verificaCategorieVarsta(int varsta) {
        if (varsta <= 12) {
            return "Copil";
        } else if (varsta <= 17) {
            return "Adolescent";
        } else if (varsta <= 64) {
            return "Adult";
        } else {
            return "Senior";
        }
    }

    public static void main(String[] args) {
        Varsta v = new Varsta();
        System.out.println(v.verificaCategorieVarsta(5));
        System.out.println(v.verificaCategorieVarsta(14));
        System.out.println(v.verificaCategorieVarsta(32));
        System.out.println(v.verificaCategorieVarsta(85));

    }
}


