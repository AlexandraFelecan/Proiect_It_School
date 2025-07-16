package tema_14_07;

// Creează o clasă Dispozitiv cu metoda porneste(). Creează clasele Laptop și Telefon care o suprascriu.
// Creează o metodă care primește un Dispozitiv și apelează porneste().
public class Dispozitiv {

    public void porneste(){
        System.out.println("Porneste");
    }

    public class Laptop extends Dispozitiv{
        @Override
        public void porneste() {
            System.out.println("Laptopul porneste!");
        }
    }

    public class Telefon extends Dispozitiv{
        @Override
        public void porneste() {
            System.out.println("Telefonul porneste!");
        }
    }
    public class TestDispozitiv {

        public static void pornesteDispozitiv(Dispozitiv d) {
            d.porneste();
        }

        public void main(String[] args) {
            Dispozitiv d1 = new Laptop();
            Dispozitiv d2 = new Telefon();

            pornesteDispozitiv(d1);
            pornesteDispozitiv(d2);
        }
    }


}
