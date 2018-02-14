package com.mluch.javastart.lesson4.hw.lv1.cond;

public class BiggerRectangle {

    public static void main(String[] args) {

        int widht1 = 10;
        int height1 = -20;
        int widht2 = 40;
        int height2 = 30;

        int s1 = widht1 * height1;
        int s2 = widht2 * height2;

        if (s1 > s2 && s1 > 0 && s2 > 0) {
            System.out.println(1);
        } else if (s2 > s1 && s2 > 0 && s1 > 0){
            System.out.println(2);
        } else if (s1 <= 0 || s2 <= 0) {
            System.out.println("Ошибка");
        }

    }

}

//10 20 40 30 -> 2
// 20 40 10 15 -> 1
// 10 -20 40 30 -> Ошибка