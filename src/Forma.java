abstract class Forma {

    abstract void deseneaza();

    class Cerc extends Forma{
        void deseneaza() {
            System.out.println("Deseneaza un cerc");
        }
    }
}
