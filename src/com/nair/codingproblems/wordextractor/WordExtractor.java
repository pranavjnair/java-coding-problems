package com.nair.codingproblems.wordextractor;

public class WordExtractor {
    public String[] extractElements(String[] in, int count) {
        String[] output = new String[count];
        for (int i = 0; i < count; i++) {
            output[i] = in[i];
        }
        return output;
    }
}
