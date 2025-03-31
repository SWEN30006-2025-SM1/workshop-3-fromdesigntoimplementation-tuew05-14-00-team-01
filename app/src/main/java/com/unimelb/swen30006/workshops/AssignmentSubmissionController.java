package com.unimelb.swen30006.workshops;

/**
 * Controller that allows students to submit assignments.
 */
public class AssignmentSubmissionController extends AuthenticatedController {
    private Student student;

    public AssignmentSubmissionController(Student student) {
        super(student);  // student is a User
        this.student = student;
    }

    @Override
    public void render() {
        System.out.println("Rendering assignment submission view for: " + student.studentID);
    }

    public Receipt submitAssignment(String id, File f, String note) {
        return student.submitAssignment(id, f, note);
    }
}
