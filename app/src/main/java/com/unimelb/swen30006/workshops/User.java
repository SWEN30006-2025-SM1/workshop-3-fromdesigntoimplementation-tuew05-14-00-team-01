package com.unimelb.swen30006.workshops;

/**
 * Generic user of the system.
 */
public class User {
    public String name;
    public String email;
    public String username;
    public String passwordDigest;

    public User(String name, String email, String username, String passwordDigest) {
        this.name = name;
        this.email = email;
        this.username = username;
        this.passwordDigest = passwordDigest;
    }

    public boolean authenticate(String pwd) {
        return this.passwordDigest.equals(pwd);
    }
}