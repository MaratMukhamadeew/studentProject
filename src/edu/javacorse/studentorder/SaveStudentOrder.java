package edu.javacorse.studentorder;

import edu.javacorse.studentorder.domain.StudentOrder;
import edu.javacorse.studentorder.validator.CityRegisterValidator;

/**
 * Класс сохранения студенческой заявки
 */
public class SaveStudentOrder {
    public static void main(String[] args) {
        StudentOrder so = new StudentOrder("Сергей", "Иванов", "Елена", "Иванова");
        StudentOrderValidator studentOrderValidator = new StudentOrderValidator();
        studentOrderValidator.checkAll(so);
        saveStudentOrder(so);
    }

    static void saveStudentOrder(StudentOrder so) {
        System.out.println("Заявка сохранена");
    }
}