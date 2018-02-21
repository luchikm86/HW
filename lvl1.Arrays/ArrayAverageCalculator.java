package com.mluch.javastart.lesson6.hw.lvl1;

public class ArrayAverageCalculator {
    public static void main(String[] args) {

        int[] array = {5, 10, 2};

        int ar = average(array);
        System.out.println(ar);

    }

    public static int average(int[] array) {
        if (array.length <= 0) {
            throw new IllegalArgumentException("negative size: " + array.length);
        }

        int sum = 0;
        int calc;
        for (int elem : array) {
            sum = sum + elem;
        }
        calc = sum/array.length;
        return calc;
    }

}
