package sual_43;

/**
 * Daxil edilən sözün uzunluğunu çap edən metod yazın.Hazır metod istifadə etməyin.
 */
public class Main {
    public static void sozunUzunlugu(String soz) {
        int saygac = 0;
        char[] herflerMassivi = soz.toCharArray();
        for (char herf : herflerMassivi) {
            saygac++;
        }
        System.out.println(soz + " sözünün uzunluğu = " + saygac);
    }

    public static void main(String[] args) {
        sozunUzunlugu("Ramazan");
    }
}
