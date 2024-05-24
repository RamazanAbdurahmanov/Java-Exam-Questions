package sual_28;

/**
 * [2,5.7,-8,13] massivdəki ədədlərin cəmini hesablayan kod yazın
 */
public class Main {
    public static void main(String[] args) {
        double[] massiv = {2, 5.7, -8, 13};
        double cem = 0;
        for (int i = 0; i < massiv.length; i++) {
            cem += massiv[i];
        }
        System.out.println(cem);


    }
}
