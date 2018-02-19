package com.mluch.javastart.lesson6.hw.lvl0.method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindLastChar {

    public static void main(String[] args) throws IOException {
        String s = getString();
        printLine(s);
        System.out.println("Last char: " + lastChar(s));
    }

    public static String getString() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter text: ");
        return reader.readLine();
    }

    public static char lastChar(String s) {
        int num = s.length();
        char last = s.charAt(num -1);

        return last;
    }

    public static void printLine(String s) {
        if (s.length()<= 0) {
            throw new IllegalArgumentException("negative char: " + s.length());
        }
    }

}

//Enter text: Hello my friend.
//Last char: .

//Enter text: Java
//Last char: a