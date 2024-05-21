package sual_1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * InputMissmatchException xətası tuta bilən try catch kod nümunəsi yazın.Öz mesajınızı çap edin.
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yaşınızı daxil edin");
        try {
            int age =scanner.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println("Uyğunsuz tip daxil edildi!");
        }finally {
            scanner.close();
            System.out.println("Scanneri bağladım");
        }
    }
}
