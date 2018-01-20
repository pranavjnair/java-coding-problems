package com.nair.codingproblems.progressivestudent;

public class ProgressiveStudent {
    public boolean scoresIncreasing(double[] scores) {
        boolean resultant = true;
        for (int x = 1; x < scores.length; x++) {
            if (scores[x - 1] > scores[x]) {
                resultant = false;
                break;
            }
        }
        return resultant;
    }
}
