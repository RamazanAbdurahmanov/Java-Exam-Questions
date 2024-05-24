package sual_22;

/**
 * [12,5.7,18,13] massivin ortalama dəyərini hesablayan metod yazın
 */
public class Main {
    public static double ortalamaDeyer(double [] massiv){
        double cem=0;
        for(double element : massiv){
            cem+=element;
        }
        double ortalama=cem/massiv.length;
        return ortalama;


    }

    public static void main(String[] args) {
        double massiv[]={12,5.7,18,13};
        ortalamaDeyer(massiv);

    }
}
