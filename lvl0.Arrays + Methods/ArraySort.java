package com.mluch.javastart.lesson6.hw.lvl0;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] val = {1, 23, 3, 8, 2, 4, 4};
        Arrays.sort(val);
        System.out.println(Arrays.toString(val));
    }
}

//[1, 2, 3, 4, 4, 8, 23]