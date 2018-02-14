package com.mluch.javastart.lesson4.hw.lvl1.loops;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PalindromeChecker {

    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter: ");
        String s = reader.readLine();
        System.out.println(isPalindrome(s));


    }

    public static Boolean isPalindrome(String s) {
        return s.equals((new StringBuilder(s)).reverse().toString());
    }
}


//Enter: apple
//false

//Enter: madam
//true