package com.mluch.javastart.lesson4.hw.lv1.cond;

import java.util.Scanner;

public class Blackjack {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter cardA: ");
        int cardA = scanner.nextInt();
        System.out.print("Enter cardB: ");
        int cardB = scanner.nextInt();
        scanner.close();

        if (cardA == 21 && cardB == 21) {
            System.out.print(0);
        } else if ((cardA <= 21 && cardA > cardB) && (cardA > 0 && cardB > 0)) {
            System.out.print(cardA);
        } else if ((cardB <= 21 && cardB > cardA) && (cardB > 0 && cardA > 0)) {
            System.out.print(cardB);
        } else if ((cardA <= 0 || cardB <= 0) || (cardA > 21 || cardB > 21)) {
            System.out.println("Ошибка");
        }
    }
}


//    19 20 -> 20
//    22 -19 -> Ошибка
//    22 23 -> 0

