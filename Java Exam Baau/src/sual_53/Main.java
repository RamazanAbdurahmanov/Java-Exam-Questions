package sual_53;

import java.util.Scanner;

/**
 * Həftənin sıra nömrəsini istifadəçidən əldə edib qarşılığında onun adını çap edin. If şərt
 * operatorundan istifadə edin.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Günün sıra nömrəsini daxil edin : ");
        int gun = scanner.nextInt();
        if (gun == 1) {
            System.out.println("Bazar ertəsi ");
        } else if (gun == 2) {
            System.out.println("Çərşənbə axşam");
        } else if (gun == 3) {
            System.out.println("Çərşənbə");
        } else if (gun == 4) {
            System.out.println("Cümə axşamı");
        } else if (gun == 5) {
            System.out.println("Cümə");
        } else if (gun == 6) {
            System.out.println("Şənbə");
        } else if (gun == 7) {
            System.out.println("Bazar");
        } else {
            System.out.println("Həftənin bele bir günü yoxdur");
        }
        scanner.close();

    }
}
