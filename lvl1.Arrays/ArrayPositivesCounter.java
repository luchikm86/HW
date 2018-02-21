package com.mluch.javastart.lesson6.hw.lvl1;

public class ArrayPositivesCounter {
    public static void main(String[] args) {

        int[] array = {-3, 0, -1, 4, -2, 5};

        int arr = countPositives(array);
        System.out.println(arr);


    }

    public static int countPositives(int[] array) {

        int counter = 0;
        for (int i : array) {
            if (i > 0)
                counter += 1;
        }
            return counter;
    }

}

//{-3, 0, -1, 4, -2, 5} -> 2
//{-3, 0, -1, -4, -2, -5} -> 0
//{} -> 0