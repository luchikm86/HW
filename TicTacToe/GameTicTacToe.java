package com.mluch.javastart.hw;

import java.util.Scanner;

public class GameTicTacToe {

    public static Scanner scanner = new Scanner(System.in);
    public static String star = " * ";
    public static int size = 3;
    public static String[][] field = new String[size][size];
    public static String playerOne = " X ";
    public static String playerTwo = " O ";


    public static void main(String[] args) {

        // пример поля игры
        System.out.println("0  1  2  3");
        System.out.println("1  .  .  .");
        System.out.println("2  .  .  .");
        System.out.println("3  .  .  .");

        twoPlayers();

    }

    public static void twoPlayers() {
        int x = 0;
        int y = 0;
        // колличество ходов игроков
        for (int i = 0; i < field.length * size; i++) {
            //ход первого игрока
            playerOne(i);
            //ход второго игрока
            playerTwo(i);
            //вывод
            for (String[] aField : field) {
                for (int k = 0; k < field.length; k++) {
                    if (aField[k] == playerOne) {
                        System.out.print(playerOne);
                    }
                    if (aField[k] == playerTwo) {
                        System.out.print(playerTwo);
                    } else if (aField[k] != playerOne && aField[k] != playerTwo) {
                        System.out.print(star);
                    }
                }
                System.out.println();
            }
        }
    }

    public static int playerOne(int i) {
        int x;
        int y;
        if ((i % 2) == 0) {
            System.out.println("Player 1");
            System.out.print("Enter the first value (1 - " + size + "): ");
            x = scanner.nextInt() - 1;
            System.out.print("Enter the second value (1 - " + size + "): ");
            y = scanner.nextInt() - 1;
            field[x][y] = playerOne;
            checkWin();
        }
        return i;
    }

    public static int playerTwo(int i) {
        int x;
        int y;
        if ((i % 2) != 0) {
            System.out.print("Player 2");
            System.out.print("Enter the first value (1 - " + size + "): ");
            x = scanner.nextInt() - 1;
            System.out.println("Enter the second value (1 - " + size + "): ");
            y = scanner.nextInt() - 1;
            field[x][y] = playerTwo;
            checkWin();
        }
        return i;
    }

    public static void checkWin(){
        checkLine();
        checkColumn();


    }

    public static void checkLine(){

        for (int i = 0; i < field.length; i++) {
            if (field[i][0] == playerOne && field[i][1] == playerOne && field[i][2] == playerOne){
                System.out.println("Player 1 - WIN");
                break;
            } else if (field[i][0] == playerTwo && field[i][1] == playerTwo && field[i][2] == playerTwo) {
                System.out.println("Player 2 - WIN");
                break;
            }
        }
    }

    public static void checkColumn(){
        if ((field[0][0] == playerOne && field[1][1] == playerOne && field[2][2] == playerOne) ||
                (field[0][2] == playerOne && field[1][1] == playerOne && field[2][0] == playerOne)){
            System.out.println("Player 1 - WIN");

        } else if ((field[0][0] == playerTwo && field[1][1] == playerTwo && field[2][2] == playerTwo) ||
                (field[0][2] == playerTwo && field[1][1] == playerTwo && field[2][0] == playerTwo)) {
            System.out.println("Player 2 - WIN");

        }
    }

}