package sual_7;

import java.util.Arrays;

/**
 * Bir sinifə aid 3 fərqli parametrli amma eyni ada malik constructor təyin edib,bunları istifadə edin.
 *
 */

public class Main {
    String ad;
    String soyad;
    int yas;
    int kurs;

    public Main(String ad, String soyad){
        this.ad=ad;
        this.soyad=soyad;

    }
    public Main(String ad,int yas,int kurs){
        this.ad=ad;
        this.yas=yas;
        this.kurs=kurs;
    }
    public Main(String soyad,int kurs){
        this.soyad=soyad;
        this.kurs=kurs;
    }


    public static void main(String[] args) {
        Main main_1= new Main("Ramazan","Abdurahmanov");
        System.out.println(main_1.ad+" "+main_1.soyad);

        Main main_2= new Main("Ramazan",31,4);
        System.out.println(main_2.ad+" "+main_2.yas+" "+main_2.kurs);

        Main main_3 = new Main("Abdurahmanov",4);
        System.out.println(main_3.soyad+" "+main_3.kurs);
    }

}
