package com.mluch.javastart.lesson6.hw.lvl0;


public class ArrayRevPositiveElement {

    public static void main(String[] args) {
        int[] array = {10,-20,7,-6,22};

        countPositiveEl(array);
      // нужно сделать строку вывода в обратном порядке

    }


    public static void countPositiveEl(int[] array) {
        checkNotNull(array);

        for (int ind : array) {
            if (ind > 0) {

                System.out.print(ind + " ");
            }
        }
    }

    private static void checkNotNull(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("null array");
        }
    }
}
