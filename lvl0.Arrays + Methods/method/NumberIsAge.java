package com.mluch.javastart.lesson6.hw.lvl0.method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberIsAge {

    public static void main(String[] args) throws IOException {
        int age = getAge();

        System.out.println(isAge(age));
    }

    public static int getAge() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter age: ");
        String str = reader.readLine();
        return Integer.parseInt(str);
    }

    public static boolean isAge(int n) {

        if ((n <= 0) || (n >= 120)){
            return false;
        }
        return true;
    }

}

//Enter age: 0 -> false
//Enter age: 55 -> true
//Enter age: 122 -> false

