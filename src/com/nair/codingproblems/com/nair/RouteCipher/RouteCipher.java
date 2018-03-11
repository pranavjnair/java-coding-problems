package com.nair.codingproblems.com.nair.RouteCipher;

public class RouteCipher {
    private String[][] letterBlock;
    private int numRows;
    private int numCols;

    RouteCipher(int r, int c) {
        numRows = r;
        numCols = c;
        letterBlock = new String[r][c];
    }

    //See instructions for implementation details
    private void fillBlock(String str) {
        int counter = 0;
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (counter >= str.length()) {
                    letterBlock[i][j] = "A";
                } else {
                    letterBlock[i][j] = Character.toString(str.charAt(counter));
                }
                counter++;
            }
        }
    }

    private void fillDecryptedBlock(String str) {
        int counter = str.length()-1;
        for (int i = numCols-1; i>=0; i--) {
            for (int j = numRows-1; j>=0; j--) {
                if (counter >= str.length()) {
                    letterBlock[j][i] = " ";
                } else {
                    letterBlock[j][i] = Character.toString(str.charAt(counter));
                }
                counter--;
            }
        }
    }

    //See instructions for implementation details
    private String encryptBlock() {
        String resultant = "";
        for (int i = 0; i < numCols; i++) {
            for (int j = 0; j < numRows; j++) {
                resultant += letterBlock[j][i];
            }
        }
        return resultant;
    }

    private  String decryptBlock(){
        String resultant = "";
        for (int i = 0; i<numRows; i++) {
            for (int j = 0; j<numCols; j++) {
                resultant += letterBlock[i][j];
            }
        }
        return resultant;
    }

    //See instructions for implementation details
    public String encryptMessage(String mes) {
        String editor, resultant = "";
        int extrema = numRows * numCols, stepThrough = extrema, start = 0;
        RouteCipher temporary = new RouteCipher(numRows, numCols);
        if (mes.length() > extrema) {
            while (start < mes.length()) {
                if (stepThrough > mes.length()) {
                    stepThrough = mes.length();
                }
                editor = mes.substring(start, stepThrough);
                temporary.fillBlock(editor);
                resultant += temporary.encryptBlock();
                temporary = new RouteCipher(numRows, numCols);
                start += extrema;
                stepThrough += extrema;
            }
        } else {
            temporary.fillBlock(mes);
            resultant = temporary.encryptBlock();
        }
        return resultant;
    }
    public String decryptMessage (String s){
        String editor, resultant = "";
        int extrema = numRows * numCols, stepThrough = extrema, start = 0;
        RouteCipher temporary = new RouteCipher(numRows, numCols);
        if (s.length() > extrema) {
            while (start < s.length()) {
                if (stepThrough > s.length()) {
                    stepThrough = s.length();
                }
                editor = s.substring(start, stepThrough);
                temporary.fillDecryptedBlock(editor);
                resultant += temporary.decryptBlock();
                temporary = new RouteCipher(numRows, numCols);
                start += extrema;
                stepThrough += extrema;
            }
        } else {
            temporary.fillDecryptedBlock(s);
            resultant = temporary.decryptBlock();
        }
        return resultant;
    }
}

