package com.mluch.javastart.lesson4.hw.lv0;

import java.util.Scanner;

public class KeyboardInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter from: ");
        int from = scanner.nextInt();

        System.out.print("Enter to: ");
        int to = scanner.nextInt();

        scanner.close();

        while (from <= to) {
            System.out.print(from + " ");
            from++;
        }

    }
}

//Input - Output
//Enter from: 1
//Enter to: 10
//1 2 3 4 5 6 7 8 9 10