package sual_27;

/**
 * [2,5.7,-8,13] massivdəki ədədlərin cəmini hesablayan metod yaradın
 */
public class Main {
    public static double ededlerinCemi(double[] massiv) {
        double cem = 0;
        for (int i = 0; i < massiv.length; i++) {
            cem += massiv[i];
        }
        return cem;
    }

    public static void main(String[] args) {
        double[] massiv = {2, 5.7, -8, 13};
        System.out.println(ededlerinCemi(massiv));
    }
}
