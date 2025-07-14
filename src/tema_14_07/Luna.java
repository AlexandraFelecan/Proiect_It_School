package tema_14_07;

// Creează o metodă tipZile(int luna) care returnează numărul de zile din lună (fără an bisect), folosind switch.
public class Luna {

    public int tipZile(int luna) {
        switch (luna) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return 28;
        }
        return -1;
    }

    public static void main(String[] args) {
        Luna l = new Luna();

        System.out.println("Ianuarie are " + l.tipZile(1) + " zile.");
        System.out.println("Aprilie are " + l.tipZile(4) + " zile.");
        System.out.println("Februarie are " + l.tipZile(2) + " zile.");
        System.out.println("Luna Decembrie are " + l.tipZile(12) + " zile.");
    }

}
