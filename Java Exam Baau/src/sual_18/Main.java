package sual_18;

/**
 * [2,5.7,8,13] massivin maksimum dəyərini hesablayan return type metod yazın.
 */

public class Main {
    public static double maxElement(double[] massiv) {
        double enBoyuk = massiv[0];
        for (int i = 0; i < massiv.length; i++) {
            if ( massiv[i]>enBoyuk ) {
                enBoyuk = massiv[i];
            }

        }
        return enBoyuk;
    }

    public static void main(String[] args) {
        double[] massiv = {2, 5.7, 8, 13};
        System.out.println(maxElement(massiv));
    }
}
