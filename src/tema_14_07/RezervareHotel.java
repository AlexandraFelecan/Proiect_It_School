package tema_14_07;

public class RezervareHotel {

    String nume;
    String tipCamera;

    public RezervareHotel(String n){
        nume = n;
    }

    public RezervareHotel (String n, String c){
        nume =n;
        tipCamera = c;
    }
    public void afiseazaDetalii() {
        if (tipCamera == null) {
            System.out.println("Rezervare pentru client: " + nume);
        } else {
            System.out.println("Rezervare pentru client: " + nume + ", Camera: " + tipCamera);
        }
    }

    public static void main(String[] args) {
        RezervareHotel c1 = new RezervareHotel("Laura Laurentiu");
        RezervareHotel c2 = new RezervareHotel("Martin Pop", "Camera Dubla");

        c1.afiseazaDetalii();
        c2.afiseazaDetalii();

    }
}
