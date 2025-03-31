package com.unimelb.swen30006.workshops;

/**
 * Abstract base class for controllers requiring user authentication.
 */
public abstract class AuthenticatedController {
    protected User user;

    public AuthenticatedController(User user) {
        this.user = user;
    }

    public abstract void render();
}

