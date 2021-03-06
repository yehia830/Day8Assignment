package com.tiy.practice;

/**
 * Created by Yehia830 on 8/18/16.
 */
public class Pulmonologist extends HospitalDoctor implements Surgeon {

    public Pulmonologist(String firstName, String lastName, String college) {
        super(firstName, lastName, college);
    }

    public Diagnosis diagnose() {

        return new Diagnosis(Diagnosis.LUNG_CANCER);
    }

    public boolean operate(Patient patient) {
        patient.setSick(false);
        return true; // successfull operation
    }
}
