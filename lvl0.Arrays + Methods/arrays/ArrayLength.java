package com.mluch.javastart.lesson6.hw.lvl0.arrays;

public class ArrayLength {

    public static void main(String[] args) {
        int[] array = {44, 5, 7, -3, 23};
        System.out.println(arrayLength(array));

    }

    public static int arrayLength(int[] array) {
        int len = array.length;
        return len;
    }

}
