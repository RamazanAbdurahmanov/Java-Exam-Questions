package sual_52;

import java.util.Scanner;

/**
 * Həftənin sıra nömrəsini istifadəçidən əldə edib qarşılığında onun adını çap edin. Swich case şərt
 * operatorundan istifadə edin.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Günün sıra nömrəsini daxil edin : ");
        int gun = scanner.nextInt();
        switch (gun) {
            case 1:
                System.out.println("Bazar ertəsi ");
                break;
            case 2:
                System.out.println("Çərşənbə axşam");
                break;
            case 3:
                System.out.println("Çərşənbə");
                break;
            case 4:
                System.out.println("Cümə axşamı");
                break;
            case 5:
                System.out.println("Cümə");
                break;
            case 6:
                System.out.println("Şənbə");
                break;
            case 7:
                System.out.println("Bazar");
                break;
            default:
                System.out.println("Həftənin bele bir günü yoxdur");

        }
        scanner.close();
    }

}
