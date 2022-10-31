package com.hillel.yarychevskyi.lessons.lesson16;

//Додайте метод, який буде рахувати середнє арифметичне елементів масиву.
// Зробіть метод, який прийматиме на вхід двомірну матрицю (двовимірний масив) у та перевіряти чи є вона квадратною
//  В тестовому класі створіть тестову матрицю та передайте її в метод тестованого класу


import java.util.Scanner;

public class ArraysUtil {
    public static double getArithmeticMeanArrays(int[] array) {
        double counter;
        int sum = 0;
        if (array == null || array.length == 0) {
            return 0.0;
        }

        for (int j : array) {
            sum += j;
        }
        counter= (double) sum / array.length;
        return counter;
    }

    public static boolean getArrays(int[][] array) {
        double value = 0;
        if (array == null || array.length == 0) {
            return false;
        }


        for (int[] ints : array) {
            if (ints == null || ints.length == 0) {
                return false;
            }
            value += ints.length;
        }

        value = value / (double) array.length;
        return value == array.length;
    }
}