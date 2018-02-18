package com.mluch.javastart.lesson6.hw.lvl0;

public class ArrayPositiveElement {
    public static void main(String[] args) {
       int[] array = {10,-20,7,-6,22};

        countPositiveEl(array);
    }
    
    public static void countPositiveEl(int[] array) {
        checkNotNull(array);

        for (int i : array) {
            if (i > 0) {
                System.out.println(i);
            }
        }
    }

    private static void checkNotNull(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("null array");
        }
    }
}


//10
//7
//22