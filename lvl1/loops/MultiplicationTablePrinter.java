package com.mluch.javastart.lesson4.hw.lvl1.loops;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MultiplicationTablePrinter {

    public static void main(String[] args) throws Exception{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter: ");
        int size = Integer.parseInt(reader.readLine());


        if (size > 0) {
            for (int i = 1; i <= size; i++){
                for (int g = 1; g <= size; g++){
                    System.out.print(g * i + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Ошибка");
        }

    }
}


//Enter: 5
//1 2 3 4 5
//2 4 6 8 10
//3 6 9 12 15
//4 8 12 16 20
//5 10 15 20 25

//Enter: -3
//Ошибка
