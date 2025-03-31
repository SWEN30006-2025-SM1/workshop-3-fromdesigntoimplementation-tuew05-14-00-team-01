package com.unimelb.swen30006.workshops;

import java.util.Date;

/**
 * Represents a receipt issued after a student submits an assignment.
 */
public class Receipt {
    public Date time;
    public Status status;

    public Receipt(Date time, Status status) {
        this.time = time;
        this.status = status;
    }
}
