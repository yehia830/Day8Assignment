package com.tiy.practice;

/**
 * Created by Yehia830 on 8/17/16.
 */
public abstract class HospitalDoctor extends Person implements Doctor {
    private String speciality;
    public HospitalDoctor(String firstname, String lastname,String speciality) {
        super(firstname, lastname);
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
