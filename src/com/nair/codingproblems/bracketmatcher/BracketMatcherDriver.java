package com.nair.codingproblems.bracketmatcher;

public class BracketMatcherDriver {
    public static void main(String args[]){
        BracketMatcher first = new BracketMatcher();
        BracketMatcher second = new BracketMatcher();
        BracketMatcher third = new BracketMatcher();
        String a = "((()))";
        String b = "(((())";
        String c = ")))(((";
        System.out.println("Status a: "+first.isValidExpression(a));
        System.out.println("Status b: "+second.isValidExpression(b));
        System.out.println("Status c: "+third.isValidExpression(c));
    }
}
