package com.mluch.javastart.lesson6.hw.lvl0;

import java.util.Arrays;

public class ArrayNumber {

    public static void main(String[] args) {

        int[] array = getInts();

        System.out.println(Arrays.toString(array));
    }

    public static int[] getInts() {
        int[] array = new int[10];

        int filler = 42;
        for (int i = 0; i < array.length; i++) {
            array[i] = filler;
        }
        return array;
    }
}

//[42, 42, 42, 42, 42, 42, 42, 42, 42, 42]