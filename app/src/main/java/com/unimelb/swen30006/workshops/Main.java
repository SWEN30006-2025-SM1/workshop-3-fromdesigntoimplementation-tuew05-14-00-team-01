package com.unimelb.swen30006.workshops;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Instructor instructor = new Instructor("I001", new Subject[0]);

        Subject subject = new Subject("Software Engineering", "SWEN30006", new Instructor[]{instructor});
        instructor.subjects = new Subject[]{subject};

        File instructionFile = new File();
        subject.createAssignment("Assignment 1", "online", new Date(), instructionFile);

        Student student = new Student(
                "Alice", "alice@example.com", "alice123", "pass123",
                "S001", new Subject[]{subject}
        );

        AssignmentSubmissionController controller = new AssignmentSubmissionController(student);
        controller.render();

        File submissionFile = new File();
        Receipt receipt = controller.submitAssignment("Assignment 1", submissionFile, "Please find my submission attached.");

        if (receipt != null) {
            System.out.println("Submission successful!");
            System.out.println("Time: " + receipt.time);
            System.out.println("Status: " + receipt.status);
        } else {
            System.out.println("Submission failed.");
        }
    }
}
