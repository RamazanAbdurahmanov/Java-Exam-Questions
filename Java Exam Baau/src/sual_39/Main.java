package sual_39;

/**
 * Natamam qisməti və qalığı geri qaytaran iki metod yazın
 */
public class Main {
    //9:2=4(1)
    // bolunen,bolen,natamamQismet,Qaliq
    public static int natamamQismet(int a, int b) {
        return a / b;

    }

    public static int qaliq(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {
        System.out.println(natamamQismet(9, 2));
        System.out.println(qaliq(9, 2));
    }
}
