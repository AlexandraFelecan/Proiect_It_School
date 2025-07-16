package Exercitii;

public class Car {

    String model;
    int an;

    public Car() {
        model = "Generic";
        an = 2000;
    }

    public Car (String m, int a){
        model = m;
        an = a;
    }
    public void afiseaza(){
        System.out.println(model + " - " + an);
    }

    public static void main (String[]args){
        Car c1 = new Car();
        Car c2 = new Car("Dacia", 2025);
        c1.afiseaza();
        c2.afiseaza();
    }
}
