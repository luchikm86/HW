package com.mluch.javastart.lesson4.hw.lvl1.loops;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class PrimeChecker {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter: ");
        int integer = Integer.parseInt(reader.readLine());
        BigInteger bigInteger = BigInteger.valueOf(integer);
        boolean probablePrime = bigInteger.isProbablePrime((int) Math.log(integer));
        System.out.println(probablePrime);
    }
}
