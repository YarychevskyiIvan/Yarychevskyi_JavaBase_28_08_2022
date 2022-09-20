package com.hillel.yarychevskyi.lessons.lesson6;

public class Shuttles {
    public static void main(String[] args) {
        int counter = 0;
        int i;
        for (i = 1; i < 160; i++) {
            if ((i == 4) || (i == 9) || (i / 10 == 4) || (i / 10 == 9) || (i % 10 == 4) || (i % 10 == 9) || (i / 10 % 10 == 4) || (i / 10 % 10 == 9)) {
                continue;
            }
            System.out.println("shuttle number:" + i);
            counter++;

        }
           System.out.println("count = "+counter);
    }



}
