package com.hillel.yarychevskyi.lessons.lesson9;

import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int m = 0;


        System.out.println("Pleas enter n");
        while (true) {
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n < 0) {
                    System.out.println("Please enter positive number");
                } else {
                    break;
                }
                scanner.nextLine();
            } else {
                System.out.println("Wrong data, try again");
                scanner.nextLine();
            }
        }
        System.out.println("Pleas enter m");
        while (true) {
            if (scanner.hasNextInt()) {
                m = scanner.nextInt();
                if (m < 0) {
                    System.out.println("Please enter positive number");
                } else {
                    break;
                }
                scanner.nextLine();
            } else {
                System.out.println("Wrong data, try again");
                scanner.nextLine();
            }
        }


        int[][] array = new int[n][m];
        int[][] array2 = new int[m][n];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 10);
            }

        }
        System.out.println("Array");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");

            }
            System.out.println();
        }
        System.out.println("Array2");
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j] = array[j][i];

            }

        }
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j] + "\t");
            }
            System.out.println();

        }


    }

}

