package sual_42;

/**
 * Daxil edilən sözün uzunluğunu geri qaytaran metod yazın.Hazır metod istifadə etməyin
 */
public class Main {
    public static int sozunUzunlugu(String soz) {
        int saygac = 0;
        char[] herfmassivi = soz.toCharArray();
        for (char herf : herfmassivi) {
            saygac++;
        }
        return saygac;

    }

    public static void main(String[] args) {
        System.out.println(sozunUzunlugu("Java"));
    }
}
