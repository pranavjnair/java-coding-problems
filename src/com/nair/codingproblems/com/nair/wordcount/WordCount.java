package com.nair.codingproblems.com.nair.wordcount;

import java.io.*;
import java.util.ArrayList;

public class WordCount {
    public int amtWords() throws IOException {
        ArrayList<Integer> list = new ArrayList<Integer>();
        File toRead = new File("/Users/pranav/Desktop/MiscellaneousDocuments/TextDocuments/Photography.txt");
        try{
            BufferedReader inputString = new BufferedReader(new FileReader(toRead));
            String words = null;
            while((words = inputString.readLine()) != null){
                words = list.add(Integer.parseInt(words));
            }
        }
    }
//print out the list
}
