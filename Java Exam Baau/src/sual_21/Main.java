package sual_21;

/**
 * [12,5.7,18,13] massivin ortalama dəyərini çap edən metod yazın
 */
public class Main {
    public static void ortalamaDeyer(double [] massiv){
        double cem=0;
        for(double element : massiv){
            cem+=element;
        }
        double ortalama=cem/massiv.length;
        System.out.println("Massivin ortalama dəyəri : "+ortalama);

    }

    public static void main(String[] args) {
        double massiv[]={12,5.7,18,13};
        ortalamaDeyer(massiv);

    }


}
