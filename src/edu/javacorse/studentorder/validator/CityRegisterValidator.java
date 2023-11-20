package edu.javacorse.studentorder.validator;

import edu.javacorse.studentorder.domain.AnswerCityRegister;
import edu.javacorse.studentorder.domain.StudentOrder;

public class CityRegisterValidator {
    private String hostName;
    private static String staticHostName;
    private StudentOrder studentOrder;

    public CityRegisterValidator() {
    }

    public CityRegisterValidator(StudentOrder studentOrder) {
        this.studentOrder = studentOrder;
    }
    public CityRegisterValidator(String hostName, StudentOrder studentOrder) {
        this.hostName = hostName;
        this.studentOrder = studentOrder;
    }
    public CityRegisterValidator(StudentOrder studentOrder, String hostName) {
        this.hostName = hostName;
        this.studentOrder = studentOrder;
    }


    public String getHostName() {
        return hostName;
    }

    public StudentOrder getStudentOrder() {
        return studentOrder;
    }

    public static String getStaticHostName() {
        return staticHostName;
    }

    public static void setStaticHostName(String staticHostName) {
        CityRegisterValidator.staticHostName = staticHostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public void setStudentOrder(StudentOrder studentOrder) {
        this.studentOrder = studentOrder;
    }

    public boolean checkCityRegister(StudentOrder studentOrder) {
        if (AnswerCityRegister.isSuccess(studentOrder)) {
            System.out.println("Имя хоста региона " + staticHostName);
        }
        return AnswerCityRegister.isSuccess(studentOrder);
    }
}
