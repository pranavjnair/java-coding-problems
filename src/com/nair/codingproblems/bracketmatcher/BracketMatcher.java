package com.nair.codingproblems.bracketmatcher;

public class BracketMatcher {
    public boolean isValidExpression(String expression) {
        int leftBracket = 0, rightBracket = 0;
        boolean resultant = false;
        for (int x = 0; x < expression.length(); x++) {
            if (rightBracket > leftBracket) {
                break;
            }
            if (expression.charAt(x) == '(') {
                leftBracket++;
            } else if (expression.charAt(x) == ')') {
                rightBracket++;
            }
        }
        if (rightBracket == leftBracket) {
            resultant = true;
        }
        return resultant;
    }
}
