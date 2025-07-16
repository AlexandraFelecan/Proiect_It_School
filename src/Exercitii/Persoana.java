package Exercitii;

public class Persoana {
    private String nume;
    public int varsta;

    public Persoana(String n, int v){
        nume = n;
        varsta = v;
    }
    void afiseazaDate(){
        System.out.println("Nume: " + nume);
        System.out.println("Varsta: " + varsta);
    }
    public  static void main(String[]args){
        Persoana p = new Persoana("Ana" , 30);
        p.afiseazaDate();
        System.out.println(p.nume);
    }
}
