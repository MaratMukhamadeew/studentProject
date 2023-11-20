package edu.javacorse.studentorder.domain;

import java.util.Scanner;

public class AnswerCityRegister {
    static boolean success = true;
    public static boolean isSuccess(StudentOrder so) {

        if (so == null) return false;
        while (success) {
            if (so.getHusband().getSurName() == null || so.getHusband().getSurName().equals("")) {
                System.out.println("Обязательно напишите Имя мужа");
            } else if (so.getHusband().getGivenName() == null || so.getHusband().getGivenName().equals("")) {
                System.out.println("Обязательно напишите Фамилию мужа");
            } else if (so.getWife().getSurName() == null || so.getWife().getSurName().equals("")) {
                System.out.println("Обязательно напишите Имя жены");
            } else if (so.getWife().getGivenName() == null || so.getWife().getGivenName().equals("")) {
                System.out.println("Обязательно напишите Фамилию жены");
            } else {
                System.out.printf(" Имя Мужа : %s%n Фамилия Мужа : %s%n Имя Жены : %s%n Фамилия Жены : %s%n", so.getHusband().getSurName()
                        , so.getHusband().getGivenName(), so.getWife().getSurName(), so.getWife().getGivenName());
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
