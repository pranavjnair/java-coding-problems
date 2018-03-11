package com.nair.codingproblems.com.nair.RouteCipher;

public class RouteCipherDriver {
    public static void main(String[] args) {
        String decryption;
        String p1 = "Meet at midnight";
        String p2 = "Finding a needle in hay stack is easy if you set hay on fire";
        RouteCipher r1 = new RouteCipher(2, 3);
        System.out.println(r1.encryptMessage(p1));
        RouteCipher r2 = new RouteCipher(3, 5);
        decryption = r2.encryptMessage(p2);
        System.out.println(decryption);
        System.out.println(r2.decryptMessage(decryption));
    }
}

