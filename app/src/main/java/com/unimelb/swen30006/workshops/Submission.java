package com.unimelb.swen30006.workshops;
import java.util.ArrayList;

// Sample private submission class to be replaced by your implementation
class Submission {
    private int attemptNum;
<<<<<<< HEAD
    private File[] files;
    private int numFiles;

    // Return two fake files
    public File[] includedFiles(){
        File[] files = new File[2];
        files[0] = new File();
        files[1] = new File();
=======
    private ArrayList<File> files = new ArrayList<File>();
    private int numFiles = 0;

    public Submission(int attemptNum){
        this.attemptNum = attemptNum;
    }

    public Submission(int attemptNum, File[] files) {
        this.attemptNum = attemptNum;
        for(File f : files){
            this.addFile(f);
        }
    }

    public ArrayList<File> includedFiles(){
>>>>>>> b9c22c045ac3376ce391f051b18a869d35ff5c1d
        return files;
    }

    public void addFile(File f){
        files.add(f);
        numFiles++;
    }
}
