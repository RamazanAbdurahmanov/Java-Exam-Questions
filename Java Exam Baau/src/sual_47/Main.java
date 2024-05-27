package sual_47;

/**
 * Artan istiqamətdə for dövrü ilə,0! faktorialı nəzərə alan və mənfi ədədlərin faktorialının olmadığı vəziyəti nəzərə
 * * * alan metod yaz.
 */
public class Main {
    public static void faktorial(int eded) {
        int faktorial = 1;
        if (eded != 0 & eded > 1) {
            for (int i = 1; i <=eded; i++) {
                faktorial *= i;
            }
            System.out.println(eded + " ədədinin faktorialı = " + faktorial);
        } else if (eded == 0 || eded == 1) {
            System.out.println(eded + " ədədinin faktorialı = 1");
        } else {
            System.out.println("menfi ədədlərin faktorialı olmur");
        }
    }

    public static void main(String[] args) {
        faktorial(5);
    }
}
