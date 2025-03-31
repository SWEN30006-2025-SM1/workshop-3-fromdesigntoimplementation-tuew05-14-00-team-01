package com.unimelb.swen30006.workshops;

import java.util.ArrayList;
import java.util.Date;

/**
 * Represents a subject taught at the university.
 */
public class Subject {
    public String name;
    public String code;
    public ArrayList<AssessmentItem> assignments;
    public Instructor[] instructors;

    public Subject(String name, String code, Instructor[] instructors) {
        this.name = name;
        this.code = code;
        this.assignments = new ArrayList<>();
        this.instructors = instructors;
    }

    public Subject createAssignment(String name, String uploadMethod, Date dueDate, File file) {
        AssessmentInstructions instructions = new AssessmentInstructions(file);
        AssessmentItem item = new AssessmentItem(uploadMethod, name, dueDate, this, instructions);
        this.assignments.add(item);
        return this;
    }

    public AssessmentItem findByID(String id) {
        for (AssessmentItem a : assignments) {
            if (a.title.equals(id)) {
                return a;
            }
        }
        return null;
    }

    public static Subject findByCode(String code) {
        return null;
    }
}
