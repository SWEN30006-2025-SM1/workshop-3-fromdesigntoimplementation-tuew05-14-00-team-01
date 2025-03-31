package com.unimelb.swen30006.workshops;

import java.util.Date;
import java.util.HashMap;

/**
 * Represents a student who can submit assignments.
 */
public class Student extends User {
    public String studentID;
    public HashMap<Subject, Receipt[]> submissions;
    public Subject[] subjects;

    public Student(String name, String email, String username, String passwordDigest,
                   String studentID, Subject[] subjects) {
        super(name, email, username, passwordDigest);
        this.studentID = studentID;
        this.subjects = subjects;
        this.submissions = new HashMap<>();
    }

    /**
     * Submit an assignment.
     * @param id Assessment ID
     * @param f File to submit
     * @param note Optional note
     * @return Receipt of submission
     */
    public Receipt submitAssignment(String id, File f, String note) {
        // Find the AssessmentItem
        for (Subject subject : subjects) {
            AssessmentItem assessment = subject.findByID(id);
            if (assessment != null) {
                Submission s = new Submission(new Date(), f, new Note(note));
                boolean success = assessment.makeSubmission(s);
                if (success) {
                    Receipt receipt = new Receipt(new Date(), Status.OnTime);
                    submissions.computeIfAbsent(subject, k -> new Receipt[0]);
                    return receipt;
                }
            }
        }
        return null;
    }
}
