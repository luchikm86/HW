package com.mluch.javastart.lesson6.hw.lvl0.method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintEvensNumber {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter from: ");
        int from = Integer.parseInt(reader.readLine());
        System.out.print("Enter from: ");
        int to = Integer.parseInt(reader.readLine());

        printLine(from, to);
        printEvens(from, to);
    }

    public static void printEvens(int from, int to) {
        for (int i = from; i <= to; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void printLine(int from, int to) {
        if (from > to) {
            throw new IllegalArgumentException("negative from (from > to): " + from);
        }
    }

}

//Enter from: 11
//Enter from: 22
//12 14 16 18 20 22