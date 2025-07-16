package tema_14_07;

//Creează clasa Client cu atribut nume. Creează un constructor care setează numele cu this.
// Creează o metodă care returnează: „Bun venit, [nume]!” și testeaz-o în main().
public class Client {

    String nume;

    public Client(String nume){
        this.nume = nume;
    }

    public String mesajBunVenit(){
       return "Bun venit, " + nume + " !";
    }
    public static void main(String[]args){
        Client c = new Client("Andrei");
        System.out.println(c.mesajBunVenit());
    }
}
