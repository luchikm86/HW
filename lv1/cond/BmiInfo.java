package com.mluch.javastart.lesson4.hw.lv1.cond;

import java.util.Scanner;

public class BmiInfo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight: ");
        double weight = scanner.nextDouble();
        System.out.print("Enter height: ");
        double height = scanner.nextDouble();
        scanner.close();

        double bmi = weight / Math.pow(height, 2);

        if ((weight < 0.0) || (height < 0.0)) {
            System.out.println("Ошибка");
            System.exit(-1);
        } else if (bmi <= 18.5) {
            System.out.println("Underweight");
        } else if ((bmi > 18.5) && (bmi <= 25.0)) {
            System.out.println("Normal");
        } else if (bmi > 25.0) {
            System.out.println("Overweight");
        }

    }
}

//Enter weight: 70
//Enter height: -1,75
//Ошибка

//Enter weight: 70
//Enter height: 1,75
//Normal

//Enter weight: 90
//Enter height: 1,8
//Overweight