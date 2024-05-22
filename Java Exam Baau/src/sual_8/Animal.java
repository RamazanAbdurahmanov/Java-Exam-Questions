package sual_8;

/**
 * Animal class yaradıb müvafiq iki metod yaradın daha sonra Dog class yaradıb Animal classından miras alın
 * və Dog classına aid olan yeni bir meod yaradın daha sonra hər iki classın metodlarını çağırın.
 */
public class Animal {
    public void qidalanma(){
        System.out.println("Heyvanlar ət yeyən və ot yeyən olaraq ayrılırlar");
    }
    public void ayaqSayi(String heyvaninAdi,int heyvaninAyaqSayi){
        System.out.println(heyvaninAdi+" "+heyvaninAyaqSayi+" ayaqlıdır");
    }
}
