package com.tiy.practice;

/**
 * Created by Yehia830 on 8/18/16.
 */
public class Patient extends Person {
    private boolean isSick = true;

    public boolean isSick() {

        return isSick;
    }

    public void setSick(boolean sick) {

        isSick = sick;
    }

    public Patient(String firstName, String lastName) {
        super(firstName, lastName);
    }
}
