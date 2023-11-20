package edu.javacorse.studentorder;

import edu.javacorse.studentorder.domain.Adult;
import edu.javacorse.studentorder.domain.Child;
import edu.javacorse.studentorder.domain.StudentOrder;

import java.time.LocalDate;

/**
 * Класс сохранения студенческой заявки
 */
public class SaveStudentOrder {
    public static void main(String[] args) {
        StudentOrder so = buildStudentOrder();
//        StudentOrderValidator studentOrderValidator = new StudentOrderValidator();
//        studentOrderValidator.checkAll(so);
        saveStudentOrder(so);
        System.out.println(so.getHusband());
    }

    static void saveStudentOrder(StudentOrder so) {
        System.out.println("Заявка сохранена");
    }

    static StudentOrder buildStudentOrder() {
        Adult husband = new Adult("Сергей", "Иванов","Иванович", LocalDate.of(1989, 11, 7));
        Adult wife = new Adult("Анна", "Иванова","Ивановна", LocalDate.of(1990,5,15));
        Child child = new Child("Петр", "Иванов", "Сергеевич",LocalDate.of(2024,9,20));
        return new StudentOrder(husband, wife, child);
    }
}