package sual_36;

/**
 * İki ədədin fərqini hesablayan return type və void type iki metod yazın.
 */
public class Main {
    //return type
    public static double ferq(double a, double b) {
        return a - b;
    }

    //void
    public void ferq(float a, float b) {
        System.out.println(a - b);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.ferq(52, 10);
        System.out.println(ferq(9.6, 9));

    }
}
