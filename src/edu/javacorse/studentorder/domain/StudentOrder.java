package edu.javacorse.studentorder.domain;

public class StudentOrder {
    private String имяМужа;
    private String фамилияМужа;
    private String имяЖены;
    private String фамилияЖены;

    public StudentOrder(String имяМужа, String фамилияМужа, String имяЖены, String фамилияЖены) {
        this.имяМужа = имяМужа;
        this.фамилияМужа = фамилияМужа;
        this.имяЖены = имяЖены;
        this.фамилияЖены = фамилияЖены;
    }

    public String gethFirstName() {
        return имяМужа;
    }

    public void sethFirstName(String hFirstName) {
        this.фамилияМужа = hFirstName;
    }

    public String gethLastName() {
        return фамилияМужа;
    }

    public void имяЖены(String hLastName) {
        this.имяЖены = hLastName;
    }

    public String getwFirstName() {
        return имяЖены;
    }

    public void setwFirstName(String wFirstName) {
        this.фамилияЖены = wFirstName;
    }

    public String getwLastName() {
        return фамилияЖены;
    }

    public void setwLastName(String wLastName) {
        this.фамилияЖены = wLastName;
    }

}
