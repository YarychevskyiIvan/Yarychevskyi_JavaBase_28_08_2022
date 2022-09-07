package com.hillel.yarychevskyi.lessons.lesson2;

public class MyApp {
    public static void main(String[] args) {
        byte a1 = 40;
        char x1 = '\u00B0';
        int b1 = 41;
        char x2 = '\'';
        byte a2 = 21;
        char x3 = '\"';

        String name = "Довжина";

        System.out.println(name + " " + "" + a1 + x1+ b1 + x2+ a2 + x3);

        byte a3 = 74;
        char x4 = '\u00B0';
        int b2 = 2;
        char x7 = '\u0030';
        char x5 = '\'';
        byte a4 = 39;
        char x6 = '\"';
        String name2 = "Ширина";

        System.out.println(name2 + " " + "" + a3 + x4+ x7 + b2 + x5+ a4 + x6);

        String name4 = "I am the Statue of Liberty";

        System.out.println(name4);
    }

}
