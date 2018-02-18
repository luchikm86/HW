package com.mluch.javastart.lesson6.hw.lvl0.arrays;

public class ArrayIndexPos {
    public static void main(String[] args) {


        int[] array = {-10, 20, 50, -25, 3};

        indexPositiveElems(array);


    }

    public static void indexPositiveElems(int[] array) {
        checkNotNull(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                array[i] = i;
                System.out.println("array[" + i + "]");
            }
        }
    }

    private static void checkNotNull(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("null array");
        }
    }

}

//array[1]
//array[2]
//array[4]