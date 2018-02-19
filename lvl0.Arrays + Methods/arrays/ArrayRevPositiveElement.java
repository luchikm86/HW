package com.mluch.javastart.lesson6.hw.lvl0.arrays;


public class ArrayRevPositiveElement {

    public static void main(String[] args) {
        int[] array = {10,-20,7,-6,22};

        countPositiveEl(array);

    }


    public static void countPositiveEl(int[] array) {
        checkNotNull(array);

        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] > 0)
                System.out.print(array[i] + " ");
        }
    }

    private static void checkNotNull(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("null array");
        }
    }
}
