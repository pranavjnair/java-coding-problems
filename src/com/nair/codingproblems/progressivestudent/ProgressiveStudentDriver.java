package com.nair.codingproblems.progressivestudent;

public class ProgressiveStudentDriver {
    public static void main(String[] args){
        ProgressiveStudent s1 = new ProgressiveStudent();
        double[] gpas = {2.0,3.5,4.0};
        boolean status = s1.scoresIncreasing(gpas);
        System.out.println("Status: "+ status + " changed.");
    }
}
