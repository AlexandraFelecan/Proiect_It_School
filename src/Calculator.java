public class Calculator {
    // Metoda pentru adunare int
    int aduna(int a, int b) {
        return a + b;
    }

    double aduna(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int rezultatInt = calc.aduna(3, 4);
        double rezultatDouble = calc.aduna(2.5, 3.7);

        System.out.println("Rezultat int: " + rezultatInt);
        System.out.println("Rezultat double: " + rezultatDouble);
    }
}
