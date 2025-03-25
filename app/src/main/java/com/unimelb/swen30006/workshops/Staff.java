package com.unimelb.swen30006.workshops;

public class Staff extends Person{
    private String[] roles;
    private String staffID;

    public Staff(String name, String staffID){
        super(name);
        this.staffID = staffID;
    }
}
