package com.mluch.javastart.lesson6.hw.lvl1;


import java.util.Arrays;
import java.util.Scanner;

public class ArrayReader {

    public static void main(String[] args) {

        int[] array = readArray();

        System.out.print(Arrays.toString(array));


    }

    public static int[] readArray() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = scan.nextInt();

        int[] array = new int[size];

        System.out.println("Create array elements: ");
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }
        return array;
    }

}


//[3] [10 30 20] -> [10, 30, 20]
//[5] [10 -34 0 6 -8] -> [10, -34, 0, 6, -8]