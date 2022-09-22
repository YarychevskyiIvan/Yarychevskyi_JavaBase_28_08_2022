package com.hillel.yarychevskyi.lessons.lesson7;

import java.util.Arrays;

public class MyApp {
    public static void main(String[] args) {
        int[] team1 = new int[25];
        int[] team2 = new int[25];
        for (int i = 0; i < team1.length; i++) {
            team1[i] = (int) ((Math.random() * 23) + 18);
            team2[i] = (int) ((Math.random() * 23) + 18);


        }
        System.out.println(Arrays.toString(team1));
        System.out.println(Arrays.toString(team2));
        int sum1 = 0;
        for (int value : team1) {
            sum1 += value;
        }
        System.out.println("Середній вік команди = " + sum1 / team1.length);
        int sum2 = 0;
        for (int value2 : team2) {
            sum2 += value2;

        }
        System.out.println("Середній вік команди = " + sum2 / team2.length);


    }

}

