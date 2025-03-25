package com.unimelb.swen30006.workshops;

public class Student extends Person{
    private String email;
    private String studentID;
    private float grade;

    public Student(String name, String email, String studentID){
        super(name);
        this.email = email;
        this.studentID = studentID;
        this.grade = (float) 0.5;
    }

    public void sendEmailMsg(String msg) {
        // implement email sending
        return;
    }

    public float totalGrade() {
        return this.grade;
    }
}
