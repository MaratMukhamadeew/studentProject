package edu.javacorse.studentorder.validator;

import edu.javacorse.studentorder.domain.AnswerCityRegister;
import edu.javacorse.studentorder.domain.StudentOrder;

public class CityRegisterValidator {
    private String hostName;

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public AnswerCityRegister checkCityRegister(StudentOrder so) {
        System.out.println("CityRegister запущен " + hostName);
        AnswerCityRegister acr = new AnswerCityRegister();
        acr.setSuccess(false);
        return acr;
    }
}
