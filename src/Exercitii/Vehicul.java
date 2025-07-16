package Exercitii;

class Vehicul {
    void porneste() {
        System.out.println("Vehiculul pornește.");
    }
}

class Bicicleta extends Vehicul {
    @Override
    void porneste() {
        System.out.println("Exercitii.Bicicleta pornește pedalatul.");
    }
}

class Masina2 extends Vehicul {
    @Override
    void porneste() {
        System.out.println("Mașina pornește motorul.");
    }
}

