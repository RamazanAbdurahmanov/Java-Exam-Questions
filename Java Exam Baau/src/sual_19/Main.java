package sual_19;

/**
 * [-2,5.7,8,13] massivinin minimum dəyərini hesablayan return type metod yazın.
 */
public class Main {
    public static double minElement(double [] massiv){
        double enKichikElement=massiv[0];
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i]<enKichikElement){
                enKichikElement=massiv[i];
            }
        }
        return enKichikElement;
    }

    public static void main(String[] args) {
        double [] massiv={-2,5.7,8,13};
        System.out.println(minElement(massiv));
    }
}
