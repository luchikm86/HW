package com.mluch.javastart.lesson4.hw.lvl1.loops;

import java.util.Scanner;

public class RangePrinter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first: ");
        int first = scanner.nextInt();
        System.out.print("Enter last: ");
        int last = scanner.nextInt();
        scanner.close();

        if (first <= last) {
            for (int i = first; i <= last; i++) {
                System.out.print(i + " ");
            }
        } else if (first > last) {
            for (int i = first; i >= last; i--) {
                System.out.print(i + " ");
            }
        }
    }
}

//5 1 -> 5 4 3 2 1
//1 5 -> 1 2 3 4 5
//1 1 -> 1