package com.tiy.practice;

/**
 * Created by Yehia830 on 8/18/16.
 */
public class HeartSurg  extends HospitalDoctor implements Surgeon {

    public HeartSurg(String firstName, String lastName, String college) {
        super(firstName, lastName, college);
    }

    public Diagnosis diagnose() {

        return new Diagnosis(Diagnosis.HEART_CANCER);
    }

    public boolean operate(Patient patient) {
        patient.setSick(false);
        return true; // successfull operation
    }
}
