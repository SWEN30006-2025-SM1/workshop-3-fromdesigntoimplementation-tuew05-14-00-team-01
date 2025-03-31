package com.unimelb.swen30006.workshops;

import java.util.Date;

/**
 * Represents a submission by a student.
 */
public class Submission {
    public Date time;
    public File content;
    public Note note;

    public Submission(Date time, File content, Note note) {
        this.time = time;
        this.content = content;
        this.note = note;
    }

    // Return two fake files
    public File[] includedFiles(){
        File[] files = new File[2];
        files[0] = new File();
        files[1] = new File();
        return files;
    }
}
