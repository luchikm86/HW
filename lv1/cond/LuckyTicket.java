package com.mluch.javastart.lesson4.hw.lv1.cond;

import java.util.Scanner;

public class LuckyTicket {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your ticket: ");
        int ticket = scanner.nextInt();
        scanner.close();

        int a = ticket / 100000 % 10;
        int b = ticket / 10000 % 10;
        int c = ticket / 1000 % 10;
        int d = ticket / 100 % 10;
        int e = ticket / 10 % 10;
        int f = ticket % 10;
        int sum1 = a + b + c;
        int sum2 = d + e + f;

        System.out.print("My ticket is Lucky? - ");
        if (sum1 == sum2) {
            System.out.print("true");
        } else if (ticket < 0 || ticket > 999999) {
            System.out.print("Ошибка");
            System.exit(-1);
        } else if (sum1 != sum2) {
            System.out.print("false");

        }
    }
}