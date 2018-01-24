package com.nair.codingproblems.wordextractor;

import java.util.Arrays;

public class WordExtractorDriver {
    public static void main(String args[]) {
        String[] a = new String[]{"a", "b", "c", "d"};
        WordExtractor first = new WordExtractor();
        System.out.println("String After Extraction: " + Arrays.toString(first.extractElements(a, 3)));
    }
}
