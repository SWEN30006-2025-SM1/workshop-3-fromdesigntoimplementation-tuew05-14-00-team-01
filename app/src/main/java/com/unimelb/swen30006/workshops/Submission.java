package com.unimelb.swen30006.workshops;
import java.util.ArrayList;

// Sample private submission class to be replaced by your implementation
class Submission {
    private int attemptNum;
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
        return files;
    }

    public void addFile(File f){
        files.add(f);
        numFiles++;
    }
}
