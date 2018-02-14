package com.mluch.javastart.lesson4.hw.lvl1.loops;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SumApp {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        for (int i = 1; i > 0; i++) {
        System.out.print("Enter: ");
        int num1 = Integer.parseInt(reader.readLine());
            int num2 = num1 + sum;
            sum = num2;
            if (num1 == 0) {
                System.out.println(sum);
                break;
            }
        }
    }
}

//10 20 30 -> 60
