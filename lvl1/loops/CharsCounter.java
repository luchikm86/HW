package com.mluch.javastart.lesson4.hw.lvl1.loops;


import java.util.Scanner;

public class CharsCounter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter: ");
        String s = scanner.nextLine();
        System.out.print("Enter: ");
        char ch = scanner.next().charAt(0);

        int str = s.length();
        int n = 0;
        for (int i = 0; i < str; i++) {
            if (s.charAt(i) == ch) {
                n++;
            }
        }
        System.out.println(n);

    }
}

//Enter: Hello, world!
//Enter: H
//1
