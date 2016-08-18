package com.tiy.practice;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import sun.jvm.hotspot.jdi.IntegerValueImpl;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Yehia830 on 8/16/16.
 */
public class Day8Runner {
    public static void main(String[] args) {
        int choice = 0;
        Hospital hospital = new Hospital("Dom's Hospital");
        Scanner userInput = new Scanner(System.in);
        System.out.println("How many doctors are in the hospital?");
        choice = Integer.valueOf(userInput.nextLine());
        ArrayList<String> doctors = new ArrayList<String>();
        ArrayList<String> docspec = new ArrayList<String>();
        for (int counter = 1; counter <= choice; counter++) {
            System.out.println("What is the first name and last name of doctor " + counter);

            doctors.add(userInput.nextLine());
        }
        for (int counter = 1; counter <= doctors.size(); counter++) {
            int actionChoice = 0;
            System.out.println("Please choose the number that corresponds with the speciality of your doctor" + counter);
            System.out.println("1.Lung Cancer");
            System.out.println("2.Brain Cancer");
            System.out.println("3.Heart Cancer");
            System.out.println("4.Strep Throat");
            System.out.println("0. Do not see speciality");
            actionChoice = Integer.valueOf(userInput.next());
            if (actionChoice == 1) {
                docspec.add("lungcancer");
            }
            if (actionChoice == 2) {
                docspec.add("Brain Cancer");
            }
            if (actionChoice == 3)
                docspec.add("Heart Cancer");

            if (actionChoice == 4) {
                docspec.add("Strep Thorat");
            }
            if (actionChoice == 0) {
                break;

            }


        }

        String patientName;
        System.out.println("What is the patients first name?");
        patientName = userInput.nextLine();
        System.out.println("What is the patients last name?");
        patientName = userInput.nextLine();

        int actionChoice = 0;
        System.out.println("Which one of these is the patient concerned about?");
        System.out.println("1.Lung Cancer");
        System.out.println("2.Brain Cancer");
        System.out.println("3.Heart Cancer");
        System.out.println("4.Strep Throat");
        System.out.println("0. Do not see concern");
        actionChoice = Integer.valueOf(userInput.next());
        if (actionChoice == 1) {
            HospitalDoctor firstDoc = new Pulmonologist("David", "Johns", "Morehouse");
            if (actionChoice == choice) {
                Patient patient = new Patient(patientName, patientName);
                boolean success = ((Pulmonologist) firstDoc).operate(patient);

            } else {
                System.out.println("operation not successful");
            }
            if (actionChoice == 2) {
                HospitalDoctor secondDoc = new SurgicalOncologist("James", "Glavin", "MIT");
                if (actionChoice == choice) {
                    System.out.println("operation");
                    //Patient patient = new Patient(patientName, patientName);
                    //boolean success = ((SurgicalOncologist) secondDoc).operate(patient);
                } else {
                    System.out.println("operation not successful");
                }

                if (actionChoice == 3) {
                    HospitalDoctor thridDoc = new HeartSurg("Yehia", "Abdullah", "TIO");
                    Patient patient = new Patient(patientName, patientName);
                    if (actionChoice == choice) {
                        boolean success = ((HeartSurg) thridDoc).operate(patient);
                    }
                } else {
                    System.out.println("operation not successful");
                }
                if (actionChoice == 4) {
                    HospitalDoctor fourthDoc = new Otolaryngologists("Mike", "Scott", "GSU");
                    Patient patient = new Patient(patientName, patientName);
                    if (actionChoice == choice) {
                        boolean success = ((Otolaryngologists) fourthDoc).operate(patient);
                        System.out.println("operation successful!");
                    } else {
                        System.out.println("operation not successful");
                    }
                    if (actionChoice == 0) {
                        System.out.println("You need to go to another hospital!");

                    }


                }
            }
        }
    }
}