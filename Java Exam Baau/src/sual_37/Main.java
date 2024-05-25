package sual_37;

/**
 * İki ədədin hasilini hesablayan return type və void type iki metod yazın.
 */
public class Main {
    public static double hasil(double a, double b) {
        return a * b;
    }

    public static void ededlerinHasili(double a, double b) {
        System.out.println(a * b);
    }

    public static void main(String[] args) {
        System.out.println(hasil(3, 5));
        ededlerinHasili(8, 9);
    }
}
