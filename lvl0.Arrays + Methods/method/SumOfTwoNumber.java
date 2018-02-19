package com.mluch.javastart.lesson6.hw.lvl0.method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfTwoNumber {

    public static void main(String[] args) throws IOException {
        int sum = getSum();
        System.out.print("Sum a + b = " + sum);

    }

    public static int getSum() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a: ");
        int a = Integer.parseInt(reader.readLine());
        System.out.print("Enter b: ");
        int b = Integer.parseInt(reader.readLine());

        return sum(a, b);
    }

    public static int sum(int a, int b){
        int sum = a + b;
        return sum;
    }

}

// 4 6 -> 10