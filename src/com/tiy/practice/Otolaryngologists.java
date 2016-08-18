package com.tiy.practice;

/**
 * Created by Yehia830 on 8/18/16.
 */
public class Otolaryngologists extends HospitalDoctor implements Surgeon {
    public Otolaryngologists(String firstName, String lastName, String college) {
        super(firstName, lastName, college);
    }

    public Diagnosis diagnose() {

        return new Diagnosis(Diagnosis.STREP_THROAT);
    }

    public boolean operate(Patient patient) {
        patient.setSick(false);
        return true; // successfull operation
    }
}
