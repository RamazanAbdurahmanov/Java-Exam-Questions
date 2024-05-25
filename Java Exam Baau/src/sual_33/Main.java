package sual_33;

/**
 * İki ədədin cəmini və fərqini çap edən iki parametrli metod yazın.
 */
public class Main {
    public void cem(double a, double b) {
        System.out.println(a + b);
    }

    public static void ferq(double a, double b) {
        System.out.println(a - b);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.cem(5, 6);
        //Static metod
        ferq(9, 8);
    }
}
