package com.mluch.javastart.lesson4.hw.lv0;

public class Console {

    public static void main(String[] args) {
        for (int a = 10; a <= 30; a++) {
            System.out.print(a + " ");
        }

        System.out.println();

        for (int b = 20; b >= -10; b--) {
            System.out.print(b + " ");
        }

        System.out.println();

        for (int c = 10; c <= 100; c = c + 10) {
            System.out.print(c + " ");
        }

        System.out.println();

        for (int d = 300; d >= -200; d = d - 50) {
            System.out.print(d + " ");
        }

    }

}
