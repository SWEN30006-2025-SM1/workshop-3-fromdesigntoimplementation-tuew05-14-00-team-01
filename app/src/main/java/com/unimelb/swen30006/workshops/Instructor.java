package com.unimelb.swen30006.workshops;

/**
 * Represents an instructor who teaches subjects.
 */
public class Instructor {
    public String staffID;
    public Subject[] subjects;

    public Instructor(String staffID, Subject[] subjects) {
        this.staffID = staffID;
        this.subjects = subjects;
    }
}
