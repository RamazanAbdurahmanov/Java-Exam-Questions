package sual_51;

/**
 * 1-100 arasında 3-ə və ya 5-ə bölünüb 15-ə bölünməyən ədələri çap edən kod sətri yazın.
 * Şərtlər :
 * a. for dövrü istifadə edin
 * b. Məntiqi operatorlardan istifadə edərək həll edin
 * c. Continue istifadə etməyin.
 */
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if ((i % 3 == 0 || i % 5 == 0) && (i % 15 != 0)) {
                System.out.println(i);
            }
        }
    }
}
