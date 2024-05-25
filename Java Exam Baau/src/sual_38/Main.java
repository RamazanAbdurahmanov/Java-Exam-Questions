package sual_38;

/**
 * Natamam qisməti və qalığı çap edən iki metod yazın.
 */
public class Main {

    //9:2=4(1)
    // bolunen,bolen,natamamQismet,Qaliq
    public static void natamamQismet(int a, int b) {
        System.out.println(a / b);

    }

    public static void qaliq(int a, int b) {
        System.out.println(a % b);
    }

    public static void main(String[] args) {
        natamamQismet(9, 2);
        qaliq(9, 2);
    }
}
