package com.mluch.javastart.lesson4.hw.lv0;

public class DayOfTheWeek {

    public static void main(String[] args) {

        int day =8;

        if (day <= 5) {
            System.out.println("weekday");
        } else if (!(day >7)){
            System.out.println("weekend");
        } else {
            System.out.println("неверное значение");
        }
    }
}

//Input - Output
//1   weekday
//5   weekday
//7   weekend
//8   неверное значение