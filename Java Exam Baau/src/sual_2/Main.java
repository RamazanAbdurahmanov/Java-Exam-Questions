package sual_2;

/**
 * StringİndexOutOfBoundsException xətası tuta bilən try catch kod nümunəsi yazın.Öz mesajınızı çap edin
 */

public class Main {
    public static void main(String[] args) {
        String str="Java";
        try {
            int indeks=str.charAt(6);
        }catch (StringIndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("Stringin uzuluğundan böyük bir indeks istədiz");
        }

    }
}
