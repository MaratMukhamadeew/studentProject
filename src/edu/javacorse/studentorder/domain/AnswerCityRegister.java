package edu.javacorse.studentorder.domain;

public class AnswerCityRegister {
    static boolean success = true;
    public static boolean isSuccess(StudentOrder so) {

        if (so == null) return false;

        while (success) {
            if (so.gethFirstName() == null || so.gethFirstName().equals("")) {
                System.out.println("Обязательно напишите Имя мужа");
            } else if (so.gethLastName() == null || so.gethLastName().equals("")) {
                System.out.println("Обязательно напишите Фамилию мужа");
            } else if (so.getwFirstName() == null || so.getwFirstName().equals("")) {
                System.out.println("Обязательно напишите Имя жены");
            } else if (so.getwLastName() == null || so.getwLastName().equals("")) {
                System.out.println("Обязательно напишите Фамилию жены");
            } else {
                System.out.printf(" Имя Мужа : %s%n Фамилия Мужа : %s%n Имя Жены : %s%n Фамилия Жены : %s%n", so.gethFirstName()
                        , so.gethLastName(), so.getwFirstName(), so.getwLastName());
                success = false;
                return true;
            }
        }
        return false;
    }

    public static void setSuccess(boolean success) {
        AnswerCityRegister.success = success;
    }
}
