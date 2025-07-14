package tema_14_07;

// Creează o clasă ContBancar cu atribut private double sold. Creează metode depunere(), retragere() și verificaSold(). Afișează un mesaj dacă retragerea e mai mare decât soldul.
public class ContBancar {
    private double sold;

    public ContBancar(double soldInitial) {
        sold = soldInitial;
    }



    public void depunere(double suma) {
        sold += suma;
        System.out.println("Ai depus " + suma + " lei.");
    }

    public void retragere(double suma) {
        if (suma > sold) {
            System.out.println("Fonduri insuficiente! Sold disponibil: " + sold + " lei");
        } else {
            sold -= suma;
            System.out.println("Ai retras " + suma + " lei");
        }
    }

    public void verificaSold() {
        System.out.println("Soldul actual este: " + sold + " lei.");
    }

    public static void main(String[] args) {
        ContBancar cont = new ContBancar(500.20);

        cont.verificaSold();
        cont.depunere(200.0);
        cont.retragere(100.0);
        cont.retragere(700.0);
        cont.verificaSold();
    }
}
