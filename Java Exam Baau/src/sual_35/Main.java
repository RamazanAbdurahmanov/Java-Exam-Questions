package sual_35;

/**
 * İki ədədin cəmini hesablayan return type və void type iki metod yazın.
 */
public class Main {
    //return type
    public static double cem(double a, double b) {
        return a + b;
    }

    //void
    public static void cem(float a, float b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        System.out.println(cem(5.0, 9));
        cem(8, 9);
    }
}
