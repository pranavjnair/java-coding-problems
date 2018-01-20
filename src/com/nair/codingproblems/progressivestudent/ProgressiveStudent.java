package com.nair.codingproblems.progressivestudent;

public class ProgressiveStudent {
    public boolean scoresIncreasing(double[] scores) {
        double initial = 0, comparison = 0;
        boolean resultant=true;
        for(int x = 0;x<scores.length;x++){
            if (initial == 0){
                initial = scores[x];
            }
            else{
                initial = scores[x-1];
            }
            comparison = scores[x];
            if (initial<=comparison){
                resultant = true;
            }
            else {
                resultant = false;
                break;
            }
        }
        return resultant;
    }
}
