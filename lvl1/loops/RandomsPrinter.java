package com.mluch.javastart.lesson4.hw.lvl1.loops;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;


public class RandomsPrinter {

    private static int count;
    private static int min;
    private static int max;

    public static void main(String[] args) throws Exception{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("count: ");
        String str = reader.readLine();
        count = Integer.parseInt(str);

        System.out.print("min: ");
        String str1 = reader.readLine();
        min = Integer.parseInt(str1);

        System.out.print("max: ");
        String str2 = reader.readLine();
        max = Integer.parseInt(str2);

        printRandoms(count, min, max);

    }

    public static void printRandoms(int count, int min, int max) {
        RandomsPrinter.count = count;
        RandomsPrinter.min = min;
        RandomsPrinter.max = max;

        Random random = new Random();

        if (count > 0 && min <= max) {

            for (int n = 1; n <= count; n++) {
                int randomInt = random.nextInt(max - min) + min;
                System.out.println(randomInt);
            }
        } else {
            System.out.println("Ошибка");
            System.exit(-1);
        }

    }

}

//3 30 20 -> Ошибка
//3 10 20 -> 11 16 10
//5 20 60 -> 54 54 57 34 40
//-3 10 20 -> Ошибка

