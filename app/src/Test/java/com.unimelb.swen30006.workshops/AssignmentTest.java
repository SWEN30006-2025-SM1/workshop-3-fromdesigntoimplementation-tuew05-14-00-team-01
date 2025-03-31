package com.unimelb.swen30006.workshops;

import org.junit.jupiter.api.Test;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class AssignmentTest {

    @Test
    void testSubmission() {
        Subject subject = new Subject("Test", "T001", new Instructor[0]);
        subject.createAssignment("A1", "online", new Date(), new File());

        Student student = new Student(
                "Test User", "test@email.com", "tester", "1234",
                "S001", new Subject[]{subject}
        );

        Receipt r = student.submitAssignment("A1", new File(), "test note");
        assertNotNull(r);
        assertEquals(Status.OnTime, r.status);
    }
}
