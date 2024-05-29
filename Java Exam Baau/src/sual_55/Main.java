package sual_55;

import java.util.Scanner;

/**
 * Həftənin adını daxil etməklə onun sıra nömrəsini çap edin. If  şərt operatorundan istifadə edin.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Günü  daxil edin : ");
        String gun = scanner.nextLine();
        if (gun.equals("Bazar ertəsi")) {
            System.out.println(1);
        } else if (gun.equals("Çərşənbə axşam")) {
            System.out.println(2);
        } else if (gun.equals("Çərşənbə")) {
            System.out.println(3);
        } else if (gun.equals("Cümə axşamı")) {
            System.out.println(4);
        } else if (gun.equals("Cümə")) {
            System.out.println(5);
        } else if (gun.equals("Şənbə")) {
            System.out.println(6);
        } else if (gun.equals("Bazar")) {
            System.out.println(7);
        } else {
            System.out.println("Həftənin bele bir günü yoxdur");
        }
        scanner.close();
    }
}
