package sual_57;

import java.util.Scanner;

/**
 * Bir ədədin n-ə bölünüb  bölünmədiyini % işarəsi istifadə etmədən dövr istifadə edərək tapın.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ədədi daxil edin : ");
        int eded = scanner.nextInt();
        System.out.println("n-i daxil edin : ");
        int n = scanner.nextInt();
        while (eded > 0) {
            eded -= n;
        }
        if (eded == 0) {
            System.out.println("Bu ədəd " + n + "ədədinə bölünür");
        } else {
            System.out.println("Bu ədəd " + n + "ədədinə bölünmür");
        }
        scanner.close();

    }
}
