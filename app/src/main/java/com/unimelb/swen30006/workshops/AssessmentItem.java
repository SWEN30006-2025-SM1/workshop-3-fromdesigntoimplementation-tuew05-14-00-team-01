package com.unimelb.swen30006.workshops;

import java.util.ArrayList;
import java.util.Date;

/**
 * Represents an assignment or assessment task in a subject.
 */
public class AssessmentItem {
    public String uploadMethod;
    public String title;
    public Date dueDate;
    public ArrayList<Submission> submissions;
    public Subject subject;
    public AssessmentInstructions instructions;

    public AssessmentItem(String uploadMethod, String title, Date dueDate, Subject subject, AssessmentInstructions instructions) {
        this.uploadMethod = uploadMethod;
        this.title = title;
        this.dueDate = dueDate;
        this.subject = subject;
        this.instructions = instructions;
        this.submissions = new ArrayList<>();
    }

    public boolean makeSubmission(Submission s) {
        this.submissions.add(s);
        return true;
    }

    public static AssessmentItem findByID(String id) {
        return null;
    }
}
