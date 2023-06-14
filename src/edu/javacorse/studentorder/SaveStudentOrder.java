package edu.javacorse.studentorder;

import edu.javacorse.studentorder.domain.StudentOrder;

/**
 * Класс сохранения студенческой заявки
 * */
public class SaveStudentOrder {
    public static void main(String[] args) {
        StudentOrder so = new StudentOrder("Bob", "Smith", "Liza","Smith");

        System.out.println(saveStudentOrder(so));
    }

    static boolean saveStudentOrder(StudentOrder so) {
        boolean result = true;
        System.out.println("Имя мужа " + so.gethFirstName());
        System.out.println("Фамилия мужа " + so.gethLastName());
        System.out.println("Имя жены " + so.getwFirstName());
        System.out.println("Фамилия жены " + so.getwLastName());
        if (so.gethFirstName() == null || so.gethLastName() == null || so.getwFirstName() == null || so.getwLastName() == null) result = false;
        return result;
    }
}