package com.mluch.javastart.lesson6.hw.lvl1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SequenceCreator {

    public static void main(String[] args) throws IOException {

        int size = getSize();
        int[] array = createSequence(size);
        System.out.print(Arrays.toString(array));


    }

    public static int getSize() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter array: ");
        return Integer.parseInt(reader.readLine());
    }

    public static int[] createSequence(int size) {
        printLine(size);

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = i;
        }

        return arr;
    }

    public static void printLine(int size) {
        if (size < 0) {
            throw new IllegalArgumentException("negative size: " + size);
        }
    }
}
