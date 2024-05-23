package sual_15;

/**
 * Sinif yaradın və sinif userName və userPassword dəyişənləri olsun.Sonra bu dəyişənlərə dəyər verin.
 * Şifrə və istifadəçi adını yoxlayan bir metod yazıb çağırın.
 */
public class User {
    String userName;
     String userPassword;

    public User(String userName, String userPassword) {
        this.userName = userName;
        this.userPassword = userPassword;
    }

    public void login(String userName,String password){
        if (userName.equals(this.userName)&password.equals(userPassword)){
            System.out.println("Ugurla girish etdiniz");
        }
        else {
            System.out.println("Username ve ya Parol sehvdir!");
        }

    }


}
