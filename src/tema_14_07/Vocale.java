package tema_14_07;

// Creează o metodă numaraVocale(String text) care returnează numărul de vocale folosind for și if.
public class Vocale {

    public static int numaraVocale(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            switch (c) {
                case 'a': case 'e': case 'i': case 'o': case 'u':
                case 'A': case 'E': case 'I': case 'O': case 'U':
                    count++;
                    break;
                default:
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String propozitie = "Ana are mere";
        int nrVocale = numaraVocale(propozitie);
        System.out.println("Număr de vocale: " + nrVocale);
    }
}

