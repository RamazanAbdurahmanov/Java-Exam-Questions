package sual_41;

/**
 * Ədədi və qüvvətini daxil etdikdə nəticəni geri qaytaran static metod yazın
 */
public class Main {
    public static double quvvetHesabla(double eded, int quvvet) {
        double netice = 1;
        for (int i = 0; i < quvvet; i++) {
            netice *= eded;
        }
        return netice;

    }

    public static void main(String[] args) {
        System.out.println(quvvetHesabla(3, 4));
    }
}
