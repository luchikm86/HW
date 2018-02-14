package com.mluch.javastart.lesson4.hw.lvl1.loops;

import java.util.Scanner;

public class EvensRangePrinter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first: ");
        int first = scanner.nextInt();
        System.out.print("Enter last: ");
        int last = scanner.nextInt();
        scanner.close();

        if (first < last) {
            for (int n = first; n <= last; n++) {
                if (n%2 == 0) {
                    System.out.println(n);
                }
            }
        }
    }
}
