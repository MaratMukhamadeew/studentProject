package edu.javacorse.studentorder.validator;

import edu.javacorse.studentorder.domain.AnswerChildren;
import edu.javacorse.studentorder.domain.StudentOrder;

public class ChildrenValidator {
    public AnswerChildren checkChildren(StudentOrder so) {
        System.out.println("Children check запущен");
        return new AnswerChildren();
    }
}
