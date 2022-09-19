package com.hillel.yarychevskyi.lessons.lesson6;

import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int comp = 0;
        int player = 0;
        System.out.println("Вгадай число від 0 до 1");
        comp = (int) (Math.random()*10);
        System.out.println("Напиши своє число");
        for (int pleyer = 0; pleyer <3 ; pleyer++) {
            pleyer = scanner.nextInt();
            if (pleyer < comp) {
                System.out.println("Напиши число більше");
            } else if (pleyer > comp) {
                System.out.println("Напиши число менше");

            } else {
                System.out.println("You Win");
                break;
            }

        }

    }
}
