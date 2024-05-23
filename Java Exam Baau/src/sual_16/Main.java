package sual_16;

/**
 * Sinif yaradın və sinifin üç dəyışəni olsun.Daha sonra bu dəyişənlərə həm setter həm də getter metodu
 * yazın.
 */

public class Main {
    private String name;
    private String surname;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
