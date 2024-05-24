package sual_20;

/**
 * [-2,5.7,8,13] massivinin minimum dəyərini hesablayan  metod yazın
 */
public class Main {
    public static void minimumElement(double [] massiv){
        double enKichikElement=massiv[0];
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i]<enKichikElement){
                enKichikElement=massiv[i];
            }

        }
        System.out.println("Massivin ən kiçik elementi : "+enKichikElement);
    }

    public static void main(String[] args) {
        double [] massiv={-2,5.7,8,13};
        minimumElement(massiv);
    }

}
