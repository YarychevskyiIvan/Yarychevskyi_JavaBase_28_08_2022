package com.hillel.yarychevskyi.lessons.lesson8;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[] mass1 = new int[7];
        int[] mass2 = new int[7];

        for (int i = 0; i < mass1.length; i++) {
            mass1[i] = (int) (Math.random() * 10);
            mass2[i] = (int) (Math.random() * 10);
        }
        int counter = 0;
        int temp = 0;
        for (int i = 0; i < mass1.length - 1; i++) {
            for (int j = 0; j < mass1.length - 1 - i; j++) {
                counter++;
                if (mass1[j] > mass1[j + 1]) {
                    temp = mass1[j];
                    mass1[j] = mass1[j + 1];
                    mass1[j + 1] = temp;
                }
            }
        }
        int counter2 = 0;
        int temp2 = 0;
        for (int i = 0; i < mass2.length - 1; i++) {
            for (int j = 0; j < mass2.length - 1 - i; j++) {
                counter2++;
                if (mass2[j] > mass2[j + 1]) {
                    temp = mass2[j];
                    mass2[j] = mass2[j + 1];
                    mass2[j + 1] = temp;
                }
            }
        } System.out.println(Arrays.toString(mass1));
        System.out.println(Arrays.toString(mass2));




    }
}