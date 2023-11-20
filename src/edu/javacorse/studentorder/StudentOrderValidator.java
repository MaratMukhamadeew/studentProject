package edu.javacorse.studentorder;

import edu.javacorse.studentorder.domain.*;
import edu.javacorse.studentorder.mail.MailSender;
import edu.javacorse.studentorder.validator.ChildrenValidator;
import edu.javacorse.studentorder.validator.CityRegisterValidator;
import edu.javacorse.studentorder.validator.StudentValidator;
import edu.javacorse.studentorder.validator.WeddingValidator;

import java.time.LocalDate;

/**
 * Класс проверки студенческой заявки
 */

public class StudentOrderValidator {
    CityRegisterValidator cityRegisterValidator;
    WeddingValidator weddingValidator;
    ChildrenValidator childrenValidator;
    StudentValidator studentValidator;
    MailSender mailSender;

    public StudentOrderValidator() {
        cityRegisterValidator = new CityRegisterValidator();
        weddingValidator = new WeddingValidator();
        childrenValidator = new ChildrenValidator();
        studentValidator = new StudentValidator();
        mailSender = new MailSender();
    }

    public static void main(String[] args) {
        StudentOrderValidator sov = new StudentOrderValidator();
        StudentOrder[] studentOrders = sov.readStudentOrders();
        for (StudentOrder so : studentOrders) {
            System.out.println("Hello");
            sov.checkAll(so);
        }
    }

    private StudentOrder[] readStudentOrders() {
        StudentOrder[] studentOrders = new StudentOrder[3];
        for (StudentOrder so : studentOrders) {
            so = buildStudentOrder();
        }
        return studentOrders;

    }

    static StudentOrder buildStudentOrder() {
        Adult husband = new Adult("Сергей", "Иванов", "Иванович", LocalDate.of(1989, 11, 7));
        Adult wife = new Adult("Анна", "Иванова", "Ивановна", LocalDate.of(1990, 5, 15));
        Child child = new Child("Петр", "Иванов", "Сергеевич", LocalDate.of(2024, 9, 20));
        return new StudentOrder(husband, wife, child);
    }

    public void checkAll(StudentOrder so) {
        while (true) {
            if (!checkCityRegister(so)) {
                continue;
            }
            AnswerWedding aw = checkWedding(so);
            AnswerChildren ac = checkChildren(so);
            AnswerStudent as = checkStudent(so);

            sendMail(so);
            break;
        }
    }

    private boolean checkCityRegister(StudentOrder so) {
        return cityRegisterValidator.checkCityRegister(so);
    }

    private AnswerWedding checkWedding(StudentOrder so) {
        return weddingValidator.checkWedding(so);
    }

    private AnswerChildren checkChildren(StudentOrder so) {
        return childrenValidator.checkChildren(so);
    }

    private AnswerStudent checkStudent(StudentOrder so) {
        return studentValidator.checkStudent(so);
    }

    private void sendMail(StudentOrder so) {
        mailSender.sendMail(so);
    }
}
