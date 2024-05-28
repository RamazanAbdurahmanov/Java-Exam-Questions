package sual_50;


/**
 * 1-100 arasında 3-ə və ya 5-ə bölünüb 15-ə bölünməyən ədələri çap edən kod sətri yazın.
 * * Şərtlər :
 * * a. while dövrü istifadə edin
 * * b. Continue istifadə edin.
 */
public class Main {
    public static void main(String[] args) {
        int eded = 1;
        while (eded <= 100) {
            if (eded % 15 == 0) {
                eded++;
                continue;
            } else if (eded % 3 == 0 || eded % 5 == 0) {
                System.out.println(eded);

            }
            eded++;
        }
    }
}