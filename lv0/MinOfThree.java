package com.mluch.javastart.lesson4.hw.lv0;

public class MinOfThree {


    public static void main(String[] args) {
        int a = 3, b = 8, c = -5;

        int d = Math.min(a, b);
        int min = Math.min(d, c);

        System.out.println(min);
    }

//  вариант 2
//    public static void main(String[] args) throws Exception {
//
//        System.out.println(min(1,7,-5));
//    }
//
//    public static int min (int a, int b, int c) {
//
//        int m1, m2, m3;
//
//        if (a < b){
//            m1 = a;
//        } else {
//            m1 = b;
//        }
//
//        if (b < c) {
//            m2 = b;
//        } else {
//            m2 = c;
//        }
//
//        if (m1 < m2){
//            m3 = m1;
//        } else {
//            m3 = m2;
//        }
//
//        return m3;
//
//
//
//    }

}


//Input - Output
//1, 7, -5  -5