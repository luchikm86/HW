package com.mluch.javastart.lesson6.hw.lvl1;

public class ArrayLastPositiveFinder {

    public static void main(String[] args) {
        int[] array = {-3, -1, 20, -2, 10, 0};

        int arr = lastPositiveElem(array);
        System.out.println(arr);
    }

    public static int lastPositiveElem(int[] array) {

        int a = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                a = array[i];
            }
        }
        return a;
    }
}

//{-3, -1, 20, -2, 10, 0} -> 10
//{-4, -10, -20, -10, 0} -> -2147483648
//{-3, -1, -20, -2, -10, 0} -> -2147483648