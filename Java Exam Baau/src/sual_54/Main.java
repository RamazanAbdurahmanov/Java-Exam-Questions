package sual_54;

import java.util.Scanner;

/**
 * Həftənin adını daxil etməklə onun sıra nömrəsini çap edin. Switch case  şərt operatorundan istifadə edin.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Günü daxil edin : ");
        String gun = scanner.nextLine();
        switch (gun) {
            case "Bazar ertəsi" -> System.out.println(1);
            case "Çərşənbə axşam" -> System.out.println(2);
            case "Çərşənbə" -> System.out.println(3);
            case "Cümə axşamı" -> System.out.println(4);
            case "Cümə" -> System.out.println(5);
            case "Şənbə" -> System.out.println(6);
            case "Bazar" -> System.out.println(7);
            default -> System.out.println("Həftənin bele bir günü yoxdur");
        }
        scanner.close();
    }
}

