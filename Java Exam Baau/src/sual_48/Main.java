package sual_48;

/**
 * Artan istiqamətdə while dövrü ilə,0! faktorialı nəzərə alan və mənfi ədədlərin faktorialının olmadığı vəziyəti nəzərə
 * alan metod yaz.
 */
public class Main {
    public static void faktorial(int eded) {
        int faktorial = 1;
        if (eded != 0 && eded > 1) {
            int i = 1;
            while (i <=eded) {
                faktorial *= i;
                i++;
            }
            System.out.println(eded + " ədədinin faktorialı = " + faktorial);
        } else if (eded == 0 || eded == 1) {
            System.out.println(eded + " ədədinin faktorialı = 1");
        } else {
            System.out.println("menfi ədədlərin faktorialı olmur");
        }
    }

    public static void main(String[] args) {
        faktorial(-9);
    }
}
