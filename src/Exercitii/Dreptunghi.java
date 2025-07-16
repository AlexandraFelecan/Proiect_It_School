package Exercitii;

public class Dreptunghi {
    int lungime;
    int latime;
    int arie;

    public Dreptunghi(int l, int L) {
        lungime = l;
        latime = L;
        arie = l * L;
    }

    public void afiseazaAria() {
        System.out.println("Aria este: " + arie);
    }
    
    public static void main(String[]args){
        Dreptunghi d = new Dreptunghi(5,7);
        d.afiseazaAria();
    }
}
