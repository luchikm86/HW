package com.mluch.javastart.lesson6.hw.lvl1;

import java.util.Arrays;

public class VectorSumCalculator {
    public static void main(String[] args) {

        int[] array1 = {10, 30, 20};
        int[] array2 = {2, 3};

        int[] vectorSum = vectorSum(array1, array2);
        System.out.println(Arrays.toString(vectorSum));
    }

    public static int[] vectorSum(int[] a, int[] b) {
        int len = Math.min(a.length, b.length);
        int[] res = new int[len];

        for (int i = 0; i < res.length; i++) {
            res[i] = a[i] + b[i];
        }

        return res;
    }
}

//{10, 30, 20} {2, 3}-> [12, 33]
//{10, 20, 30} {40, 20, 50, 100} -> [50, 40, 80]
