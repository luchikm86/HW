package com.mluch.javastart.lesson6.hw.lvl1;

import java.util.Arrays;

public class SortedChecker {

    public static void main(String[] args) {
        int[] array = {10, 20, 50};

        boolean bool = isSorted(array);
        System.out.println(bool);
    }

    public static boolean isSorted(int[] array) {

        int[] arr = Arrays.copyOf(array, array.length);
        Arrays.sort(arr);

        return Arrays.equals(array, arr);

    }
}

