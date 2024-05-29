package sual_56;

import java.util.Scanner;

/**
 * Bir ədədin 7-yə bölünüb  bölünmədiyini % işarəsi istifadə etmədən dövr istifadə edərək tapın.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ədədi daxil edin : ");
        int eded = scanner.nextInt();
        while (eded > 0) {
            eded -= 7;
        }
        if (eded == 0) {
            System.out.println("Bu ədəd 7-yə bölünür");
        } else {
            System.out.println("Bu ədəd 7-yə bölünmür");
        }


    }
}
