package com.tiy.practice;

/**
 * Created by Yehia830 on 8/17/16.
 */
public class Person {
    private String firstname;
    private String lastname;


    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;

    }
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
