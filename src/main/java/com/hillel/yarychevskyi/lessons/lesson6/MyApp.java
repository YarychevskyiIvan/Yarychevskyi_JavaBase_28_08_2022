package com.hillel.yarychevskyi.lessons.lesson6;

import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int comp = 0;
        int player = 0;
        System.out.println("Вгадай число від 0 до 1");
        comp = (int) (Math.random()*10);
        System.out.println(comp);
        System.out.println("Напиши своє число");
        for (int i = 0; i < 3 ; i++) {
            if (scanner.hasNextInt()) {
                player = scanner.nextInt();
            } else {
                System.out.println("Wrong date, pleas try again!");
                System.exit(0);
            }
            if (player < comp) {
                System.out.println("Напиши число більше");
            } else if (player > comp) {
                System.out.println("Напиши число менше");

            } else {
                System.out.println("You Win");
                break;
            }

        }

    }
}
