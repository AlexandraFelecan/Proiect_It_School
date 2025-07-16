package tema_14_07;
//Creează o clasă Temperatura cu o metodă static double converteste(double celsius) care returnează temperatura în Fahrenheit.
// Apeleaz-o în main() fără să creezi obiect.
public class Temperatura {

    public static double converteste(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public static void main(String[] args) {
        double tempCelsius = 25;
        double tempFahrenheit = Temperatura.converteste(tempCelsius);
        System.out.println(tempCelsius + " grade Celsius = " + tempFahrenheit + " grade Fahrenheit");
    }
}
