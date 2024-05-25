package sual_40;

/**
 * Qisməti və natamam qisməti geri qaytaran iki metod yazın
 */
public class Main {
    public static double qismet(double a, double b) {
        return a / b;
    }

    public static int natamamQissmet(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        System.out.println(qismet(7, 2));
        System.out.println(natamamQissmet(7, 2));

    }
}
