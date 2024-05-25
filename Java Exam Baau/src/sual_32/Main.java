package sual_32;

/**
 * İki ədədin cəmini və ədədi ortasını çap edən iki static metod yazın.
 */
public class Main {
    public static void cem(double a, double b) {
        System.out.println(a + b);
        ;
    }

    public static void edediOrtra(double a, double b) {
        System.out.println((a + b) / 2);
    }

    public static void main(String[] args) {
        cem(5, 6);
        edediOrtra(2, 8);

    }
}
