package com.mluch.javastart.lesson6.hw.lvl0.arrays;

import java.util.Arrays;

public class ArrayBool {

    public static void main(String[] args) {

        boolean[] arr = getBooleans();
        System.out.println(Arrays.toString(arr));


    }

    public static boolean[] getBooleans() {
        int size = 30;
        return new boolean[size];
    }
}

