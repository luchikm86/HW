package com.mluch.javastart.lesson6.hw.lvl0.method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RangeSumFromTo {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter from: ");
        int from = Integer.parseInt(reader.readLine());
        System.out.print("Enter from: ");
        String str = reader.readLine();
        int to = Integer.parseInt(str);

        printLine(from, to);
        System.out.print("Sum from .. to: " + rangeSum(from, to));
    }

    public static int rangeSum(int from, int to) {
        int sum = from;
        for (int i = from + 1; i <= to; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static void printLine(int from, int to) {
        if (from > to) {
            throw new IllegalArgumentException("negative from (from < to): " + from);
        }
    }

}

//Enter from: 10
//Enter from: 14
//Sum from .. to: 60