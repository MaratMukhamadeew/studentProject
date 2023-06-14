package edu.javacorse.studentorder;

import edu.javacorse.studentorder.domain.*;
import edu.javacorse.studentorder.mail.MailSender;
import edu.javacorse.studentorder.validator.ChildrenValidator;
import edu.javacorse.studentorder.validator.CityRegisterValidator;
import edu.javacorse.studentorder.validator.StudentValidator;
import edu.javacorse.studentorder.validator.WeddingValidator;

/**
 * Класс проверки студенческой заявки
 */


public class StudentOrderValidator {
    public static void main(String[] args) {
        checkAll();
    }

    public static void checkAll() {

        while (true) {
            StudentOrder so = readStudentOrder();
            System.out.println("Start");
            if (so == null) {
                break;
            }
            System.out.println("Finish");

            AnswerCityRegister acr = checkCityRegister(so);
            if (!acr.isSuccess()) {
                continue;
            }
            AnswerWedding aw = checkWedding(so);
            AnswerChildren ac = checkChildren(so);
            AnswerStudent as = checkStudent(so);

            sendMail(so);
        }
        System.out.println("Finish 2");
    }

    private static void sendMail(StudentOrder so) {
        new MailSender().sendMail(so);
    }

    private static StudentOrder readStudentOrder() {
        return new StudentOrder("Bob", "Smith", "Liza", "Smith");
    }

    private static AnswerCityRegister checkCityRegister(StudentOrder so) {
        CityRegisterValidator crv = new CityRegisterValidator();
        crv.setHostName("Host1");
        return crv.checkCityRegister(so);
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
}
