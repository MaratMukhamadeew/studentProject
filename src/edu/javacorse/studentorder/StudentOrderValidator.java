package edu.javacorse.studentorder;

import edu.javacorse.studentorder.domain.*;
import edu.javacorse.studentorder.mail.MailSender;
import edu.javacorse.studentorder.validator.ChildrenValidator;
import edu.javacorse.studentorder.validator.CityRegisterValidator;
import edu.javacorse.studentorder.validator.StudentValidator;
import edu.javacorse.studentorder.validator.WeddingValidator;

import java.util.Scanner;

/**
 * Класс проверки студенческой заявки
 */

public class StudentOrderValidator {
    public static void main(String[] args) {
        StudentOrderValidator sov = new StudentOrderValidator();
        StudentOrder studentOrder = sov.readStudentOrder();
        sov.checkAll(studentOrder);
    }

    private StudentOrder readStudentOrder() {
        return new StudentOrder("Bob", "Smith", "Liza", "Smith");
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

    private static boolean checkCityRegister(StudentOrder studentOrder) {
        return !CityRegisterValidator.checkCityRegister(studentOrder);
    }
    private static AnswerWedding checkWedding(StudentOrder so) {
        return WeddingValidator.checkWedding(so);
    }
    private static AnswerChildren checkChildren(StudentOrder so) {
        return ChildrenValidator.checkChildren(so);
    }
    private static AnswerStudent checkStudent(StudentOrder so) {
        return StudentValidator.checkStudent(so);
    }
    private static void sendMail(StudentOrder so) {
        new MailSender().sendMail(so);
    }
}
