package com.hillel.yarychevskyi.lessons.lesson3;

public class MyApp {
    public static void main(String[] args) {
        int a = 12;
        int b = 15;
        int h = 20;
        int volume = a * b * h;
        System.out.println("Об'єм паралелепіпеда =" + volume + "m");
        int length = 4 * (a + b + h);
        System.out.println("Сумарна довжина всіх сторін =" + length + "m");
    }
}
