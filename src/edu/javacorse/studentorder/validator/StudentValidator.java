package edu.javacorse.studentorder.validator;

import edu.javacorse.studentorder.domain.AnswerStudent;
import edu.javacorse.studentorder.domain.StudentOrder;

public class StudentValidator {
    public AnswerStudent checkStudent(StudentOrder so) {
        System.out.println("Student check запущен");
        return new AnswerStudent();
    }
}
