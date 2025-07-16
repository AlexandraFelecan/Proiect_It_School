package Exercitii;

public class Student {
    String nume;
    int varsta;

    public Student() {
        nume = "Anonim";
        varsta = 0;
    }

    public Student(String n, int v) {
        nume = n;
        varsta = v;
    }

    public void afiseazaStudent() {
        System.out.println("Exercitii.Student: " + nume + ", Varsta: " + varsta);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.afiseazaStudent();

        Student s2 = new Student("Andrei", 20);
        s2.afiseazaStudent();
    }
}
