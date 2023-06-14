package edu.javacorse.studentorder.validator;

import edu.javacorse.studentorder.domain.AnswerWedding;
import edu.javacorse.studentorder.domain.StudentOrder;

public class WeddingValidator {
    public static AnswerWedding checkWedding(StudentOrder so) {
        System.out.println("Wedding check запущен");
        return new AnswerWedding();
    }
}
